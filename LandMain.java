
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LandMain {

	public void landInform(ArrayList<LandDTO> list, int input) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < list.size(); i++) {
			// Ư������
			if (list.get(0).getLandNumber() == input) {
				System.out.println("\t\t" +"������� �Դϴ�");
				System.out.println("\t\t" +"�̰��� ������ ������ �޽��ϴ�");
				break;
			} else if (list.get(8).getLandNumber() == input) {
				System.out.println("\t\t" +"���� �Դϴ�");
				System.out.println("\t\t" +"2�ϰ� ���ԵǸ� ���� �ֻ��� ���� ������ Ż���մϴ�");
				break;
			} else if (list.get(16).getLandNumber() == input) {
				System.out.println("\t\t" +"������ �Դϴ�");
				System.out.println("\t\t" +"�������� ����� ����");
				System.out.println("\t\t" +"������ ������ �ްų� ������ ������ �����մϴ�");
				break;
			} else if (list.get(24).getLandNumber() == input) {
				System.out.println("\t\t" +"�Ѱ� ũ���� �Դϴ�");
				System.out.println("\t\t" +"������ ���ϴ� ������ �̵��� �� �ֽ��ϴ�");
				break;
				// ���ʽ�
			}
			if (input == list.get(4).getLandNumber() || list.get(13).getLandNumber() == input
					|| list.get(22).getLandNumber() == input || list.get(27).getLandNumber() == input) {
				System.out.println("\t\t" +"���ʽ� ĭ�Դϴ�");
				System.out.println("\t\t" +"��Ȳ�� ���� �ڱ��� �ްų� ����ϴ�");
				break;
			} else if (input == list.get(i).getLandNumber()) {
				System.out.println();
				System.out.println("\t\t" +"<< ���� ���� >>");
				System.out.println("\t\t" +"����\t���װ���\t��������\tȣ�ڰ���\t�����\t��������\tȣ�ں�\t�μ����\t�����μ�\tȣ���μ�");
				System.out.println("\t\t" +list.get(i).toString());
				break;
			}
		}
		System.out.println();
	}
}
