import java.util.*;
public class binaryrepresentationisapalindrome {


    public static boolean pallin(String str){
        int i=0; 
        int j=str.length()-1;
        boolean ans=true;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                ans=false;
            }
            i++;
            j--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
    }   
}
