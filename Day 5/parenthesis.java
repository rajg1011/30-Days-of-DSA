import java.util.*;
public class parenthesis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        Stack<Character> stack= new Stack<>();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='('|| str.charAt(i)=='{'){
                stack.add(str.charAt(i));
            }
            if(str.charAt(i)==')'&& stack.peek()=='('){
                stack.pop();
            }
            if(str.charAt(i)=='}'&& stack.peek()=='{'){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
