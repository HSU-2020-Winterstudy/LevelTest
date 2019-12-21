package questions;

import java.lang.reflect.Array;

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
        if(nodes >= size){
            extend();
        }
        arr[nodes++] = data;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)arr[index];
    }

    public int size(){
        return nodes;
    }

    public void extend(){
        try{
            Object [] temp = new Object[size];
            size = size *2;
            if (nodes >= 0) System.arraycopy(arr, 0, temp, 0, nodes);
            arr = new Object[size];
            if (nodes >= 0) System.arraycopy(temp, 0, arr, 0, nodes);
        }
        catch (IndexOutOfBoundsException e1){
            System.out.println("Index Error");
            e1.printStackTrace();
        }
        catch (ArrayStoreException e2){
            System.out.println("Type mismatch");
            e2.printStackTrace();
        }
        catch (NullPointerException e3){
            System.out.println("Friendly NullPointerException");
            e3.printStackTrace();
        }
    }
}
