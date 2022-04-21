package Ds;

import java.util.Scanner;

public class linkedlist {
       Node head;
       class Node{
                int data;
                Node next;
                Node(int val){
                    data=val;
                    next=null;
                }
       } 
       public linkedlist()
       {
            head=null;
       }
        public  void insertAtBegining(int val)
       {
          Node newnode=new Node(val);
          if(head==null)
          {
             head=newnode;   
         }
         else{
             newnode.next=head;
             head=newnode;
         }
      }
      public  void display(){
          Node temp=head;
          while(temp!=null)
          {
            System.out.println(temp.data+" ");
          temp=temp.next;
          }
      }
     public  void insertAtPos(int position,int val)
      {
          if(position==0)
          {
                insertAtBegining(val);
                return;
          }
            Node newNode=new Node(val);
            Node temp=head;
            for(int i=1;i<=position-1;i++)
            {
                temp=temp.next;
                if(temp==null){
                   throw new IndexOutOfBoundsException("invalid position"+""+position);
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void deleteAtPos(int position)
       {
           if(head==null){
               throw new IndexOutOfBoundsException("Deletion attempted on empty list");
           }
           if(position==0)
           {
               head=head.next;
               return;
           }
           Node temp=head;
           Node prev=null;
           for(int i=1;i<=position;i++){
               prev= temp;
               temp=temp.next;
           }
           prev.next=temp.next;
       }
       public void insertAtEnd(int val){
           Node newnode=new Node(val);
           Node temp=head;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=newnode;
           newnode.next=null;
       }
       public static void calllinkedist(){
           linkedlist list=new linkedlist();
           list.insertAtBegining(5);
           list.insertAtBegining(9);
           list.display();
            System.out.println("");
           list.insertAtPos(1,10);
           list.display();
           System.out.println("");
           list.deleteAtPos(0);
           list.display();
           System.out.println("");
          list.insertAtEnd(56);
           list.display();
           Choose();
       }
       private static void Choose() {
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
                          linkedlist.calllinkedist();
                          break;

                      default:
                          System.out.print("Invalid Choice");
                          System.exit(0);
                          break;
                  }
          }
  }
  
       }

      /* public void calllinkedist(){
        linkedlist list=new linkedlist();
        list.insertAtBegining(5);
        list.insertAtBegining(9);
        list.display();
         System.out.println("");
        list.insertAtPos(1,10);
        list.display();
        System.out.println("");
        list.deleteAtPos(0);
        list.display();
        System.out.println("");
       list.insertAtEnd(56);
        list.display();
       }*/
    
    }
