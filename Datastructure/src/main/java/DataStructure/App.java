package DataStructure;

import java.util.*;
import Ds.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackEx stack = new StackEx();
        linkedlist l = new linkedlist();
        queue que = new queue();
        int choice;
        System.out.print("\n1. STACK \n2. QUEUE \n3. Linked List \n\nEnter Your Choice : ");
        choice = s.nextInt();
        while (choice <= 3) {
            switch (choice) {
                case 1:
                    stack.callStack();
                    break;

                case 2:
                    que.callQueue();
                    break;

                case 3:
                    l.calllinkedist();
                    break;

                default:
                    System.out.print("Invalid Choice");
                    System.exit(0);
                    break;
            }
        }
        s.close();
    }
}
