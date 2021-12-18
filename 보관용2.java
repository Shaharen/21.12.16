import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 보관용2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Pc pc = new Pc();
		LandDAO dao = new LandDAO();
		ArrayList<LandDTO> land = dao.selectAll(); // 나중에 형식 land로 변경
		System.out.println(land.get(2).getPrice());
		
		
		int turnCnt = 0; // 턴 카운트 변수
		int diceSum = 1; // 시작지점, 바퀴계산 (32칸의 나머지)
		int userWhere = diceSum % 32; // 현재위치
		int pcWhere = diceSum % 32; // 현재위치
		
		int landOwner = 0; // 땅 소유권 ( 각 메소드로 변경할 것 )
		int landNumber = 0; // 땅 번호
		int userMoney = 1000; // 초기자금
		int PcMoney = 1000;
		int landPrice = 0;
		int building = 0;// 빌딩값
		int hotel = 0;// 호텔값
		int landPass = 0; // 통행료
		int interceptLand = 0;// 인수 가격
		int landCnt = 0;

		System.out.println("선을 결정합니다.");
		int userDice = random.nextInt(6) + 1;
		int pcDice = random.nextInt(6) + 1;
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
		while (true) { // money < 0
			turnCnt++;
			if (turnCnt % 2 == 1) {
				// 주사위 굴리기
				System.out.println("플레이어 턴입니다");
				user.Dice();
//				int dice1 = random.nextInt(6) + 1;
//				int dice2 = random.nextInt(6) + 1;
//				int diceAdd = dice1 + dice2; // 주사위 합
//				System.out.println("주사위 결과 : " + dice1 + "," + dice2);
//				System.out.println(diceAdd + "만큼 이동합니다");
				user.DiceSum();
//				diceSum += diceAdd;

				// 보드판 출력

				// 도시 또는 특수지구 메소드
				// 플레이어 행동
				// '특수지구'일경우
				if (userWhere % 8 == 0) {
					// 각 특수지구별 효과 호출
					if (userWhere / 8 == 0 || userWhere / 8 == 4) {
						// 출발
					} else if (userWhere / 8 == 1) {
						// 무인도
					} else if (userWhere / 8 == 2) {
						// 사회 복지기금
					} else if (userWhere / 8 == 3) {
						// 우주여행
					}
				} else {
					// '도시'일경우 ( 각 도시에 맞는 땅소유권, 건물가격 전부 호출 )
					System.out.println("랜드 카운터 : " + landCnt);
					if (landOwner == 0) {
						System.out.println("현재 소유자가 없는 땅입니다.");
						while (true) {
							System.out.println("땅을 구매 하시겠습니까? Y / N");
							String choiceLand = sc.next();
							if (choiceLand.equals("Y") || choiceLand.equals("y")) {
								if (userMoney - landPrice < 0) {
									System.out.println("플레이어의 소유 재산이 부족합니다.");
									System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
									System.out.println("턴을 종료합니다");
									break;
								} else {
									
									landOwner = 1; // 소유권 플레이어로 변경
									landCnt++;
									// 땅 구매 메소드
									land.get(userWhere);
//									newOp.land(i);
//									land18.landCnt++;
									System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
									System.out.println("턴을 종료합니다");
									// 해당 땅의 통행료 증가
									break;
								}
							} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
								System.out.println("턴을 종료합니다.");
								break;
							} else {
								System.out.println("다시 입력해주세요");
							}
						}
					} else if (landOwner == 1) {
						System.out.println("플레이어의 땅입니다");
						if (landCnt == 1) {
							System.out.println("땅만 구입된 땅입니다");
							while (true) {
								System.out.println("빌딩을 건설 하시겠습니까? Y / N");
								String plusBuilding = sc.next();
								if (plusBuilding.equals("Y") || plusBuilding.equals("y")) {
									if (userMoney - building < 0) {
										System.out.println("플레이어의 재산이 부족합니다");
										System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
										System.out.println("턴을 종료합니다");
										break;
									} else {
										userMoney -= building;
										System.out.println("빌딩을 건설했습니다");
										System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
										System.out.println("턴을 종료합니다");
										landCnt++;
//										land18.landCnt++;
										break;
									}
								} else if (plusBuilding.equals("N") || plusBuilding.equals("n")) {
									System.out.println("건설하지않고 턴을 종료했습니다");
									break;
								} else {
									System.out.println("다시 입력해주세요");
								}
							}
						} else if (landCnt == 2) {
							System.out.println("빌딩까지 구입된 땅입니다");
							while (true) {
								System.out.println("호텔을 건설 하시겠습니까? Y / N");
								String plusHotel = sc.next();
								if (plusHotel.equals("Y") || plusHotel.equals("y")) {
									if (userMoney - hotel < 0) {
										System.out.println("플레이어의 재산이 부족합니다");
										System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
										System.out.println("턴을 종료합니다");
										break;
									} else {
										userMoney -= hotel;
										System.out.println("호텔을 건설했습니다");
										System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
										System.out.println("턴을 종료합니다");
										landCnt++;
//										land18.landCnt++;
										break;
									}
								} else if (plusHotel.equals("N") || plusHotel.equals("n")) {
									System.out.println("건설하지않고 턴을 종료했습니다");
									break;
								} else {
									System.out.println("다시 입력해주세요");
								}
							}
						}
					} else if (landOwner == 2) {
						System.out.println("PC의 땅입니다");
						// 땅 통행료 호출
						System.out.println("통행료는 " + landPass + "입니다");
						userMoney -= landPass;
						PcMoney += landPass;
						System.out.println("남은 재산 : " + userMoney + "억");
						// 파산 여부
						if (userMoney < 0) {
							System.out.println("파산했습니다");
							System.out.println("게임에서 패배 하셨습니다");
							System.out.println("게임을 종료합니다");
							break;
						}
						// 인수 여부 ( 각 인수 금액 호출 필요 )
						while (true) {
							System.out.println("인수 하시겠습니까?  Y / N");
							String intercept = sc.next();
							if (intercept.equals("Y") || intercept.equals("y")) {
								if (userMoney - interceptLand < 0) {
									System.out.println("소지금이 부족합니다.");
									System.out.println("남은 재산 : " + userMoney + "억");
									System.out.println("턴을 종료합니다");
									break;
								} else {
									landOwner = 1;
									// 인수값 만큼 원래 땅주인의 재산 늘릴지 여부 필요
									userMoney -= interceptLand;
									PcMoney += interceptLand;
									System.out.println("땅을 인수하였습니다");
									System.out.println("남은 재산 : " + userMoney + "억");
									System.out.println("턴을 종료합니다");
									break;
								}
							} else if (intercept.equals("N") || intercept.equals("n")) {
								System.out.println("턴을 종료합니다");
								break;
							} else {
								System.out.println("다시 입력하세요");
							}

						}
					}
				}
				// 후플레이어
			} else if (turnCnt % 2 == 0) {

				// 주사위 굴리기
				System.out.println("PC 플레이어 턴");
				int dice1 = random.nextInt(6) + 1;
				int dice2 = random.nextInt(6) + 1;
				int diceAdd = dice1 + dice2;
				System.out.println("주사위 결과 : " + dice1 + "," + dice2);
				System.out.println(diceAdd + "만큼 이동합니다");
				diceSum += diceAdd;

				// 보드판 출력

				// 도시 또는 특수지구 메소드
				// PC 행동
				// '특수지구'일경우
				if (pcWhere % 8 == 0) {
					// 각 특수지구별 효과 호출
					if (pcWhere / 8 == 0 || pcWhere / 8 == 4) {
						// 출발
					} else if (pcWhere / 8 == 1) {
						// 무인도
					} else if (pcWhere / 8 == 2) {
						// 사회 복지기금
					} else if (pcWhere / 8 == 3) {
						// 우주여행
					}
				} else {
					// '도시'일경우 ( 각 도시에 맞는 땅소유권, 건물가격 전부 호출 )
					System.out.println("랜드 카운터 : " + landCnt);
					if (landOwner == 0) {
						System.out.println("PC가 소유자가 없는 땅에 도착했습니다");
						System.out.println("PC가 땅 구매여부를 결정 중 입니다");

						while (true) { // PcMoney < 0
							// 땅구매
							if (PcMoney - landPrice < 0) {
								System.out.println("PC의 소유 재산이 부족합니다.");
								System.out.println("PC의 남은 재산 : " + PcMoney + "억");
								System.out.println("PC턴을 종료합니다");
								break;
							} else {
								PcMoney -= landPrice;
								landOwner = 2; // 소유권 PC로 변경
								landCnt++;
//								land18.landCnt++;
								System.out.println("PC가 땅을 구매했습니다");
								System.out.println("PC의 남은 재산 : " + PcMoney + "억");
								System.out.println("PC턴을 종료합니다");
								// 해당 땅의 통행료 증가
								break;
							}
						}
					} else if (landOwner == 1) {
						System.out.println("플레이어의 땅입니다");
						// 땅 통행료 호출
						System.out.println("통행료는 " + landPass + "입니다");
						PcMoney -= landPass;
						userMoney += landPass;
						System.out.println("PC의 남은 재산 : " + PcMoney + "억");
						// 파산 여부
						if (PcMoney < 0) {
							System.out.println("PC가 파산했습니다");
							System.out.println("게임에서 승리하셨습니다");
							break;
						}
						// 인수 여부 ( 각 인수 금액 호출 필요 )
						while (true) {
							System.out.println("인수 여부를 결정 중입니다");
							int intercept = random.nextInt(2);
							if (intercept == 0) {
								if (PcMoney - interceptLand < 0) {
									System.out.println("PC의 재산이 부족합니다.");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									landOwner = 2;
									PcMoney -= interceptLand;
									System.out.println("PC가 땅을 인수하였습니다");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									userMoney += interceptLand;
									System.out.println("PC턴을 종료합니다");
									break;
								}
							} else if (intercept == 1) {
								System.out.println("인수하지 않고 턴을 종료합니다");
								break;
							}
						}
					} else if (landOwner == 2) {
						// 랜드 카운터 확인 후 땅 빌딩 호텔 순서로 짓는다
						System.out.println("PC의 땅입니다");
						if (landCnt == 1) {
							int plusBuilding = random.nextInt(2);
							if (plusBuilding == 0) { // 빌딩건설
								if (PcMoney - building < 0) {
									System.out.println("PC의 재산이 부족합니다.");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									PcMoney -= building;
									System.out.println("PC가 빌딩을 건설했습니다");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									System.out.println("PC턴을 종료합니다");
									landCnt++;
//									land18.landCnt++;

								}
							} else if (plusBuilding == 1) { // 건설 안함
								System.out.println("PC가 건설하지않고 턴을 종료했습니다");
								break;
							}
						} else if (landCnt == 2) {
							int plusHotel = random.nextInt(2);
							if (plusHotel == 0) {// 호텔 건설
								if (PcMoney - hotel < 0) {
									System.out.println("PC의 재산이 부족합니다.");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									System.out.println("PC턴을 종료합니다");
									break;
								} else {
									PcMoney -= hotel;
									System.out.println("PC가 호텔을 건설했습니다");
									System.out.println("PC의 남은 재산 : " + PcMoney + "억");
									System.out.println("PC턴을 종료합니다");
									landCnt++;
//									land18.landCnt++;

								}
							} else if (plusHotel == 1) {// 건설 안함
								System.out.println("PC가 건설하지않고 턴을 종료했습니다");
								break;
							}
						} else if (landCnt == 3) {
							System.out.println("지을수 있는 건물이 없습니다");
							System.out.println("턴을 종료합니다");
						}
					}
				}
			}
			System.out.println();
		}
	}
	

}
