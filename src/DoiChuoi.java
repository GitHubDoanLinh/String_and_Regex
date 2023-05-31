package communityuni.com;

public class DoiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "xin chào putin, tôi là trump ";
		s.replace("putin", "ủn ỉn");
		System.out.println(s);
		s=s.replace("putin", "ủn ỉn");
		System.out.println(s);
		
		s = "obama xin chào michael obama ";
		s = s.replaceFirst("obama", "putin");
		System.out.println(s);

	}

}
