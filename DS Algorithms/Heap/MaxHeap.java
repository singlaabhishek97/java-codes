public class MaxHeap {
    int[] heap;
    int heap_size;
    int max_heap_size = 100;
    MaxHeap(int[] arr, int n) {
        heap = new int[max_heap_size];
        for (int i = 0; i < n; i++) {
            heap[i] = arr[i];
        }
        heap_size = n;
        heapify(heap, n);
    }
    static void heapify(int[] heap, int heap_size) {
        int n = heap_size - 1;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            shift_down(heap, i, heap_size);
        }
    }
    static void shift_up(int[] heap, int index) {
        int p = (index - 1) / 2;
        if(p < 0) return;
        if(heap[p] < heap[index]) {
            int temp = heap[p];
            heap[p] = heap[index];
            heap[index] = temp;
            shift_up(heap, p);
        }
    }
    static void shift_down(int[] heap, int i, int heap_size) {
        int l = 2 * i + 1;
        int r = l + 1;
        int max_ind = i;
        if (l < heap_size) {
            if (heap[l] > heap[max_ind]) {
                max_ind = l;
            }
        }
        if (r < heap_size) {
            if (heap[r] > heap[max_ind]) {
                max_ind = r;
            }
        }
        if (i != max_ind) {
            int temp = heap[i];
            heap[i] = heap[max_ind];
            heap[max_ind] = temp;
            shift_down(heap, max_ind, heap_size);
        }
    }
    int extractMax() {
        int max_value = heap[0];
        deleteNode(0);
        return max_value;
    }
    void deleteNode(int index) {
        if(index >= heap_size) {
            return;
        }
        heap[index] = heap[heap_size - 1];
        heap_size--;
        shift_down(heap, index, heap_size);
    }
    void insertNode(int val) {
        if(heap_size == max_heap_size) {
            return;
        }
        heap[heap_size] = val;
        heap_size++;
        shift_up(heap, heap_size - 1);
    }
    void displayHeap() {
        for(int i = 0; i < heap_size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 1, 2, 4};
        MaxHeap myheap = new MaxHeap(arr, 6);
        myheap.displayHeap();
        myheap.deleteNode(1);
        myheap.displayHeap();
        myheap.insertNode(6);
        myheap.displayHeap();
        System.out.println(myheap.extractMax());
        myheap.displayHeap();
    }
}
