
import java.util.ArrayList;

public class ������ {

	public void landInform(ArrayList<LandDTO> land, int input) {//23

		for (; input < land.size();) {
			if (input % 8 == 0) {
				if (input / 8 == 0) {
					System.out.println("������� �Դϴ�");
					System.out.println("�̰��� ������ ������ �޽��ϴ�");
				} else if (input / 8 == 1) {
					System.out.println("���ε� �Դϴ�");
					System.out.println("2�ϰ� ���ԵǸ� ���� �ֻ��� ���� ������ Ż���մϴ�");
				} else if (input / 8 == 2) {
					System.out.println("������ �Դϴ�");
					System.out.println("�������� ����� ����");
					System.out.println("������ ������ �ްų� ������ ������ �����մϴ�");
				} else if (input / 8 == 3) {
					System.out.println("�Ѱ� ũ���� �Դϴ�");
					System.out.println("������ ���ϴ� ������ �̵��� �� �ֽ��ϴ�");
				}
				break;
			} else if (input == 4 || input == 13 || input == 22 || input == 27) {
				System.out.println("���ʽ� ĭ�Դϴ�");
				System.out.println("��Ȳ�� ���� �ڱ��� �ްų� ����ϴ�");
				break;
			} else {
				LandDTO m = land.get(input);// land.get(23) -> 23���� ȣ��
				System.out.println("<< ���� ���� >>");
				System.out.println("����\t���װ���\t��������\tȣ�ڰ���\t�����\t��������\tȣ�ں�\t�μ����\t�����μ�\tȣ���μ�");
				System.out.println(m.toString());
				break;
			}

		}

	}
	
	
	
}
