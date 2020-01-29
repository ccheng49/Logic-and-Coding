public class myBubbleSort
{
    public static void main (String[] args)
    {
        int [] myArray = {8,2,5,9,3,1,4,6,7};
        bubbleSort(myArray);
    }
    public static void swap (int [] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b]=temp;
    }
    public static void bubbleSort (int [] array)
    {
        for (int a=0; a<array.length-1; a++)
        {
            for (int b=0; b<array.length-1-a; b++)
            {
                if (array[b]>array[b+1])
                {
                    swap(array,b, b+1);
                    System.out.println(java.util.Arrays.toString(array));
                }
            }
        }
    }
}