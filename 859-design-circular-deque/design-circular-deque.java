class MyCircularDeque {

   private final int[] buffer;
   private int head;
   private int tail;
   private int size;

   public MyCircularDeque(int k) {
       this.buffer = new int[k];
       this.head = 1;
       this.tail = 0;
       this.size = 0;
   }    

   public boolean insertFront(int value) {
       if (isFull()) {
           return false;
       }
       head = prev(head);
       buffer[head] = value;
       size++;
       return true;
   }

   private int prev(int i) {
       return i == 0 ? buffer.length - 1 : --i;
   }
   
   public boolean insertLast(int value) {
       if (isFull()) {
           return false;
       }
       tail = next(tail);
       buffer[tail] = value;
       size++;
       return true;
   }
   
   private int next(int i) {
       i++;
       return i == buffer.length ? 0 : i;
   }

   public boolean deleteFront() {
       if (isEmpty()) {
           return false;
       }
       head = next(head);
       size--;
       return true;
   }
   
   public boolean deleteLast() {
       if (isEmpty()) {
           return false;
       }
       tail = prev(tail);
       size--;
       return true;
   }
   
   public int getFront() {
       return isEmpty() ? -1 : buffer[head];
   }
   
   public int getRear() {
       return isEmpty() ? -1 : buffer[tail];
   }
   
   public boolean isEmpty() {
       return size == 0;
   }
   
   public boolean isFull() {
       return size == buffer.length;
   }
}