import java.util.*;
public class cumulativecountofsetbits {

    public static int binary(int n){
        int count=0;
        while(n!=0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
        for(int i=1; i<=n;i++){
            count+=binary(i);
        }

        System.out.println(count);

    }
}
