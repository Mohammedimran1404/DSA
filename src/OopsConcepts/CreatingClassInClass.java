package OopsConcepts;

public class CreatingClassInClass {
    public static void main(String[] args) {

        CreateOtherClass[] createOtherClasses=new CreateOtherClass[5];

        for (int i=0;i<createOtherClasses.length;i++){
            createOtherClasses[i]=new CreateOtherClass("Student "+(i+1),i+1,"40"+i);
//            createOtherClasses[i].strStudentName="Student "+(i+1);
//            createOtherClasses[i].RollNo=i+1;
//            createOtherClasses[i].strMarks="40"+i;

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

public CreateOtherClass(String strStudentName,int RollNo,String strMarks){
    this.strStudentName=strStudentName;
    this.RollNo=RollNo;
    this.strMarks=strMarks;

}

}
