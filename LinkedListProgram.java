package LinkedList;

public class LinkedListProgram {
    public static void main(String args[]) {
        System.out.println("Welcome To Linked List Problem");

        System.out.println("\n===================");

        //Add Data at head in linked list
        System.out.println("Add Nodes");
        ListOperations.addData();
        System.out.println("\n===================");

        //Add Data at tail in linked list
        System.out.println("Append Nodes");
        ListOperations.appendData();
        System.out.println("\n===================");

        //Add Data at middle in linked list
        System.out.println("Insert Nodes");
        ListOperations.insertData();
        System.out.println("\n===================");

        //Add head data in linked list
        System.out.println("Delete First Node");
        ListOperations.deleteFirstData();
        System.out.println("\n===================");

        //delete tail data in linked list
        System.out.println("Delete Last Node");
        ListOperations.deleteLastData();
        System.out.println("\n===================");

        //Find Data by value in linked list
        System.out.println("Find Node By Value");
        ListOperations.findNodeByValue();
        System.out.println("===================");

        //Insert Data at given node in linked list
        System.out.println("Insert Element");
        ListOperations.insertDataAtGivenNode();
        System.out.println("\n===================");

        //Delete Data at given node in linked list
        System.out.println("Delete Element");
        ListOperations.deleteDataAtGivenNode();
        System.out.println("\n===================");

        //Sort linked list
        System.out.println("Sort List");
        ListOperations.sortList();
        System.out.println("\n===================");
    }
}

//Node Class
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
