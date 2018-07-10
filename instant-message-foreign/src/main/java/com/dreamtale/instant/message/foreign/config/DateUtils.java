package com.dreamtale.instant.message.foreign.config;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     *  常量 0
     */
    private static final Long ZERO = 0L;

    /**
     * 常量 10
     */
    private static final Long TEN = 10L;

    /**
     * 根据秒数计算展示时间
     * @param seconds 秒数
     * @return
     */
    public static String formatShowTime(long seconds){
        if(seconds<=0){
            return "00:00:00";
        }
        StringBuffer sb = new StringBuffer();
        long hours = seconds/3600;
        sb.append(processZero(hours));
        long minutes = (seconds-(3600*hours))/60;
        sb.append(processZero(minutes));
        return sb.substring(0,sb.length()-1);
    }

    /**
     * 处理小于10的
     * @param time
     * @return
     */
    public static String processZero(long time){
        StringBuffer sb = new StringBuffer();
        if(time>ZERO){
            if(time<TEN){
                sb.append("0").append(time);
            } else {
                sb.append(time);
            }
            sb.append(":");
        } else {
            sb.append("00:");
        }
        return sb.toString();
    }

    /**
     * 解析展示时间
     * @param time
     * @return
     */
    public static long parseShowTime(String time){
        long seconds = 0L;
        String[] strs = time.split(":");
        seconds += Long.valueOf(strs[0])*3600;
        seconds += Long.valueOf(strs[1])*60;
        return seconds;
    }

    public static long sumDaysBetween2Date(Date startDate, Date endDate) {
        long mSec = endDate.getTime() - startDate.getTime();
        if(mSec<0){
            return 0;
        }
        if(startDate.compareTo(endDate)==0){
            return 1;
        } else {
            return mSec/86400000 +1 ;
        }
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date startDate = sdf.parse("2018-07-04 01:13:20");
            Date endDate = sdf.parse("2018-07-05 10:20:20");
            System.out.println(sumDaysBetween2Date(startDate,endDate));
            System.out.println(sumDaysBetween2Date(endDate,startDate));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
