import java.io.File;
public class Filetxt{
	public static void main(String[] args) {
		File file = new File("D:\\Hello.txt");
		if(file.exists())   //如果文件存在
		{
			file.delete();  
			System.out.println("文件已删除");//删除文件
		}
		else {
			try {
				file.createNewFile(); //创建该文件
				System.out.println("文件已创建");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}