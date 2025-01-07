package OopsConcepts;

public class CreatingClassInClass {
    public static void main(String[] args) {

        CreateOtherClass[] createOtherClasses=new CreateOtherClass[5];

        for (int i=0;i<createOtherClasses.length;i++){
            createOtherClasses[i]=new CreateOtherClass();
            createOtherClasses[i].strStudentName="Student "+(i+1);
            createOtherClasses[i].RollNo=i+1;
            createOtherClasses[i].strMarks="40"+i;

        }
        for (int i=0;i<createOtherClasses.length;i++){
            System.out.println("Name "+createOtherClasses[i].strStudentName);
            System.out.println("RollNo "+createOtherClasses[i].RollNo);
            System.out.println("Marks "+createOtherClasses[i].strMarks);
        }


    }

}

   class CreateOtherClass{

    String strStudentName;
    int RollNo;
    String strMarks;

}
