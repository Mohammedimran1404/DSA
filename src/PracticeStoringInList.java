import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeStoringInList {


    public static void main(String[] args) {
        PracticeStoringInList practiceStoringInList=new PracticeStoringInList();
        practiceStoringInList.validateTwoList();

    }

        public List<String> storeMultiElementsInLst() {

//            List<String> myLst = Arrays.asList("Apple", "Apple", "Apple");
            List<String> myLst=new ArrayList<>();
            myLst.add("Apple");
            myLst.add("Apple");
            myLst.add("Apple");

            List<String> storeInLst=new ArrayList<>();

            for(int i=0;i<myLst.size();i++){

                storeInLst.add(myLst.get(i));

            }
            System.out.println(storeInLst);
            return storeInLst;

        }

        public List<String> storeMultiElementsInLst1(){


            List<String> myLst = Arrays.asList("Apple", "Apple", "banana"); // fixed size

            List<String> storeInLst=new ArrayList<>();

            for(int i=0;i<myLst.size();i++){

                storeInLst.add(myLst.get(i));

            }
            System.out.println(storeInLst);
            return storeInLst;


        }
        public void validateTwoList(){
        if(storeMultiElementsInLst().equals(storeMultiElementsInLst1())){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        }

    }
