package communityuni.com;

public class NoiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Đoàn Nguyễn";
		String s2 = "Ngọc Anh";
		String s3 = s1 + " " +s2;
		System.out.println(s3);
		
		String s4 = "Obama"+1;
		System.out.println(s4);
		String s5 = "Obama"+1+2;
		System.out.println(s5);
		String s6 = "Obama"+(1+2);
		System.out.println(s6);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		System.out.println(sb.toString());
		
	}

}
