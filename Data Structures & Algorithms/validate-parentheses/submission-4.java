public class validParentheses {
    public static boolean validParentheses(String s){
        if (s.length()==0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')'){
                char check = stack.peek();
                if (check != '('){
                    return false;
                } 
            } else if (c == ']'){
                char check = stack.peek();
                if (check != '['){
                    return false;
                }
            } else if (c == '}'){
                char check = stack.peek();
                if (check != '{'){
                    return false;
                }
            }
        }
        return true;
    }
}
