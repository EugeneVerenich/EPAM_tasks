package com.company;

import java.util.Date;

public class Train {

    private String station_name;
    private int train_num;
    private String time;

    public Train(String station_name, int train_num, String time){
        this.station_name = station_name;
        this.train_num = train_num;
        this.time = time;
    }

    public int getTrain_num() {
        return train_num;
    }

    public String getStation_name() {
        return station_name;
    }

    public String getTime() {
        return time;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTrain_num(int train_num) {
        this.train_num = train_num;
    }

    public void showInfo(){
        System.out.println("Название пункта назначения : "+station_name+"\n"+"Номер поезда : "+train_num+"\n"+"Время отправления : "+time);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
