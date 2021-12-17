import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LandMemberDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);

	// ������ ���̽��� �����Ű�� ���

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_3_1209";
			String db_pw = "smhrd3";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �α��� ���
	public String login(String id, String pw) {
		String nick = null;
		getConnection();
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� ������Ʈ�� Driver ���ϳֱ�
			// 1. Driver �ε� (Oracle Driver) -> �����ε�
			// ���� ����ϴ� DBMS�� ����̹��ε�
//	         Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection ����
			// Connection�� �����ϱ� ���ؼ���
			// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�
//	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//	         String db_id = "hr";
//	         String db_pw = "hr";
//	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

			// 3. SQL�� �ۼ� �� ����
			String sql = "select * from LandMember where id = ? and pw = ?";
			// PreparedStatement ��Ʈ�� �ȿ� ?�� ä���� �� ����
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			// executeQuery -> ���̺� �����Ͱ� ���� ������
			// ResultSet���� ��ȯ
			// executeUpdate -> ���̺��� ������ ����� ��
			// int���� ��ȯ -> ����� sql ���� ��

			if (rs.next()) {
				nick = rs.getString("nick"); // rs.getString(3); �÷� ����, �÷���
			} else {
				nick = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		// 4. finally
		// �������� ����
		// rs > psmt > conn
		return nick;
	}

	public int join(String id, String pw, String nick) {
		getConnection();
		int cnt = 0;
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� ������Ʈ�� Driver ���ϳֱ�
			// 1. Driver �ε� (Oracle Driver) -> �����ε�
			// ���� ����ϴ� DBMS�� ����̹��ε�

			// 2. Connection ����
			// Connection�� �����ϱ� ���ؼ���
			// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�

			// 3. SQL�� �ۼ� �� ����
			String sql = "select * from LandMember where id= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				cnt = -1;
			} else {
				sql = "insert into LandMember values(?,?,?)";
				// PreparedStatement ��Ʈ�� �ȿ� ?�� ä���� �� ����
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, nick);

				cnt = psmt.executeUpdate();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

	}

	public int update(String id, String pw, String new_nick, String new_pw) {
		int cnt = 0;
		getConnection();
		try {

			// 3. SQL�� �ۼ� �� ����
			String sql = "update LandMember set nick = ?, pw =? where id =? and pw = ?";
			// PreparedStatement ��Ʈ�� �ȿ� ?�� ä���� �� ����
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, new_nick);
			psmt.setString(2, new_pw);
			psmt.setString(3, id);
			psmt.setString(4, pw);
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<LandMemberDTO> selectAll() {
		ArrayList<LandMemberDTO> list = new ArrayList<LandMemberDTO>();
		getConnection();

		try {
			String sql = "select * from LandMember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				LandMemberDTO m = new LandMemberDTO(id, pw, nick);
				list.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public int delete(String id, String pw) {
		int cnt = 0;
		getConnection();

		try {
			String sql = "delete from LandMember where id= ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int adminUpdate(String change_id, String change_nick) {
		getConnection();
		int cnt = 0;

		try {

			String sql = "update landMember set nick = ? where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, change_nick);
			psmt.setString(2, change_id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int deleteId(String id) {
		int cnt = 0;
		getConnection();

		try {
			String sql = "delete from LandMember where id= ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

	}

	public boolean check(String removeId) {
		ArrayList<LandMemberDTO> list = new ArrayList<LandMemberDTO>();
		getConnection();
		boolean exist = false;

		try {
			String sql = "select * from LandMember where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, removeId);
			rs = psmt.executeQuery();
			exist = rs.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return exist;
	}
}