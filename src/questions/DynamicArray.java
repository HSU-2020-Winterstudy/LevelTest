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
}