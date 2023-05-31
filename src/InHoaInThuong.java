package communityuni.com;

public class InHoaInThuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "obama";
		s1 = s1.toUpperCase();
		System.out.println(s1);

		s1 = "obama";
		s1 = s1.replaceFirst("o", "o".toUpperCase());
		System.out.println(s1);

		s1 = "putin";
		s1 = s1.replaceFirst(
				(s1.charAt(0)+""),// lấy ra ký tự đầu tiên
				(s1.charAt(0)+"").toUpperCase());// Biến đổi ký tự đầu tiên thành in hoa
		System.out.println(s1);

		String s2 = "BIDEN";
		s2=s2.toLowerCase();
		System.out.println(s2);

		String s3 = "linh";
		s3=s3.toUpperCase();
		System.out.println(s3);

		String s4 = "LUC";
		s4 = s4.toLowerCase();
		s4 = s4.replaceFirst(
				(s4.charAt(0)+""),// lấy ra ký tự đầu tiên
				(s4.charAt(0)+"").toUpperCase());// Biến đổi ký tự đầu tiên thành in hoa
		System.out.println(s4);
	}

}
