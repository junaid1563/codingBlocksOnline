package codingBlocks.array1D.sort;

public class ArrayList {

	private int size;
	private int capacity;
	private int[] arr;
	private int pointer;

	public ArrayList() {
		this.capacity = 2;
		this.arr = new int[this.capacity];
		this.pointer = 0;
		this.size = 0;
	}
	
	public ArrayList(int n) {
		this.capacity = n;
		this.arr = new int[this.capacity];
		this.pointer = 0;
		this.size = 0;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < this.pointer; i++) {
			str += arr[i] + " ";
		}
		return str;
	}

	public void increaseSize() {
		this.capacity = 2 * this.capacity;
		int[] newArray = new int[this.capacity];
		for (int i = 0; i < this.arr.length; i++) {
			newArray[i] = this.arr[i];
		}
		this.arr = newArray;
	}

	public void add(int n) {
		if (this.size == this.capacity) {
			increaseSize();
		}
		this.arr[this.pointer] = n;
		this.pointer++;
		this.size++;
	}

	public int remove() {

		int val = this.arr[pointer - 1];
		this.pointer--;
		this.size--;
		return val;
	}

}


