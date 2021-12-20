import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;
import javazoom.jl.player.MP3Player;

public class LandMemberMain {

	public static void main(String[] args) {

		LandMemberDAO dao2 = new LandMemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t" + "<<<<  Land Wars회원관리 시스템  >>>>");
		MP3Player mp3 = new MP3Player();
		while (true) {
			System.out.print("\t\t" + "[1]로그인 [2]회원가입 [3]회원목록보기 [4]회원정보수정 [5]회원탈퇴 [6]종료 >>");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("\t\t" + "<<< 로그인 >>>");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();

				String nick = dao2.login(id, pw);

				if (nick != null) {
					while (!id.equals("admin")) {
						System.out.println("\t\t" + nick + "님 환영합니다!");
						// landwars 로고
						System.out.println("\r\n"
					            + "         :::             :::       ::::    :::   :::::::::           :::       :::       :::      :::::::::    :::::::: \r\n"
					            + "        :+:           :+: :+:     :+:+:   :+:   :+:    :+:          :+:       :+:     :+: :+:    :+:    :+:  :+:    :+: \r\n"
					            + "       +:+          +:+   +:+    :+:+:+  +:+   +:+    +:+          +:+       +:+    +:+   +:+   +:+    +:+  +:+         \r\n"
					            + "      +#+         +#++:++#++:   +#+ +:+ +#+   +#+    +:+          +#+  +:+  +#+   +#++:++#++:  +#++:++#:   +#++:++#++   \r\n"
					            + "     +#+         +#+     +#+   +#+  +#+#+#   +#+    +#+          +#+ +#+#+ +#+   +#+     +#+  +#+    +#+         +#+    \r\n"
					            + "    #+#         #+#     #+#   #+#   #+#+#   #+#    #+#           #+#+# #+#+#    #+#     #+#  #+#    #+#  #+#    #+#     \r\n"
					            + "   ##########  ###     ###   ###    ####   #########             ###   ###     ###     ###   ##    ###   ########       \r\n"
					            +"\r\n");
						System.out.println("\t\tLandWars에 오신걸 환영합니다");
						while (true) {
							System.out.print("\t\t[ 시나리오를 보시겠습니까? Y / N ] ");
							String start = sc.next();
							if (start.equals("Y") || start.equals("y")) {
								
								String text = "2021,  대한민국 부동산 사업 실패로 인해 정부는 큰 결심을 하게 되는데, 실업자 및 취준생 약 56만명으로 늘어나고 있는 현실에서 생활이 어렵거나 운이 없어 아무것도 못하고 있는 능력 있는 사람들의 데이터를 모으고 모아 단, 한 명에게 기회를 주게 되는데...";
								
								for(int i= 0 ; i < length.text;i++){
									System.out.print( text.charAt(i));
									try{
										mp3.play("C://music/타자.mp3");
										Thread.sleep(180);
									}catch(InterruptedException e){
										e.printStackTrace();
									}
								}

// 								String[] smhrd = { " ", " " };
// 								String[] smhrd1 = { "2", "0", "2", "1", " ", "1", "2", "월" };
// 								String[] smhrd2 = { "'", "S", "M", "H", "R", "D", " ", "신", "문", "'", "중" };
// 								System.out.println();
// 								String[] smhrd3 = { "2", "0", "2", "1", " ", "대", "한", "민", "국", " ", "부", "동", "산",
// 										" ", "사", "업", "실", "패", "로", " ", "인", "해", " ", "정", "부", "는", " ", "큰", " ",
// 										"결", "심", "을", " ", "하", "게", "되", "는", "데" };

// 								String[] smhrd4 = { "실", "업", "자", " ", "및", " ", "취", "준", "생", " ", "약", " ", "5",
// 										"6", "만", "명", "으", "로", " ", "늘", "어", "나", "고", " ", "있", "는", " ", "현", "실",
// 										"에", "서", " " };

// 								String[] smhrd5 = { "생", "활", "이", " ", "어", "렵", "거", "나", " ", "운", "이", " ", "없",
// 										"어", " ", "아", "무", "것", "도", " ", "못", "하", "고", " ", "있", "는" };

// 								String[] smhrd6 = { "능", "력", "있", "는", " ", "사", "람", "들", "의", " ", "데", "이", "터",
// 										"를", " ", "모", "으", "고", " ", "모", "아" };

// 								String[] smhrd7 = { "단", " ", "한", "명", "에", "게", " ", "기", "회", "를", " ", "주", "게",
// 										"되", "는", "데", ".", ".", "." };
// 								System.out.print("\t\t");
// 								for (String value : smhrd1) {

// 									System.out.print(value);

// 									try {
// 										mp3.play("C://music/타자.mp3");
// 										Thread.sleep(180);

// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();

// 									}
// 								}

								
								
								
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd2) {
// 									System.out.print(value);

// 									try {
// 										Thread.sleep(100);

// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}
// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd3) {
// 									System.out.print(value);

// 									try {
// 										Thread.sleep(100);
// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}
// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd4) {
// 									System.out.print(value);

// 									try {

// 										Thread.sleep(100);
// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}
// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd5) {
// 									System.out.print(value);

// 									try {

// 										Thread.sleep(100);

// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}

// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd6) {
// 									System.out.print(value);

// 									try {

// 										Thread.sleep(100);

// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}

// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자소리.mp3");
// 								for (String value : smhrd7) {
// 									System.out.print(value);

// 									try {

// 										Thread.sleep(100);

// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}
// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
// 								System.out.println();
// 								System.out.print("\t\t");
// 								mp3.play("C://music/타자.mp3");
// 								for (String value : smhrd) {
// 									System.out.print(value);

// 									try {

// 										Thread.sleep(100);
// 									} catch (InterruptedException e) {
// 										// TODO Auto-generated catch block
// 										e.printStackTrace();
// 									}
// 									mp3.play("C://music/물방울.mp3");
// 								}
// 								if (mp3.isPlaying()) {

// 									mp3.stop();
// 								}
								mp3.play("C://music/물방울.mp3");
								System.out.println();
								System.out.println();
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");
								System.out.print("\t\t");
								System.out.println("To. " + nick);
								System.out.println();
								System.out.print("\t\t");
								System.out.println("하루하루 힘들게 공부하고 사람들에게 치이고 돈에 치이고 현실에 치이고 있는");
								System.out.print("\t\t");
								System.out.println(nick + "님 수 많은 경쟁 속에서 고생하고 있는 많은 사람들중에 선택 되셨습니다.");
								System.out.print("\t\t");
								System.out.println("지금 서울의 부동산 사업 실패로 대한민국 재정에 큰 타격을 입어 고생하고 있습니다.");
								System.out.print("\t\t");
								System.out.println("그 이유중에 하나가 강남의 정체 모를 PBK라는 강남의 모든 땅을 가지고 있는 악덕지주가 있는데");
								System.out.print("\t\t");
								System.out.println("지금 같이 어려운 상황에서 서울의 땅을 다 사가며 대한민국의 부동산을 어지럽히고 있습니다.");
								System.out.print("\t\t");
								System.out.println(nick + "님께 죄송한 마음이지만 저희를 도와주시면 큰 힘이 될거같습니다");
								System.out.print("\t\t");
								System.out.println("저희가 돈과 환경을 다 제공해 드릴테니 PBK를 막아 주십시오.");
								System.out.print("\t\t");
								System.out.println("부담 가지실 필요 없이 그냥 땅만 지켜주시면 됩니다");
								System.out.print("\t\t");
								System.out.println("저희가 부탁한 것을 들어 주신다면 이때까지의 힘든 삶을 벗어 날수 있게 해드리겠습니다.");
								System.out.print("\t\t");
								System.out.println("                                           From. 대한민국정부 대통령 김태경");
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");

								System.out.println();
								break;
							} else if (start.equals("N") || start.equals("n")) {
								System.out.println("\t\t게임을 시작합니다");
								break;
							} else {
								System.out.println("\t\t" + "다시 입력해주세요");
							}
						}

						System.out.print("\t\t" + "아무 키나 입력하시고 엔터를 누르시면 게임이 시작됩니다.");
						String a = sc.next();

						Random rd = new Random();
						User user = new User();
						Pc pc = new Pc();
						Op op = new Op();
						LandDAO dao = new LandDAO();
						ArrayList<LandDTO> land = dao.selectAll();
						LandMain inform = new LandMain();
						Out out = new Out();

						int turnCnt = 0; // 턴 카운트 변수
						int userIsland = 0; // 무인도 변수
						int pcIsland = 0;
						int sw = rd.nextInt(5);// 세무서 변수
						int userSpace = 0; // 한강 크루즈 변수
						int pcSpace = 0;

						System.out.println("\t\t" + "선을 결정합니다.");
						timeLate(500);

						int userDice = rd.nextInt(6) + 1;
						int pcDice = rd.nextInt(6) + 1;
						System.out.println("\t\t" + nick + "주사위 : " + userDice);
						timeLate(500);
						System.out.println("\t\t" + "PBK 주사위 : " + pcDice);
						timeLate(500);
						if (userDice >= pcDice) {
							turnCnt = 0;
							System.out.println("\t\t" + nick + "님 선입니다");
							timeLate(500);
						} else {
							turnCnt = 1;
							System.out.println("\t\t" + "PBK 선입니다");
							timeLate(500);
						}
						System.out.println();
						System.out.println(
								"=========================================================================================================");

						while (user.getUserMoney() >= 0 && pc.getPcMoney() >= 0) {
							sw++; // 사회 복지기금 카운터 증가
							// 사용자 플레이어
							if (turnCnt % 2 == 0) {
								turnCnt++;
								while (true) {
									System.out.println();
									System.out.println("\t\t" + nick + "님 턴입니다");
									timeLate(300);
									// 지역 정보 호출 또는 다이스 선택
									System.out.println("\t\t" + "행동을 선택하세요");
									while (true) {
										System.out.print("\t\t" + "[ 1. 턴 시작  2. 지역 정보 호출 ] >> ");
										String choice = sc.next();
										if (choice.equals("1")) {
											System.out.println("\t\t" + "턴을 시작합니다");
											timeLate(300);
											System.out.println();
											break;
										} else if (choice.equals("2")) {
											System.out.println("\t\t" + "호출할 지역 번호를 입력하세요");
											timeLate(300);
											System.out.println("\t\t" + "지역 번호는 0(출발)부터 31입니다");
											timeLate(300);
											System.out.print("\t\t" + "입력하신 지역 번호 : ");
											int landChoice = sc.nextInt();
											inform.landInform(land, landChoice);
										} else {
											System.out.println("\t\t" + "다시 입력하세요");
										}
									}

									// 무인도 패턴
									if (userIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										System.out.println("\t\t" + "첫번째 주사위 : " + islandDice1);
										timeLate(300);
										System.out.println("\t\t" + "두번째 주사위 : " + islandDice2);
										timeLate(300);
										if (islandDice1 == islandDice2) {
											System.out.println("\t\t" + "검사결과 음성입니다");
											timeLate(300);
											System.out.println("\t\t" + "퇴원했습니다");
											timeLate(300);
											userIsland = 0;
											break;
										} else {
											System.out.println("\t\t" + "검사가 완료되지 않았습니다");
											timeLate(300);
											System.out.println("\t\t" + "병원밥 JMT");
											timeLate(300);
											userIsland--;
											System.out.println("\t\t" + "남은 입원 일수 : " + userIsland);
											timeLate(300);
											break;
										}
									}
									// 크루즈 (우주여행)
									if (userSpace > 0) {
										while (userSpace > 0) {
											System.out.print("\t\t" + "[ 이동할 칸 수를 입력하세요 (1 ~ 31 칸) ] >>");
											int move = sc.nextInt();
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "다시 입력해주세요.");
											} else {
												user.space(move);
												userSpace = 0;
											}
										}
									} else {
										// 턴 다이스
										user.Dice();
										mp3.play("C://music/주사위.mp3");
										user.DiceSum();
										user.DiceWhere();
										pc.DiceWhere();
										// 판 호출
//											System.out.println("test : "+land.get(1).getLandOwner()+land.get(2).getLandOwner()+land.get(3).getLandOwner()+land.get(5).getLandOwner()+land.get(6).getLandOwner()+land.get(7).getLandOwner());
//											System.out.println("userDiceMain"+user.diceWhere);
//											System.out.println("pcDiceMain"+pc.diceWhere);
										timeLate(300);
										out.outPrint(user.diceWhere, pc.diceWhere, land);
										timeLate(2000);

									}
									// 보너스
									if (user.DiceWhere() == 4 || user.DiceWhere() == 13 || user.DiceWhere() == 22
											|| user.DiceWhere() == 27) {
										System.out.println("\t\t" + nick + "님이 보너스칸에 도착했습니다");
										timeLate(300);
										int bonus = rd.nextInt(6) + 1;
										op.bonus(user, bonus);
										timeLate(300);
										user.Money();
										timeLate(300);
										break;
									} else if (user.DiceWhere() % 8 == 0) {
										// 각 특수지구별 효과 호출
										if (user.DiceWhere() / 8 == 0 || user.DiceWhere() / 8 == 4) {
											// 출발
											System.out.println("\t\t" + "출발지점에 도착했습니다");
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 1) {
											// 무인도 - 2턴 쉬기
											System.out.println("\t\t" + "코로나가 의심되어 병원에 입원하였습니다");
											timeLate(300);
											userIsland = 2;
											break;
										} else if (user.DiceWhere() / 8 == 2) {
											// 사회 복지기금 - 자체 카운터에 따라서, 세무서로 이름 변경
											System.out.println("\t\t" + "세무서에 도착하셨습니다");
											timeLate(300);
											op.sw(user, sw);
											timeLate(300);
											user.Money();
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 3) {
											// 우주여행 - 원하는곳 위치
											System.out.println("\t\t" + "크루즈에 탑승하셨습니다");
											timeLate(300);
											System.out.println("\t\t" + "다음턴 원하는 곳으로 이동합니다");
											timeLate(300);
											userSpace = 1;
											break;
										}

									} else {
										// 도시도착 알림
										System.out.println(
												"\t\t" + land.get(user.DiceWhere()).getLandName() + "에 도착 하였습니다 ");
										timeLate(300);
										// 소유 판별 0 1 2
										if (land.get(user.DiceWhere()).getLandOwner() == 0) {
											// 땅구입 Cnt++
											System.out.println("\t\t" + "현재 소유자가 없는 땅입니다.");
											timeLate(300);
											while (true) {
												System.out.print("\t\t" + "[ 땅을 구입하시겠습니까? Y / N ] >> ");
												String choiceLand = sc.next();
												if (choiceLand.equals("Y") || choiceLand.equals("y")) {
													op.userLandBuy(user, land.get(user.DiceWhere()));
													user.Money();
													timeLate(300);
													System.out.println("\t\t" + nick + "님 턴을 종료합니다");
													timeLate(300);
													land.get(user.DiceWhere()).setLandOwner(1);
													land.get(user.DiceWhere()).setLandCnt(1);
													break;
												} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
													System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.println("\t\t" + nick + "님 턴을 종료합니다");
													timeLate(300);
													break;
												} else {
													System.out.println("\t\t" + "다시 입력해주세요");
												}
											}
											break;
										} else if (land.get(user.DiceWhere()).getLandOwner() == 1) {
											// 플레이어땅이고, 건설 여부 (CNT)
											System.out.println("\t\t" + nick + "님 땅입니다");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// 빌딩
												while (true) {
													System.out.println("\t\t" + "이 지역의 빌딩 가격은 "
															+ land.get(user.DiceWhere()).getBuilding() + "억 입니다");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.print("\t\t" + "[ 빌딩을 건설하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userBuildingBuy(user, land.get(user.DiceWhere()));
														user.Money();
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(2);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
														timeLate(300);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// 호텔
												while (true) {
													System.out.println("\t\t" + "이 지역의 호텔 가격은 "
															+ land.get(user.DiceWhere()).getHotel() + "억 입니다");
													timeLate(300);
													user.Money();
													timeLate(300);
													System.out.print("\t\t" + "[ 호텔을 건설하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userHotelBuy(user, land.get(user.DiceWhere()));
														user.Money();
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(3);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
														timeLate(300);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요");
													}
												}
												break;
											} else {
												// 더이상 건설할 땅 없음
												System.out.println("\t\t" + "더이상 건설할 건물이 없습니다.");
												timeLate(300);
												System.out.println("\t\t" + nick + "님 턴을 종료합니다");
												timeLate(300);
												break;
											}
										} else if (land.get(user.DiceWhere()).getLandOwner() == 2) {
											// PC땅, 통행료계산, 인수여부 (OWNER,CNT)
											System.out.println("\t\t" + "PBK의 땅입니다");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// 땅만 있음, 땅통행료 지불, 인수여부 물어볼것
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPass() + "억 입니다");
												timeLate(300);
												op.userPass(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice() + "억 입니다");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// 빌딩까지 있음, 통행료2 지불, 인수여부
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPassBuilding() + "억 입니다");
												timeLate(300);
												op.userPassBuilding(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice2()
															+ "억 입니다");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice2(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요");
													}
												}
												break;
											} else {
												// 호텔까지 있음, 통행료3 지불, 인수여부
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPassHotel() + "억 입니다");
												timeLate(300);
												op.userPassHotel(user, pc, land.get(user.DiceWhere()));
												user.Money();
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice3()
															+ "억 입니다");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice3(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money();
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다");
														timeLate(300);
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요");
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
									// 후플레이어
									System.out.println();
									System.out.println("\t\t" + "PBK 턴입니다.");
									System.out.print("\t\t" + "아무 키나 입력하시면 PBK턴을 진행합니다");
									String pbkTurn = sc.next();

									// 무인도 패턴
									if (pcIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										System.out.println("\t\t" + "첫번째 주사위 : " + islandDice1);
										System.out.println("\t\t" + "두번째 주사위 : " + islandDice2);
										if (islandDice1 == islandDice2) {
											System.out.println("\t\t" + "PBK가 퇴원했습니다");
											pcIsland = 0;
											break;
										} else {
											System.out.println("\t\t" + "PBK의 검사 결과가 늦어지고 있습니다...");
											System.out.println("\t\t" + "PBK가 병원밥을 먹습니다 ㅠㅠ");
											pcIsland--;
											System.out.println("\t\t" + "PBK의 남은 입원 일수 : " + pcIsland);
											break;
										}
									}
									// 우주여행
									if (pcSpace > 0) {
										while (pcSpace > 0) {
											System.out.println("\t\t" + "PBK가 이동할 칸 수");
											int move = rd.nextInt(30) + 1;
											System.out.println("\t\t" + move);
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "다시 입력해주세요.");
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
									// 보너스
									if (pc.DiceWhere() == 4 || pc.DiceWhere() == 13 || pc.DiceWhere() == 22
											|| pc.DiceWhere() == 27) {
										System.out.println("\t\t" + "PBK가 보너스칸에 도착했습니다");
										int bonus = rd.nextInt(6) + 1;
										System.out.println("\t\t" + bonus);
										op.bonus(pc, bonus);
										pc.Money();
										break;
									} else if (pc.DiceWhere() % 8 == 0) {
										// 각 특수지구별 효과 호출
										if (pc.DiceWhere() / 8 == 0 || pc.DiceWhere() / 8 == 4) {
											// 출발
											System.out.println("\t\t" + "PBK가 출발지점에 도착했습니다");
											break;
										} else if (pc.DiceWhere() / 8 == 1) {
											// 무인도 - 2턴 쉬기
											System.out.println("\t\t" + "PBK가 코로나가 의심되어 병원에 입원했습니다");
											pcIsland = 2;
											break;
										} else if (pc.DiceWhere() / 8 == 2) {
											// 사회 복지기금 - 자체 카운터에 따라서
											System.out.println("\t\t" + "PBK가 세무서에 도착했습니다");
											op.sw(pc, sw);
											pc.Money();
											break;
										} else if (pc.DiceWhere() / 8 == 3) {
											// 우주여행 - 원하는곳 위치
											System.out.println("\t\t" + "PBK가 크루즈에 탑승하였습니다");
											pcSpace = 1;
											break;
										}

									} else {
										// pc위치
										System.out.println("\t\t" + "PBK가 " + land.get(pc.DiceWhere()).getLandName()
												+ "에 도착 하였습니다 ");
										if (land.get(pc.DiceWhere()).getLandOwner() == 0) {
											// 땅구입 Cnt++
											System.out.println("\t\t" + "현재 소유자가 없는 땅입니다.");
											System.out.println("\t\t" + "PBK가 땅을 구입할지 결정중입니다.");
											op.pcLandBuy(pc, land.get(pc.DiceWhere()));
											System.out.println("\t\t" + "PBK가 땅을 구입했습니다");
											pc.Money();
											System.out.println("\t\t" + "PBK턴을 종료합니다");
											land.get(pc.DiceWhere()).setLandOwner(2);
											land.get(pc.DiceWhere()).setLandCnt(1);
											break;
										} else if (land.get(pc.DiceWhere()).getLandOwner() == 1) {
											// 플레이어땅
											if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
												// 땅만 있음, 통행료, 인수
												op.pcPass(pc, user, land.get(pc.DiceWhere()));
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다");
													pc.Money();
													System.out.println("\t\t" + "PBK턴을 종료합니다");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다");
													break;
												}
											} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
												// 빌딩까지 있음, 통행료, 인수
												op.pcPassBuilding(pc, user, land.get(pc.DiceWhere()));
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice2(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다");
													pc.Money();
													System.out.println("\t\t" + "PBK턴을 종료합니다");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다");
													break;
												}
											} else {
												// 호텔까지 있음, 통행료, 인수
												op.pcPassHotel(pc, user, land.get(pc.DiceWhere()));
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice3(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다");
													pc.Money();
													System.out.println("\t\t" + "PBK턴을 종료합니다");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다");
													break;
												}
											}
										} else if (land.get(pc.DiceWhere()).getLandOwner() == 2) {
											// PC땅
											if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
												// 빌딩구입, 카운터변경
												System.out.println("\t\t" + "PBK가 빌딩을 구입했습니다");
												op.pcBuildingBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(2);
												pc.Money();
												System.out.println("\t\t" + "PBK턴을 종료합니다");
												break;
											} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
												// 호텔구입, 카운터변경
												System.out.println("\t\t" + "PBK가 호텔을 구입했습니다");
												op.pcHotelBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(3);
												pc.Money();
												System.out.println("\t\t" + "PBK턴을 종료합니다");
												break;
											} else {
												System.out.println("\t\t" + "PBK가 구입할 건물이 없습니다");
												System.out.println("\t\t" + "PBK턴을 종료합니다");
											}
										}

									}
								}
							}
						}
						if (user.getUserMoney() < 0 && pc.getPcMoney() > 0)

						{
							System.out.println("\t\t" + "게임에서 패배하셨습니다...");
							System.out.println("\t\t" + "게임을 종료합니다");
							break;
						}
						if (pc.getPcMoney() < 0 && user.getUserMoney() > 0) {
							System.out.println("\t\t" + "게임에서 승리하셨습니다~!!");
							System.out.println("\t\t" + "게임을 종료합니다");
							break;
						}

					}
					while (id.equals("admin")) {
						if (id.equals("admin")) {
							System.out.println("\t\t" + " <<< 관리자 모드 >>>");
							System.out.println("\t\t" + "1. 회원정보수정 2. 회원삭제 3. 전체회원ID보기 4. 관리자 로그아웃");
							System.out.print("\t\t" + "숫자입력 >> ");
							menu = sc.nextInt();
							if (menu == 1) {
								System.out.println("\t\t" + " <<< 관리자 회원정보수정 >>>");
								System.out.print("\t\t" + "아이디 입력 : ");
								String change_id = sc.next();
								System.out.print("\t\t" + "변경할 닉네임 입력 : ");
								String change_nick = sc.next();

								int cnt = dao2.adminUpdate(change_id, change_nick);

								if (cnt > 0) {
									System.out.println("\t\t" + change_nick + "으로 회원정보 수정 완료!!!");
								} else {
									System.out.println("\t\t" + "회원정보 수정 실패...");
								}
							} else if (menu == 2) {

								System.out.println("\t\t" + "<<< 회원삭제 >>>");
								System.out.println("\t\t" + "삭제할 회원을 선택합니다.");
								System.out.print("\t\t" + "ID : ");
								String removeId = sc.next();

								if (dao2.check(removeId)) {

									System.out.print("\t\t" + "[" + nick + "회원을 진짜 탈퇴를 시키시겠습니까? ] Y/N");
									String yn = sc.next();

									if (yn.equals("y") || yn.equals("Y")) {
										int cnt = dao2.deleteId(removeId);
										if (cnt > 0) {
											System.out.println("\t\t" + "회원삭제 완료!!!");
										}
									} else if (yn.equals("n") || yn.equals("N")) {
										System.out.println("\t\t" + "처음부터 다시 시작합니다.");
									} else {
										System.out.println("\t\t" + "잘못 입력했습니다.");
									}
								} else {
									System.out.println("\t\t" + "회원이 존재하지 않습니다.");
								}
							} else if (menu == 3) {
								System.out.println("\t\t" + " <<< 전체회원 정보보기 >>>");
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
								System.out.println("\t\t" + "<<< 관리자 모드 종료 >>>");
								break;
							} else {
								System.out.println("\t\t" + "다시 입력해주세요.");
							}
							System.out.println();
						}
					}

				} else {
					System.out.println("\t\t" + "로그인 실패...");
				}

			} else if (menu == 2) {
				System.out.println("\t\t" + " <<< 회원가입 >>>");
				System.out.print("\t\t" + "아이디 입력 :");
				String id = sc.next();
				System.out.print("\t\t" + "비밀번호를 입력 :");
				String pw = sc.next();
				System.out.print("\t\t" + "닉네임 입력 :");
				String nick = sc.next();
				int cnt = dao2.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("\t\t" + "회원가입 성공");
				} else {
					System.out.println("\t\t" + "회원가입 실패");
				}

			} else if (menu == 3) {
				// 회원 목록 보기
				System.out.println("\t\t" + " <<< 회원목록보기 >>>");
				ArrayList<LandMemberDTO> list = dao2.selectAll();
				System.out.println("\t\t ID\tNick");
				// pbk - 1234 - 호두아빠
				int listNum = 1;
				for (int i = 0; i < list.size(); i++) {
					LandMemberDTO m = list.get(i);
					if (!m.getId().equals("admin")) {
						System.out.print("\t\t" + (listNum++) + ". " + m.getId());
						System.out.println("\t" + m.getNick());
					}
				}

			} else if (menu == 4) {
				System.out.println("\t\t" + "<<< 회원정보수정 >>>");
				System.out.println("\t\t" + "회원정보를 확인합니다.");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();
				String nick = dao2.login(id, pw);
				System.out.println("\t\t" + nick + "님 회원정보가 일치합니다. 회원정보 변경하세요.");

				System.out.print("\t\t" + "변경할 NICKNAME : ");
				String new_nick = sc.next();

				System.out.print("\t\t" + "변경할 PASSWORD : ");
				String new_pw = sc.next();

				int cnt = dao2.update(id, pw, new_nick, new_pw);

				if (cnt > 0) {
					System.out.println("\t\t" + "회원정보 수정 성공!!!");
				} else {
					System.out.println("\t\t" + "회원정보 수정 실패...");
				}

			} else if (menu == 5) {
				// 회원 탈퇴
				System.out.println("\t\t" + "<<< 회원탈퇴 >>>");
				System.out.print("\t\t" + "아이디 입력  : ");
				String id = sc.next();
				System.out.print("\t\t" + "비밀번호 입력 : ");
				String pw = sc.next();
				int cnt = dao2.delete(id, pw);

				if (cnt > 0) {
					System.out.println("\t\t" + "회원삭제 완료");
				} else {
					System.out.println("\t\t" + "회원삭제 실패");
				}
			} else if (menu == 6) {
				System.out.println("\t\t" + "프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("\t\t" + "정확한 숫자를 다시 입력해주세요.");
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
