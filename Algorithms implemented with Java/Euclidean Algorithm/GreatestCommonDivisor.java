import java.util.Scanner;
public class GreatestCommonDivisor {
    public static long GCD(long a, long b) {
        long z=b;
        long y=a%b;
        if (y!=0){
            return GCD(z,y);
        }
        else
            return z;
    }
    public static void main (String [] args){
        Scanner myScan = new Scanner(System.in);
        long input = myScan.nextLong();
        long input1 = myScan.nextLong();
        System.out.println(GCD(input,input1));
        myScan.close();
    }
}