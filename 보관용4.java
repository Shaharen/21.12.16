import java.util.Random;
import java.util.Scanner;

public class ������4 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int turnCnt = 1; // �� ī��Ʈ ����
		int diceSum = 1; // ��������, ������� (32ĭ�� ������)
		int PlayerWhere = diceSum % 32; // ������ġ
		int landOwner = 2; // �� ������ ( �� �޼ҵ�� ������ �� )
		int landNumber = 0; // �� ��ȣ
		int userMoney = 500; // �ʱ��ڱ�
		int PcMoney = 500;
		int landPrice = 10;
		int building = 20;// ������
		int hotel = 30;// ȣ�ڰ�
		int landPass = 30; // �����
		int interceptLand = landPass * 2;// �μ� ����
		int landCnt = 1;
		// ������ -> �Ҹ������� �� t/f �� ������ �� ���� �����մϿ��� �Ҹ��� f��
		// PC�÷��̾� ���� ������ �Ҹ��� t �� ������� �ٽ� �ݺ�

		while (true) { // money < 0
			turnCnt++; // �Ͻ���
			if (turnCnt % 2 == 1) {
				break;
			}
			// �ֻ��� ������
			System.out.println("�÷��̾� ���Դϴ�");
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			int diceAdd = dice1 + dice2; // �ֻ��� ��
			System.out.println();
			System.out.println("�ֻ��� ��� : " + dice1 + "," + dice2);
			System.out.println(diceAdd + "��ŭ �̵��մϴ�");
			diceSum += diceAdd;

			// ������ ���

			// ���� �Ǵ� Ư������ �޼ҵ�
			// �÷��̾� �ൿ
			// 'Ư������'�ϰ��
			if (PlayerWhere % 8 == 0) {
				// �� Ư�������� ȿ�� ȣ��
				if (PlayerWhere / 8 == 0 || PlayerWhere / 8 == 4) {
					// ���
				} else if (PlayerWhere / 8 == 1) {
					// ���ε�
				} else if (PlayerWhere / 8 == 2) {
					// ��ȸ �������
				} else if (PlayerWhere / 8 == 3) {
					// ���ֿ���
				}
			} else {
				// '����'�ϰ�� ( �� ���ÿ� �´� ��������, �ǹ����� ���� ȣ�� )
				if (landOwner == 0) {
					System.out.println("���� �����ڰ� ���� ���Դϴ�.");
					while (true) {
						System.out.println("���� ���� �Ͻðڽ��ϱ�? Y / N");
						String choiceLand = sc.next();
						if (choiceLand.equals("Y")) {
							if (userMoney - landPrice < 0) {
								System.out.println("�÷��̾��� ���� ����� �����մϴ�.");
								System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
								System.out.println("���� �����մϴ�");
								break;
							} else {
								userMoney -= landPrice;
								landOwner = 1; // ������ �÷��̾�� ����
								landCnt++;
								System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
								System.out.println("���� �����մϴ�");
								// �ش� ���� ����� ����
								break;
							}
						} else if (choiceLand.equals("N")) {
							System.out.println("���� �����մϴ�.");
							break;
						} else {
							System.out.println("�ٽ� �Է����ּ���");
						}
					}
				} else if (landOwner == 1) {
					System.out.println("�÷��̾��� ���Դϴ�");
					if (landCnt == 1) {
						System.out.println("���� ���Ե� ���Դϴ�");
						while (true) {
							System.out.println("������ �Ǽ� �Ͻðڽ��ϱ�? Y / N");
							String plusBuilding = sc.next();
							if (plusBuilding.equals("Y")) {
								if (userMoney - building < 0) {
									System.out.println("�÷��̾��� ����� �����մϴ�");
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
									break;
								} else {
									userMoney -= building;
									System.out.println("������ �Ǽ��߽��ϴ�");
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
//									landCnt++:
									break;
								}
							} else if (plusBuilding.endsWith("N")) {
								System.out.println("�Ǽ������ʰ� ���� �����߽��ϴ�");
								break;
							} else {
								System.out.println("�ٽ� �Է����ּ���");
							}
						}
					} else if (landCnt == 2) {
						System.out.println("�������� ���Ե� ���Դϴ�");
						while (true) {
							System.out.println("ȣ���� �Ǽ� �Ͻðڽ��ϱ�? Y / N");
							String plusHotel = sc.next();
							if (plusHotel.equals("Y")) {
								if (userMoney - hotel < 0) {
									System.out.println("�÷��̾��� ����� �����մϴ�");
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
									break;
								} else {
									userMoney -= hotel;
									System.out.println("ȣ���� �Ǽ��߽��ϴ�");
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
//									landCnt++:
									break;
								}
							} else if (plusHotel.endsWith("N")) {
								System.out.println("�Ǽ������ʰ� ���� �����߽��ϴ�");
								break;
							} else {
								System.out.println("�ٽ� �Է����ּ���");
							}
						}
					}
				} else if (landOwner == 2) {
					System.out.println("PC�� ���Դϴ�");
					// �� ����� ȣ��
					System.out.println("������ " + landPass + "�Դϴ�");
					userMoney -= landPass;
					// PC�� ��� landPass ��ŭ ����
					// PcMoney += landPass;
					System.out.println("���� ��� : " + userMoney + "��");
					// �Ļ� ����
					if (userMoney < 0) {
						System.out.println("�Ļ��߽��ϴ�");
						System.out.println("���ӿ��� �й� �ϼ̽��ϴ�");
						System.out.println("������ �����մϴ�");
						break;
					}
					// �μ� ���� ( �� �μ� �ݾ� ȣ�� �ʿ� )
					System.out.println("�μ� �ݾ��� ������� 2���Դϴ�");
					while (true) {
						System.out.println("�μ� �Ͻðڽ��ϱ�?  Y / N");
						String intercept = sc.next();
						if (intercept.equals("Y")) {
							if (userMoney - interceptLand < 0) {
								System.out.println("�������� �����մϴ�.");
								System.out.println("���� ��� : " + userMoney + "��");
								System.out.println("���� �����մϴ�");
								break;
							} else {
								landOwner = 1;
								// �μ��� ��ŭ ���� �������� ��� �ø��� ���� �ʿ�
								userMoney -= interceptLand;
								PcMoney += interceptLand;
								System.out.println("���� �μ��Ͽ����ϴ�");
								System.out.println("���� ��� : " + userMoney + "��");
								System.out.println("���� �����մϴ�");
								break;
							}
						} else if (intercept.equals("N")) {
							System.out.println("���� �����մϴ�");
							break;
						} else {
							System.out.println("�ٽ� �Է��ϼ���");
						}

					}
				}
			}
		}
	}
}
