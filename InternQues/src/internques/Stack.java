package internques;

class StackList {
    String stack[] = new String[100];
    int size = stack.length;
    int top=-1;
    
    public boolean isEmpty()
    {
        if(top<=-1)
            return true;
        return false;
    }
    
    public void insertStack(String name)
    {
        if(top>=size-1)
        {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stack[top]=name;
        System.out.println(stack[top]+" is added to the stack.");
    }
            
    public void removeStack()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
        }
        System.out.println("Remove "+stack[top]+" from the stack.");
        stack[top]="";
        top--;
    }
            
    public void displayStack()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(stack[i]+"-");
        }
        System.out.println("\n");
    }
    
    public void getSize()
    {
        System.out.println("The size of queue is "+(top+1));
    }
}

public class Stack {

    public static void main(String[] args) {
        StackList s = new StackList();
        s.insertStack("1");
        s.insertStack("2");
        s.removeStack();
        s.insertStack("3");
        s.insertStack("4");
        s.insertStack("5");
        s.removeStack();
        s.insertStack("6");
        s.displayStack();
        s.getSize();
    }
}
