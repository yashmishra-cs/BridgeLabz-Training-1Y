import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;
public class MapPractice {
    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,98);
        hm.put(5,76);
        hm.put(0,22);
        hm.put(7,99);
        System.out.println("============HashMap=============");
        System.out.println(hm);
        System.out.println(hm.keySet());
        Set<Integer> t = hm.keySet();
        System.out.println("Key set using set :"+t);
        System.out.println(hm.values());
        System.out.println("============Key Set============");
        for (int a : hm.keySet()){
            System.out.println(a);
        }
        System.out.println("============Values==========");
        for(int b :hm.values()){
            System.out.println(b);
        }


        LinkedHashMap<String,String> lm = new LinkedHashMap<>();
        hm.put(1,98);
        hm.put(5,76);
        hm.put(0,22);
        hm.put(7,99);
        System.out.println("============LinkedHashMap=============");
        System.out.println(hm);
        System.out.println(hm.keySet());
        Set<Integer> u = hm.keySet();
        System.out.println("Key set using set :"+u);
        System.out.println(hm.values());
        System.out.println("============Key Set============");
        for (int a : hm.keySet()){
            System.out.println(a);
        }
        System.out.println("============Values==========");
        for(int b :hm.values()){
            System.out.println(b);
        }

        TreeMap<Integer,String> ts = new TreeMap<>();
        hm.put(1,98);
        hm.put(5,76);
        hm.put(0,22);
        hm.put(7,99);
        System.out.println("============TreeMap=============");
        System.out.println(hm);
        System.out.println(hm.keySet());
        Set<Integer> s = hm.keySet();
        System.out.println("Key set using set :"+s);
        System.out.println(hm.values());
        System.out.println("============Key Set============");
        for (int a : hm.keySet()){
            System.out.println(a);
        }
        System.out.println("============Values==========");
        for(int b :hm.values()){
            System.out.println(b);
        }

    }
}