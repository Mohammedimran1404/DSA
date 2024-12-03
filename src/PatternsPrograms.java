public class PatternsPrograms {

    public void rightTrianglePattern() {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rightTrianglePatternWithNumber() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }

    public void rectangle() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public void reverseRightTriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public void leftTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) { // if i=1 use formula n-i+1 or if i starts from 0
                // then formula change as n-i formulas making depends on our assumption.
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rotatedTriangle() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void trianglePattern() {
        int n = 5;
        for (int row = 1; row <= 2 * n; row++) {
            int allCols = row > n ? 2 * n - row : row;
            for (int cols = 1; cols <= allCols; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
    
    public void diamondPattern() {
        int n = 5;
        for (int i = 1; i <= 2 * n; i++) {

            int allCols = i > n ? 2 * n - i : i;
            for (int j = 1; j <= n - allCols; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= allCols; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public void practice(){

        int count =5;
        for(int i=1;i<=2*count;i++){
            int totalRows=i>count?i:2*count-i;
            for(int j=1;j<=totalRows;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void practicePatterns(){

        int n=5;
        for(int row=1;row<=2*n;row+=1){
           int allCols=row>n?row:2*n-row;
                for (int col = 1; col <= allCols; col++) {
                    System.out.print("* ");
                }

            System.out.println();
        }


//        for(int row=1;row<=2*n;row++){
//            int allCols=row>n?n:2*n-row;
//            for(int spaces=1;spaces<=n-allCols;spaces++){
//                System.out.print(" ");
//            }
//            for(int cols=1;cols<=row;cols++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public void trianglePatternWithNumbers(){
        int n=5;
        for (int row = 1; row <=n; row++) {

            for (int spaces =0; spaces <n-row ; spaces++) {
                System.out.print("  ");

            }

            for (int lCols =row; lCols>=1 ; lCols--) {
                System.out.print(lCols+" ");

            }
            for (int rCols = 2; rCols <= row; rCols++) {
                System.out.print(rCols+" ");

            }
            System.out.println();

        }
    }



    public static void main(String[] args) {
        PatternsPrograms patternsPrograms = new PatternsPrograms();
//       patternsPrograms.reverseRightTriangle();
//      patternsPrograms.rightTrianglePattern();
//        patternsPrograms.rectangle();
        // patternsPrograms.rightTrianglePatternWithNumber();
//        patternsPrograms.leftTriangle();
//        patternsPrograms.rotatedTriangle();
//         patternsPrograms.trianglePattern();
//        patternsPrograms.diamondPattern();
//        patternsPrograms.practice();
//        patternsPrograms.practicePatterns();
        patternsPrograms.trianglePatternWithNumbers();
    }
}
