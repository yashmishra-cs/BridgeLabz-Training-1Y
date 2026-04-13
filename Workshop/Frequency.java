import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            i = sc.nextInt();
        }
        int[] freq = new int[100];
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            int count = 1;
            for(int k=j+1;k<arr.length-1;k++){
                if(arr[j]==arr[k]){
                    count++;
                }
            }
            freq[j]=count;
        }
        System.out.println(freq);
    }
}
