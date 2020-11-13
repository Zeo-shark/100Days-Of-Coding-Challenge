import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node{

    protected int data;
    protected Node link;

    public Node(){
        data= 0;
        link= null;
    }
   //Parameterised Constructor
   public Node(int n, Node link)
   {
       this.data= data;
       this.link= link;
   }

   public void setLink(Node n){
       link= n;
   }

   public void setData(int d) {
       data= d;

   }
   public void setLink(Node link){
       this.link= link;
   }
   public int getData() {
       return data;
   }
   public Node getLink(){
       return link;
   }
}

// Class SinglyLinkedList
public class SinglyLinkedList{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        linkedList list= new linkedList();
        

    }
}