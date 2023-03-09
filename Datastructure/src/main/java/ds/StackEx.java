package ds;

import java.util.*;
import java.util.logging.Logger;
import datastructure.*;

public class StackEx {
    int ch;
    Scanner sc = new Scanner(System.in);
    Logger logger = Logger.getLogger("Datastructure");
    int[] s = new int[3];
    int len = sc.length;
    int tos = -1;

    public void callStack() {

        while (ch <= 3) {
            logger.info("\n1. PUSH\n2. POP\n3. DISPLAY\n4. Exit\n");
            logger.info("Choose the Action : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    logger.info("\nEnter Your Element : ");
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
                    logger.info(" Invalid choice");
                    break;
            }
        }
    }

    void push(int item) {
        if (tos == len - 1) {
            logger.info("The stack is full");
        } else {
            tos++;
            s[tos] = item;
            logger.info(item + " is pushed  to stack\n ");
        }
    }

    void pop() {
        if (tos < 0)
            logger.info("\nStack is empty\n");
        else {
            logger.info(s[tos] + " is popped from the stack");
            tos--;

        }
    }

    void display() {
        if (tos < 0)
            logger.info("stack is empty");
        else {
            logger.info("Display : ");
            for (int i = tos; i >= 0; i--) {
                logger.info(s[i] + "\t");
            }
        }
    }
}
