//import java.util.ArrayList;
//
//public class Out {
////
////	LandDAO dao = new LandDAO();
////	ArrayList<LandDTO> land = dao.selectAll();
//
//	public void outPrint(int userWhere, int pcWhere, ArrayList<LandDTO> land) {
//
////		land.get(1).getLandOwner();
//
////		LandDTO m = land.get(i);
////		System.out.println("testuser" + userWhere);
////		System.out.println("testpc" + pcWhere);
////		System.out.println("test : "+land.get(1).getLandOwner()+land.get(2).getLandOwner()+land.get(3).getLandOwner()+land.get(5).getLandOwner()+land.get(6).getLandOwner()+land.get(7).getLandOwner());
//
//		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
//		System.out.println("|8" + "\t|9" + ownerCheck(land.get(9).getLandOwner()) + "\t|10"
//				+ ownerCheck(land.get(10).getLandOwner()) + "\t|11" + ownerCheck(land.get(11).getLandOwner()) + "\t|12"
//				+ ownerCheck(land.get(12).getLandOwner()) + "\t|13\t|14" + ownerCheck(land.get(14).getLandOwner())
//				+ "\t|15" + ownerCheck(land.get(15).getLandOwner()) + "\t|16\t|");
//		System.out.println("|병원\t|자곡동\t|대방동\t|논현동\t|서초동\t|보너스\t|아현동\t|교북동\t|세무소\t|");
//		System.out.println("|" + go8(userWhere, pcWhere) + "\t|" + go9(userWhere, pcWhere) + "\t|"
//				+ go10(userWhere, pcWhere) + "\t|" + go11(userWhere, pcWhere) + "\t|" + go12(userWhere, pcWhere) + "\t|"
//				+ go13(userWhere, pcWhere) + "\t|" + go14(userWhere, pcWhere) + "\t|" + go15(userWhere, pcWhere) + "\t|"
//				+ go16(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
//		System.out.println("|7" + ownerCheck(land.get(7).getLandOwner()) + "\t|" + "당신의 말 : [○]" + "\t" + "\t" + "\t"
//				+ "\t" + "\t" + "\t" + "|17" + ownerCheck(land.get(17).getLandOwner()) + "\t|");
//		System.out.println("|사당동\t|" + "당신의 땅 : [☆]" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "|성수동\t|");
//		System.out.println("|" + go7(userWhere, pcWhere) + "\t|                                                       |"
//				+ go17(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|6" + ownerCheck(land.get(6).getLandOwner()) + "\t|" + "PBK의 말 : [●]"
//				+  "\t" + "\t" + "\t" + "\t" + "\t" + "\t"  + "|18" + ownerCheck(land.get(18).getLandOwner())
//				+ "\t|");
//		System.out.println("|신당동\t|" + "PBK의 땅 : [★]" +  "\t" + "\t" + "\t" + "\t" + "\t" + "\t"  + "|수유동\t|");
//		System.out.println("|" + go6(userWhere, pcWhere) + "\t|                                                       |"
//				+ go18(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|5" + ownerCheck(land.get(5).getLandOwner()) + "\t|"
//				+ "                                                       " + "|19"
//				+ ownerCheck(land.get(19).getLandOwner()) + "\t|");
//		System.out.println("|도곡동\t|                                                       |반포동\t|");
//		System.out.println("|" + go5(userWhere, pcWhere) + "\t|                             "
//				+ "                          |" + go19(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|4" + "\t|" + "                                                       " + "|20"
//				+ ownerCheck(land.get(20).getLandOwner()) + "\t|");
//		System.out.println("|보너스\t|                                                       |삼성동\t|");
//		System.out.println("|" + go4(userWhere, pcWhere) + "\t|                                                       |"
//				+ go20(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|3" + ownerCheck(land.get(3).getLandOwner())
//				+ "\t|                                                       |21"
//				+ ownerCheck(land.get(21).getLandOwner()) + "\t|");
//		System.out.println("|노량진동\t|                                                       |신계동\t|");
//		System.out.println("|" + go3(userWhere, pcWhere) + "\t|                                                       |"
//				+ go21(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|2" + ownerCheck(land.get(2).getLandOwner())
//				+ "\t|                                                       |22\t|");
//		System.out.println("|방배동\t|                                                       |보너스\t|");
//		System.out.println("|" + go2(userWhere, pcWhere) + "\t|                                                       |"
//				+ go22(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+                                                       +-------+");
//		System.out.println("|1" + ownerCheck(land.get(1).getLandOwner())
//				+ "\t|                                                       |23"
//				+ ownerCheck(land.get(23).getLandOwner()) + "\t|");
//		System.out.println("|안암동\t|                                                       |수서동\t|");
//		System.out.println("|" + go1(userWhere, pcWhere) + "\t|                                                       |"
//				+ go23(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
//		System.out.println("|0\t|31" + ownerCheck(land.get(31).getLandOwner()) + "\t|30"
//				+ ownerCheck(land.get(30).getLandOwner()) + "\t|29" + ownerCheck(land.get(29).getLandOwner()) + "\t|28"
//				+ ownerCheck(land.get(28).getLandOwner()) + "\t|27\t|26" + ownerCheck(land.get(26).getLandOwner())
//				+ "\t|25" + ownerCheck(land.get(25).getLandOwner()) + "\t|24\t|");
//		System.out.println("|출발\t|압구정동\t|청담동\t|개포동\t|잠원동\t|보너스\t|잠실동\t|대치동\t|서울여행\t|");
//		System.out.println("|" + go0(userWhere, pcWhere) + "\t|" + go31(userWhere, pcWhere) + "\t|"
//				+ go30(userWhere, pcWhere) + "\t|" + go29(userWhere, pcWhere) + "\t|" + go28(userWhere, pcWhere) + "\t|"
//				+ go27(userWhere, pcWhere) + "\t|" + go26(userWhere, pcWhere) + "\t|" + go25(userWhere, pcWhere) + "\t|"
//				+ go24(userWhere, pcWhere) + "\t|");
//		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
//
//	}
//
//	public String ownerCheck(int landOwner) {
//		String exp = "";
//		if (landOwner == 0) {
//
//		} else if (landOwner == 1) {
//			exp += "[☆]";
//		} else if (landOwner == 2) {
//			exp += "[★]";
//		}
//		return exp;
//	}
//
//	public String go0(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 0) {
//			place += "[○]";
//		}
//		if (pcWhere == 0) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go1(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 1) {
//			place += "[○]";
//		}
//		if (pcWhere == 1) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go2(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 2) {
//			place += "[○]";
//		}
//		if (pcWhere == 2) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go3(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 3) {
//			place += "[○]";
//		}
//		if (pcWhere == 3) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go4(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 4) {
//			place += "[○]";
//		}
//		if (pcWhere == 4) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go5(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 5) {
//			place += "[○]";
//		}
//		if (pcWhere == 5) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go6(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 6) {
//			place += "[○]";
//		}
//		if (pcWhere == 6) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go7(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 7) {
//			place += "[○]";
//		}
//		if (pcWhere == 7) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go8(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 8) {
//			place += "[○]";
//		}
//		if (pcWhere == 8) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go9(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 9) {
//			place += "[○]";
//		}
//		if (pcWhere == 9) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go10(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 10) {
//			place += "[○]";
//		}
//		if (pcWhere == 10) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go11(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 11) {
//			place += "[○]";
//		}
//		if (pcWhere == 11) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go12(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 12) {
//			place += "[○]";
//		}
//		if (pcWhere == 12) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go13(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 13) {
//			place += "[○]";
//		}
//		if (pcWhere == 13) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go14(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 14) {
//			place += "[○]";
//		}
//		if (pcWhere == 14) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go15(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 15) {
//			place += "[○]";
//		}
//		if (pcWhere == 15) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go16(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 16) {
//			place += "[○]";
//		}
//		if (pcWhere == 16) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go17(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 17) {
//			place += "[○]";
//		}
//		if (pcWhere == 17) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go18(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 18) {
//			place += "[○]";
//		}
//		if (pcWhere == 18) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go19(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 19) {
//			place += "[○]";
//		}
//		if (pcWhere == 19) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go20(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 20) {
//			place += "[○]";
//		}
//		if (pcWhere == 20) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go21(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 21) {
//			place += "[○]";
//		}
//		if (pcWhere == 21) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go22(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 22) {
//			place += "[○]";
//		}
//		if (pcWhere == 22) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go23(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 23) {
//			place += "[○]";
//		}
//		if (pcWhere == 23) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go24(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 24) {
//			place += "[○]";
//		}
//		if (pcWhere == 24) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go25(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 25) {
//			place += "[○]";
//		}
//		if (pcWhere == 25) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go26(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 26) {
//			place += "[○]";
//		}
//		if (pcWhere == 26) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go27(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 27) {
//			place += "[○]";
//		}
//		if (pcWhere == 27) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go28(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 28) {
//			place += "[○]";
//		}
//		if (pcWhere == 28) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go29(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 29) {
//			place += "[○]";
//		}
//		if (pcWhere == 29) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go30(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 30) {
//			place += "[○]";
//		}
//		if (pcWhere == 30) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//	public String go31(int userWhere, int pcWhere) {
//		String place = "";
//		if (userWhere == 31) {
//			place += "[○]";
//		}
//		if (pcWhere == 31) {
//			place += "[●]";
//		}
//		return place;
//	}
//
//}
