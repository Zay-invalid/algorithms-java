import java.util.Arrays;
import java.util.Scanner;
public class MaxPairProduct {
    public static void main (String[] args) {
    Scanner myScan = new Scanner(System.in);
    int size = myScan.nextInt();
    String input = myScan.next()+myScan.nextLine();
    String [] array = input.split(" ");
    long[] longArray=new long[size];
    for (int i=0; i<size;i++){
        longArray[i] = Long.parseLong(array[i]);
    }
    Arrays.sort(longArray);
    System.out.println(longArray[size-1]*longArray[size-2]);
    myScan.close();
}
}