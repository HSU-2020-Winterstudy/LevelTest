/**
 * Author : Disarmy
 * Created date : 2019-12-24
 */

public class MyArray<T> {
    private int size;
    private PartTimeJob[] data;

    public MyArray() {
        this.size = 0;
        this.data = new PartTimeJob[10];
    }

    public void add(PartTimeJob data) {
        if (this.size == this.data.length)
            expend();
        this.data[size++] = data;
    }

    public PartTimeJob get(int index) {
        return data[index];
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
        PartTimeJob[] newData = new PartTimeJob[size * 2];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }
}
