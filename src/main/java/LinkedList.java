/*
- linkedList class -
- So we implemented the datastructure itself at here. 
- I will be explaining all the functions one by one. It will be not do detailed. At videos we will be looking for the functions and their complexity more deeply.  
- For any errors or problems, please mail: samliumay965@gmail.com
*/
public class LinkedList {
  // Reference variable for the head Node.
  private Node first;

  // Reference variable for the tail Node.
  private Node last;

  // Variable to follow the size of linkedlist.
  private int size;

  // Constructor of the Linkedlist. We will be creating the Linkedlist by creating
  // the first node based on the value itself. Then we will be referencing the
  // head and tail nodes to this first node. Becaouse the first and the last node
  // is same when the size of list is 1. Then we set the size of linkedlist to 1.
  public LinkedList(int value) {
    Node node = new Node(value);
    first = node;
    last = node;
    size = 1;
  }

  // Setters and getters
  public int getSize() {
    return size;
  }

  public Node getTail() {
    return last;
  }

  public Node getHead() {
    return first;
  }

  // Function to insert a value to begining of the Linkedlist. As you can see the
  // complexity of the function is O(1).
  public void append(int value) {
    Node newNode = new Node(value);

    if (size == 0) {
      first = newNode;
      last = newNode;
    } else {
      last.setNext(newNode);
      last = newNode;
    }
    size++;
  }

  /*
   * Function to remove the last Node of the list. For cutting the reference of
   * the previus node, we need to travel n-1. So the complexity will be O(n). I am
   * using two Nodes as you can see, 'temp' and 'pre'. We will be using temp to
   * return the last node to the user itself. But we will be using pre to cut the
   * connection of the last node and change the tail of the linkedlist.
   */
  public Node removeLast() {
    Node temp = first;
    Node pre = first;
    if (size == 0) {
      return null;
    }

    while (temp.getNext() != null) {
      pre = temp;
      temp = temp.getNext();

    }
    last = pre;
    pre.setNext(null);
    size--;
    if (size == 0) {
      first = null;
      last = null;
    }
    return temp;
  }

  // Function to add value at the begining of the list. Complexity is O(1).
  public void prepend(int value) {

    Node newNode = new Node(value);

    if (size == 0) {
      newNode = first;
      newNode = last;
    } else {
      newNode.setNext(first);
      first = newNode;
    }

    size++;
  }

  // Function to remove the first value of the list. Complexity is O(1).
  public Node removeFirst() {

    if (size == 0) {
      return null;
    }
    Node temp = first;
    first = first.getNext();
    temp.setNext(null);
    size--;
    if (size == 0) {
      last = null;
    }
    return temp;

  }

  /*
   * Function to get the Node at the Linkedlist. Complexity is O(n).So to reach to
   * the spesific index of the linkedlist, we need to traversal insdie the
   * linkedlist. So at the workst case we need to look all the list. Thats why
   * complexity is O(n)
   */
  public Node get(int index) {
    if (index < 0 || index >= size) {
      return null;
    }

    Node temp = first;
    for (int i = 0; index > i; i++) {
      temp = temp.getNext();
    }
    return temp;

  }

  /*
   * Function to set the Node vaue at the Linkedlist. Complexity is O(n).So to
   * reach to the spesific index of the linkedlist, we need to traversal insdie
   * the linkedlist. So at the workst case we need to look all the list. Thats why
   * complexity is O(n)
   */
  public boolean set(int index, int value) {
    Node temp = get(index);

    if (temp != null) {
      temp.setValue(value);
      return true;
    }

    return false;
  }

  /*
   * Function to instert the Node vaue at the Linkedlist. Complexity is O(n).So to
   * reach to the spesific index of the linkedlist, we need to traversal insdie
   * the linkedlist. So at the workst case we need to look all the list. Thats why
   * complexity is O(n)
   */
  public boolean instert(int index, int value) {
    if (index < 0 || index > size) {
      return false;
    } else if (index == 0) {
      prepend(value);
    } else if (index == size) {
      append(value);
    } else {
      Node newNode = new Node(value);
      Node temp = get(index - 1);
      newNode.setNext(temp.getNext());
      temp.setNext(newNode);

    }
    size++;
    return true;

  }

  /*
   * Function to remove the Node vaue at the Linkedlist. Complexity is O(n).So to
   * reach to the spesific index of the linkedlist, we need to traversal insdie
   * the linkedlist. So at the workst case we need to look all the list. Thats why
   * complexity is O(n)
   */
  public Node remove(int index) {
    if (index < 0 || index > size) {
      return null;
    } else if (index == 0) {
      size--;
      return removeFirst();
    } else if (index == size) {
      size--;
      return removeLast();
    }

    Node current = get(index);
    Node temp = get(index - 1);

    temp.setNext(current.getNext());
    current.setNext(null);

    size--;

    return current;

  }
  /*
   * Function to reverse all the linkedlist. Complexity is O(n).So we need to
   * reverse all the nodes, we need to traversal with a different system inside
   * the linkedlist. We will be doing 3n computations aprximetly. Still as we now
   * we are droping the constants while expressing the complexity. So the
   * complexity is O(n).
   */

  public void reverse() {

    Node temp = first;
    first = last;
    last = temp;
    Node after = temp.getNext();
    Node before = null;
    for (int i = 0; i < size; i++) {
      after = temp.getNext();
      temp.setNext(before);
      before = temp;
      temp = after;
    }
  }

  // Function to print the list in a proper way. Not to relevant.
  public void printList() {

    Node temp = first;

    while (temp != null) {

      System.out.print(temp.getValue() + " -> ");

      temp = temp.getNext();
    }
    System.out.print("null \n");
  }

}