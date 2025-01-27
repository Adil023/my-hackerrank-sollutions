import java.util.Scanner;

public class FindDigits {
    public int findDigits(int n) {

        int original = n;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            if(digit != 0 && original % digit == 0) {
                sum++;
            }
            n = n / 10;
        }

        return sum;

    }
}
