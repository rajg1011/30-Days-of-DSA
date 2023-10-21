import java.util.*;
public class FindingProductiveCharacterPairsinaString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String ans="";
        int i=0;
        int j=1;
        while(j<str.length()){
            int first= (int)(str.charAt(i));
            int second= (int)(str.charAt(j));
            if(first>=second){
                ans+=str.charAt(i);
            }
            else if(second>first){
                ans+=str.charAt(j);
            }
            i+=2;
            j+=2;
        }
        if(i==str.length()-1){
            ans+=str.charAt(str.length()-1);
        }

        System.out.println(ans);
    }
}
