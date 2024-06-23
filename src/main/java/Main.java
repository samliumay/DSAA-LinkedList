/*
-Linked Lists-
- Generally at Data structures and Coding lessons, we start with the LinkedLists. But what is Linkedlists? 
- Its basically a data structure. It has nodes gas reference to other nodes. And you are inserting the data in to node. 
- Still looking to what is LinkedList before coming here can be helpfull.
- Lessons will be available soon. They will be at youtube and when its finished I will be putting to the Github page.
- Still for introduction, you can check: https://www.geeksforgeeks.org/linked-list-data-structure/
- At this lesson we basically coded the LinkedList structure by ourselves. 
- Firslty Look and read node class. Be sure that you understand everything. 
- Then Look to the LinkedList class. It is the main class that we developed the Linked List data structure. 
- Lastly came to here and observe how the functions work. 
- Do not forget to report any mistakes or errors to samliumay965@gmail.com
*/

public class Main {
  public static void main(String[] args) {

    System.out.println("Controlling append function:  ");
    LinkedList linkedlist = new LinkedList(1);
    System.out.print("Before Append: ");
    linkedlist.printList();

    linkedlist.append(2);
    linkedlist.append(3);
    linkedlist.append(4);
    System.out.print("After Append: ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling removeLast function: ");
    System.out.print("Before removLast: ");
    linkedlist.printList();
    linkedlist.removeLast();
    System.out.print("After removLast: ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling removeFirst function: ");
    System.out.print("Before removFirst: ");
    linkedlist.printList();
    linkedlist.removeFirst();
    System.out.print("After removFirst: ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling get function: ");
    System.out.print("Geting the value at index 1: ");
    System.out.println(linkedlist.get(1).getValue());
    System.out.println("");

    System.out.println("Controlling set function: ");
    System.out.print("Before setting value at index 1 to 39 : ");
    linkedlist.printList();
    linkedlist.set(1, 39);
    System.out.print("After setting value at index 1 to 39 : ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling insert function: ");
    System.out.print("Before inserting 1 to index 1: ");
    linkedlist.printList();
    linkedlist.instert(1, 1);
    System.out.print("After inserting 1 to index 1 : ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling remove function: ");
    System.out.print("Before removingNode at index 1: ");
    linkedlist.printList();
    linkedlist.remove(1);
    System.out.print("After remove 1 to index 1 : ");
    linkedlist.printList();
    System.out.println("");

    System.out.println("Controlling reverse function: ");
    System.out.print("Before reversing the Linkedlist: ");
    linkedlist.printList();
    linkedlist.reverse();
    System.out.print("After reversing the Linkedlist: ");
    linkedlist.printList();
  }
}