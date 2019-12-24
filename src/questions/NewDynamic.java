package questions;

public class NewDynamic <T> {

    private Object[] arr;
    private int size=0;
    private int defaultSize=10;
    private int dataCount =0;

    public NewDynamic(){
        arr = new Object[defaultSize];
        size = defaultSize;
    }

    /**
     * If nodes is bigger than size, extend arrSize
     * @param data add in arr
     */
    public void put(T data){
        if(dataCount >= size){
            extend();
        }
        arr[dataCount++] = data;
    }

    /**
     *
     * @param index Want to get data's Index
     * @return data
     */
    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)arr[index];
    }

    /**
     *
     * @return How many arr has data
     */
    public int size(){
        return dataCount;
    }

    /**
     * All data add in to temp array and arr extend twice currentSize
     * After extend add all data in arr
     */
    public void extend(){
        try{
            Object [] temp = new Object[size];
            size = size *2;
            if (dataCount >= 0) System.arraycopy(arr, 0, temp, 0, dataCount);
            arr = new Object[size];
            if (dataCount >= 0) System.arraycopy(temp, 0, arr, 0, dataCount);
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

    /**
     *
     * @param data Want to find object
     * @return If arr has that data return data's index
     */
    public int contains(T data){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     *
     * @param data Want to remove object
     */
    public void remove(T data){
        try{
            if(dataCount > 0){
                int index = contains(data);
                for(int i = index; i< dataCount -1; i++){
                    arr[i] = arr[i+1];
                }
                dataCount--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }

    /**
     *
     * @param index Want to remove index
     */
    public void remove(int index){
        try{
            if(dataCount > 0){
                if (dataCount - 1 - index >= 0)
                    System.arraycopy(arr, index + 1, arr, index, dataCount - 1 - index);
                dataCount--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }
}
