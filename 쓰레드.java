
public class ������ {

	public static void main(String[] args) {
		String[] testString = { "��", "��", " ", "��", "��", "��", "��", "��" };

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
