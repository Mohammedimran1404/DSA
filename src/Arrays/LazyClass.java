package Arrays;

import ArrayListInJava.TestLazy;

public class LazyClass {

    private static final LazyClass l=new LazyClass();

    private TestLazy lazy;

    private LazyClass(){

    }

    public static LazyClass getInstance(){
        return l;
    }

    public TestLazy getLazy(){
        return (lazy==null)?lazy=new TestLazy():lazy;
    }
}
