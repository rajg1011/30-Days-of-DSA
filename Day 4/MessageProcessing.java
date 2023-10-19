import java.util.*;
public class MessageProcessing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String ans="";
        int i=0;
        int j=1;
        while(j<str.length()){
            if(str.charAt(j)==' '){
                ans=ans+str.substring(i,j);
                i=j+1;
                j++;
            }
            j++;
        }
        ans+=str.substring(i, str.length());
        char ch= (char)(ans.charAt(0)-32);
        String ans1=ch+ans.substring(1);
        System.out.println(ans1);
    }
}
