import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;
import javazoom.jl.player.MP3Player;

public class LandMemberMain {

	public static void main(String[] args) {

		LandMemberDAO dao2 = new LandMemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t" + "<<<<  Land Warsȸ������ �ý���  >>>>");
		MP3Player mp3 = new MP3Player();
		while (true) {
			System.out.print("\t\t" + "[1]�α��� [2]ȸ������ [3]ȸ����Ϻ��� [4]ȸ���������� [5]ȸ��Ż�� [6]���� >>");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("\t\t" + "<<< �α��� >>>");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();

				String nick = dao2.login(id, pw);

				if (nick != null) {
					while (!id.equals("admin")) {
						System.out.println("\t\t" + nick + "�� ȯ���մϴ�!");
						// landwars �ΰ�
						System.out.println("\r\n"
					            + "         :::             :::       ::::    :::   :::::::::           :::       :::       :::      :::::::::    :::::::: \r\n"
					            + "        :+:           :+: :+:     :+:+:   :+:   :+:    :+:          :+:       :+:     :+: :+:    :+:    :+:  :+:    :+: \r\n"
					            + "       +:+          +:+   +:+    :+:+:+  +:+   +:+    +:+          +:+       +:+    +:+   +:+   +:+    +:+  +:+         \r\n"
					            + "      +#+         +#++:++#++:   +#+ +:+ +#+   +#+    +:+          +#+  +:+  +#+   +#++:++#++:  +#++:++#:   +#++:++#++   \r\n"
					            + "     +#+         +#+     +#+   +#+  +#+#+#   +#+    +#+          +#+ +#+#+ +#+   +#+     +#+  +#+    +#+         +#+    \r\n"
					            + "    #+#         #+#     #+#   #+#   #+#+#   #+#    #+#           #+#+# #+#+#    #+#     #+#  #+#    #+#  #+#    #+#     \r\n"
					            + "   ##########  ###     ###   ###    ####   #########             ###   ###     ###     ###   ##    ###   ########       \r\n"
					            +"\r\n");
						System.out.println("\t\tLandWars�� ���Ű� ȯ���մϴ�");
						while (true) {
							System.out.print("\t\t[ �ó������� ���ðڽ��ϱ�? Y / N ] ");
							String start = sc.next();
							if (start.equals("Y") || start.equals("y")) {

								String[] smhrd = { " ", " " };
								String[] smhrd1 = { "2", "0", "2", "1", " ", "1", "2", "��" };
								String[] smhrd2 = { "'", "S", "M", "H", "R", "D", " ", "��", "��", "'", "��" };
								System.out.println();
								String[] smhrd3 = { "2", "0", "2", "1", " ", "��", "��", "��", "��", " ", "��", "��", "��",
										" ", "��", "��", "��", "��", "��", " ", "��", "��", " ", "��", "��", "��", " ", "ū", " ",
										"��", "��", "��", " ", "��", "��", "��", "��", "��" };

								String[] smhrd4 = { "��", "��", "��", " ", "��", " ", "��", "��", "��", " ", "��", " ", "5",
										"6", "��", "��", "��", "��", " ", "��", "��", "��", "��", " ", "��", "��", " ", "��", "��",
										"��", "��", " " };

								String[] smhrd5 = { "��", "Ȱ", "��", " ", "��", "��", "��", "��", " ", "��", "��", " ", "��",
										"��", " ", "��", "��", "��", "��", " ", "��", "��", "��", " ", "��", "��" };

								String[] smhrd6 = { "��", "��", "��", "��", " ", "��", "��", "��", "��", " ", "��", "��", "��",
										"��", " ", "��", "��", "��", " ", "��", "��" };

								String[] smhrd7 = { "��", " ", "��", "��", "��", "��", " ", "��", "ȸ", "��", " ", "��", "��",
										"��", "��", "��", ".", ".", "." };
								System.out.print("\t\t");
								for (String value : smhrd1) {

									System.out.print(value);

									try {
										mp3.play("C://music/Ÿ��.mp3");
										Thread.sleep(180);

									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();

									}
								}

								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd2) {
									System.out.print(value);

									try {
										Thread.sleep(100);

									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd3) {
									System.out.print(value);

									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd4) {
									System.out.print(value);

									try {

										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd5) {
									System.out.print(value);

									try {

										Thread.sleep(100);

									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd6) {
									System.out.print(value);

									try {

										Thread.sleep(100);

									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ�ڼҸ�.mp3");
								for (String value : smhrd7) {
									System.out.print(value);

									try {

										Thread.sleep(100);

									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/Ÿ��.mp3");
								for (String value : smhrd) {
									System.out.print(value);

									try {

										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									mp3.play("C://music/�����.mp3");
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}

								System.out.println();
								System.out.println();
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");
								System.out.print("\t\t");
								System.out.println("To. " + nick);
								System.out.println();
								System.out.print("\t\t");
								System.out.println("�Ϸ��Ϸ� ����� �����ϰ� ����鿡�� ġ�̰� ���� ġ�̰� ���ǿ� ġ�̰� �ִ�");
								System.out.print("\t\t");
								System.out.println(nick + "�� �� ���� ���� �ӿ��� ����ϰ� �ִ� ���� ������߿� ���� �Ǽ̽��ϴ�.");
								System.out.print("\t\t");
								System.out.println("���� ������ �ε��� ��� ���з� ���ѹα� ������ ū Ÿ���� �Ծ� ����ϰ� �ֽ��ϴ�.");
								System.out.print("\t\t");
								System.out.println("�� �����߿� �ϳ��� ������ ��ü �� PBK��� ������ ��� ���� ������ �ִ� �Ǵ����ְ� �ִµ�");
								System.out.print("\t\t");
								System.out.println("���� ���� ����� ��Ȳ���� ������ ���� �� �簡�� ���ѹα��� �ε����� ���������� �ֽ��ϴ�.");
								System.out.print("\t\t");
								System.out.println(nick + "�Բ� �˼��� ���������� ���� �����ֽø� ū ���� �ɰŰ����ϴ�");
								System.out.print("\t\t");
								System.out.println("���� ���� ȯ���� �� ������ �帱�״� PBK�� ���� �ֽʽÿ�.");
								System.out.print("\t\t");
								System.out.println("�δ� ������ �ʿ� ���� �׳� ���� �����ֽø� �˴ϴ�");
								System.out.print("\t\t");
								System.out.println("���� ��Ź�� ���� ��� �ֽŴٸ� �̶������� ���� ���� ���� ���� �ְ� �ص帮�ڽ��ϴ�.");
								System.out.print("\t\t");
								System.out.println("                                           From. ���ѹα����� ����� ���°�");
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");

								System.out.println();
								break;
							} else if (start.equals("N") || start.equals("n")) {
								System.out.println("\t\t������ �����մϴ�");
								break;
							} else {
								System.out.println("\t\t" + "�ٽ� �Է����ּ���");
							}
						}

						System.out.print("\t\t" + "�ƹ� Ű�� �Է��Ͻð� ���͸� �����ø� ������ ���۵˴ϴ�.");
						String a = sc.next();

						Random rd = new Random();
						User user = new User();
						Pc pc = new Pc();
						Op op = new Op();
						LandDAO dao = new LandDAO();
						ArrayList<LandDTO> land = dao.selectAll();
						LandMain inform = new LandMain();
						Out out = new Out();

						int turnCnt = 0; // �� ī��Ʈ ����
						int userIsland = 0; // ���ε� ����
						int pcIsland = 0;
						int sw = rd.nextInt(5);// ������ ����
						int userSpace = 0; // �Ѱ� ũ���� ����
						int pcSpace = 0;

						System.out.println("\t\t" + "���� �����մϴ�.");
						timeLate(500);

						int userDice = rd.nextInt(6) + 1;
						int pcDice = rd.nextInt(6) + 1;
						System.out.println("\t\t" + nick + "�ֻ��� : " + userDice);
						timeLate(500);
						System.out.println("\t\t" + "PBK �ֻ��� : " + pcDice);
						timeLate(500);
						if (userDice >= pcDice) {
							turnCnt = 0;
							System.out.println("\t\t" + nick + "�� ���Դϴ�");
							timeLate(500);
						} else {
							turnCnt = 1;
							System.out.println("\t\t" + "PBK ���Դϴ�");
							timeLate(500);
						}
						System.out.println();
						System.out.println(
								"=========================================================================================================");

						while (user.getUserMoney() >= 0 && pc.getPcMoney() >= 0) {
							sw++; // ��ȸ ������� ī���� ����
							// ����� �÷��̾�
							if (turnCnt % 2 == 0) {
								turnCnt++;
								while (true) {
									System.out.println();
									System.out.println("\t\t" + nick + "�� ���Դϴ�");
									timeLate(300);
									// ���� ���� ȣ�� �Ǵ� ���̽� ����
									System.out.println("\t\t" + "�ൿ�� �����ϼ���");
									while (true) {
										System.out.print("\t\t" + "[ 1. �� ����  2. ���� ���� ȣ�� ] >> ");
										String choice = sc.next();
										if (choice.equals("1")) {
											System.out.println("\t\t" + "���� �����մϴ�");
											timeLate(300);
											System.out.println();
											break;
										} else if (choice.equals("2")) {
											System.out.println("\t\t" + "ȣ���� ���� ��ȣ�� �Է��ϼ���");
											timeLate(300);
											System.out.println("\t\t" + "���� ��ȣ�� 0(���)���� 31�Դϴ�");
											timeLate(300);
											System.out.print("\t\t" + "�Է��Ͻ� ���� ��ȣ : ");
											int landChoice = sc.nextInt();
											inform.landInform(land, landChoice);
										} else {
											System.out.println("\t\t" + "�ٽ� �Է��ϼ���");
										}
									}

									// ���ε� ����
									if (userIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										System.out.println("\t\t" + "ù��° �ֻ��� : " + islandDice1);
										timeLate(300);
										System.out.println("\t\t" + "�ι�° �ֻ��� : " + islandDice2);
										timeLate(300);
										if (islandDice1 == islandDice2) {
											System.out.println("\t\t" + "�˻��� �����Դϴ�");
											timeLate(300);
											System.out.println("\t\t" + "����߽��ϴ�");
											timeLate(300);
											userIsland = 0;
											break;
										} else {
											System.out.println("\t\t" + "�˻簡 �Ϸ���� �ʾҽ��ϴ�");
											timeLate(300);
											System.out.println("\t\t" + "������ JMT");
											timeLate(300);
											userIsland--;
											System.out.println("\t\t" + "���� �Կ� �ϼ� : " + userIsland);
											timeLate(300);
											break;
										}
									}
									// ũ���� (���ֿ���)
									if (userSpace > 0) {
										while (userSpace > 0) {
											System.out.print("\t\t" + "[ �̵��� ĭ ���� �Է��ϼ��� (1 ~ 31 ĭ) ] >>");
											int move = sc.nextInt();
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "�ٽ� �Է����ּ���.");
											} else {
												user.space(move);
												userSpace = 0;
											}
										}
									} else {
										// �� ���̽�
										user.Dice();
										mp3.play("C://music/�ֻ���.mp3");
										user.DiceSum();
										user.DiceWhere();
										pc.DiceWhere();
										// �� ȣ��
//											System.out.println("test : "+land.get(1).getLandOwner()+land.get(2).getLandOwner()+land.get(3).getLandOwner()+land.get(5).getLandOwner()+land.get(6).getLandOwner()+land.get(7).getLandOwner());
//											System.out.println("userDiceMain"+user.diceWhere);
//											System.out.println("pcDiceMain"+pc.diceWhere);
										timeLate(300);
										out.outPrint(user.diceWhere, pc.diceWhere, land);
										timeLate(2000);

									}
									// ���ʽ�
									if (user.DiceWhere() == 4 || user.DiceWhere() == 13 || user.DiceWhere() == 22
											|| user.DiceWhere() == 27) {
										System.out.println("\t\t" + nick + "���� ���ʽ�ĭ�� �����߽��ϴ�");
										timeLate(300);
										int bonus = rd.nextInt(6) + 1;
										op.bonus(user, bonus);
										timeLate(300);
										user.Money();
										timeLate(300);
										break;
									} else if (user.DiceWhere() % 8 == 0) {
										// �� Ư�������� ȿ�� ȣ��
										if (user.DiceWhere() / 8 == 0 || user.DiceWhere() / 8 == 4) {
											// ���
											System.out.println("\t\t" + "��������� �����߽��ϴ�");
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 1) {
											// ���ε� - 2�� ����
											System.out.println("\t\t" + "�ڷγ��� �ǽɵǾ� ������ �Կ��Ͽ����ϴ�");
											timeLate(300);
											userIsland = 2;
											break;
										} else if (user.DiceWhere() / 8 == 2) {
											// ��ȸ ������� - ��ü ī���Ϳ� ����, �������� �̸� ����
											System.out.println("\t\t" + "�������� �����ϼ̽��ϴ�");
											timeLate(300);
											op.sw(user, sw);
											timeLate(300);
											user.Money();
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 3) {
											// ���ֿ��� - ���ϴ°� ��ġ
											System.out.println("\t\t" + "ũ��� ž���ϼ̽��ϴ�");
											timeLate(300);
											System.out.println("\t\t" + "������ ���ϴ� ������ �̵��մϴ�");
											timeLate(300);
											userSpace = 1;
											break;
										}

									} else {
										// ���õ��� �˸�
										System.out.println(
												"\t\t" + land.get(user.DiceWhere()).getLandName() + "�� ���� �Ͽ����ϴ� ");
										timeLate(300);
										// ���� �Ǻ� 0 1 2
										if (land.get(user.DiceWhere()).getLandOwner() == 0) {
											// ������ Cnt++
											System.out.println("\t\t" + "���� �����ڰ� ���� ���Դϴ�.");
											timeLate(300);
											while (true) {
												System.out.print("\t\t" + "[ ���� �����Ͻðڽ��ϱ�? Y / N ] >> ");
												String choiceLand = sc.next();
												if (choiceLand.equals("Y") || choiceLand.equals("y")) {
													op.userLandBuy(user, land.get(user.DiceWhere()));
													user.Money();
													timeLate(300);
													System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
													timeLate(300);
													land.get(user.DiceWhere()).setLandOwner(1);
													land.get(user.DiceWhere()).setLandCnt(1);
													break;
												} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
													System.out.println("\t\t" + "���� �������� �ʾҽ��ϴ�.");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
													timeLate(300);
													break;
												} else {
													System.out.println("\t\t" + "�ٽ� �Է����ּ���");
												}
											}
											break;
										} else if (land.get(user.DiceWhere()).getLandOwner() == 1) {
											// �÷��̾�̰�, �Ǽ� ���� (CNT)
											System.out.println("\t\t" + nick + "�� ���Դϴ�");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// ����
												while (true) {
													System.out.println("\t\t" + "�� ������ ���� ������ "
															+ land.get(user.DiceWhere()).getBuilding() + "�� �Դϴ�");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.print("\t\t" + "[ ������ �Ǽ��Ͻðڽ��ϱ�? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userBuildingBuy(user, land.get(user.DiceWhere()));
														user.Money();
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(2);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + "���� �������� �ʾҽ��ϴ�.");
														timeLate(300);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "�ٽ� �Է����ּ���");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// ȣ��
												while (true) {
													System.out.println("\t\t" + "�� ������ ȣ�� ������ "
															+ land.get(user.DiceWhere()).getHotel() + "�� �Դϴ�");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.print("\t\t" + "[ ȣ���� �Ǽ��Ͻðڽ��ϱ�? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userHotelBuy(user, land.get(user.DiceWhere()));
														user.Money();
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(3);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + "���� �������� �ʾҽ��ϴ�.");
														timeLate(300);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "�ٽ� �Է����ּ���");
													}
												}
												break;
											} else {
												// ���̻� �Ǽ��� �� ����
												System.out.println("\t\t" + "���̻� �Ǽ��� �ǹ��� �����ϴ�.");
												timeLate(300);
												System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
												timeLate(300);
												break;
											}
										} else if (land.get(user.DiceWhere()).getLandOwner() == 2) {
											// PC��, �������, �μ����� (OWNER,CNT)
											System.out.println("\t\t" + "PBK�� ���Դϴ�");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// ���� ����, ������� ����, �μ����� �����
												System.out.println("\t\t" + "������ "
														+ land.get(user.DiceWhere()).getPass() + "�� �Դϴ�");
												timeLate(300);
												op.userPass(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "�� ������ ���� �μ� ������ "
															+ land.get(user.DiceWhere()).getInterceptPrice() + "�� �Դϴ�");
													timeLate(300);
													System.out.print("\t\t" + "[ �μ� �Ͻðڽ��ϱ�? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "�μ��� �����ϼ̽��ϴ�");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "�ٽ� �Է����ּ���");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// �������� ����, �����2 ����, �μ�����
												System.out.println("\t\t" + "������ "
														+ land.get(user.DiceWhere()).getPassBuilding() + "�� �Դϴ�");
												timeLate(300);
												op.userPassBuilding(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "�� ������ ���� �μ� ������ "
															+ land.get(user.DiceWhere()).getInterceptPrice2()
															+ "�� �Դϴ�");
													timeLate(300);
													System.out.print("\t\t" + "[ �μ� �Ͻðڽ��ϱ�? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice2(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "�μ��� �����ϼ̽��ϴ�");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "�ٽ� �Է����ּ���");
													}
												}
												break;
											} else {
												// ȣ�ڱ��� ����, �����3 ����, �μ�����
												System.out.println("\t\t" + "������ "
														+ land.get(user.DiceWhere()).getPassHotel() + "�� �Դϴ�");
												timeLate(300);
												op.userPassHotel(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "�� ������ ���� �μ� ������ "
															+ land.get(user.DiceWhere()).getInterceptPrice3()
															+ "�� �Դϴ�");
													timeLate(300);
													System.out.print("\t\t" + "[ �μ� �Ͻðڽ��ϱ�? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice3(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "�μ��� �����ϼ̽��ϴ�");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "�� ���� �����մϴ�");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "�ٽ� �Է����ּ���");
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
									System.out.println("\t\t" + "PBK ���Դϴ�.");
									System.out.print("\t\t" + "�ƹ� Ű�� �Է��Ͻø� PBK���� �����մϴ�");
									String pbkTurn = sc.next();

									// ���ε� ����
									if (pcIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										System.out.println("\t\t" + "ù��° �ֻ��� : " + islandDice1);
										System.out.println("\t\t" + "�ι�° �ֻ��� : " + islandDice2);
										if (islandDice1 == islandDice2) {
											System.out.println("\t\t" + "PBK�� ����߽��ϴ�");
											pcIsland = 0;
											break;
										} else {
											System.out.println("\t\t" + "PBK�� �˻� ����� �ʾ����� �ֽ��ϴ�...");
											System.out.println("\t\t" + "PBK�� �������� �Խ��ϴ� �Ф�");
											pcIsland--;
											System.out.println("\t\t" + "PBK�� ���� �Կ� �ϼ� : " + pcIsland);
											break;
										}
									}
									// ���ֿ���
									if (pcSpace > 0) {
										while (pcSpace > 0) {
											System.out.println("\t\t" + "PBK�� �̵��� ĭ ��");
											int move = rd.nextInt(30) + 1;
											System.out.println("\t\t" + move);
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "�ٽ� �Է����ּ���.");
											} else {
												pc.space(move);
												pcSpace = 0;
											}
										}
									} else {
										pc.Dice();
										pc.DiceSum();
										user.DiceWhere();
										pc.DiceWhere();
										out.outPrint(user.diceWhere, pc.diceWhere, land);
									}
									// ���ʽ�
									if (pc.DiceWhere() == 4 || pc.DiceWhere() == 13 || pc.DiceWhere() == 22
											|| pc.DiceWhere() == 27) {
										System.out.println("\t\t" + "PBK�� ���ʽ�ĭ�� �����߽��ϴ�");
										int bonus = rd.nextInt(6) + 1;
										System.out.println("\t\t" + bonus);
										op.bonus(pc, bonus);
										pc.Money();
										break;
									} else if (pc.DiceWhere() % 8 == 0) {
										// �� Ư�������� ȿ�� ȣ��
										if (pc.DiceWhere() / 8 == 0 || pc.DiceWhere() / 8 == 4) {
											// ���
											System.out.println("\t\t" + "PBK�� ��������� �����߽��ϴ�");
											break;
										} else if (pc.DiceWhere() / 8 == 1) {
											// ���ε� - 2�� ����
											System.out.println("\t\t" + "PBK�� �ڷγ��� �ǽɵǾ� ������ �Կ��߽��ϴ�");
											pcIsland = 2;
											break;
										} else if (pc.DiceWhere() / 8 == 2) {
											// ��ȸ ������� - ��ü ī���Ϳ� ����
											System.out.println("\t\t" + "PBK�� �������� �����߽��ϴ�");
											op.sw(pc, sw);
											pc.Money();
											break;
										} else if (pc.DiceWhere() / 8 == 3) {
											// ���ֿ��� - ���ϴ°� ��ġ
											System.out.println("\t\t" + "PBK�� ũ��� ž���Ͽ����ϴ�");
											pcSpace = 1;
											break;
										}

									} else {
										// pc��ġ
										System.out.println("\t\t" + "PBK�� " + land.get(pc.DiceWhere()).getLandName()
												+ "�� ���� �Ͽ����ϴ� ");
										if (land.get(pc.DiceWhere()).getLandOwner() == 0) {
											// ������ Cnt++
											System.out.println("\t\t" + "���� �����ڰ� ���� ���Դϴ�.");
											System.out.println("\t\t" + "PBK�� ���� �������� �������Դϴ�.");
											op.pcLandBuy(pc, land.get(pc.DiceWhere()));
											System.out.println("\t\t" + "PBK�� ���� �����߽��ϴ�");
											pc.Money();
											System.out.println("\t\t" + "PBK���� �����մϴ�");
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
													System.out.println("\t\t" + "PBK�� ���� �μ��߽��ϴ�");
													pc.Money();
													System.out.println("\t\t" + "PBK���� �����մϴ�");
													break;
												} else {
													System.out.println("\t\t" + "PBK�� �μ������ʰ� ���� �����߽��ϴ�");
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
													System.out.println("\t\t" + "PBK�� ���� �μ��߽��ϴ�");
													pc.Money();
													System.out.println("\t\t" + "PBK���� �����մϴ�");
													break;
												} else {
													System.out.println("\t\t" + "PBK�� �μ������ʰ� ���� �����߽��ϴ�");
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
													System.out.println("\t\t" + "PBK�� ���� �μ��߽��ϴ�");
													pc.Money();
													System.out.println("\t\t" + "PBK���� �����մϴ�");
													break;
												} else {
													System.out.println("\t\t" + "PBK�� �μ������ʰ� ���� �����߽��ϴ�");
													break;
												}
											}
										} else if (land.get(pc.DiceWhere()).getLandOwner() == 2) {
											// PC��
											if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
												// ��������, ī���ͺ���
												System.out.println("\t\t" + "PBK�� ������ �����߽��ϴ�");
												op.pcBuildingBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(2);
												pc.Money();
												System.out.println("\t\t" + "PBK���� �����մϴ�");
												break;
											} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
												// ȣ�ڱ���, ī���ͺ���
												System.out.println("\t\t" + "PBK�� ȣ���� �����߽��ϴ�");
												op.pcHotelBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(3);
												pc.Money();
												System.out.println("\t\t" + "PBK���� �����մϴ�");
												break;
											} else {
												System.out.println("\t\t" + "PBK�� ������ �ǹ��� �����ϴ�");
												System.out.println("\t\t" + "PBK���� �����մϴ�");
											}
										}

									}
								}
							}
						}
						if (user.getUserMoney() < 0 && pc.getPcMoney() > 0)

						{
							System.out.println("\t\t" + "���ӿ��� �й��ϼ̽��ϴ�...");
							System.out.println("\t\t" + "������ �����մϴ�");
							break;
						}
						if (pc.getPcMoney() < 0 && user.getUserMoney() > 0) {
							System.out.println("\t\t" + "���ӿ��� �¸��ϼ̽��ϴ�~!!");
							System.out.println("\t\t" + "������ �����մϴ�");
							break;
						}

					}
					while (id.equals("admin")) {
						if (id.equals("admin")) {
							System.out.println("\t\t" + " <<< ������ ��� >>>");
							System.out.println("\t\t" + "1. ȸ���������� 2. ȸ������ 3. ��üȸ��ID���� 4. ������ �α׾ƿ�");
							System.out.print("\t\t" + "�����Է� >> ");
							menu = sc.nextInt();
							if (menu == 1) {
								System.out.println("\t\t" + " <<< ������ ȸ���������� >>>");
								System.out.print("\t\t" + "���̵� �Է� : ");
								String change_id = sc.next();
								System.out.print("\t\t" + "������ �г��� �Է� : ");
								String change_nick = sc.next();

								int cnt = dao2.adminUpdate(change_id, change_nick);

								if (cnt > 0) {
									System.out.println("\t\t" + change_nick + "���� ȸ������ ���� �Ϸ�!!!");
								} else {
									System.out.println("\t\t" + "ȸ������ ���� ����...");
								}
							} else if (menu == 2) {

								System.out.println("\t\t" + "<<< ȸ������ >>>");
								System.out.println("\t\t" + "������ ȸ���� �����մϴ�.");
								System.out.print("\t\t" + "ID : ");
								String removeId = sc.next();

								if (dao2.check(removeId)) {

									System.out.print("\t\t" + "[" + nick + "ȸ���� ��¥ Ż�� ��Ű�ðڽ��ϱ�? ] Y/N");
									String yn = sc.next();

									if (yn.equals("y") || yn.equals("Y")) {
										int cnt = dao2.deleteId(removeId);
										if (cnt > 0) {
											System.out.println("\t\t" + "ȸ������ �Ϸ�!!!");
										}
									} else if (yn.equals("n") || yn.equals("N")) {
										System.out.println("\t\t" + "ó������ �ٽ� �����մϴ�.");
									} else {
										System.out.println("\t\t" + "�߸� �Է��߽��ϴ�.");
									}
								} else {
									System.out.println("\t\t" + "ȸ���� �������� �ʽ��ϴ�.");
								}
							} else if (menu == 3) {
								System.out.println("\t\t" + " <<< ��üȸ�� �������� >>>");
								System.out.println("\t\t ID\tPW");
								ArrayList<LandMemberDTO> list = dao2.selectAll();

								int listNum = 1;
								for (int i = 0; i < list.size(); i++) {
									LandMemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.print("\t\t" + (listNum++) + ". " + m.getId());
										System.out.println("\t" + m.getPw());
									}
								}
							} else if (menu == 4) {
								System.out.println("\t\t" + "<<< ������ ��� ���� >>>");
								break;
							} else {
								System.out.println("\t\t" + "�ٽ� �Է����ּ���.");
							}
							System.out.println();
						}
					}

				} else {
					System.out.println("\t\t" + "�α��� ����...");
				}

			} else if (menu == 2) {
				System.out.println("\t\t" + " <<< ȸ������ >>>");
				System.out.print("\t\t" + "���̵� �Է� :");
				String id = sc.next();
				System.out.print("\t\t" + "��й�ȣ�� �Է� :");
				String pw = sc.next();
				System.out.print("\t\t" + "�г��� �Է� :");
				String nick = sc.next();
				int cnt = dao2.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("\t\t" + "ȸ������ ����");
				} else {
					System.out.println("\t\t" + "ȸ������ ����");
				}

			} else if (menu == 3) {
				// ȸ�� ��� ����
				System.out.println("\t\t" + " <<< ȸ����Ϻ��� >>>");
				ArrayList<LandMemberDTO> list = dao2.selectAll();
				System.out.println("\t\t ID\tNick");
				// pbk - 1234 - ȣ�ξƺ�
				int listNum = 1;
				for (int i = 0; i < list.size(); i++) {
					LandMemberDTO m = list.get(i);
					if (!m.getId().equals("admin")) {
						System.out.print("\t\t" + (listNum++) + ". " + m.getId());
						System.out.println("\t" + m.getNick());
					}
				}

			} else if (menu == 4) {
				System.out.println("\t\t" + "<<< ȸ���������� >>>");
				System.out.println("\t\t" + "ȸ�������� Ȯ���մϴ�.");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();
				String nick = dao2.login(id, pw);
				System.out.println("\t\t" + nick + "�� ȸ�������� ��ġ�մϴ�. ȸ������ �����ϼ���.");

				System.out.print("\t\t" + "������ NICKNAME : ");
				String new_nick = sc.next();

				System.out.print("\t\t" + "������ PASSWORD : ");
				String new_pw = sc.next();

				int cnt = dao2.update(id, pw, new_nick, new_pw);

				if (cnt > 0) {
					System.out.println("\t\t" + "ȸ������ ���� ����!!!");
				} else {
					System.out.println("\t\t" + "ȸ������ ���� ����...");
				}

			} else if (menu == 5) {
				// ȸ�� Ż��
				System.out.println("\t\t" + "<<< ȸ��Ż�� >>>");
				System.out.print("\t\t" + "���̵� �Է�  : ");
				String id = sc.next();
				System.out.print("\t\t" + "��й�ȣ �Է� : ");
				String pw = sc.next();
				int cnt = dao2.delete(id, pw);

				if (cnt > 0) {
					System.out.println("\t\t" + "ȸ������ �Ϸ�");
				} else {
					System.out.println("\t\t" + "ȸ������ ����");
				}
			} else if (menu == 6) {
				System.out.println("\t\t" + "���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("\t\t" + "��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}
		}

	}

	public static void timeLate(int a) {
		try {
			Thread.sleep(a);
		} catch (Exception e) {
		}
	}
}
