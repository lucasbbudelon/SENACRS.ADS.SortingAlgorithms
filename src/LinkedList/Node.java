/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author lucas.budelon
 * @param <T>
 */
public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    public T Data;
    public Node Next;
    public Node Prev;

    public T getT() {
        return Data;
    }

    public Node(T data, Node next, Node prev) {
        this.Data = data;
        this.Next = next;
        this.Prev = prev;
    }

    public int compareTo(T t) {
        return getT().compareTo(t);
    }

    @Override
    public int compareTo(Node<T> other) {
        return getT().compareTo(other.getT());
    }
}
