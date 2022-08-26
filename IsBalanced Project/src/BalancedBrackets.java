import java.util.Stack;

public class BalancedBrackets {
    
	public static void main (String [] args)
    {
      String input = "({[>]})"; // insert test case here
      System.out.println(isBalanced(input));
    }
	
    public static boolean isBalanced(String input) 
    {
		if (input.length()==0 || input.length()%2 != 0) 
		{
			return false;
		}
    	Stack<Character> stackBP = new Stack<Character>();
    	for(int i = 0; i < input.length(); i++)
    	{
    		char standin = input.charAt(i);
            if(standin == '(' || standin == '{' || standin == '[' || standin == '<')
            {
            	stackBP.push(standin);
            }
            else if(standin == ')' || stackBP.isEmpty())
            {
                if(stackBP.pop() != '(')
                {
                    return false;
                }
            }
            else if(standin == '}'|| stackBP.isEmpty())
            {
                if(stackBP.pop() != '{')
                {
                    return false;
                }           
            } 
            else if(standin == ']'|| stackBP.isEmpty()) 
            {
                if(stackBP.pop() != '[') 
                {
                    return false;
                }
            }
            else if(standin == '>'|| stackBP.isEmpty()) 
            {
                if(stackBP.pop() != '<') 
                {
                    return false;
                }
            }
        }
        return stackBP.isEmpty();
    }
}