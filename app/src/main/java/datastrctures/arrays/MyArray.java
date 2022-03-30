package datastrctures.arrays;

import java.util.Arrays;

/* Implementing an array
*/
public class MyArray {

    private int length;
    private Object[] data;
    private int capacity;

    public MyArray() {
        this.capacity = 1;
        this.length = 0;
        this.data = new Object[1];
    }

    // To get an item for given index
    public Object get(int index) {
        return this.data[index];
    }

    public void push(Object item) {
        if (capacity == length) {
            this.data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        this.data[length] = item;
        this.length++;
    }

    public Object pop() {
        Object popped = data[length - 1]; // To delete last item from an array
        data[length - 1] = null;
        length--;
        return popped;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.push("First Item");
        myArray.push("Second Item");
        myArray.push("Third Item");

        myArray.pop();
        System.out.println("Length of myArray: " + myArray.length);

        // To print myArray
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("i: " + myArray.get(i));
        }
    }
}
