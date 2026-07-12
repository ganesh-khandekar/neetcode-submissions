class Solution {
    public boolean isValid(String s) {
        Stack<Character> Parentheses =new Stack<>();
            // System.out.println(Parentheses);
        for(char ch :s.toCharArray()){
            if(ch=='['||ch=='('||ch=='{'){
                Parentheses.push(ch);
            }else if(!Parentheses.isEmpty()&&ch==']'&&Parentheses.peek()=='['){
                Parentheses.pop();
            }else if(!Parentheses.isEmpty()&&ch=='}'&&Parentheses.peek()=='{'){
                Parentheses.pop();
            }else if(!Parentheses.isEmpty()&&ch==')'&&Parentheses.peek()=='('){
                Parentheses.pop();
            }else{
                return false;
            }
            System.out.println(" ch"+ch);
        }
            System.out.println(Parentheses);
        return Parentheses.isEmpty();
    }
}
