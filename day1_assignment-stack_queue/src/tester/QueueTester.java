package tester;

import java.util.Scanner;

import intfImpl.QueueImpl;

public class QueueTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Queue Capacity ");
			QueueImpl queue = new QueueImpl(sc.nextInt());
			boolean flag = true;
			while (flag) {
				try {
					System.out.println("1. Add Queue");
					System.out.println("2. Delete Queue");
					System.out.println("3. IsEmpty");
					System.out.println("4. IsFull");
					System.out.println("5. Exit");
					System.out.println("Enter Your Choice ");
					switch (sc.nextInt()) {
					case 1:
						if (!queue.IsFull()) {
							System.out.println("Enter Element to Add");
							queue.AddQ(sc.nextInt());
							System.out.println("Added in Queue Successfully!");
						} else {
							System.out.println("Queue is Full");
						}
						break;
					case 2:
						if(!queue.IsEmpty()) {
							System.out.println("Delete Queue is - " + queue.DeleteQ());
						}else {
							System.out.println("Queue is Empty");
						}
						break;
					case 3:
						if (queue.IsEmpty()) {
							System.out.println("Queue is Empty!");
						} else {
							System.out.println("Queue is not Empty!");
						}
						break;
					case 4:
						if (queue.IsFull()) {
							System.out.println("Queue is Full!");
						} else {
							System.out.println("Queue is not Full!");
						}
						break;
					case 5:
						System.out.println("Exit");
						flag = false;
						break;

					default:
						System.out.println("Enter Correct Choice ");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
