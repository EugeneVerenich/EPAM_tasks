package com.company;

public class Student {

    private String name;
    private String surname;
    private int group_num;
    private int[] progress = new int[5];

    public Student(String name,String surname,int group_num,int[] progress){
        this.name = name;
        this.surname = surname;
        this.group_num = group_num;
        this.progress = progress;
    }

    public void showInfo(){
        System.out.println("Фамилия : "+surname+"\n"+"Номер группы : " + group_num+"\n");
    }

    public void excellentInfo(){
        int amount = 0;
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] >= 9){
                amount++;
            }
        }
        if (amount == progress.length){
            System.out.print("Фамилия : "+surname+"\n"+"Номер группы : " + group_num+"\n");
            System.out.println("Успеваемость : ");
            for (int i = 0; i < progress.length; i++) {
                System.out.print(progress[i]+" ");
            }
            System.out.println();
        }
    }


}
