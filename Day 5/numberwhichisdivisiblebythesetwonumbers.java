import java.util.*;
public class numberwhichisdivisiblebythesetwonumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();

        for(int i=1; i<n1*n2;i++){
            if(i%n1==0&&i%n2==0){
                System.out.println(i);
                return;
            }
        }
    }
}
