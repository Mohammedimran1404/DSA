package PracticePrograms;

public class CreatingMultipleConstructors {
    String strStudentName;
    String strPlace;
    int employeeId;


    public static void main(String[] args) {
        CreatingMultipleConstructors creatingMultipleConstructors=new CreatingMultipleConstructors("imran","hyderabad",12);
        System.out.println(creatingMultipleConstructors.strStudentName);

        CreatingMultipleConstructors defaultCons=new CreatingMultipleConstructors();
        System.out.println(defaultCons.strStudentName);

    }
   CreatingMultipleConstructors(String strStudentName,String strPlace, int empId){
        this();
        this.strStudentName=strStudentName;
        this.strPlace=strPlace;
        this.employeeId=empId;
    }
    CreatingMultipleConstructors(){
        strStudentName="Imran";
        strPlace="Hyderabad";
        employeeId=1545;
    }

}
