package OopsConcepts;

public class SingleTonPattern {

    /**
     * creating a private constructor because there should not be other object creation
     * outside the class
     */
    private SingleTonPattern(){
    }

    /**
     * the instance is static because static will be related to class level
     */
    private static SingleTonPattern singleTonPattern;

    public static SingleTonPattern getSingleTonPattern(){
       if(singleTonPattern==null){
           singleTonPattern=new SingleTonPattern();
       }
       return singleTonPattern;
    }

   }