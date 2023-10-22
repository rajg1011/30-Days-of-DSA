import java.util.*;
public class Costofgroceries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int X=sc.nextInt();
        int[] fresh= new int[n];
        int[] cost= new int[n];
        for(int i=0; i<n;i++){
            fresh[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            cost[i]=sc.nextInt();
        }
        int totalcost=0;

        for(int i=0; i<n; i++){        
            if(fresh[i]>=X){
                totalcost+=cost[i];
            }
        }
        System.out.println(totalcost);
    }
}
