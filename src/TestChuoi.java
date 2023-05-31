package communityuni.com;

public class TestChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		String s2 = new String("Nguyen Phu Trong");
		String s3 = "Nguyen Phu Trong";
		System.out.println("Chieu dai cua s1 = "+s1.length());
		System.out.println("Chieu dai cua s2 = "+s2.length());
		System.out.println("Chieu dai cua s3 = "+s3.length());
		if(s2==s3)
		{
			System.out.println("s2 = s3");
		}
		else
		{
			System.out.println("s2 ko bang s3");// dung vi s2 va s3 thuoc va cac o nho khac nhau
		}
		if(s2.equals(s3))
			System.out.println("s2 bang s3");
		else
			System.out.println("s2 khong bang s3");
		
		
		
	}

}
