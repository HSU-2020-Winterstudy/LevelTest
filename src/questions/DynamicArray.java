package questions;

import java.lang.reflect.Array;

public class DynamicArray<T> {
    private T[] dynamicArray;
    private int currentSize;
    private int resizeDegree;
    private int defaultSize = 10;
    private int nodes;
    private Class<T> type;

    @SuppressWarnings("unchecked")
    public DynamicArray(Class<T> type){
        this.type = type;
        currentSize = defaultSize;
        resizeDegree = 2;
        nodes = 0;
        dynamicArray = (T[])Array.newInstance(type,defaultSize);
    }

    public void put(T value){
        dynamicArray[nodes++] = value;
    }

    public T get(int index){
        return dynamicArray[index];
    }

    public int size(){
        return nodes;
    }

    @SuppressWarnings("unchecked")
    public void extend(){
        try{
            currentSize = currentSize *2;
            T[] temp = (T[])Array.newInstance(type,currentSize);
            if (nodes >= 0) System.arraycopy(dynamicArray, 0, temp, 0, nodes);
            dynamicArray = (T[])Array.newInstance(type, currentSize);
            if (nodes >= 0) System.arraycopy(temp, 0, dynamicArray, 0, nodes);
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