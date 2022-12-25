import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Filtertest {
    public static void main(String[] args) {
        List<Integer>list  = new ArrayList<>();
        for(int i = 1;i<=30;i ++){
            list.add(i);                                //向集合中添加数据
        }
        printeach("过滤前" ,list);
        Stream<Integer>stream = list.stream();         //获取集合流对象
        stream= stream.filter(n-> n % 3 == 0);         //过流出流中3的倍数（关键代码）
        List<Integer>res = stream.collect(Collectors.toList());//将流重新封装成List集合

        printeach("过滤后",res);

    }
    static void printeach(String S,List list)
    {   System.out.print(S);
        list.stream().forEach(n->{
            System.out.print(n+" ");
        });  //不要忘记分号
        System.out.println(" ");
    }

}