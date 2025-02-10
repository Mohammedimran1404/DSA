package Arrays;

import org.w3c.dom.ls.LSOutput;

public class TestLazyy {
    public static void main(String[] args) {

        int a = LazyClass.getInstance().getLazy().m1();
        System.out.println(a);
    }

}