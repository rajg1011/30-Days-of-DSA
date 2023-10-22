import java.util.*;
public class FindthLengthoftheLongestStringUsingRecursion {

    public static int recursion(String str){
        if(str.length()<=0){
            return 0;
        }
        int k=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                k=i;
                break;
            }
            if(i==str.length()-1){
                k=i;
            }
        }
        int ans= recursion(str.substring(k+1));
        return Math.max(ans, k);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int ans=recursion(str);
        System.out.println(ans);
    }
}
