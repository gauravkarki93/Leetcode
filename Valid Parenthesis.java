class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0)
            return true;
        Stack<Character> stack = new Stack<Character>();     
        int i = 0;
        while(i<s.length())
        {            
            char currChar = s.charAt(i);
            if(currChar == '(' ||currChar == '[' || currChar == '{')
            {
                stack.push(currChar);
            }
            else if(stack.empty())
            {
                return false;
            }
            else //Pop when you find closing brackets and if it doesn't matches to curr Char then return false
            {
                char poppedChar = stack.pop();
                if((poppedChar == '{' && currChar != '}' ) || (poppedChar == '[' && currChar != ']' ) || (poppedChar == '(' && currChar != ')' ))
                    return false;
            }
            i++;
        }
        if(!stack.empty())
            return false;
        
        return true;
    }
}
