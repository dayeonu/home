
public class methodEx {

	public static String[] getMembers() {
		String[] members = { "유", "영", "훈" };
		return members;
	}

	public static String[] getMembers2() {
		String[] members2 = { "유", "다", "연" };
		return members2;
	}
	
	public static void main(String[] args) {

		String[] members = getMembers();
		String[] members2 = getMembers2();
		
		System.out.print(members[0]);
		System.out.print(members[1]);
		System.out.print(members[2]);
		
		System.out.println();
		System.out.print(members2[0]);
		System.out.print(members2[1]);
		System.out.print(members2[2]);
	}

}

