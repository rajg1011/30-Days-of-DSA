import java.util.*;

public class KthElementfromlastLinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        while(n!=-1){
            arr.add(n);
            n=sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(arr.get(arr.size()-k));

    }
}
