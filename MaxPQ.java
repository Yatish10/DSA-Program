package PriorityQueue;

public class MaxPQ {
	private Integer[] heap;
	private int n;
	
	public MaxPQ(int capacity) {
		heap = new Integer [capacity + 1]; // index 0 is kept as empty
		n = 0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	// how to insert in a max heap 
	
	public void insert(int x) {
		if(n == heap.length - 1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}

	private void swim(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; //bcoz we need to continue shifting up till new value inserted is at correct position
		}
	}

	private void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;	
	}
	
	public void printMaxHeap() {
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	public static void main(String[] args) {
		MaxPQ mpq = new MaxPQ(3);
		//System.out.println(mpq.size()); // 0
		//System.out.println(mpq.isEmpty()); // true
		mpq.insert(4);
		mpq.insert(5);
		mpq.insert(2);
		mpq.insert(10);
		mpq.insert(3);
		mpq.insert(1);
		mpq.insert(7);
		System.out.println(mpq.size());
		mpq.printMaxHeap();

	}

}
