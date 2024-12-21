package Linked_list;

import org.w3c.dom.*;

   class Node {
    int value;
    Node next;
    Node (int value){
    this.value=value;
}
}
class main{
    public static void main(String[] args) {
//        linklist_construct sc=new linklist_construct();
//        sc.value=10;
//
//
//        linklist_construct a=new linklist_construct();
//        a.value=20;
//
//
//        linklist_construct b=new linklist_construct();
//        b.value=30;
//
//
//        linklist_construct c=new linklist_construct();
//        c.value=40;
//
//
//        System.out.println(sc);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        System.out.println(sc.value);
//        System.out.println(a.value);
//        System.out.println(b.value);
//        System.out.println(c.value);
//
//
//        System.out.println(sc.next);
//        System.out.println(a.next);
//        System.out.println(b.next);
//        System.out.println(c.next);


//        linklist_construct a=new linklist_construct(10);
//        linklist_construct b=new linklist_construct(20);
//        linklist_construct c=new linklist_construct(30);
//        linklist_construct d=new linklist_construct(40);
//        linklist_construct e=new linklist_construct(50);
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
        System.out.println(temp.value);


       System.out.println(a);
//       System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        System.out.println(a.value);
//        System.out.println(b.value);
//       System.out.println(c.value);
//        System.out.println(d.value);
//
//        System.out.println(a.next);
//        System.out.println(b.next);
//       System.out.println(c.next);
//        System.out.println(d.next);
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }


    }
}
