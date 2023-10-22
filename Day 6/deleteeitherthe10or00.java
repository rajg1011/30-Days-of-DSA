import java.util.*;
public class deleteeitherthe10or00 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        char[] arr= str.toCharArray();
        int j=0;
        int k=1;

        while(k<arr.length){
            if(arr[k]=='0' && (arr[j]=='1'|| arr[j]=='0')){
                arr[j]='*';
                arr[k]='*';
            }
            j++;
            k++;
        }
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!='*'){
                count++;
            }
        }
        System.out.println(count);


    }
}
