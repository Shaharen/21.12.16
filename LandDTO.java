public class LandDTO {

	// �����ͺ��̽��� ǥ���ϱ����� ����� ������ VO Ŭ�����̴�
	// VO Ŭ���� -> Value Object(����� ������ Ŭ����)
	private String landName;
	private int price;
	private int building;
	private int hotel;
	private int pass;
	private int passBuilding;
	private int passHotel;
	private int interceptPrice;
	private int interceptPrice2;
	private int interceptPrice3;
	private int landOwner;
	private int landCnt;
	private int landNumber;

	public LandDTO(String landName, int price, int building, int hotel, int pass, int passBuiliding, int passHotel,
			int interceptPrice, int interceptPrice2, int interceptPrice3, int landOwner, int landCnt, int landNumber) {
		this.landName = landName;
		this.price = price;
		this.building = building;
		this.hotel = hotel;
		this.pass = pass;
		this.passBuilding = passBuiliding;
		this.passHotel = passHotel;
		this.interceptPrice = interceptPrice;
		this.interceptPrice2 = interceptPrice2;
		this.interceptPrice3 = interceptPrice3;
		this.landOwner = landOwner;
		this.landCnt = landCnt;
		this.landNumber = landNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLandName() {
		return landName;
	}

	public int getBuilding() {
		return building;
	}

	public int getHotel() {
		return hotel;
	}

	public int getPass() {
		return pass;
	}

	public int getPassBuilding() {
		return passBuilding;
	}

	public int getPassHotel() {
		return passHotel;
	}

	public int getInterceptPrice() {
		return interceptPrice;
	}

	public int getInterceptPrice2() {
		return interceptPrice2;
	}

	public int getInterceptPrice3() {
		return interceptPrice3;
	}
	public int getLandOwner() {
		return landOwner;
	}
	public void setLandOwner(int landOwner) {
		this.landOwner = landOwner;
	}
	public int getLandCnt() {
		return landCnt;
	}
	public void setLandCnt(int landCnt) {
		this.landCnt = landCnt;
	}
	public int getLandNumber() {
		return landNumber;
	}
	
	public String toString() {
		return landName + "\t" + price + "��\t" + building + "��\t" + hotel + "��\t" + pass + "��\t" + passBuilding + "��\t"
				+ passHotel + "��\t" + interceptPrice + "��\t" + interceptPrice2 + "��\t" + interceptPrice3 + "��";
	}

}