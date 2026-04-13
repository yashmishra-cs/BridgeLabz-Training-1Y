import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            int count = 1;

            while(i < arr.length - 1 && arr[i] == arr[i + 1]){
                count++;
                i++;
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}