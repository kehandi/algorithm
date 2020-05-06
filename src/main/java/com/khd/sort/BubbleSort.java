package com.khd.sort;

/**
 * 冒泡排序
 * 思路：俩俩交换，大的放在后面，第一次排序后最大值已在数组末尾。因为俩俩交换，需要n-1趟排序（比如10个数，需要9趟排序）
 *
 * 代码实现要点：两个for循环，外层循环控制排序的趟数，内层循环控制比较的次数。每趟过后，比较的次数都应该要减1
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arrays = {4, 6, 1, 8, 2, 7, 6};
//        int[] arrays = {1, 2, 3, 4, 5, 7, 6};

        int temp;
        int isChange;
        int num = 0;
        int changeNum = 0;

        for (int i = 0; i < arrays.length-1; i++) {
            isChange = 0;

            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;

                    isChange = 1;
                    changeNum ++;
                }
            }

            if (isChange == 0) {
                break;
            }
            num ++;
        }

        System.out.println("外层循环执行了" + num + "次");
        System.out.println("交换了" + changeNum + "次");
        showArray(arrays);
    }

    public static void showArray(int[] arrays) {
        System.out.print("[");
        for (int i = 0; i < arrays.length; i++) {
            if (i == arrays.length - 1) {
                System.out.print(arrays[i]);
            } else {
                System.out.print(arrays[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
