package tester;

import java.util.Scanner;

import intfImpl.StackImpl;

public class StackTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Stack Capacity ");
			StackImpl stack = new  StackImpl(sc.nextInt());
			boolean flag=true;
			while(flag) {
				try {
					System.out.println("1. Push Element");
					System.out.println("2. Pop Element");
					System.out.println("3. IsEmpty");
					System.out.println("4. IsFull");
					System.out.println("5. Exit");
					System.out.println("Enter Your Choice ");
					switch (sc.nextInt()) {
					case 1:
						if(!stack.IsFull()) {
							System.out.println("Enter Element to Push");
							stack.Push(sc.nextInt());
							System.out.println("Element Push Successfully!");
						}else {
							System.out.println("Stack is Full");
						}
						break;
					case 2:
						if(!stack.IsEmpty()) {
							System.out.println("Pop Element is - "+stack.Pop());
						}else {
							System.out.println("Stack is Empty");
						}
						break;
					case 3:
						if(stack.IsEmpty()) {
							System.out.println("Stack is Empty!");
						}else {
							System.out.println("Stack is not Empty!");
						}
						break;
					case 4:
						if(stack.IsFull()) {
							System.out.println("Stack is Full!");
						}else {
							System.out.println("Stack is not Full!");
						}
						break;
					case 5:
						System.out.println("Exit");
						flag=false;
						break;

					default:
						System.out.println("Enter Correct Choice ");
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();				
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
