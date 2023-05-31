package communityuni.com;

public class XoaKhoangTrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    Đoàn Hữu Linh   ";
		System.out.println(s);
		System.out.println("Chiều dài = "+s.length());
		s=s.trim();// xóa hết khoảng trắng 
		System.out.println(s);
		System.out.println("Chiều dài = "+s.length());
		
		s = "    Linh ăn cơm trưa với trump    ";
		System.out.println(s);
		int vtLeft = 0;
		int  i =0;
		for(i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c==' ')
				vtLeft = i;// lưu vết
			else 
				break;
		}
		s=s.substring(i);
		System.out.println(s);
		s = "    Linh ăn cơm trưa với trump    ";
		int vtRight = 0;
		i=0;
		for(i = s.length()-1;i>=0;i--)
		{
			char c  = s.charAt(i);
					if(c==' ')
						vtRight = i;
					else
						break;
		}
		s=s.substring(0, vtRight);
		System.out.println(s);
		
		
	}

}
