package communityuni.com;

public class TachChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="SV001;Nguyễn Văn Tí;DHTL";
		String a[] = s.split(";");// tách chuỗi theo ký tự
		if(a.length==3)
		{
			System.out.println("Mã = "+a[0]);
			System.out.println("Tên = "+a[1]);
			System.out.println("Trường = "+a[2]);

		}
		System.out.println("----------------------");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("----------------------");
		for(String x : a)
			System.out.println(x);
		
		
	}

}
