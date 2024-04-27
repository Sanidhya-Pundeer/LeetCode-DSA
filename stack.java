class stack {
    int top = 0;
    int size = 5;
    int arr[] = new int[size];

    boolean push(int i) {
        if (top == size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[top] = i;
            top++;
            System.out.println("Successfully pushed");
            return true;
        }
    }

    boolean pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return false;
        } else {
            System.out.println(arr[top]);
            arr[top] = 0;
            top--;
            System.out.println("Successfully popped");
            return true;

        }
    }

    int peek() {
        if (top == 0) {
            System.out.println("Stack Empty");
            return 0;
        }

        else {
            return arr[top - 1];
        }
    }

}

class temp {
    public static void main(String[] args) {
        stack sc = new stack();
        sc.push(5);
        int i = sc.peek();
        System.out.println(i);
    }
}