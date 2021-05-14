package code;

/**
 * Author: "Farnaz Tavakol"
 * For the backend engineer task for Startmate fellowship
 * The code includes the bonus revese functions and some tests in the main function
 * 
 */

import java.util.*;

public class LinkedList<T> {

  // each node holds its value, pointer to the next node and pointer to the node
  // befor it
  private static class Node<T> {
    T data;
    Node next;
 

    public Node(T data) {
      this.data = data;
      next = null;
    }

    @Override
    public String toString() {
      return data.toString();
    }
  }

  private Node<T> head;
  private Node<T> tail;

  /**
   * @param element This function will add the given element to the top of the
   *                list
   */
  public void addFirst(T element) {
    Node<T> toAdd = new Node(element);

    // check if list is empty to initilise it
    if (head == null) {
      head = toAdd;
      tail = toAdd;
    } else {
      toAdd.next = head;
      head = toAdd;
    }
  }

  /**
   * @param element This function will add the given element to the end of the
   *                list
   */
  public void addLast(T element) {
    Node<T> toAdd = new Node(element);
    // check if the list is emtpy to initialise it
    if (head == null) {
      head = toAdd;
      tail = toAdd;
    } else {
      tail.next = toAdd;
      tail = toAdd;
    }
  }

  /**
   * @return first element
   * This function will remove the last element
   */
  public T removeLast() throws Exception {

    // if the list throw an exception
    if (tail == null)
      throw new IllegalStateException();
    if (tail == head) {
      T data = head.data;
      tail = head = null;
      return data;
    }
    Node<T> temp = head;
    Node<T> befor = null;
    while (temp.next != null) {
      befor = temp;
      temp = temp.next;
    }
    befor.next = null;
    T data = tail.data;
    tail = befor;
    return data;
  }

  /**
   * @return last element
   * This function will remove the first element
   * @throws Exception
   */
  public T removeFirst() throws Exception {

    // if the list throw an exception
    if (head == null)
      throw new Exception("List is emtpy");

    if (head == tail) {
      T data = head.data;
      tail = head = null;
      return data;
    }
   
    T data = head.data;
    head = head.next;
    return data;
  }

  /**
   * @return head data This function will return the first element from the list
   */
  public T getFirst() {
    // if the list is empty return null
    if (head == null)
      return null;
    return head.data;
  }

  /**
   * @return tail data This function will return the last element from the list
   */
  public T getLast() {

    // if the list is empty return null
    if (tail == null)
      return null;
    return tail.data;
  }

  /**
   * This function will print the nodes in the list in the format
   * node.data->node.data->node.data
   */
  public void showList() {
    Node<T> temp = head;
    while (temp != null) {
      if (temp == tail)
        System.out.println(temp.toString());

      else
        System.out.print(temp.toString() + "->");

      temp = temp.next;
    }
  }

  /**
   * This function will reverse the list
   */
  public void reverse() {

    LinkedList<T> nodes = new LinkedList<T>();
    Node<T> temp = head;
    Node<T> befor = null;
    while (temp != null) {
      Node<T> curr = temp;
      temp = temp.next;
      curr.next = befor;
      befor = curr;
      
    }
    
    temp = head;
    head = tail;
    tail = temp;

  }

  @Override
  public String toString() {
    String res = "[";
    Node<T> temp = head;
    while (temp != null) {
      if (temp == tail)
        res += temp.toString();

      else
        res = res + temp.toString() + "->";

      temp = temp.next;
    }
    return res + "]";
  }

  public static void main(String[] argc) {
    //emptye
  }
}
