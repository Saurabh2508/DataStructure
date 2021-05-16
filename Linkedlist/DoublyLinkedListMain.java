
package Saurabh.Linkedlist;


public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList_DeleteNodeWithData list=new DoublyLinkedList_DeleteNodeWithData();
        list.addNode(49);
        list.addNode(20);
        list.addNode(67);
        list.addNode(55);
        list.display();
        list.reverseDisplay();
        list.deleteData(20);
        list.display();
        list.reverseDisplay();
    }
}
