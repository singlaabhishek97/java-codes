public class MaxHeap {
    int[] heap;
    int heap_size;
    MaxHeap(int[] arr, int n) {
        heap = arr;
        heap_size = n;
        heapify(heap, n);
    }
    static void heapify(int[] heap, int heap_size) {
        int n = heap_size - 1;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            shift_down(heap, i, heap_size);
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
    void deleteNode(int index) {
        heap[index] = heap[heap_size - 1];
        heap_size--;
        shift_down(heap, index, heap_size);
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
    }
}
