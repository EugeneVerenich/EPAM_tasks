/*
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
 */
package com.company;


import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addHoliday(MonthDay.of(Month.MARCH,8));
        calendar.addHoliday(MonthDay.of(Month.MAY,1));
        calendar.addHoliday(MonthDay.of(Month.MAY,9));

        calendar.showWeekendAndHolidayBetween(LocalDate.of(2022,2,14),LocalDate.of(2022,8,14));

    }
}
