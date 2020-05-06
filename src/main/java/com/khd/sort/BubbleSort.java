package com.khd.sort;

/**
 * @author mac
 * @title: SelectionSort
 * @projectName algorithm
 * @description: 冒泡排序
 * @date 2020-05-06 10:28
 */
public class BubbleSort implements Sort {

    /**
     * 思路：
     * 俩俩交换，大的放在后面，第一次排序后最大值已在数组末尾。
     * 因为俩俩交换，需要n-1趟排序（比如10个数，需要9趟排序）
     * <p>
     * 代码实现要点：
     * 两个for循环，外层循环控制排序的趟数，内层循环控制比较的次数。
     * 每趟过后，比较的次数都应该要减1
     *
     * @param array
     */
    @Override
    public void sort(int[] array) {
        int temp;
        int isChange;
        int num = 0;
        int changeNum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            isChange = 0;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isChange = 1;
                    changeNum++;
                }
            }

            if (isChange == 0) {
                break;
            }
            num++;
        }

        System.out.println("外层循环执行了" + num + "次");
        System.out.println("交换了" + changeNum + "次");
    }
}
