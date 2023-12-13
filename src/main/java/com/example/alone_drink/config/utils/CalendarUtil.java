package com.example.alone_drink.config.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarUtil {

    public static List<Integer> getYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Integer> years = new ArrayList<>();
        for (int year = currentYear; year >= 1900; year--) {
            years.add(year);
        }
        return years;
    }

    public static List<Integer> getMonths() {
        List<Integer> months = new ArrayList<>();
        for (int month = 1; month <= 12; month++) {
            months.add(month);
        }
        return months;
    }

    public static List<Integer> getDays() {
        List<Integer> days = new ArrayList<>();
        for (int day = 1; day <= 31; day++) {
            days.add(day);
        }
        return days;
    }

}
