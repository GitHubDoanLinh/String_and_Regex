package communityuni.com;

import java.util.Scanner;

public class EX_Panlyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// chuỗi panlyndrome là chuỗi có chuỗi đảo ngược bằng chính nó 
		Scanner sc = new Scanner(System.in);
		System.out.println("mời bạn nhập vào 1 chuỗi : ");
		String s = sc.nextLine();
		char arr[] = s.toCharArray();// tra ve mang cac ky tu
		boolean flag = true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				flag = false;
			}
		}
		if(flag==true)
			System.out.println(s + " la chuoi doi xung");
		else
			System.out.println(s + " khong la chuoi doi xung");
		
	}

}
