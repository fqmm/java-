import java.io.File;
public class Filetests{
	public static void main(String[] args) {
		File file = new File("E:\\Hello.txt");
		if(file.exists()) {                //����ļ�����
			String name = file.getName();
			long len = file.length();
			boolean hid = file.isHidden();
			boolean abso = file.isAbsolute();
			System.out.println("���ƣ�"+name);
			System.out.println("���ȣ�"+len);
			System.out.println("�Ƿ��������ļ���"+ hid);
			System.out.println("�Ƿ�Ϊ����·������"+abso);
		}
	}
}