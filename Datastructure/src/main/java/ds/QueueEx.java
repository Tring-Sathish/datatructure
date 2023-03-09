package ds;

import java.util.*;
import java.util.logging.Logger;
import datastructure.*;

public class QueueEx {
  int queue[] = new int[3];
  int len = queue.length;
  int front = -1;
  int rear = -1;
  int ch;
  Scanner S = new Scanner(System.in);
  Logger logger = Logger.getLogger("Datastructure");

  public void callQueue() {
    while (ch <= 3) {
      logger.info("\n1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY\n4. Exit\n");
      logger.info("\nEnter Your Choice : ");
      ch = S.nextInt();
      switch (ch) {
        case 1:
          if (rear == len)
            logger.info("Queue is full");
          else {
            logger.info("Enter a Elements:");
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
          logger.info("Enter the valid choice : ");
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
      logger.info("The Queue is Empty");
    else {
      logger.info(queue[front] + " is removed from the Queue");
      front++;
    }
  }

  void display() {
    int i;
    if (front == -1 || rear < 0)
      logger.info("Queue is empty");
    else {
      logger.info("Display : ");
      for (i = front; i <= rear; i++)
        logger.info(queue[i] + "\t");
    }
  }
}
