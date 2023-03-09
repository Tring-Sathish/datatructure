package ds;

import java.util.*;

import datastructure.*;

public class QueueEx {
  int queue[] = new int[3];
  int len = queue.length;
  int front = -1;
  int rear = -1;
  int ch;
  Scanner S = new Scanner(System.in);

  public void callQueue() {
    while (ch <= 3) {
      System.out.println("\n1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY\n4. Exit\n");
      System.out.print("\nEnter Your Choice : ");
      ch = S.nextInt();
      switch (ch) {
        case 1:
          if (rear == len)
            System.out.println("Queue is full");
          else {
            System.out.print("Enter a Elements:");
            int ele = S.nextInt();
            enqueue(ele);
          }
          break;

        case 2:
          dequeue();
          break;

        case 3:
          display();
          break;

        case 4:
          App.main(null);
          break;

        default:
          System.out.print("Enter the valid choice : ");
          break;
      }
    }
  }

  void enqueue(int item) {
    if (front == -1)
      front = 0;
    rear++;
    queue[rear] = item;
  }

  void dequeue() {
    if (front == -1 || rear < 0)
      System.out.println("The Queue is Empty");
    else {
      System.out.println(queue[front] + " is removed from the Queue");
      front++;
    }
  }

  void display() {
    int i;
    if (front == -1 || rear < 0)
      System.out.println("Queue is empty");
    else {
      System.out.print("Display : ");
      for (i = front; i <= rear; i++)
        System.out.print(queue[i] + "\t");
    }
  }
}