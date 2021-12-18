import java.util.Random;
import java.util.Scanner;

public class 보관용4 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int turnCnt = 1; // 턴 카운트 변수
		int diceSum = 1; // 시작지점, 바퀴계산 (32칸의 나머지)
		int PlayerWhere = diceSum % 32; // 현재위치
		int landOwner = 2; // 땅 소유권 ( 각 메소드로 변경할 것 )
		int landNumber = 0; // 땅 번호
		int userMoney = 500; // 초기자금
		int PcMoney = 500;
		int landPrice = 10;
		int building = 20;// 빌딩값
		int hotel = 30;// 호텔값
		int landPass = 30; // 통행료
		int interceptLand = landPass * 2;// 인수 가격
		int landCnt = 1;
		// 턴종료 -> 불리언으로 턴 t/f 값 구현후 각 턴을 종료합니에서 불리언 f로
		// PC플레이어 턴이 끝나면 불리언 t 로 변경시켜 다시 반복

		while (true) { // money < 0
			turnCnt++; // 턴시작
			if (turnCnt % 2 == 1) {
				break;
			}
			// 주사위 굴리기
			System.out.println("플레이어 턴입니다");
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			int diceAdd = dice1 + dice2; // 주사위 합
			System.out.println();
			System.out.println("주사위 결과 : " + dice1 + "," + dice2);
			System.out.println(diceAdd + "만큼 이동합니다");
			diceSum += diceAdd;

			// 보드판 출력

			// 도시 또는 특수지구 메소드
			// 플레이어 행동
			// '특수지구'일경우
			if (PlayerWhere % 8 == 0) {
				// 각 특수지구별 효과 호출
				if (PlayerWhere / 8 == 0 || PlayerWhere / 8 == 4) {
					// 출발
				} else if (PlayerWhere / 8 == 1) {
					// 무인도
				} else if (PlayerWhere / 8 == 2) {
					// 사회 복지기금
				} else if (PlayerWhere / 8 == 3) {
					// 우주여행
				}
			} else {
				// '도시'일경우 ( 각 도시에 맞는 땅소유권, 건물가격 전부 호출 )
				if (landOwner == 0) {
					System.out.println("현재 소유자가 없는 땅입니다.");
					while (true) {
						System.out.println("땅을 구매 하시겠습니까? Y / N");
						String choiceLand = sc.next();
						if (choiceLand.equals("Y")) {
							if (userMoney - landPrice < 0) {
								System.out.println("플레이어의 소유 재산이 부족합니다.");
								System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
								System.out.println("턴을 종료합니다");
								break;
							} else {
								userMoney -= landPrice;
								landOwner = 1; // 소유권 플레이어로 변경
								landCnt++;
								System.out.println("플레이어의 남은 재산 : " + userMoney + "억");
								System.out.println("턴을 종료합니다");
								// 해당 땅의 통행료 증가
								break;
							}
						} else if (choiceLand.equals("N")) {
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
							if (plusBuilding.equals("Y")) {
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
//									landCnt++:
									break;
								}
							} else if (plusBuilding.endsWith("N")) {
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
							if (plusHotel.equals("Y")) {
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
//									landCnt++:
									break;
								}
							} else if (plusHotel.endsWith("N")) {
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
					// PC의 재산 landPass 만큼 증가
					// PcMoney += landPass;
					System.out.println("남은 재산 : " + userMoney + "억");
					// 파산 여부
					if (userMoney < 0) {
						System.out.println("파산했습니다");
						System.out.println("게임에서 패배 하셨습니다");
						System.out.println("게임을 종료합니다");
						break;
					}
					// 인수 여부 ( 각 인수 금액 호출 필요 )
					System.out.println("인수 금액은 통행료의 2배입니다");
					while (true) {
						System.out.println("인수 하시겠습니까?  Y / N");
						String intercept = sc.next();
						if (intercept.equals("Y")) {
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
						} else if (intercept.equals("N")) {
							System.out.println("턴을 종료합니다");
							break;
						} else {
							System.out.println("다시 입력하세요");
						}

					}
				}
			}
		}
	}
}
