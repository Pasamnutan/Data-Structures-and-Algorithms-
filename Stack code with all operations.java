class Stack {
    int[] a = new int[5];
    int top = -1; // Initial top is -1

    public void push(int data) {
        if (top == a.length - 1) {
            System.out.println("Stack is overflow");
        } else {
            top++;
            a[top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Deleted element: " + a[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Top element: " + a[top]);
        }
    }




    +

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}








+





