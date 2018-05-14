/*
 * To change this license _header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @author lucas.budelon
 */
public class List<T> {

    private Node _head;
    private Node _tail;
    private int _size;

    public List() {

    }

    /**
     * returns the _head of the linked list
     *
     * @return
     */
    public Node Head() {
        return _head;
    }

    /**
     * returns the _tail of the linked list
     *
     * @return
     */
    public Node Tail() {
        return _tail;
    }

    /**
     * returns the _size of the linked list
     *
     * @return
     */
    public int Size() {
        return _size;
    }

    /**
     * return whether the list is empty or not
     *
     * @return
     */
    public boolean IsEmpty() {
        return _size == 0;
    }

    /**
     * Adds data at the starting of the linked list
     *
     * @param data - Data/Value to be added
     */
    public void AddFirst(T data) {

        Node newNode = new Node((Comparable) data, _head, null);

        if (_head != null) {
            _head.Prev = newNode;
        }

        _head = newNode;

        if (_tail == null) {
            _tail = newNode;
        }

        _size++;
    }

    /**
     * Adds data at the end of the linked list
     *
     * @param data - Data/Value to be added
     */
    public void AddLast(T data) {

        Node newNode = new Node((Comparable) data, null, _tail);

        if (_tail != null) {
            _tail.Next = newNode;
        }

        _tail = newNode;

        if (_head == null) {
            _head = newNode;
        }

        _size++;
    }

    /**
     * Remove data from the start of the linked list
     *
     * @return Data/Value to be removed
     */
    public T RemoveFirst() {

        if (_size == 0) {
            throw new NoSuchElementException();
        }

        Node nodeToBeRemoved = _head;

        _head = _head.Next;
        _head.Prev = null;

        _size--;

        return (T) nodeToBeRemoved.Data;
    }

    /**
     * Remove data at end of linked list
     *
     * @return Data/Value to be removed
     */
    public T RemoveLast() {

        if (_size == 0) {
            throw new NoSuchElementException();
        }

        Node nodeToBeRemoved = _tail;

        _tail = _tail.Prev;
        _tail.Next = null;

        _size--;

        return (T) nodeToBeRemoved.Data;
    }

    /**
     * Print linked list from Head
     */
    public void PrintFromHead() {
        System.out.println("Print linked list from Head");
        System.out.println(ToStringFromHead());
        System.out.println("");
    }

    /**
     * Returns list in string format
     *
     * @return list in string format
     */
    public String ToStringFromHead() {

        String list = "";

        Node currentNode = _head;

        while (currentNode != null) {

            list += currentNode.Data;

            currentNode = currentNode.Next;

            if (currentNode != null) {
                list += " - ";
            }
        }

        return list;
    }

    /**
     * Performs list sorting using an unstable algorithm
     */
    public void EfficientSort() {
        //QuickSort(_head, _tail);
        SelectionSort();
    }

    /**
     * Performs list sorting using a stable algorithm
     */
    public void StableSort() {
        InsertionSort();
    }

    /**
     * Exchange two place values
     *
     * @param node1
     * @param node2
     */
    public void Swap(Node node1, Node node2) {

        T backup = (T) node1.Data;

        node1.Data = node2.Data;
        node2.Data = (Comparable) backup;
    }

    
    private void InsertionSort() {

        Node i = _head;
        while (i != null) {

            Node j = i.Prev;

            while (j != null && i.compareTo(j) < 0) {
                Swap(i, j);
                i = i.Prev;
                j = j.Prev;
            }

            i = i.Next;
        }
    }

    private void SelectionSort() {

        Node i = _head;
        while (i != null) {

            Node index = i;

            Node j = i.Next;
            while (j != null) {

                if ((int) j.compareTo(index) < 0) {
                    index = j;
                }

                j = j.Next;
            }

            Swap(i, index);

            i = i.Next;
        }
    }

    private Node LomutoPartition(Node start, Node end, Node pivot) {

        Node compare = start;
        Node index = start;

        while (index != null) {

            if (index.compareTo(pivot) <= 0) {
                Swap(compare, index);
                compare = compare.Next;
            }

            index = index.Next;
        }

        Swap(compare, end);
        return compare;
    }

    private void QuickSort(Node start, Node end) {

        if (start.compareTo(end) < 0) {

            Node midpoint = LomutoPartition(start, end, start);

            QuickSort(start, midpoint.Prev);
            QuickSort(midpoint.Next, end);
        } else {
            Swap(start, end);
        }
    }
}
