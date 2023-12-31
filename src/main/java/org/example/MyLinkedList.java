package org.example;

public class MyLinkedList {
    public INode head;
    public INode tail;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void addFirst(INode newFirstNode){
        if(this.head==null){
            this.head=newFirstNode;
        }
        if(this.tail==null){
            this.tail=newFirstNode;
        }
        else{
            this.tail.setNext(newFirstNode);
            this.tail=newFirstNode;
        }

    }
    public void inBetweenInsert(INode firstNode, INode newNode){
        INode temp=firstNode.getNext();
        firstNode.setNext(newNode);
        newNode.setNext(temp);

    }
    public void append(INode firstNode, INode newNode){
        INode temp=head;
        while(!temp.equals(firstNode)){
            temp= temp.getNext();
        }
        INode rev=temp.getNext();
        temp.setNext(newNode);
        newNode.setNext(rev);

    }
    public void add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else{
            INode temp=this.head;
            this.head=newNode;
            this.head.setNext(temp);
        }
    }
    public INode popdeleteFirst(){
        INode temp=this.head;
        this.head=head.getNext();
        return temp;
    }
    public INode deleteLast(){
        INode temp=head;
        while(!temp.getNext().equals(tail)){
            temp= temp.getNext();
        }
        this.tail=temp;
        temp= temp.getNext();
        tail.setNext(null);
        return temp;
    }
    public INode deleteInBetween(INode node){
        INode temp=head;
        while(!temp.getNext().equals(node)){
            temp= temp.getNext();
        }
        INode delete=temp.getNext();
        temp.setNext(temp.getNext().getNext());
        delete.setNext(null);
        return delete;
    }
    public Integer size(){
        if(head==null){
            return 0;
        }
        Integer length=1;
        INode temp=head;
        while(temp.getNext()!=null){
            length+=1;
            temp=temp.getNext();
        }
        return length;

    }
    public void printNode(){
        StringBuffer myNode=new StringBuffer("My Node is :");
        INode temp=head;
        while(temp.getNext()!=null){
            myNode.append(temp.getKey());
            if(!temp.equals(tail)){
                myNode.append("->");
            }
            temp=temp.getNext();
        }
        myNode.append(temp.getKey());
        System.out.println(myNode);
    }
    public INode searchNode(INode node){
        INode temp=head;
        while(temp.getNext()!=null){
            if(temp.equals(node)){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;

    }
    public boolean searchKey(Integer key){
        INode temp=head;
        while(temp!=null){
            if(temp.getKey()==key){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    public boolean isEmpty(INode head){
        if(head==null){
            return true;
        }
        return false;
    }


}
