class MyCircularDeque {
    int head = 0, tail = 0, size = 0, n;
    int[] arr;

    public MyCircularDeque(int k) {
        arr = new int[k];
        n = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        head = head == 0 ? n - 1 : --head;
        arr[head] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        arr[tail] = value;
        tail = (tail + 1) % n;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % n;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = tail == 0 ? n - 1 : --tail;
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[head];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        // Adjust the index to wrap around correctly
        int rearIndex = (tail == 0) ? n - 1 : tail - 1;
        return arr[rearIndex];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }
}
