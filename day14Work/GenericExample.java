package day14Work;

import java.util.*;

public class GenericExample {
	
	void stackSample() {
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(100);
		intStack.push(231);
		intStack.push(32424);
		intStack.push(34);
		
		System.out.println("The stack "+intStack);
		System.out.println("pop 1"+intStack.pop());
		System.out.println("The stack after pop1 "+intStack);
		System.out.println("Peek 1"+intStack.peek());
		System.out.println("The stack after pop1 "+intStack);
		intStack.push(444);
		System.out.println("peek 2"+intStack.peek());
		System.out.println("The stack after peek 2 "+intStack);
		
	}

	public static void main(String[] args) {
		GenericExample ge = new GenericExample();
		ge.stackSample();

	}

}
