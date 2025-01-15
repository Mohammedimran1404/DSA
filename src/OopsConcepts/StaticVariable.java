package OopsConcepts;

public class StaticVariable {
    int age;
    int salary;
    String name;
    static long population;

    public StaticVariable(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
       StaticVariable.population=population+1;
    }
}
