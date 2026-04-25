import java.sql.SQLOutput;
import java.util.*;
public class CollectionFramework {
    public static void main(String[] args){
        List<Object> l = new ArrayList<>();
        List<Object> l2 = new LinkedList<>();
        List<Object> l3 = new Vector<>();
        List<Object> l4 = new Stack<>();
        l.add(10);
        l.add(20);
        l.add("yash");
        l.add(5.55);
        System.out.println(l);
        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        List<Object> l5 = new ArrayList<>();
        // for-each loop
        for(Object item : l){
            System.out.println(item);
        }
        System.out.println(l.contains(10));
        l.remove(1);
        System.out.println(l);
        System.out.println(l.isEmpty());

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        Vector<Double> vector = new Vector<>();
        Stack<Boolean> stack = new Stack<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.set(0,12);
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}