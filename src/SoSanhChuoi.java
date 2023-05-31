package communityuni.com;


public class SoSanhChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Doan Huu Linh";
		String s2 = "Doan HUU LInh";
		int kq = s1.compareTo(s2);
		System.out.println(kq);//kq<0:s1<s2; kq>0:s1>s2; kq=0:s1=s2

		int kq2 = s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		
		if(s1.equals(s2))// giong hay khac
			System.out.println("s1=s2");
		else
			System.out.println("s1!=s2");
		
		if(s1.equalsIgnoreCase(s2))// ko phan biet hoa vs thuong
			System.out.println("s1=s2");
		else
			System.out.println("s1!=s2");
		// equal ko phan biet dc lon hon hay nho hon
	}

}
