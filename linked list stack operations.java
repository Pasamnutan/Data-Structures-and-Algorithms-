class Stack {
    int data;
    Stack next;

    // Constructor
    Stack(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackOne {

    Stack top;

    public void push(int data) {
        Stack newNode = new Stack(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Top of the stack: " + top.data);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }
        Stack temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        StackOne operations = new StackOne();
        operations.push(10);
        operations.push(20);
        operations.push(30);
        operations.push(40);
        operations.push(50);

        operations.peek();
        operations.display();

        operations.pop();
        operations.display();

        operations.pop();
        operations.peek();
    }
}
