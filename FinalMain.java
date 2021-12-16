import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FinalMain {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Pc pc = new Pc();
		Op op = new Op();
		LandDAO dao = new LandDAO();
		ArrayList<LandDTO> land = dao.selectAll();
		LandMain inform = new LandMain();

		int turnCnt = 0; // �� ī��Ʈ ����
		int island = 0; // ���ε� ����
		int sw = rd.nextInt(5);// ������ ����
		int space = 0; // �Ѱ� ũ���� ����

		System.out.println("���� �����մϴ�.");
		int userDice = rd.nextInt(6) + 1;
		int pcDice = rd.nextInt(6) + 1;
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

		while (user.getUserMoney() >= 0 && pc.getPcMoney() >= 0) {
			sw++; // ��ȸ ������� ī���� ����
			// ����� �÷��̾�
			if (turnCnt % 2 == 0) {
				turnCnt++;
				while (true) {
					System.out.println();
					System.out.println("�÷��̾� ���Դϴ�");
					// ���� ���� ȣ�� �Ǵ� ���̽� ����
					System.out.println("�ൿ�� �����ϼ���");
					while (true) {
						System.out.print("[ 1. �� ����  2. ���� ���� ȣ�� ] >> ");
						int choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("���� �����մϴ�");
							System.out.println();
							break;
						} else if (choice == 2) {
							System.out.println("ȣ���� ���� ��ȣ�� �Է��ϼ���");
							System.out.println("���� ��ȣ�� 0(���)���� 31�Դϴ�");
							System.out.print("�Է��Ͻ� ���� ��ȣ : ");
							int landChoice = sc.nextInt();
							inform.landInform(land, landChoice);
						} else {
							System.out.println("�ٽ� �Է��ϼ���");
						}
					}

					// ���ε� ����
					if (island > 0) {
						int islandDice1 = rd.nextInt(6) + 1;
						int islandDice2 = rd.nextInt(6) + 1;
						System.out.println("ù��° �ֻ��� : " + islandDice1);
						System.out.println("�ι�° �ֻ��� : " + islandDice2);
						if (islandDice1 == islandDice2) {
							System.out.println("��~ �̰� Ż���ϳ�");
							island = 0;
							break;
						} else {
							System.out.println("�踦 �߰����� ���߽��ϴ�...");
							System.out.println("�� �̵� ���� ��");
							island--;
							System.out.println("���� ���ε� Ƚ�� : " + island);
							break;
						}
					}
					// ũ���� (���ֿ���)
					if (space > 0) {
						while (space > 0) {
							System.out.println("�̵��� ĭ ���� �Է��ϼ��� (1 ~ 31 ĭ)");
							int move = sc.nextInt();
							if (move >= 32 || move <= 0) {
								System.out.println("�ٽ� �Է����ּ���.");
							} else {
								user.space(move);
								space = 0;
							}
						}
					} else {
						// �� ���̽�
						user.Dice();
						user.DiceSum();
					}
					// ���ʽ�
					if (user.DiceWhere() == 4 || user.DiceWhere() == 13 || user.DiceWhere() == 22
							|| user.DiceWhere() == 27) {
						int bonus = rd.nextInt(6) + 1;
						System.out.println(bonus);
						op.bonus(user, bonus);
						user.Money();
						break;
					} else if (user.DiceWhere() % 8 == 0) {
						// �� Ư�������� ȿ�� ȣ��
						if (user.DiceWhere() / 8 == 0 || user.DiceWhere() / 8 == 4) {
							// ���
							System.out.println("��������� �����߽��ϴ�");
							break;
						} else if (user.DiceWhere() / 8 == 1) {
							// ���ε� - 2�� ����
							System.out.println("���ε��� �������ϴ�");
							island = 2;
							break;
						} else if (user.DiceWhere() / 8 == 2) {
							// ��ȸ ������� - ��ü ī���Ϳ� ����, �������� �̸� ����
							System.out.println("�������� �����ϼ̽��ϴ�");
							op.sw(user, sw);
							user.Money();
							break;
						} else if (user.DiceWhere() / 8 == 3) {
							// ���ֿ��� - ���ϴ°� ��ġ
							System.out.println("ũ��� ž���ϼ̽��ϴ�");
							System.out.println("������ ���ϴ� ������ �̵��մϴ�");
							space = 1;
							break;
						}

					} else {
						// ���õ��� �˸�
						System.out.println(land.get(user.DiceWhere()).getLandName() + "�� ���� �Ͽ����ϴ� ");
						// ���� �Ǻ� 0 1 2
						if (land.get(user.DiceWhere()).getLandOwner() == 0) {
							// ������ Cnt++
							System.out.println("���� �����ڰ� ���� ���Դϴ�.");
							while (true) {
								System.out.println("���� �����Ͻðڽ��ϱ�? Y / N");
								String choiceLand = sc.next();
								if (choiceLand.equals("Y") || choiceLand.equals("y")) {
									op.userLandBuy(user, land.get(user.DiceWhere()));
									user.Money();
									System.out.println("�÷��̾����� �����մϴ�");
									land.get(user.DiceWhere()).setLandOwner(1);
									land.get(user.DiceWhere()).setLandCnt(1);
									break;
								} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
									System.out.println("���� �������� �ʾҽ��ϴ�.");
									user.Money();
									System.out.println("�÷��̾����� �����մϴ�");
									break;
								} else {
									System.out.println("�ٽ� �Է����ּ���");
								}
							}
							break;
						} else if (land.get(user.DiceWhere()).getLandOwner() == 1) {
							// �÷��̾�̰�, �Ǽ� ���� (CNT)
							System.out.println("�÷��̾� ���Դϴ�");
							if (land.get(user.DiceWhere()).getLandCnt() == 1) {
								// ����
								while (true) {
									System.out.println("������ �Ǽ��Ͻðڽ��ϱ�? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userBuildingBuy(user, land.get(user.DiceWhere()));
										user.Money();
										land.get(user.DiceWhere()).setLandCnt(2);
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("���� �������� �ʾҽ��ϴ�.");
										user.Money();
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else {
										System.out.println("�ٽ� �Է����ּ���");
									}
								}
								break;
							} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
								// ȣ��
								while (true) {
									System.out.println("ȣ���� �Ǽ��Ͻðڽ��ϱ�? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userHotelBuy(user, land.get(user.DiceWhere()));
										user.Money();
										land.get(user.DiceWhere()).setLandCnt(3);
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("���� �������� �ʾҽ��ϴ�.");
										user.Money();
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else {
										System.out.println("�ٽ� �Է����ּ���");
									}
								}
								break;
							} else {
								// ���̻� �Ǽ��� �� ����
								System.out.println("���̻� �Ǽ��� ���� �����ϴ�.");
								System.out.println("�÷��̾����� �����մϴ�");
								break;
							}
						} else if (land.get(user.DiceWhere()).getLandOwner() == 2) {
							// PC��, �������, �μ����� (OWNER,CNT)
							System.out.println("PC�� ���Դϴ�");
							if (land.get(user.DiceWhere()).getLandCnt() == 1) {
								// ���� ����, ������� ����, �μ����� �����
								op.userPass(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("�μ� �Ͻðڽ��ϱ�? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice(user, pc, land.get(user.DiceWhere()));
										System.out.println("�μ��� �����ϼ̽��ϴ�");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else {
										System.out.println("�ٽ� �Է����ּ���");
									}
								}
								break;
							} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
								// �������� ����, �����2 ����, �μ�����
								op.userPassBuilding(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("�μ� �Ͻðڽ��ϱ�? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice2(user, pc, land.get(user.DiceWhere()));
										System.out.println("�μ��� �����ϼ̽��ϴ�");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else {
										System.out.println("�ٽ� �Է����ּ���");
									}
								}
								break;
							} else {
								// ȣ�ڱ��� ����, �����3 ����, �μ�����
								op.userPassHotel(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("�μ� �Ͻðڽ��ϱ�? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice3(user, pc, land.get(user.DiceWhere()));
										System.out.println("�μ��� �����ϼ̽��ϴ�");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("�÷��̾����� �����մϴ�");
										break;
									} else {
										System.out.println("�ٽ� �Է����ּ���");
									}
								}
								break;
							}

						}
					}
				}
			} else {
				turnCnt++;
				while (true) {
					// ���÷��̾�
					System.out.println();
					System.out.println("PC�÷��̾� ���Դϴ�.");
					// ���ε� ����
					if (island > 0) {
						int islandDice1 = rd.nextInt(6) + 1;
						int islandDice2 = rd.nextInt(6) + 1;
						System.out.println("ù��° �ֻ��� : " + islandDice1);
						System.out.println("�ι�° �ֻ��� : " + islandDice2);
						if (islandDice1 == islandDice2) {
							System.out.println("PC�� ���ε����� Ż���߽��ϴ�");
							island = 0;
							break;
						} else {
							System.out.println("PC�� �踦 �߰����� ���߽��ϴ�...");
							System.out.println("PC �̵� ���� �Ф�");
							island--;
							System.out.println("PC�� ���� ���ε� Ƚ�� : " + island);
							break;
						}
					}
					// ���ֿ���
					if (space > 0) {
						while (space > 0) {
							System.out.print("PC�� �̵��� ĭ ��");
							int move = rd.nextInt(30) + 1;
							if (move >= 32 || move <= 0) {
								System.out.println("�ٽ� �Է����ּ���.");
							} else {
								pc.space(move);
								space = 0;
							}
						}
					} else {
						pc.Dice();
						pc.DiceSum();
					}
					// ���ʽ�
					if (pc.DiceWhere() == 4 || pc.DiceWhere() == 13 || pc.DiceWhere() == 22 || pc.DiceWhere() == 27) {
						int bonus = rd.nextInt(6) + 1;
						System.out.println(bonus);
						op.bonus(pc, bonus);
						pc.Money();
						break;
					} else if (pc.DiceWhere() % 8 == 0) {
						// �� Ư�������� ȿ�� ȣ��
						if (pc.DiceWhere() / 8 == 0 || pc.DiceWhere() / 8 == 4) {
							// ���
							System.out.println("PC�� ��������� �����߽��ϴ�");
							break;
						} else if (pc.DiceWhere() / 8 == 1) {
							// ���ε� - 2�� ����
							System.out.println("PC�� ���ε��� �������ϴ�");
							island = 2;
							break;
						} else if (pc.DiceWhere() / 8 == 2) {
							// ��ȸ ������� - ��ü ī���Ϳ� ����
							System.out.println("PC�� �������� �����߽��ϴ�");
							op.sw(pc, sw);
							pc.Money();
							break;
						} else if (pc.DiceWhere() / 8 == 3) {
							// ���ֿ��� - ���ϴ°� ��ġ
							System.out.println("PC�� ũ��� ž���Ͽ����ϴ�");
							space = 1;
							break;
						}

					} else {
						// pc��ġ
						System.out.println("PC�� " + land.get(pc.DiceWhere()).getLandName() + "�� ���� �Ͽ����ϴ� ");
						if (land.get(pc.DiceWhere()).getLandOwner() == 0) {
							// ������ Cnt++

							System.out.println("���� �����ڰ� ���� ���Դϴ�.");

							System.out.println("PC�� ���� �������� �������Դϴ�.");
							op.pcLandBuy(pc, land.get(pc.DiceWhere()));
							System.out.println("PC�� ���� �����߽��ϴ�");
							pc.Money();
							System.out.println("PC���� �����մϴ�");
							land.get(pc.DiceWhere()).setLandOwner(2);
							land.get(pc.DiceWhere()).setLandCnt(1);
							break;
						} else if (land.get(pc.DiceWhere()).getLandOwner() == 1) {
							// �÷��̾
							if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
								// ���� ����, �����, �μ�
								op.pcPass(pc, user, land.get(pc.DiceWhere()));
								pc.Money();
								int intercept = rd.nextInt(2);
								if (intercept == 0) {
									op.pcInterceptPrice(user, pc, land.get(pc.DiceWhere()));
									land.get(pc.DiceWhere()).setLandOwner(2);
									System.out.println("PC�� ���� �μ��߽��ϴ�");
									pc.Money();
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									System.out.println("PC�� �μ������ʰ� ���� �����߽��ϴ�");
									break;
								}
							} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
								// �������� ����, �����, �μ�
								op.pcPassBuilding(pc, user, land.get(pc.DiceWhere()));
								pc.Money();
								int intercept = rd.nextInt(2);
								if (intercept == 0) {
									op.pcInterceptPrice2(user, pc, land.get(pc.DiceWhere()));
									land.get(pc.DiceWhere()).setLandOwner(2);
									System.out.println("PC�� ���� �μ��߽��ϴ�");
									pc.Money();
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									System.out.println("PC�� �μ������ʰ� ���� �����߽��ϴ�");
									break;
								}
							} else {
								// ȣ�ڱ��� ����, �����, �μ�
								op.pcPassHotel(pc, user, land.get(pc.DiceWhere()));
								pc.Money();
								int intercept = rd.nextInt(2);
								if (intercept == 0) {
									op.pcInterceptPrice3(user, pc, land.get(pc.DiceWhere()));
									land.get(pc.DiceWhere()).setLandOwner(2);
									System.out.println("PC�� ���� �μ��߽��ϴ�");
									pc.Money();
									System.out.println("PC���� �����մϴ�");
									break;
								} else {
									System.out.println("PC�� �μ������ʰ� ���� �����߽��ϴ�");
									break;
								}
							}
						} else if (land.get(pc.DiceWhere()).getLandOwner() == 2) {
							// PC��
							if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
								// ��������, ī���ͺ���
								System.out.println("PC�� ������ �����߽��ϴ�");
								op.pcBuildingBuy(pc, land.get(pc.DiceWhere()));
								land.get(pc.DiceWhere()).setLandCnt(2);
								pc.Money();
								System.out.println("PC���� �����մϴ�");
								break;
							} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
								// ȣ�ڱ���, ī���ͺ���
								System.out.println("PC�� ȣ���� �����߽��ϴ�");
								op.pcHotelBuy(pc, land.get(pc.DiceWhere()));
								land.get(pc.DiceWhere()).setLandCnt(3);
								pc.Money();
								System.out.println("PC���� �����մϴ�");
								break;
							} else {
								System.out.println("PC�� ������ �ǹ��� �����ϴ�");
								System.out.println("PC���� �����մϴ�");
							}
						}

					}
				}
			}
		}
		if (user.getUserMoney() < 0 && pc.getPcMoney() > 0)

		{
			System.out.println("���ӿ��� �й��ϼ̽��ϴ�...");
			System.out.println("������ �����մϴ�");
		}
		if (pc.getPcMoney() < 0 && user.getUserMoney() > 0) {
			System.out.println("���ӿ��� �¸��ϼ̽��ϴ�~!!");
			System.out.println("������ �����մϴ�");
		}
	}
}
