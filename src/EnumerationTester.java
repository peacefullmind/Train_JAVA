import java.util.Enumeration;
import java.util.Vector;
//这种传统接口已被迭代器取代 枚举
public class EnumerationTester {
    public static void main(String args[]){
        Enumeration<String> days;
        Vector<String> daynames=new Vector<String>();
        daynames.add("Sunday");
        daynames.add("Monday");
        daynames.add("Tuesday");
        daynames.add("Wednesday");
        daynames.add("Thursday");
        daynames.add("Friday");
        daynames.add("Saturday");

        days=daynames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

    }
}
