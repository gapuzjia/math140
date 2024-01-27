package week4SimpleCompiler;

public class ASimpleCompiler 
{
	public static void main(String[]args)
	{
		//declare flag and initialize to true
		boolean balanced = true;
		
		//declare stack
		Stack<Character> myStack = new Stack();
		
		//declare string to test compiler
		String inputStr = "({()})";
		
		//for loop goes through all characters in the string
		for(int i = 0; i < inputStr.length() && balanced; i++)
		{
			//assign current character to currChar
			char currChar = inputStr.charAt(i);
			
			//if currChar is an opening bracket, push into stack
			if(currChar == '(' || currChar  == '[' || currChar  == '{')
				myStack.push(currChar);
			
			else
			{
				//if stack has contents, pop from stack 
				//and compare to element on top of stack
				if(!myStack.isEmpty())
				{
					char temp  = myStack.pop();
					
					if(temp == ')' && currChar == ')')
						balanced = false;
				
					else if(temp == ']' && currChar == ']')
						balanced = false;
				
					else if(temp == '}' && currChar == '{')
						balanced = false;
				}
				
				//else, return error
				else
					balanced = false;
			}
		}
		
		//if brackets remain in the stack, flag as unbalanced
		if(!myStack.isEmpty())
			balanced = false;
		
		
		//print final results
		if(balanced)
			System.out.println(inputStr + "is properly balanced.");
		else
			System.out.println(inputStr + "is not balanced.");	
	
	}
}
