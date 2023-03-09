package ds;

import java.util.Scanner;
import java.util.logging.Logger;
import datastructure.*;

public class Linked {
    Node head;
    Logger logger = Logger.getLogger("Datastructure");

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public Linked() {
        head = null;
    }

    public void insertAtBegining(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            logger.info(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int position, int val) {
        if (position == 0) {
            insertAtBegining(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i <= position - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("invalid position" + "" + position);
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= position; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void insertAtEnd(int val) {
        Node newnode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
    }

    public void calllinkedist() {
        Linked list = new Linked();
        Scanner sc = new Scanner(System.in);
        final msg = "Enter the value : ";
        int ch = 0;
        while (ch <= 3) {
            logger.info(
                    "\n1. Insert At Begin \n2. Insert At Postion \n3. Insert At End\n4. Delete At Position\n5. Display\n6. Exit\n");
            logger.info("\nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    logger.info(msg);
                    int val = sc.nextInt();
                    list.insertAtBegining(val);
                    break;

                case 2:
                    logger.info("Enter the position : ");
                    int pos = sc.nextInt();
                    logger.info(msg);
                    val = sc.nextInt();
                    list.insertAtPos(pos, val);
                    break;

                case 3:
                    logger.info(msg);
                    val = sc.nextInt();
                    list.insertAtEnd(val);
                    break;

                case 4:
                    logger.info("Enter the position : ");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    App.main(null);
                    break;

                default:
                    logger.info("Enter the valid choice : ");
                    break;
            }
        }
        S.close();
    }
}
