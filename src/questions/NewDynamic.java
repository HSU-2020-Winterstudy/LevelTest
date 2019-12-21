package questions;

public class NewDynamic <T> {

    private Object[] arr;
    private int size=0;
    private int defaultSize=10;
    private int nodes=0;

    public NewDynamic(){
        arr = new Object[defaultSize];
        size = defaultSize;
    }

    public void put(T data){
        arr[nodes] = data;
        nodes++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)arr[index];
    }
}
