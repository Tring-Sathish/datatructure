import java.util.*;

import Ds.Stack;
import Ds.linkedlist;
import Ds.queue;

    public class Main {
        public static void main(String args[])
    {
            try (Scanner s = new Scanner(System.in)) {
                  Stack stack=new Stack();
                  queue que=new queue();
                  int choice;
                  System.out.print("\n1. STACK \n2. QUEUE \n3. Linked List \n\nEnter Your Choice : ");
                  choice=s.nextInt();
                  while(choice<=3){
                        switch(choice)
                        {
                            case 1:  
                                stack.callStack(); 
                                break;

                            case 2:
                                que.callQueue();
                                break;

                            case 3:
                                linkedlist.calllinkedist(args);
                                break;

                            default:
                                System.out.print("Invalid Choice");
                                System.exit(0);
                                break;
                        }
                }
            }
            }
        }
