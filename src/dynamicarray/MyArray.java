package dynamicarray;

public class MyArray<T> {

    private Object[] t;
    private int size;

    public MyArray() {
        this.t = new Object[8];
        this.size = 0;
    }

    public void add(T t) {
        if (this.size == this.t.length) {
            expand();
        }

        this.t[size++] = t;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; ++i) {

            try {
                this.t[i] = this.t[i + 1];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        size = size - 1;
    }

    public T get(int index) {
        try {
            return (T) this.t[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int size() {
        return this.size;
    }

    public void expand() {
        Object[] objects = new Object[this.size * 2];
        System.arraycopy(this.t, 0, objects, 0, this.size);
        t = objects;
    }
}
