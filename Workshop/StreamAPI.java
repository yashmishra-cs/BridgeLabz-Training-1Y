package StreamAPI;
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamAPI {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        System.out.println(stream);
        stream.forEach(a -> System.out.println(a) );
        Stream<String> stm = Stream.of("Hello","aa","bb","cc");
        stm.forEach(System.out::println);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(23);
        al.add(36);
        al.add(42);
        al.add(55);
        al.add(16);
        System.out.println("==============================");
        Stream<Integer> stream1 = al.stream();
        //stream1.forEach(a -> System.out.println(a));
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("Anushka","Virat","Rohit","Hardik","Abhishek");
        stream2.filter(n -> n.startsWith("A")).forEach(System.out::println);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream3 = list.stream();
        Stream<Integer> FilterStream = stream3.filter(i -> i%2==0);
        FilterStream.forEach(System.out::println);

        list.stream().filter(i -> i%2==0).forEach(System.out::println);
        
    }
}