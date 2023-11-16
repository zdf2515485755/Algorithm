package sort;

public class SortAlgorithm
{
    /**
     * 用于交换数组位置index1和数组位置index2的方法
     * @param index1
     * @param index2
     * @param array
     */
    public static void swap(int index1, int index2, int[] array)
    {
        //临时变量
        int temporary = 0;
        temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }

    /**
     * 判断数组是否有效
     * @param array
     */
    public static boolean judgeArray(int[] array)
    {
        return null == array || array.length == 1;
    }
    /**
     * 选择排序(从小到大)
     * @param array
     */
    public static void selectSort(int[] array)
    {
        if (judgeArray(array))
        {
            return;
        }
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[i])
                {
                    swap(j, i, array);
                }
            }
        }
    }

    /**
     * 冒泡算法
     * @param array
     */
    public static void bubbleSort(int[] array)
    {
        if (judgeArray(array))
        {
            return;
        }

        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    swap(j, j + 1, array);
                }
            }

        }
    }

    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array)
    {
        if (judgeArray(array))
        {
            return;
        }

        for (int i = 1; i < array.length; i++)
        {
            for (int j = i; j != 0 && array[j] < array[j - 1]; j--)
            {
                swap(j, j - 1, array);
            }
        }
    }


    public static void main(String[] args) {
        int[] arrays = {1};
        //selectSort(arrays);
        //bubbleSort(arrays);
        insertSort(arrays);
        for (int value:arrays) {
            System.out.println(value);

        }

    }
}
