package day13Work;

import java.util.*;

public class CollectionExample {
	
	
	@SuppressWarnings("rawtypes")
	ArrayList myArray;
	
	@SuppressWarnings("rawtypes")
	CollectionExample(){
		myArray = new ArrayList();
	}
	
	@SuppressWarnings("unchecked")
	void addMembers() {
		myArray.add(10);
		myArray.add(10.2f);
		myArray.add("Hello");
		myArray.add(new Movie(101,"GGG",12.2f));
		myArray.add(true);
		myArray.add('w');
	}
	
	void printMembers() {
		for(int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
	}
	
	void sumCollection() {
		double sum = 0;
		for(int i = 0; i < myArray.size(); i++) {
			sum = sum+ Double.parseDouble(myArray.get(i).toString());
		    System.out.println(myArray.get(i));
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
	
	}

}
