/**
 * Author : susemeeee
 * Created date : 2019-12-23
 */
package core;

public class CostomArray<T> {
	private T[] arrayContents;
	private int currentSize;
	
	@SuppressWarnings("unchecked")
	public CostomArray() {
		arrayContents = (T[])new Object[100];
		currentSize = 0;
	}
	
	public void add(T content) {
		if(currentSize == arrayContents.length) {
			expend();
		}
		
		arrayContents[currentSize] = content;
		++currentSize;
	}
	
	public T get(int index) {
		if((index >= currentSize) || (index < 0)) {
			System.out.println("error");
			return null;
		}
		
		return arrayContents[index];
	}
	
	public void remove(int index) {
		if((index >= currentSize) || (index < 0)) {
			System.out.println("error");
			return;
		}
		
		if(index == currentSize - 1) {
			arrayContents[index] = null;
			--currentSize;
		}
		else {
			for(int i = index; i < currentSize - 1; ++i) {
				arrayContents[i] = arrayContents[i + 1];
			}
			arrayContents[currentSize - 1] = null;
			--currentSize;
		}
	}
	
	public int size() {
		return currentSize;
	}
	
	@SuppressWarnings("unchecked")
	private void expend() {
		T[] newArrayContents = (T[])new Object[currentSize * 2];
		
		for(int i = 0; i < currentSize; ++i) {
			newArrayContents[i] = arrayContents[i];
		}
		
		arrayContents = newArrayContents;
	}
}