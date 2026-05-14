package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Test {

    private int a;

    public int getData(){
        return a;
    }
    public void setData(int a ){
       this.a=a;
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.setData(10);
        t.getData();

    }
}

