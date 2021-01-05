package ms0.a0;

public class Stack {

    private int size = 0;
    private int defaultCapacity = 100;
    private String[] arr;

    public Stack() {
        this.arr = new String[defaultCapacity];
    }

    public void push(String element) {
        if (size == arr.length) {
            arr = resizeArray();
        }
        arr[size] = element;
        size++;

    }

    public String pop() {
        if (size - 1 < 0) {
            return "The stack is empty";
        }
        String element = arr[size - 1];
        String[] newArr = new String[arr.length];
        for (int i = 0; i < size-1; i++) {//arr.length - 1
            newArr[i] = arr[i];
        }
        arr = newArr;
        size--;
        return element;

    }

    //public void trimToSize() {
    // if size<arr.length
    //arr.length==size
    // }

    private String[] resizeArray() {
        int newSize = arr.length*2;
        String[] newArr = new String[newSize];
        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public String peek(){
        if(size-1<0){
            return "The stack is empty";
        }
        return arr[size-1];
    }

    public int size(){

         return size;
    }
}

