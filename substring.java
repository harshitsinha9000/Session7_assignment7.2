//assignment 7.2
package java_session_7;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=null,str_sub=null;
		
		System.out.println("Enter the main string");
		str=sc.next();
		
		System.out.println("Enter the substring ");
		str_sub=sc.next();
		
		if(str.contains(str_sub))
		{
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Doesn't Contains");
		}
	}

}
