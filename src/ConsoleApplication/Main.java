package ConsoleApplication;

/**
 *
 * @author lucas.budelon
 */
public class Main<T> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList.List linkedList;

        System.out.println("");

        linkedList = new LinkedList.List();
        linkedList.AddLast(4);
        linkedList.AddLast(7);
        linkedList.AddLast(2);
        linkedList.AddLast(8);
        linkedList.AddLast(3);
        linkedList.AddLast(10);
        linkedList.AddLast(5);
        linkedList.AddLast(9);
        linkedList.AddLast(1);
        linkedList.AddLast(6);
        System.out.println("List: " + linkedList.ToStringFromHead());

        linkedList.EfficientSort();
        System.out.println("EfficientSort: " + linkedList.ToStringFromHead());

        System.out.println("");

        linkedList = new LinkedList.List();
        linkedList.AddLast("F");
        linkedList.AddLast("D");
        linkedList.AddLast("G");
        linkedList.AddLast("B");
        linkedList.AddLast("I");
        linkedList.AddLast("E");
        linkedList.AddLast("A");
        linkedList.AddLast("H");
        linkedList.AddLast("J");
        linkedList.AddLast("C");
        System.out.println("List: " + linkedList.ToStringFromHead());

        linkedList.StableSort();
        System.out.println("StableSort: " + linkedList.ToStringFromHead());

        System.out.println("");
    }
}
