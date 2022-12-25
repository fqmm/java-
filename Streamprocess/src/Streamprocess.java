import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Streamprocess{
    private String name;
    private int age;
    private double salary;
    private String sex;
    private String dept;
    public Streamprocess(String name,int age,double salary,String sex, String dept)
    {
        this.name = name;
        this.age =age;
        this.salary = salary;
        this.sex = sex;
        this.dept = dept;
    }
    public String toString() {
        return " name="+name+" age="+age+" salary="+salary+" sex="+sex+" dept="+dept;
    }
    public String getName() { return name;}
    public int getAge() {return age;}
    public double getSalary() {return salary;}
    public String getSex() {return sex;}
    public String getDept() {return dept;}
    static List<Streamprocess>getEm(){
        List<Streamprocess>list = new ArrayList<Streamprocess>();
        list.add(new Streamprocess("小一",50,4000,"男","一部"));
        list.add(new Streamprocess("小二",10,4000,"男","一部"));
        list.add(new Streamprocess("小三",30,5000,"男","二部"));
        list.add(new Streamprocess("小四",40,5000,"男","二部"));
        list.add(new Streamprocess("小五",60,3000,"男","三部"));
        list.add(new Streamprocess("小六",10,4000,"男","三部"));
        return list;
    }
    public static void main(String[] args) {
        List<Streamprocess>list1 = Streamprocess.getEm();
        Stream<Streamprocess>stream = list1.stream();
        stream = stream.filter(people->people.getAge()>30);
        List<Streamprocess>result = stream.collect(Collectors.toList());
        for(Streamprocess emp:result) {
            System.out.println(emp);

        }
    }
}