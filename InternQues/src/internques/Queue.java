package internques;

class QueueList {
    String queue[] = new String[100];
    int size = queue.length;
    int front = -1,end = -1;
    
    public boolean isEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public void enqueue(String name)
    {
        try{
            if(end>=size-1)
            {
                System.out.println("The queue is full!");
                return;
            }
            else
            {
                if(front == -1)
                {
                    front = 0;
                }
                System.out.println(name+" is added to the queue.");
                end++;
                queue[end]=name;
            }
        }catch(Exception e){}
    }
    
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(queue[front]+" is removed from the queue.");
        queue[front]="";
        front++;
    }
    
    public void getQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        for(int i = front;i<=end;i++)
        {
            System.out.print(queue[i]+" - ");
        }
        System.out.println("\n");
    }
    
    public void getSize()
    {
        System.out.println("The size of queue is "+(end-front+1));
        System.out.println("\n");
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueList q = new QueueList();
        q.enqueue("1");
        q.enqueue("2");
        q.dequeue();
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");
        q.dequeue();
        q.enqueue("6");
        q.getQueue();
        q.getSize();
    }
    
}
