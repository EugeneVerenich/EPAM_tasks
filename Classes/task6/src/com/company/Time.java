package com.company;
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        if (hours >= 24){
            this.hours = 0;
        }

        if (minutes >= 60){
            this.minutes = 0 ;
        }

        if (seconds >= 60){
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 24){
            this.hours = 0;
        }else {
        this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60){
            this.minutes = 0;
        }else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 24){
            this.seconds = 0;
        }else {
            this.seconds = seconds;
        }
    }

    public void showTime(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }

    public void changeTime(int new_hours, int new_minutes, int new_seconds){
        this.hours += new_hours;
        this.minutes += new_minutes;
        this.seconds += new_seconds;

        if (this.seconds >= 60){
            this.seconds = 0;
            this.minutes++;
        }
        if (this.minutes >= 60){
            this.minutes = 0;
            this.hours++;
        }
        if (this.hours >=24){
            this.hours = 0;
        }

        System.out.println(hours+":"+minutes+":"+seconds);

    }

}
