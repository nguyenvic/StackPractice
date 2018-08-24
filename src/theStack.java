import java.util.Arrays;

public class theStack {
	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;
	
	
	theStack(int size)								//Constructor
	{
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
		
	}
	
	
	public void push(String input) //Adds an item to the top of the stack
	{
		if (topOfStack + 1 < stackSize)				//As long as there is at least 1 space in the stack..
		{
			topOfStack++;
			stackArray[topOfStack] = input;
		}
		else
		{
			System.out.printf("The stack is full!");
		}
	}
	
	
	public void pushMultiple(String inputs)	//Adds multiple items to the stack at once
	{
		String[] tempString = inputs.split(" ");	//each element in the string array will take a value from the input. (distinguishes what values based off the spaces)
		
		for (int i = 0; i < inputs.length(); i++)
		{
			push(tempString[i]);
		}
	}
	
	
	public void pop() //Removes an item from the top of the stack
	{
		if (topOfStack >= 0)						//As long as there is something in the stack
		{
			stackArray[topOfStack] = "-1";
			topOfStack--;
		}
		else
		{
			System.out.printf("The stack is empty!");
		}
	}
	
	
	public void popAll() //Removes all items from the stack
	{
		for(int i = topOfStack; i >= 0; i--)
		{
			pop();
		}
	}
	
	
	public void printStack() //Prints out what is in the stack
	{
		for (int i = 0; i < stackSize; i++)
		{
			if (stackArray[i] != "-1")					//Only prints out nonempty ones (-1 considered empty)
			{
				System.out.printf("%n%s", stackArray[i]);
			}
		}
		System.out.printf("%n");

	}
	
	
	public void peek() //See what is at the top of the stack
	{
		System.out.printf("%s", stackArray[topOfStack]);
	}
}
