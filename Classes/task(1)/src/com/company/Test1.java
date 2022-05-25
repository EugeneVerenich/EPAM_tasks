package com.company;

public class Test1 {

    private int first_num = 1;
    private int second_num = 2;


    public int Increment_first(){
        first_num++;
        return first_num;
    }

    public int Increment_second(){
        second_num++;
        return second_num;
    }

    public int Decrement_first(){
        first_num--;
        return first_num;
    }

    public int Decrement_second(){
        second_num--;
        return second_num;
    }

    public void showInfo(){
        System.out.println("Первое число : "+first_num);
        System.out.println("Второе число : "+second_num);
    }

    public void numSum(){
        int Sum = first_num+second_num;
        System.out.println("Сумма чисел : "+Sum);
    }

    public void getMax(){
        if (first_num >= second_num){
            System.out.println("Максимальное число : "+first_num);
        }else {
            System.out.println("Максимальное число : "+second_num);
        }
    }

}
