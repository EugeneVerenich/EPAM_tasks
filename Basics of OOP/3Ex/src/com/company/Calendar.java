package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Calendar {

    private final Set<MonthDay> holidays = new HashSet<>();

    Holiday holiday;

    public Calendar(){
        this.holiday = new Holiday();
    }

    public void addHoliday(final MonthDay monthDay){
        holidays.add(monthDay);
    }

    public void showWeekendAndHolidayBetween(final LocalDate start, final LocalDate end){
        System.out.println("Total weekends and holidays: " + holiday.numberOfWeekendAndHolidaysBetween(start,end));
        for (LocalDate i = start; !i.isAfter(end); i = i.plusDays(1)){
            if (holiday.isHoliday(i)){
                System.out.println(i + " " + i.getDayOfWeek());
            }
        }
    }

    private class Holiday{

        public boolean isHoliday(final LocalDate localDate){
            return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
        }

        public boolean isWeekend(final LocalDate localDate){
            final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
        }

        public MonthDay toMonthDay(final LocalDate localDate){
            return MonthDay.of(localDate.getMonth(),localDate.getDayOfMonth());
        }

        public int numberOfWeekendAndHolidaysBetween(final LocalDate start, final LocalDate end){
            int c = 0;
            for (LocalDate i = start; !i.isAfter(end) ; i = i.plusDays(1)) {
                if (isHoliday(i)){
                    c++;
                }
            }
            return c;
        }

    }

}