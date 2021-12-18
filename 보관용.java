
import java.util.ArrayList;

public class 보관용 {

	public void landInform(ArrayList<LandDTO> land, int input) {//23

		for (; input < land.size();) {
			if (input % 8 == 0) {
				if (input / 8 == 0) {
					System.out.println("출발지점 입니다");
					System.out.println("이곳을 지나면 월급을 받습니다");
				} else if (input / 8 == 1) {
					System.out.println("무인도 입니다");
					System.out.println("2턴간 쉬게되며 같은 주사위 눈이 나오면 탈출합니다");
				} else if (input / 8 == 2) {
					System.out.println("세무서 입니다");
					System.out.println("연말정산 결과에 따라");
					System.out.println("납부한 세금을 받거나 부족한 세금을 납부합니다");
				} else if (input / 8 == 3) {
					System.out.println("한강 크루즈 입니다");
					System.out.println("다음턴 원하는 곳으로 이동할 수 있습니다");
				}
				break;
			} else if (input == 4 || input == 13 || input == 22 || input == 27) {
				System.out.println("보너스 칸입니다");
				System.out.println("상황에 따라 자금을 받거나 뺏깁니다");
				break;
			} else {
				LandDTO m = land.get(input);// land.get(23) -> 23번땅 호출
				System.out.println("<< 동네 정보 >>");
				System.out.println("동네\t동네가격\t빌딩가격\t호텔가격\t통행료\t빌딩사용료\t호텔비\t인수비용\t빌딩인수\t호텔인수");
				System.out.println(m.toString());
				break;
			}

		}

	}
	
	
	
}
