package communityuni.com;

import java.util.StringTokenizer;

public class TimKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Nhật chiếu hương lô sinh tử yên, dao khan bộc bố quải tiền xuyên,phi lưu trực há tam thiên xích,nghi thị ngân hà lạc cửu thiên";
		int vt1 = s.indexOf("ô");
		System.out.println("tìm thấy [ô] ở vị trí thứ "+vt1);
		int vt2 = s.indexOf("hương");
		System.out.println("tìm thấy [hương] ở vị trí "+vt2);
		int vt3 = s.indexOf("lê");
		if(vt3==-1)
			System.out.println("Không tìm thấy lê");
		else 
			System.out.println("tìm thấy lê");
		int vt4 = s.lastIndexOf("i");
		System.out.println("tim thay i o vu tri thu "+vt4);
		int vt5 = s.lastIndexOf("ên");
		System.out.println("tim thay ên o vu tri thu "+vt5);
			
		if(s.contains("yên"))
			System.out.println("có tồn tại chữ yên trong chuỗi s ");
		else
			System.out.println("không tồn tại chữ yên trong chuỗi s ");
			
		StringTokenizer token = new StringTokenizer(s);
		int dem=0;
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			if(value.contains("iên")) {
				dem++;
			}
		}
		System.out.println("tim thay 'iên' xuat hien "+dem+" lan");
	}

}
