/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas.budelon
 */
public class ListTest {

    public ListTest() {

    }

    @Test
    public void AddFirst_When_The_List_Is_Empty() {

        LinkedList.List linkedList = new LinkedList.List();
        
        linkedList.AddFirst(2);

        assertTrue(!linkedList.IsEmpty());
        assertEquals(linkedList.Size(), 1);
        assertNotNull(linkedList.Head());
        assertNotNull(linkedList.Tail());
    }
    
    @Test
    public void AddLast_When_The_List_Is_Empty() {

        LinkedList.List linkedList = new LinkedList.List();
        
        linkedList.AddLast(2);

        assertTrue(!linkedList.IsEmpty());
        assertEquals(linkedList.Size(), 1);
        assertNotNull(linkedList.Head());
        assertNotNull(linkedList.Tail());
    }

    /*
    @Test
    public void RemoveFirst_When_The_List_Has_Only_One_Element() {
        
        LinkedList.List linkedList = new LinkedList.List();
        
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(3);
        
        linkedList.Remove();
        
        assertTrue(linkedList.IsEmpty());
        //assertEquals(linkedList.Size(), 0);
        assertNull(linkedList.Head());
        assertNull(linkedList.Tail());
    }
     */
}
