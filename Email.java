//import java.util.regex.*;
public class Email{
	public static void main(String[] args) {
		String regexx =new String( "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}");
		String str1 = "sss";
		String str2 = "@we.com";
		String str3 = "ss@qq.com";
		if(str1.matches(regexx)) {
			System.out.println(str1+"��һ���Ϸ���E-mail��ַ");
		}
		if(str2.matches(regexx)) {
			System.out.println(str2+"��һ���Ϸ���E-mail��ַ");
		}
		if(str3.matches(regexx)) {
			System.out.println(str3+"��һ���Ϸ���E-mail��ַ");
		}
	}
}