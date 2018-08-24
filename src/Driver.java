
public class Driver {

	public static void main(String[] args) {
		theStack stack1 = new theStack(10);
		stack1.printStack();
		
		stack1.push("Hello");
		stack1.push("I");
		stack1.push("Am");
		stack1.push("Victor");

		stack1.printStack();

		
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();

		System.out.printf("%n");
		stack1.printStack();
		
		stack1.push("Hello again!");
		
		
		stack1.popAll();
		System.out.printf("%n");
		stack1.printStack();

	}

}
