package tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1<Type1, Type2>{
    Type1 var1;
    Type2 var2;
    public Task1(Type1 first, Type2 second){
        var1 = first;
        var2 = second;
    }
    public static void complete(){
        var first = new Task1(1,4);
        var arr1 = new int[]{1,2,3};
        var arr2 = new Long[]{1L, 2L, 3L};
        var second = new Task1(arr1, arr2);
        var third = new Task1(true, "Stroka");
        first.Print();
        second.Print();
        third.Print();
    }

    public void Print()
    {
        if(var1.getClass().isArray())
        {
            printArray();
        }
        else
        {
            printValues();
        }
    }
    private void printValues(){
        System.out.println("The values of item1 and item2:\n");
        System.out.printf("item1 = %s\nitem2 = %s\n",  var1.toString(), var2.toString());
        System.out.printf("The type of item1 = %s;\nThe type of item2 = %s;\n", var1.getClass(), var2.getClass());
    }
    private void printArray()
    {
        System.out.println("The values of arrays A1, A2:\n");
        System.out.printf("A1 = %s\nA2 = %s\n", Arrays.toString(getArray(var1)),  Arrays.toString(getArray(var2)));
        System.out.printf("The type of array A1 = %s;\nThe type of array A2 = %s;\n", var1.getClass().getName(), var2.getClass().getName());
    }

    /**
     * Converts a given parameter into Object[]. So you can act with it like with an Array
     */
    private Object[] getArray(Object val){
        int arrlength = Array.getLength(val);
        Object[] outputArray = new Object[arrlength];
        for(int i = 0; i < arrlength; ++i){
            outputArray[i] = Array.get(val, i);
        }
        return outputArray;
    }

}
