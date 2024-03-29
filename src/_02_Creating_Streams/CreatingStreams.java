package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		

//1
//2
//3
//String[] arr = new String[]{"a", "b", "c"};
//Stream<String> stream = Arrays.stream(arr);
//stream = Stream.of("a", "b", "c"); 

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		Stream<Integer> stream = intList.stream();
		System.out.println();
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		Stream<Random> stream2 = randStack.stream();
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		Stream<Double> stream3 = dQueue.stream();
	}
}
