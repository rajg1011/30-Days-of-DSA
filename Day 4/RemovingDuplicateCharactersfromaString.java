import java.util.*;
public class RemovingDuplicateCharactersfromaString {
    public static String recursion(String str){
        if(str.length()<=1){
            return str;
        }
        String ans= recursion(str.substring(1));
        if(str.charAt(0)==ans.charAt(0)){
            return ans;
        }
        else{
            ans=str.charAt(0)+ans;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        String ans= recursion(str);
        System.out.println(ans);
    }
}
