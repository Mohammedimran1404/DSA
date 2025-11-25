package Programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int sum=0;
        int digits=String.valueOf(num).length();
        while(num>0){
            int rem=num%10;
            sum+=(int)Math.pow(rem,digits);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not an Armstrong number");
        }
    }
}
