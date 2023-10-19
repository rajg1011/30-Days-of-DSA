import java.util.*;
public class RemoveStringsfromLinkedListBasedonComparison {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str[]=new String[sc.nextInt()];
        for(int i=0; i<str.length;i++){
            str[i]=sc.next();
        }
        String string= sc.next();
        ArrayList<String> arr= new ArrayList<>();
        int k=-1;
        for(int i=0; i<str.length;i++){
            if(string.equals(str[i])){
                k=i;
                break;
            }
        }
        if(k!=-1){
            for(int i=k+1;i<str.length;i++){
                arr.add(str[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
