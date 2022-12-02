//import java.util.regex.*;
public class Email{
	public static void main(String[] args) {
		String regexx =new String( "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}");
		String str1 = "sss";
		String str2 = "@we.com";
		String str3 = "ss@qq.com";
		if(str1.matches(regexx)) {
			System.out.println(str1+"是一个合法的E-mail地址");
		}
		if(str2.matches(regexx)) {
			System.out.println(str2+"是一个合法的E-mail地址");
		}
		if(str3.matches(regexx)) {
			System.out.println(str3+"是一个合法的E-mail地址");
		}
	}
}