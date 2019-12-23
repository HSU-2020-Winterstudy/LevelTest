package java_1;

/**
 * 가변길이 배열 NewArrayList입니다.
 * 배열의 초기 크기 maxSize는 5부터 시작합니다.
 * 배열의 값이 더 들어갈 수 없으면 배열을 2배 확장시켜주는 expend() 메서드를 실행합니다.
 * Author : Cwhist
 * Created : 2019-12-23
 */
public class NewArrayList<T> {
	private int size;
	private int maxSize;
	private PartTimeJob[] data;
	
	public NewArrayList() {
		maxSize = 5;
		data = new PartTimeJob[maxSize];
		size = 0;
	}
	
	public void add(PartTimeJob data) {
		if(size >= maxSize)
			expend();
		this.data[size] = data;
		size++;
	}
	
	public PartTimeJob get(int index) {
		return data[index];
	}
	
	public void remove(int index) {
		for(int i=index; i<size; i++) {
			data[i] = data[i+1];
		}
		data[size-1] = null;
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public void expend() {
		PartTimeJob[] temp = new PartTimeJob[maxSize*2];
		for(int i=0; i<maxSize; i++) {
			temp[i] = data[i];
		}
		data = temp;
		maxSize *= 2;
	}
	
	public PartTimeJob[] getData() {
		return data;
	}
	

}
