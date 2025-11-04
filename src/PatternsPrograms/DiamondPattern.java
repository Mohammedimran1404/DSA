package PatternsPrograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=2*n;i++) {
            int allcols=i>n?2*n-i:i;
            for (int j = 1; j <= n-allcols; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= allcols; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
