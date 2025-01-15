package OopsConcepts;

public class Human {
    public static void main(String[] args) {
        Human human2=new Human();
        human2.m1(1,"22",33);
    }
    int age;
    String name;
    int salary;
    public void m1(int age, String name, int salary){
        this.age=age;
        this.salary=salary;
        this.name=name;

        System.out.println(age+" "+name+" "+salary);

    }
}
