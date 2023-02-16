package internques;

class listnode
{
    int name;
    listnode next;
    public listnode(int name){
            this.next = null;
            this.name = name;
    }
}

class Queue1 {
    listnode head,tail;
    int size=0;
        
    Queue1(){head=tail=null;}    
        
    boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    void enqueue(int name)
    {
        listnode node = new listnode(name);
        if(head==null)
            head = tail = node;
        else{
            this.tail.next=node;
            tail=node;
        }
        System.out.println(name+" is added to the queue.");
        size++;
    }
        
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("The queue is empty");
            return;
        }
        listnode current = this.head;
        this.head = this.head.next;
            
        if(head==null)
            tail=null;
        System.out.println(current.name+" is removed to the queue.");
        size--;
    }
    void display()
    {
        listnode current = head;
        while(current!=null)
        {
            System.out.print(current.name+"-");
            current=current.next;
        } 
    }
    
    void size()
    {
        System.out.println("\nThe size is "+size);
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.display();
        q.size();
    }
}
