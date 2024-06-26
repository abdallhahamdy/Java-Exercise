public class Exercise_2 {

    /* Write a Java program to sort the elements of a given stack in ascending order. */

    private int[] arr;
    private int top;

    public Exercise_2(int size) {
        arr = new int[size];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    // Method to get the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public void sort() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        Exercise_2 tempStack = new Exercise_2(arr.length);

        while (!isEmpty()) {
            int temp = pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp ) {
                push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise_2 stack = new Exercise_2(6);
        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.display();
        System.out.println("Sort the elements of the stack in ascending order:");
        stack.sort();
        stack.display();
    }
}
