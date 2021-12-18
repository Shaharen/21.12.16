
public class 쓰레드 {

	public static void main(String[] args) {
		String[] testString = { "선", "을", " ", "결", "정", "합", "니", "다" };

		for (String value : testString) {
			System.out.print(value);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println();
	}

}
