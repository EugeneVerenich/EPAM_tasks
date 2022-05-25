/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 3;

        System.out.println("Сумма всех "+n+"- значных чисел, содержащих только нечетные цифры : " + Sum(n)); // задет количество цифр в числе

        SumSplit(n);

    }

    // разбиваем число для проверки на нечетность цифр
    static int splitting(int N) {
        String tmp_N = String.valueOf(N);
        int l = tmp_N.length();
        int[] a = new int[l];

        // заполняем массив цифрами числа
        for(int k = 0; k < l; ++k) {
            a[k] = Integer.valueOf(tmp_N.substring(k, k + 1));
        }

        // проверяем на нечетность
        int buf = 0;
        for (int i = 0; i < l; i++) {
            if (a[i]%2 != 0){
                buf++;
            }
        }

        // возвращаем число
        int num = 0;
        if (buf == l){
            num = N;
        }
        return num;

    }

    // поиск нужных чисел и суммы этих чисел
    static int Sum(int n) {
        int j = (int)Math.pow(10, (n - 1)); // начальная граница(если 4 цифры то начало 1000)
        int k = (int)Math.pow(10, n); // конечная граница(если 4 цифры то конец 9999)

        // вычисление суммы
        int sum = 0;
        for(int i = j; i < k; ++i) {
            if (splitting(i) != 0){
                sum += i;
            }
        }

       return sum;

    }

    // находит количество цифр в найденной сумме
    static void SumSplit(int n){
        String tmp_N = String.valueOf(Sum(n));
        int l = tmp_N.length();
        int[] a = new int[l];

        // заполняем массив цифрами числа
        for(int k = 0; k < l; ++k) {
            a[k] = Integer.valueOf(tmp_N.substring(k, k + 1));
        }

        // проверяем на четность
        int buf = 0;
        for (int i = 0; i < l; i++) {
            if (a[i]%2 == 0){
                buf++;// количество четных цифр
            }
        }

        System.out.println("Количество четных цифр в сумме : "+buf);

    }

}
