package ds;

import java.util.*;

import datastructure.*;

public class StackEx {
    int ch;
    Scanner sc = new Scanner(System.in);
    int[] s = new int[3];
    int len = s.length;
    int tos = -1;

    public void callStack() {

        while (ch <= 3) {
            System.out.print("\n1. PUSH\n2. POP\n3. DISPLAY\n4. Exit\n");
            System.out.print("Choose the Action : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\nEnter Your Element : ");
                    int ele = sc.nextInt();
                    push(ele);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    App.main(null);
                    break;
                default:
                    System.out.println(" Invalid choice");
                    break;
            }
        }
    }

    void push(int item) {
        if (tos == len - 1) {
            System.out.println("The stack is full");
        } else {
            tos++;
            s[tos] = item;
            System.out.println(item + " is pushed  to stack\n ");
        }
    }

    void pop() {
        if (tos < 0)
            System.out.println("\nStack is empty\n");
        else {
            System.out.println(s[tos] + " is popped from the stack");
            tos--;

        }
    }

    void display() {
        if (tos < 0)
            System.out.println("stack is empty");
        else {
            System.out.print("Display : ");
            for (int i = tos; i >= 0; i--) {
                System.out.print(s[i] + "\t");
            }
        }
    }
}
