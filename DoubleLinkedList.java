import java.util.*;

class DoubleLinkedList{

    DNode list=null;
    int value;

    DoubleLinkedList(){}

    void dLadd(){
        
        if(list==null)
        list=new DNode(value);

        else{
            DNode temp=this;
            DNode prev=null;
            while(temp.tail!=null){
                prev=temp;
                temp=temp.tail;
            }
            DNode n =new DNode(value);
            n.head=prev;
            temp.tail=n;  

        }
   
    }

    /*public boolean hasNext(){
    
        if (this.tail==null){
            return false;
        }
        else
        return true;
    }*/

    void showNodes(){
        DNode nodeobj = this;
        while(nodeobj.tail!=null){
            nodeobj = nodeobj.tail;
        }
        System.out.println(nodeobj.value);
    }




}