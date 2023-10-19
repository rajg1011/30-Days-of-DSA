import java.util.*;

class LinkedListInsertion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        System.out.print(ele + " ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}