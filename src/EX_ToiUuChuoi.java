package communityuni.com;

public class EX_ToiUuChuoi {

	public static String toiuu(String s)
	{
		String stoiuu = s;
		stoiuu = stoiuu.trim();
		return stoiuu;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   Doan HuU LInh   ";
		System.out.println(s);
		String stoiuu = toiuu(s);
		System.out.println(stoiuu);
		
		
	}

}
