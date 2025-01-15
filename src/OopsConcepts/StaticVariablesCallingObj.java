package OopsConcepts;

public class StaticVariablesCallingObj {
    public static void main(String[] args) {

        StaticVariable staticVariable1=new StaticVariable(1,11,"a");
        StaticVariable staticVariable2=new StaticVariable(11,111,"b");
        StaticVariable staticVariable3=new StaticVariable(11,111,"c");
        StaticVariable staticVariable4=new StaticVariable(11,111,"c");

        System.out.println(StaticVariable.population);
    }
}
