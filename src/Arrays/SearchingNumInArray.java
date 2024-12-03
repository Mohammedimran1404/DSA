package Arrays;

public class SearchingNumInArray {
    public static void main(String[] args) {
        int array[]={1,3,4,5,6,7};
        int searchNumber=5;
        for(int i=0;i<array.length;i++){
            if(searchNumber==array[i]){
                System.out.println("Search number "+array[i]+" is present in array");
            }
        }
    }
}
