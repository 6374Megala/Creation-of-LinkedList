import org.example.INode;
import org.example.MyLinkedList;
import org.example.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void createSimpleLinkedListUC1() {
        MyNode<Integer> node1 = new MyNode(70);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(50);

    }
    @Test
    public void addingDataToLinkedListUC2(){
        MyNode<Integer> node1 = new MyNode(70);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(50);
        MyLinkedList myList = new MyLinkedList();
        myList.add(node1);
        myList.add(node2);
        myList.add(node3);
        myList.printNode();
    }
    @Test
    public void insertLastDataInLinkedListUC3(){
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.printNode();
    }
    @Test
    public void insertInBetweenUC4(){
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node3);
        myList.printNode();
        myList.inBetweenInsert(node1,node2);
        myList.printNode();
    }
    @Test
    public void deleteFirstUC5(){
        MyNode<Integer> node1 = new MyNode(56);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.printNode();
       INode deleted= myList.popdeleteFirst();
       Assert.assertEquals(node1,deleted);
        myList.printNode();
    }

    @Test
    public void deleteLastUC6(){
        MyNode<Integer> node1 = new MyNode(56);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.printNode();
        INode deleted= myList.deleteLast();
        System.out.println(deleted.getKey());
        Assert.assertEquals(node3,deleted);
        myList.printNode();
    }
    @Test
    public void searchLinkedListUC7(){
        MyNode<Integer> node1 = new MyNode(56);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.printNode();
        INode key=myList.searchNode(node2);
        System.out.println(key.getKey());
        boolean res=myList.searchKey(80);
        System.out.println( res);
    }
    @Test
    public void insertInBetweenUC8(){
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(40);
        MyNode<Integer> node4 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node4);
        myList.printNode();
        myList.inBetweenInsert(node2,node3);
        myList.printNode();
    }
    @Test
    public void deleteInBetweenUC9(){
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(40);
        MyNode<Integer> node4 = new MyNode(70);
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.addFirst(node4);
        System.out.println( myList.size());
        myList.printNode();
        INode key= myList.deleteInBetween(node3);
        System.out.println( key.getKey());
        myList.printNode();
        System.out.println( myList.size());
        System.out.println( myList.isEmpty(node1));

    }

}
