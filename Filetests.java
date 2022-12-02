import java.io.File;
public class Filetests{
	public static void main(String[] args) {
		File file = new File("E:\\Hello.txt");
		if(file.exists()) {                //如果文件存在
			String name = file.getName();
			long len = file.length();
			boolean hid = file.isHidden();
			boolean abso = file.isAbsolute();
			System.out.println("名称："+name);
			System.out.println("长度："+len);
			System.out.println("是否是隐藏文件："+ hid);
			System.out.println("是否为绝对路径名："+abso);
		}
	}
}