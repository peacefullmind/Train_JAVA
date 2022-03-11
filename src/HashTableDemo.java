import java.util.Enumeration;
import java.util.Hashtable;

//HashTable哈希表
public class HashTableDemo {
    public static void  main(String args[]){
        Hashtable balance=new Hashtable();

        balance.put("Zara",3434.34);
        balance.put("Ayan",1378.26);
        balance.put("Mahnaz",100);

        Enumeration names;
        names=balance.keys();
        while (names.hasMoreElements()){
            String str=(String) names.nextElement();
            System.out.println(str+": "+balance.get(str));
        }
    }
}
