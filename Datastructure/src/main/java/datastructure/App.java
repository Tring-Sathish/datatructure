package datastructure;

import java.util.*;
import java.util.logging.Logger;
import ds.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Logger logger = Logger.getLogger("Datastructure");
        StackEx stack = new StackEx();
        Linked l = new Linked();
        QueueEx que = new QueueEx();
        int choice;
        logger.info("\n1. STACK \n2. QUEUE \n3. Linked List \n\nEnter Your Choice : ");
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
                    logger.info("Invalid Choice");
                    System.exit(0);
                    break;
            }
        }
        s.close();
    }
}
