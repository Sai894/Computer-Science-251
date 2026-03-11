import java.lang.reflect.Array;
import java.util.Arrays;

public class DynArray
{
    private double[] array;
    private int size;
    private int nextIndex;

    public int arraySize()
    {
            return size;
    }


    public DynArray()
    {
        this.size = 10;
        array = new double[size];
        this.nextIndex = 0;
    }

    public void grow()
    {
        double[] newArray = new double[size*2];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        size *=2;
    }

    public void shrink()
    {
        double[] lowArray = new double[size/2];
        for(int i = 0; i < size/2; i++) lowArray[i] = array[i];
        array = lowArray;
        size /=2;
    }
}

