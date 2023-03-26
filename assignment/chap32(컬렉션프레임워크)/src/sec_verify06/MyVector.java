package sec_verify06;

import java.util.Arrays;

public class MyVector {

	Object[] data = null; // 객체를 담기 위한 객체배열을 선언한다.
	private int capacity = 0; // 용량
	private int size = 0; // 크기
	Object[] str1 = null;

	public MyVector(int capacity) {
		this.data = new Object[capacity];
	}

	public MyVector() {
		this.data = new Object[10];
	}

	// Empty
	public boolean isEmpty() {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				count++;
				return true;
			}
		}
		if (count == 0) {
			return false;
		}
		return false;
	}

	// capacity
	public int capacity() {
		int lenth = this.data.length;
		return lenth;
	}

	// Size
	public int size() {
		int s1 = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == null) {
				s1++;
			}
		}
		size = data.length - s1;

		return size;
	}

	// ensureCapacity
	public void ensureCapacity(int minCapacity) {
		if (minCapacity > 0) {
			Object[] arr = new Object[data.length + minCapacity];
			System.arraycopy(data, 0, arr, 0, data.length);
			data = arr;
		}
	}

	// add
	public boolean add(Object obj) {
		// this.ensureCapacity(size - 1);
		if (obj != null) {
			for (int i = 0; i < data.length; i++) {
				if (this.data[i] == null) {
					this.data[i] = obj;
					// size++;
					return true;
				}
			}
		}
		return false;
	}

	public Object get(int index) {

		return data[index];
	}

	public Object remove(int index) {
		size--;
		return data[index] = null;
	}

	public Object remove(Object obj) {
		this.size--;
		for (int i = 0; i < data.length; i++) {
			if (obj.equals(data[i])) {
				data[i] = null;
			} else {
			}
		}
		return "";
	}

	public void clear() {
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}
	}

//	@Override
//	public String toString() {
//	       int count = 0;
//	       for(int i=0; i<data.length; i++) {
//	          if(data[i]==null) {
//	             count++;
//	          }
//	       }
//	       Object[] datacopy = new Object[data.length-count];
//	       count = 0;
//	       for(int i=0; i<data.length; i++) {
//	          if(data[i]!=null) {
//	             datacopy[count] = data[i];
//	             count++;
//	          }
//	       }
//	       
//	       return Arrays.toString(datacopy);
//	    }
	@Override
	public String toString() {
		int a = this.size();
		Object[] datacopy = new Object[data.length - this.size];
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				datacopy[i] = data[i].toString();
			}else if(data[i]==null) {
			}
		}
		return Arrays.deepToString(datacopy);
	}


}