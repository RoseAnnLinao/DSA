public class ArrayStack {
  
  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public ArrayStack(int size) {
    capacity = size;
    storage = new String[capacity];
  } 
  

  public void show() {
    for (int j = capacity-1; j >= 0; j--) { 
      for (int i = capacity-1; i >= 0; i--) {
          System.out.println("stack["+ j-- +"] = " + storage[i]);
      }
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
       System.out.println("STORAGE IS EMPTY.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
       System.out.println("STORAGE IS FULL.");
       System.out.println();
       return true;
    } 
    return false;
  }

  public void push(String value) { 
    if (isFull()) {
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {
      
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
    
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {

      System.out.println("REMOVE FAILED");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ArrayStack storage = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show();
    storage.pop();
    storage.peek();
    storage.push("one");
    storage.show();
    storage.peek();
    storage.push("two");
    storage.show();
    storage.peek();
    storage.push("three");
    storage.show();
    storage.peek();
    storage.push("four");
    storage.show();
    storage.peek();
    storage.push("five");
    storage.show();
    storage.peek();
    storage.push("six"); 
    storage.show();
    storage.peek();
    storage.push("seven"); 
    storage.show();
    storage.peek();
    storage.push("eight");
    storage.show();
    storage.peek();
    storage.push("nine");
    storage.show();
    storage.peek();
    storage.push("ten");
    storage.show();
    storage.peek();
    
  }  

}