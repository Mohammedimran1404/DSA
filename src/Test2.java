import java.util.*;

public class Test2 {

   public static void main(String[] args) {
      int num = 152;
      int originalNum = num;

      List<Integer> digits = new ArrayList<>();

      // Extract digits and store in list
      while (num != 0) {
         digits.add(num % 10);
         num /= 10;
      }

      int sum = 0;
      int power = digits.size();

      // Calculate sum of powers
      for (int d : digits) {
         sum += Math.pow(d, power);
      }

      if (sum == originalNum) {
         System.out.println(originalNum + " is an Armstrong number");
      } else {
         System.out.println(originalNum + " is NOT an Armstrong number");
      }
   }
}











