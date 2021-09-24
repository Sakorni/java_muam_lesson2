package tasks;


public class GClass<T>
{


    enum Direction{
        left,
        right
    };
    public static void main()
    {
        var ex1 = new GClass<Integer>(
                new Integer[]{1,2,3,4,5,6,7,8,9,10}
        );
        var ex2 = new GClass<Long>(
                new Long[]{1L,2L,3L,4L,5L,6L,7L,8L,9L,10L}
        );
        var ex3 = new GClass<String>(
                new String[]{"A", "B", "C", "D", "E", "F", "G"}
        );
        roll(ex1);
        roll(ex2);
        roll(ex3);

    }
    private static void roll(GClass cl){
        System.out.println("Original:");
        cl.Print();
        System.out.println("After 2 left shifts:");
        cl.cyclicShift(2, Direction.left);
        cl.Print();
        System.out.println("One more left shift:");
        cl.cyclicShift(1, Direction.left);
        cl.Print();
        System.out.println("After 3 right shifts:");
        cl.cyclicShift(3, Direction.right);
        cl.Print();
        System.out.println("And 3 more right shifts:");
        cl.cyclicShift(3, Direction.right);
        cl.Print();
    }


    T[] arr;
    public GClass(T[] initValue){
        arr = initValue;
    }
    public void cyclicShift(int times, Direction direction)
    {
        if(direction == Direction.left)
        {
            for(int i = 0; i < times; ++i)
            {
                leftShift();
            }
        }
        else {
            for(int i = 0; i < times; ++i)
            {
                rightShift();
            }
        }
    }

    public void Print(){
        for (var val : arr)
        {
            System.out.printf("%s ", val.toString());
        }
        System.out.println();
    }
    private void leftShift(){
        var save = arr[0];
        for(int i = 0; i < arr.length - 1; ++i)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = save;
    }
    private void rightShift(){
        var save = arr[arr.length-1];
        for(int i = arr.length - 1; i > 0; --i)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = save;
    }

}