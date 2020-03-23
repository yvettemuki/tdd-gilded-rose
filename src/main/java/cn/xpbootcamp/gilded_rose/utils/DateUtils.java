package cn.xpbootcamp.gilded_rose.utils;


import java.util.Date;

public class DateUtils {

    public static int getDiffDays (long startTime, long endTime) {
        Date dateStart = new Date(startTime);
        Date dateEnd = new Date(endTime);
        return (int) ((dateEnd.getTime() - dateStart.getTime()) / 60 / 60 / 24);
    }
}
