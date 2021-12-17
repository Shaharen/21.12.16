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

	// 데이터 베이스에 연결시키는 기능

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

	// 로그인 기능
	public String login(String id, String pw) {
		String nick = null;
		getConnection();
		try {
			// JDBC
			// 0. JDBC를 사용하는 프로젝트에 Driver 파일넣기
			// 1. Driver 로딩 (Oracle Driver) -> 동적로딩
			// 내가 사용하는 DBMS의 드라이버로딩
//	         Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 연결
			// Connection을 연결하기 위해서는
			// DB에 접속가능한 url, id, pw가 필요하다
//	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//	         String db_id = "hr";
//	         String db_pw = "hr";
//	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

			// 3. SQL문 작성 및 실행
			String sql = "select * from LandMember where id = ? and pw = ?";
			// PreparedStatement 스트링 안에 ?를 채워줄 수 있음
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			// executeQuery -> 테이블에 데이터가 변함 없을때
			// ResultSet으로 반환
			// executeUpdate -> 테이블의 내용이 변경될 때
			// int으로 반환 -> 실행된 sql 문의 수

			if (rs.next()) {
				nick = rs.getString("nick"); // rs.getString(3); 컬럼 순서, 컬럼명
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
		// 역순으로 닫음
		// rs > psmt > conn
		return nick;
	}

	public int join(String id, String pw, String nick) {
		getConnection();
		int cnt = 0;
		try {
			// JDBC
			// 0. JDBC를 사용하는 프로젝트에 Driver 파일넣기
			// 1. Driver 로딩 (Oracle Driver) -> 동적로딩
			// 내가 사용하는 DBMS의 드라이버로딩

			// 2. Connection 연결
			// Connection을 연결하기 위해서는
			// DB에 접속가능한 url, id, pw가 필요하다

			// 3. SQL문 작성 및 실행
			String sql = "select * from LandMember where id= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				cnt = -1;
			} else {
				sql = "insert into LandMember values(?,?,?)";
				// PreparedStatement 스트링 안에 ?를 채워줄 수 있음
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

			// 3. SQL문 작성 및 실행
			String sql = "update LandMember set nick = ?, pw =? where id =? and pw = ?";
			// PreparedStatement 스트링 안에 ?를 채워줄 수 있음
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