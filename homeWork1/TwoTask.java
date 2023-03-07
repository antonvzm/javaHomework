// 2. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class TwoTask {
    public static void main(String[] args) {
        int[] array = new int[] { 3,2,2,3 };
        int val = 3;
        for (int num : array) {
            System.out.print(num + " ");
        }
        int numbersVal = 0;
        for (int num : array) {
            if (num == val){
                numbersVal++;
            }
        }
        for (int i = 0; i < array.length-numbersVal; i++) {
            if (array[i] == val){
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                i++;
            }
        }
        System.out.println("");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
