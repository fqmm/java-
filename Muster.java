import java.util.*;
public class Muster{
	public static void main(String[] args) {
		Collection<String>list = new ArrayList<>();
		list.add("һ");
		list.add("��");
		list.add("��");
		Iterator<String>ite = list.iterator();
		while(ite.hasNext()) {
			String num = (String)ite.next();
			System.out.println(num);
		}
	}
}