class Solution {
    public boolean isValid(String s) {
        Stack<Character> Parentheses =new Stack<>();
            // System.out.println(Parentheses);
        for(char ch :s.toCharArray()){
            if(ch=='['||ch=='('||ch=='{'){
                Parentheses.push(ch);
            }else if(ch==']'&&Parentheses.peek()=='['){
                Parentheses.pop();
            }else if(ch=='}'&&Parentheses.peek()=='{'){
                Parentheses.pop();
            }else if(ch==')'&&Parentheses.peek()=='('){
                Parentheses.pop();
            }else{
                return false;
            }
            System.out.println(" ch"+ch);
        }
            System.out.println(Parentheses);
        
    }
}
