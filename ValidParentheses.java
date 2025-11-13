import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (st.isEmpty() || 
                      (c == ')' && st.pop() != '(') || 
                      (c == '}' && st.pop() != '{') || 
                      (c == ']' && st.pop() != '[')) {
                return false;
            }
        }
        
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       
        System.out.println(isValid("()[]{}"));    
        System.out.println(isValid("(]"));        
        System.out.println(isValid("([)]"));      
        System.out.println(isValid("{[]}"));      
    }
}
