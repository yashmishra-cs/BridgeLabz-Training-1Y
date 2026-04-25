//arrays --- java.util.Arrays --- static methods --- Methods --- convert array element to string format --- used for sorting 
import java.util.Arrays;
class ArraysMethodExample {
public static void main (String[] args){
int arr[]= {40,50,60,10,20,30};
System.out.println("Original Arrays :");
System.out.print(arr);
System.out.println(Arrays.toString(arr));
int arr2[]={10,20,30};
boolean isEqual = Arrays.equal(arr,arr2);
System.out