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

		int turnCnt = 0; // 턴 카운트 변수
		int island = 0; // 무인도 변수
		int sw = rd.nextInt(5);// 세무서 변수
		int space = 0; // 한강 크루즈 변수

		System.out.println("선을 결정합니다.");
		int userDice = rd.nextInt(6) + 1;
		int pcDice = rd.nextInt(6) + 1;
		System.out.println("플레이어 주사위 : " + userDice);
		System.out.println("PC 주사위 : " + pcDice);
		if (userDice >= pcDice) {
			turnCnt = 0;
			System.out.println("플레이어 선입니다");
		} else {
			turnCnt = 1;
			System.out.println("PC 선입니다");
		}
		System.out.println("--------------------------------");

		while (user.getUserMoney() >= 0 && pc.getPcMoney() >= 0) {
			sw++; // 사회 복지기금 카운터 증가
			// 사용자 플레이어
			if (turnCnt % 2 == 0) {
				turnCnt++;
				while (true) {
					System.out.println();
					System.out.println("플레이어 턴입니다");
					// 지역 정보 호출 또는 다이스 선택
					System.out.println("행동을 선택하세요");
					while (true) {
						System.out.print("[ 1. 턴 시작  2. 지역 정보 호출 ] >> ");
						int choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("턴을 시작합니다");
							System.out.println();
							break;
						} else if (choice == 2) {
							System.out.println("호출할 지역 번호를 입력하세요");
							System.out.println("지역 번호는 0(출발)부터 31입니다");
							System.out.print("입력하신 지역 번호 : ");
							int landChoice = sc.nextInt();
							inform.landInform(land, landChoice);
						} else {
							System.out.println("다시 입력하세요");
						}
					}

					// 무인도 패턴
					if (island > 0) {
						int islandDice1 = rd.nextInt(6) + 1;
						int islandDice2 = rd.nextInt(6) + 1;
						System.out.println("첫번째 주사위 : " + islandDice1);
						System.out.println("두번째 주사위 : " + islandDice2);
						if (islandDice1 == islandDice2) {
							System.out.println("아~ 이걸 탈출하네");
							island = 0;
							break;
						} else {
							System.out.println("배를 발견하지 못했습니다...");
							System.out.println("님 이동 못함 ㅋ");
							island--;
							System.out.println("남은 무인도 횟수 : " + island);
							break;
						}
					}
					// 크루즈 (우주여행)
					if (space > 0) {
						while (space > 0) {
							System.out.println("이동할 칸 수를 입력하세요 (1 ~ 31 칸)");
							int move = sc.nextInt();
							if (move >= 32 || move <= 0) {
								System.out.println("다시 입력해주세요.");
							} else {
								user.space(move);
								space = 0;
							}
						}
					} else {
						// 턴 다이스
						user.Dice();
						user.DiceSum();
					}
					// 보너스
					if (user.DiceWhere() == 4 || user.DiceWhere() == 13 || user.DiceWhere() == 22
							|| user.DiceWhere() == 27) {
						int bonus = rd.nextInt(6) + 1;
						System.out.println(bonus);
						op.bonus(user, bonus);
						user.Money();
						break;
					} else if (user.DiceWhere() % 8 == 0) {
						// 각 특수지구별 효과 호출
						if (user.DiceWhere() / 8 == 0 || user.DiceWhere() / 8 == 4) {
							// 출발
							System.out.println("출발지점에 도착했습니다");
							break;
						} else if (user.DiceWhere() / 8 == 1) {
							// 무인도 - 2턴 쉬기
							System.out.println("무인도에 갇혔습니다");
							island = 2;
							break;
						} else if (user.DiceWhere() / 8 == 2) {
							// 사회 복지기금 - 자체 카운터에 따라서, 세무서로 이름 변경
							System.out.println("세무서에 도착하셨습니다");
							op.sw(user, sw);
							user.Money();
							break;
						} else if (user.DiceWhere() / 8 == 3) {
							// 우주여행 - 원하는곳 위치
							System.out.println("크루즈에 탑승하셨습니다");
							System.out.println("다음턴 원하는 곳으로 이동합니다");
							space = 1;
							break;
						}

					} else {
						// 도시도착 알림
						System.out.println(land.get(user.DiceWhere()).getLandName() + "에 도착 하였습니다 ");
						// 소유 판별 0 1 2
						if (land.get(user.DiceWhere()).getLandOwner() == 0) {
							// 땅구입 Cnt++
							System.out.println("현재 소유자가 없는 땅입니다.");
							while (true) {
								System.out.println("땅을 구입하시겠습니까? Y / N");
								String choiceLand = sc.next();
								if (choiceLand.equals("Y") || choiceLand.equals("y")) {
									op.userLandBuy(user, land.get(user.DiceWhere()));
									user.Money();
									System.out.println("플레이어턴을 종료합니다");
									land.get(user.DiceWhere()).setLandOwner(1);
									land.get(user.DiceWhere()).setLandCnt(1);
									break;
								} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
									System.out.println("땅을 구매하지 않았습니다.");
									user.Money();
									System.out.println("플레이어턴을 종료합니다");
									break;
								} else {
									System.out.println("다시 입력해주세요");
								}
							}
							break;
						} else if (land.get(user.DiceWhere()).getLandOwner() == 1) {
							// 플레이어땅이고, 건설 여부 (CNT)
							System.out.println("플레이어 땅입니다");
							if (land.get(user.DiceWhere()).getLandCnt() == 1) {
								// 빌딩
								while (true) {
									System.out.println("빌딩을 건설하시겠습니까? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userBuildingBuy(user, land.get(user.DiceWhere()));
										user.Money();
										land.get(user.DiceWhere()).setLandCnt(2);
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("땅을 구매하지 않았습니다.");
										user.Money();
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else {
										System.out.println("다시 입력해주세요");
									}
								}
								break;
							} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
								// 호텔
								while (true) {
									System.out.println("호텔을 건설하시겠습니까? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userHotelBuy(user, land.get(user.DiceWhere()));
										user.Money();
										land.get(user.DiceWhere()).setLandCnt(3);
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("땅을 구매하지 않았습니다.");
										user.Money();
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else {
										System.out.println("다시 입력해주세요");
									}
								}
								break;
							} else {
								// 더이상 건설할 땅 없음
								System.out.println("더이상 건설할 땅이 없습니다.");
								System.out.println("플레이어턴을 종료합니다");
								break;
							}
						} else if (land.get(user.DiceWhere()).getLandOwner() == 2) {
							// PC땅, 통행료계산, 인수여부 (OWNER,CNT)
							System.out.println("PC의 땅입니다");
							if (land.get(user.DiceWhere()).getLandCnt() == 1) {
								// 땅만 있음, 땅통행료 지불, 인수여부 물어볼것
								op.userPass(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("인수 하시겠습니까? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice(user, pc, land.get(user.DiceWhere()));
										System.out.println("인수를 선택하셨습니다");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else {
										System.out.println("다시 입력해주세요");
									}
								}
								break;
							} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
								// 빌딩까지 있음, 통행료2 지불, 인수여부
								op.userPassBuilding(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("인수 하시겠습니까? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice2(user, pc, land.get(user.DiceWhere()));
										System.out.println("인수를 선택하셨습니다");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else {
										System.out.println("다시 입력해주세요");
									}
								}
								break;
							} else {
								// 호텔까지 있음, 통행료3 지불, 인수여부
								op.userPassHotel(user, pc, land.get(user.DiceWhere()));
								while (true) {
									System.out.println("인수 하시겠습니까? Y / N");
									String choiceLand = sc.next();
									if (choiceLand.equals("Y") || choiceLand.equals("y")) {
										op.userInterceptPrice3(user, pc, land.get(user.DiceWhere()));
										System.out.println("인수를 선택하셨습니다");
										land.get(user.DiceWhere()).setLandOwner(1);
										user.Money();
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
										System.out.println("플레이어턴을 종료합니다");
										break;
									} else {
										System.out.println("다시 입력해주세요");
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
					System.out.println("PC플레이어 턴입니다.");
					// 무인도 패턴
					if (island > 0) {
						int islandDice1 = rd.nextInt(6) + 1;
						int islandDice2 = rd.nextInt(6) + 1;
						System.out.println("첫번째 주사위 : " + islandDice1);
						System.out.println("두번째 주사위 : " + islandDice2);
						if (islandDice1 == islandDice2) {
							System.out.println("PC가 무인도에서 탈출했습니다");
							island = 0;
							break;
						} else {
							System.out.println("PC가 배를 발견하지 못했습니다...");
							System.out.println("PC 이동 못함 ㅠㅠ");
							island--;
							System.out.println("PC의 남은 무인도 횟수 : " + island);
							break;
						}
					}
					// 우주여행
					if (space > 0) {
						while (space > 0) {
							System.out.print("PC가 이동할 칸 수");
							int move = rd.nextInt(30) + 1;
							if (move >= 32 || move <= 0) {
								System.out.println("다시 입력해주세요.");
							} else {
								pc.space(move);
								space = 0;
							}
						}
					} else {
						pc.Dice();
						pc.DiceSum();
					}
					// 보너스
					if (pc.DiceWhere() == 4 || pc.DiceWhere() == 13 || pc.DiceWhere() == 22 || pc.DiceWhere() == 27) {
						int bonus = rd.nextInt(6) + 1;
						System.out.println(bonus);
						op.bonus(pc, bonus);
						pc.Money();
						break;
					} else if (pc.DiceWhere() % 8 == 0) {
						// 각 특수지구별 효과 호출
						if (pc.DiceWhere() / 8 == 0 || pc.DiceWhere() / 8 == 4) {
							// 출발
							System.out.println("PC가 출발지점에 도착했습니다");
							break;
						} else if (pc.DiceWhere() / 8 == 1) {
							// 무인도 - 2턴 쉬기
							System.out.println("PC가 무인도에 갇혔습니다");
							island = 2;
							break;
						} else if (pc.DiceWhere() / 8 == 2) {
							// 사회 복지기금 - 자체 카운터에 따라서
							System.out.println("PC가 세무서에 도착했습니다");
							op.sw(pc, sw);
							pc.Money();
							break;
						} else if (pc.DiceWhere() / 8 == 3) {
							// 우주여행 - 원하는곳 위치
							System.out.println("PC가 크루즈에 탑승하였습니다");
							space = 1;
							break;
						}

					} else {
						// pc위치
						System.out.println("PC가 " + land.get(pc.DiceWhere()).getLandName() + "에 도착 하였습니다 ");
						if (land.get(pc.DiceWhere()).getLandOwner() == 0) {
							// 땅구입 Cnt++

							System.out.println("현재 소유자가 없는 땅입니다.");

							System.out.println("PC가 땅을 구입할지 결정중입니다.");
							op.pcLandBuy(pc, land.get(pc.DiceWhere()));
							System.out.println("PC가 땅을 구입했습니다");
							pc.Money();
							System.out.println("PC턴을 종료합니다");
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
									System.out.println("PC가 땅을 인수했습니다");
									pc.Money();
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									System.out.println("PC가 인수하지않고 턴을 종료했습니다");
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
									System.out.println("PC가 땅을 인수했습니다");
									pc.Money();
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									System.out.println("PC가 인수하지않고 턴을 종료했습니다");
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
									System.out.println("PC가 땅을 인수했습니다");
									pc.Money();
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									System.out.println("PC가 인수하지않고 턴을 종료했습니다");
									break;
								}
							}
						} else if (land.get(pc.DiceWhere()).getLandOwner() == 2) {
							// PC땅
							if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
								// 빌딩구입, 카운터변경
								System.out.println("PC가 빌딩을 구입했습니다");
								op.pcBuildingBuy(pc, land.get(pc.DiceWhere()));
								land.get(pc.DiceWhere()).setLandCnt(2);
								pc.Money();
								System.out.println("PC턴을 종료합니다");
								break;
							} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
								// 호텔구입, 카운터변경
								System.out.println("PC가 호텔을 구입했습니다");
								op.pcHotelBuy(pc, land.get(pc.DiceWhere()));
								land.get(pc.DiceWhere()).setLandCnt(3);
								pc.Money();
								System.out.println("PC턴을 종료합니다");
								break;
							} else {
								System.out.println("PC가 구입할 건물이 없습니다");
								System.out.println("PC턴을 종료합니다");
							}
						}

					}
				}
			}
		}
		if (user.getUserMoney() < 0 && pc.getPcMoney() > 0)

		{
			System.out.println("게임에서 패배하셨습니다...");
			System.out.println("게임을 종료합니다");
		}
		if (pc.getPcMoney() < 0 && user.getUserMoney() > 0) {
			System.out.println("게임에서 승리하셨습니다~!!");
			System.out.println("게임을 종료합니다");
		}
	}
}
