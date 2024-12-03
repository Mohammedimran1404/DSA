import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<String> lst=Arrays.asList("Apple","Apple","apple");

        String str="Apple";
        boolean value=true;
        for(String strLstApple:lst){
            System.out.println(strLstApple);
            if(!str.equalsIgnoreCase(strLstApple)){
                value=false;
                break;

            }
        }
        System.out.println(value);
//       if(value){
//           System.out.println("pass");
//           System.out.println(value);
//       }
//       else {
//           System.out.println("fail");
//           System.out.println(value);
//       }
    }
}
