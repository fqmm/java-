import java.io.File;
public class Filetxt{
	public static void main(String[] args) {
		File file = new File("D:\\Hello.txt");
		if(file.exists())   //����ļ�����
		{
			file.delete();  
			System.out.println("�ļ���ɾ��");//ɾ���ļ�
		}
		else {
			try {
				file.createNewFile(); //�������ļ�
				System.out.println("�ļ��Ѵ���");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}