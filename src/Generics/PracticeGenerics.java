package Generics;

import java.util.ArrayList;

public class PracticeGenerics {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();
        box.setValue(2);
        int i=box.getValue();
        System.out.println(i);
    }
}
