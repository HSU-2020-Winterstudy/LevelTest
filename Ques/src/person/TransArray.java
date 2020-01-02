package person;

public class TransArray<T> {
	
	
	private T[] arr;
	private int capacity;
	private int count;
	
	@SuppressWarnings({ "unchecked", "unused" })
	public TransArray() {
		T arr = (T)new Object[3];
		capacity = 3;
		count = 0;
	}
	
	public void add(T index) {
		if(arr.length<=count) {
			this.expend();
			arr[count] = index;
			count ++ ;
		}
		else {
			arr[count] = index;
			count ++ ;
		}
	}
	
	public T get(int pos) {
		return arr[pos];
	}
	
	public void remove(int pos) {
		if(pos<count)
			for( ;pos<=this.size();pos++)
				arr[pos] = arr[pos+1];
	}
	
	public int size(){
		return arr.length;
	}
	
	@SuppressWarnings("unchecked")
	public void expend() {
			T[] tmp = (T[])new Object[capacity*2];
		for(int i = 0; i <= capacity; i++)
			tmp[i] = arr[i];
		
		capacity *= 2;
		arr = tmp;
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
