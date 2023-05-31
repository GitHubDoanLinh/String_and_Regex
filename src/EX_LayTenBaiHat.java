package communityuni.com;

public class EX_LayTenBaiHat {

	public static String tenBaiHatCoMp3(String baiHat)
	{
		int vtCuoi = baiHat.lastIndexOf("/");
		String ten = baiHat.substring(vtCuoi+1);
		return ten;
	}
	public static String tenBaiHatKoMp3(String baiHat)
	{
		int vtCuoi1 = baiHat.lastIndexOf("/");
		int vtCuoi2 = baiHat.lastIndexOf(".");
		String ten = baiHat.substring(vtCuoi1+1,vtCuoi2);
		return ten;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baiHat = "D:/music/bolero/LongMe.mp3";
		String kq = tenBaiHatCoMp3(baiHat);
		System.out.println(kq);

		String kq2 = tenBaiHatKoMp3(baiHat);
		System.out.println(kq2);
		
		
	}

}
