import java.util.*;
public class Madhav {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        int i=1;
        int j=1;
        while(j<=n){
            if((3*i+2)%m!=0){
                System.out.println(3*i+2);
                j++;
            }
            i++;
        }

    }
}
