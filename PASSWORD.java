import java.util.*;
import java.io.*;
public class PASSWORD{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of yout password");
		int len=sc.nextInt();
		System.out.println(newPassword(len));
		return;
	}
	
	public static String newPassword(int len){
		System.out.println("Your password is being generated...");
	
		String alphabets="QqAaZzWwSsXxEeDdCcRrFfVvTtGgBbYyHhNnUuJjMmIiKkOoLlPp";
		String numbers="0123456789";
		String special="!@#$%^&*_=+-/.?<>)";
		
		Random r=new Random();
		
		String password=new String();
		
		for(int i=0;i<len;i++){
			int j=r.nextInt(3);
			int k;
			if(j==0){
				k=r.nextInt(alphabets.length());
				password=password+alphabets.charAt(k);
			}
			else if(j==1){
				k=r.nextInt(10);
				password=password+numbers.charAt(k);
			}
			else if(j==2){
				k=r.nextInt(special.length());
				password=password+special.charAt(k);
			}
		}
		System.out.println("New Password:");
		return password;
	}
}

