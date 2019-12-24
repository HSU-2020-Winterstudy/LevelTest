/**
 * Author : Disarmy
 * Created date : 2019-12-24
 */

public class MyArray<T> {
    private int size;
    private Object[] data;

    public MyArray() {
        this.size = 0;
        this.data = new Object[10];
    }

    public void add(Object data) {
        if (this.size == this.data.length)
            expend();
        this.data[size++] = data;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            this.data[i] = this.data[i + 1];
        }
        size--;
    }

    public int size() {
        return this.size;
    }

    public void expend() {
        Object[] newData = new Object[size * 2];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }
}
