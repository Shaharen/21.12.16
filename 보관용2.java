import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ������2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Pc pc = new Pc();
		LandDAO dao = new LandDAO();
		ArrayList<LandDTO> land = dao.selectAll(); // ���߿� ���� land�� ����
		System.out.println(land.get(2).getPrice());
		
		
		int turnCnt = 0; // �� ī��Ʈ ����
		int diceSum = 1; // ��������, ������� (32ĭ�� ������)
		int userWhere = diceSum % 32; // ������ġ
		int pcWhere = diceSum % 32; // ������ġ
		
		int landOwner = 0; // �� ������ ( �� �޼ҵ�� ������ �� )
		int landNumber = 0; // �� ��ȣ
		int userMoney = 1000; // �ʱ��ڱ�
		int PcMoney = 1000;
		int landPrice = 0;
		int building = 0;// ������
		int hotel = 0;// ȣ�ڰ�
		int landPass = 0; // �����
		int interceptLand = 0;// �μ� ����
		int landCnt = 0;

		System.out.println("���� �����մϴ�.");
		int userDice = random.nextInt(6) + 1;
		int pcDice = random.nextInt(6) + 1;
		System.out.println("�÷��̾� �ֻ��� : " + userDice);
		System.out.println("PC �ֻ��� : " + pcDice);
		if (userDice >= pcDice) {
			turnCnt = 0;
			System.out.println("�÷��̾� ���Դϴ�");
		} else {
			turnCnt = 1;
			System.out.println("PC ���Դϴ�");
		}
		System.out.println("--------------------------------");
		while (true) { // money < 0
			turnCnt++;
			if (turnCnt % 2 == 1) {
				// �ֻ��� ������
				System.out.println("�÷��̾� ���Դϴ�");
				user.Dice();
//				int dice1 = random.nextInt(6) + 1;
//				int dice2 = random.nextInt(6) + 1;
//				int diceAdd = dice1 + dice2; // �ֻ��� ��
//				System.out.println("�ֻ��� ��� : " + dice1 + "," + dice2);
//				System.out.println(diceAdd + "��ŭ �̵��մϴ�");
				user.DiceSum();
//				diceSum += diceAdd;

				// ������ ���

				// ���� �Ǵ� Ư������ �޼ҵ�
				// �÷��̾� �ൿ
				// 'Ư������'�ϰ��
				if (userWhere % 8 == 0) {
					// �� Ư�������� ȿ�� ȣ��
					if (userWhere / 8 == 0 || userWhere / 8 == 4) {
						// ���
					} else if (userWhere / 8 == 1) {
						// ���ε�
					} else if (userWhere / 8 == 2) {
						// ��ȸ �������
					} else if (userWhere / 8 == 3) {
						// ���ֿ���
					}
				} else {
					// '����'�ϰ�� ( �� ���ÿ� �´� ��������, �ǹ����� ���� ȣ�� )
					System.out.println("���� ī���� : " + landCnt);
					if (landOwner == 0) {
						System.out.println("���� �����ڰ� ���� ���Դϴ�.");
						while (true) {
							System.out.println("���� ���� �Ͻðڽ��ϱ�? Y / N");
							String choiceLand = sc.next();
							if (choiceLand.equals("Y") || choiceLand.equals("y")) {
								if (userMoney - landPrice < 0) {
									System.out.println("�÷��̾��� ���� ����� �����մϴ�.");
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
									break;
								} else {
									
									landOwner = 1; // ������ �÷��̾�� ����
									landCnt++;
									// �� ���� �޼ҵ�
									land.get(userWhere);
//									newOp.land(i);
//									land18.landCnt++;
									System.out.println("�÷��̾��� ���� ��� : " + userMoney + "��");
									System.out.println("���� �����մϴ�");
									// �ش� ���� ����� ����
									break;
								}
							} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
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
								if (plusBuilding.equals("Y") || plusBuilding.equals("y")) {
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
										landCnt++;
//										land18.landCnt++;
										break;
									}
								} else if (plusBuilding.equals("N") || plusBuilding.equals("n")) {
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
								if (plusHotel.equals("Y") || plusHotel.equals("y")) {
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
										landCnt++;
//										land18.landCnt++;
										break;
									}
								} else if (plusHotel.equals("N") || plusHotel.equals("n")) {
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
						PcMoney += landPass;
						System.out.println("���� ��� : " + userMoney + "��");
						// �Ļ� ����
						if (userMoney < 0) {
							System.out.println("�Ļ��߽��ϴ�");
							System.out.println("���ӿ��� �й� �ϼ̽��ϴ�");
							System.out.println("������ �����մϴ�");
							break;
						}
						// �μ� ���� ( �� �μ� �ݾ� ȣ�� �ʿ� )
						while (true) {
							System.out.println("�μ� �Ͻðڽ��ϱ�?  Y / N");
							String intercept = sc.next();
							if (intercept.equals("Y") || intercept.equals("y")) {
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
							} else if (intercept.equals("N") || intercept.equals("n")) {
								System.out.println("���� �����մϴ�");
								break;
							} else {
								System.out.println("�ٽ� �Է��ϼ���");
							}

						}
					}
				}
				// ���÷��̾�
			} else if (turnCnt % 2 == 0) {

				// �ֻ��� ������
				System.out.println("PC �÷��̾� ��");
				int dice1 = random.nextInt(6) + 1;
				int dice2 = random.nextInt(6) + 1;
				int diceAdd = dice1 + dice2;
				System.out.println("�ֻ��� ��� : " + dice1 + "," + dice2);
				System.out.println(diceAdd + "��ŭ �̵��մϴ�");
				diceSum += diceAdd;

				// ������ ���

				// ���� �Ǵ� Ư������ �޼ҵ�
				// PC �ൿ
				// 'Ư������'�ϰ��
				if (pcWhere % 8 == 0) {
					// �� Ư�������� ȿ�� ȣ��
					if (pcWhere / 8 == 0 || pcWhere / 8 == 4) {
						// ���
					} else if (pcWhere / 8 == 1) {
						// ���ε�
					} else if (pcWhere / 8 == 2) {
						// ��ȸ �������
					} else if (pcWhere / 8 == 3) {
						// ���ֿ���
					}
				} else {
					// '����'�ϰ�� ( �� ���ÿ� �´� ��������, �ǹ����� ���� ȣ�� )
					System.out.println("���� ī���� : " + landCnt);
					if (landOwner == 0) {
						System.out.println("PC�� �����ڰ� ���� ���� �����߽��ϴ�");
						System.out.println("PC�� �� ���ſ��θ� ���� �� �Դϴ�");

						while (true) { // PcMoney < 0
							// ������
							if (PcMoney - landPrice < 0) {
								System.out.println("PC�� ���� ����� �����մϴ�.");
								System.out.println("PC�� ���� ��� : " + PcMoney + "��");
								System.out.println("PC���� �����մϴ�");
								break;
							} else {
								PcMoney -= landPrice;
								landOwner = 2; // ������ PC�� ����
								landCnt++;
//								land18.landCnt++;
								System.out.println("PC�� ���� �����߽��ϴ�");
								System.out.println("PC�� ���� ��� : " + PcMoney + "��");
								System.out.println("PC���� �����մϴ�");
								// �ش� ���� ����� ����
								break;
							}
						}
					} else if (landOwner == 1) {
						System.out.println("�÷��̾��� ���Դϴ�");
						// �� ����� ȣ��
						System.out.println("������ " + landPass + "�Դϴ�");
						PcMoney -= landPass;
						userMoney += landPass;
						System.out.println("PC�� ���� ��� : " + PcMoney + "��");
						// �Ļ� ����
						if (PcMoney < 0) {
							System.out.println("PC�� �Ļ��߽��ϴ�");
							System.out.println("���ӿ��� �¸��ϼ̽��ϴ�");
							break;
						}
						// �μ� ���� ( �� �μ� �ݾ� ȣ�� �ʿ� )
						while (true) {
							System.out.println("�μ� ���θ� ���� ���Դϴ�");
							int intercept = random.nextInt(2);
							if (intercept == 0) {
								if (PcMoney - interceptLand < 0) {
									System.out.println("PC�� ����� �����մϴ�.");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									landOwner = 2;
									PcMoney -= interceptLand;
									System.out.println("PC�� ���� �μ��Ͽ����ϴ�");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									userMoney += interceptLand;
									System.out.println("PC���� �����մϴ�");
									break;
								}
							} else if (intercept == 1) {
								System.out.println("�μ����� �ʰ� ���� �����մϴ�");
								break;
							}
						}
					} else if (landOwner == 2) {
						// ���� ī���� Ȯ�� �� �� ���� ȣ�� ������ ���´�
						System.out.println("PC�� ���Դϴ�");
						if (landCnt == 1) {
							int plusBuilding = random.nextInt(2);
							if (plusBuilding == 0) { // �����Ǽ�
								if (PcMoney - building < 0) {
									System.out.println("PC�� ����� �����մϴ�.");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									PcMoney -= building;
									System.out.println("PC�� ������ �Ǽ��߽��ϴ�");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									System.out.println("PC���� �����մϴ�");
									landCnt++;
//									land18.landCnt++;

								}
							} else if (plusBuilding == 1) { // �Ǽ� ����
								System.out.println("PC�� �Ǽ������ʰ� ���� �����߽��ϴ�");
								break;
							}
						} else if (landCnt == 2) {
							int plusHotel = random.nextInt(2);
							if (plusHotel == 0) {// ȣ�� �Ǽ�
								if (PcMoney - hotel < 0) {
									System.out.println("PC�� ����� �����մϴ�.");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									PcMoney -= hotel;
									System.out.println("PC�� ȣ���� �Ǽ��߽��ϴ�");
									System.out.println("PC�� ���� ��� : " + PcMoney + "��");
									System.out.println("PC���� �����մϴ�");
									landCnt++;
//									land18.landCnt++;

								}
							} else if (plusHotel == 1) {// �Ǽ� ����
								System.out.println("PC�� �Ǽ������ʰ� ���� �����߽��ϴ�");
								break;
							}
						} else if (landCnt == 3) {
							System.out.println("������ �ִ� �ǹ��� �����ϴ�");
							System.out.println("���� �����մϴ�");
						}
					}
				}
			}
			System.out.println();
		}
	}
	

}
