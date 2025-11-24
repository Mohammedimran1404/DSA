package Programs;

public class FindingMaxLen_Index_MaxString {
    public static void main(String[] args) {
        String[] arr= {"name","elephant","hand","roundyeyyye"};
        int len=0;
        StringBuilder str=new StringBuilder();
        int index=0;
        for (int i=0;i<arr.length;i++){
            int a=arr[i].length();
            if(a>len){
                len=a;
                str.setLength(0);
               str.append(arr[i]);
                index = i;
            }

        }
        System.out.println(len+" "+str);
        System.out.println(index);

    }
}
