// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class OneTask {
    public static void main(String[] args) {
        int[] array = new int[] { 10, 5, 4, 5, 7, 2 };
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("max = " + max + ", min = " + min);
    }
}
