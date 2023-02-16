package internques;

class stacknode
{
    int name;
    stacknode prev,next;
    
    stacknode(int name)
    {
        this.name = name;
        this.prev = null;
        this.next = null;
    } 
}

class Stack1 {
    stacknode head,tail;
    int size=0;
    
    Stack1(){head=tail=null;}
    
    boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }
    
    void enqueue(int name)
    {
        stacknode newnode= new stacknode(name);
        if(head==null)
        {
            head = tail = newnode;
        }
        else
        {
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        System.out.println(head.name+" is added to the stack.");
        size++;
    }
    
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("The stack is empty");
            return;
        }
        stacknode current=head;
        head = head.next;
        if(head==null)
            tail=null;
        else
            head.prev=null;
        System.out.println(current.name+" is removed from the stack.");
        size--;
    }
        
    void display()
    {
        stacknode current=head;
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
public class StackLinkedList {

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.enqueue(1);
        s.enqueue(2);
        s.dequeue();
        s.enqueue(3);
        s.enqueue(4);
        s.enqueue(5);
        s.dequeue();
        s.display();
        s.size();
    }
}
