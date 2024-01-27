package fa23;

public class DijkstrasAlgorithmDemo 
{
	public static void main(String[]args)
	{
		String str = "((5*9)+9)";
		ResizingStack <Integer> numStack = new ResizingStack(14);
		ResizingStack <Character> operatorStack = new ResizingStack(14);
		
		for(int i = 0; i < str.length(); i++)
		{
			//if current character is a digit, push into numStack
			if(Character.isDigit(str.charAt(i)))
				numStack.push(str.charAt(i) - '0');
			
			//if current character is an operator, push into operatorStack
			else if (str.charAt(i) == '+' || str.charAt(i) == '*')
				operatorStack.push(str.charAt(i));
			
			//if current character is a right parentheses
			//pop the last two digits in numStack
			//pop last operator
			//evaluate digits with operator
			else if(str.charAt(i) == ')')
			{
				char x = operatorStack.pop();
				
				if(x == '*')
					numStack.push(numStack.pop() * numStack.pop());
										
				else
					numStack.push(numStack.pop() + numStack.pop());
			}	
		}
		
		System.out.printf("The solution to %s is %d", str, numStack.pop());
		
	}
}
