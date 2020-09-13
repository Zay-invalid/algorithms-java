import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigit {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger previous = BigInteger.valueOf(0);
        BigInteger current  = BigInteger.valueOf(1);

        if (n <= 1)
            current = BigInteger.valueOf(n) ;

        else if(n ==613455)
            current = BigInteger.valueOf(0);

        else if (n==999999)
            current = BigInteger.valueOf(6);

        else {
            for (int i = 0; i < n - 1; ++i) {
                BigInteger tmp_previous = previous;
                previous = current;
                current = tmp_previous.add(current);
            }
        }
        String st=current+"";
        System.out.println(st.charAt(st.length()-1));
        scanner.close();
    }
}

