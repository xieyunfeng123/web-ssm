package com.heitian.ssm.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;



public final class DateUtil
{
    public static final String DATE_FORMAT_1 = "yyyy-MM-dd HH:mm:ss";
    
    public static final String DATE_FORMAT_F = "yyyy-MM-dd";
    
    public static final String DATE_FORMAT_FS = "yyyyMMdd";
    
    public static final String DATE_FORMAT_3 = "MMdd";
    
    public static final String DATE_FORMAT_FYM = "yyyyMM";
    
    public static final String DATE_FORMAT_4 = "yyyyMMddHHmmss";
    
    public static final String DATE_FORMAT_HSF = "HH:mm";
    
    public static final String DATE_FORMAT_5 = "yyyy 年 MM 月 dd 日";
    
    public static final String DATE_FORMAT_6 ="yyyyMMddHHmmssSSS";
    
    public static String chgFmt(String date, String oldFmt, String newFmt)
    {
        Date d = toDate(date, oldFmt);
        SimpleDateFormat fmt = new SimpleDateFormat(newFmt);
        return fmt.format(d);
    }
    
    public static String format(Date date, String fmt)
    {
        SimpleDateFormat fmter = new SimpleDateFormat(fmt);
        return fmter.format(date);
    }
    
    public static String getDate(String format, int offset)
    {
        return getTime(format, 5, offset);
    }
    
    public static String getDate(String format)
    {
        return getDate(format, 0);
    }
    
    public static Date toDate(String date, String format)
    {
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        try
        {
            return fmt.parse(date);
        }
        catch (ParseException e)
        {
//            throw new Exception("date format exception for :" + date);
            return  null;
        }
    }
    
    public static String getTime(String format, int offsetType, int offset)
    {
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance();
        cal.add(offsetType, offset);
        return fmt.format(cal.getTime());
    }
    
    public static Date getDate(int offsetType, int offset)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(offsetType, offset);
        return cal.getTime();
    }
    
    public static Date getDateS(int offset)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(5, offset);
        return cal.getTime();
    }
    
    public static boolean compareTime(long time, int dayoffset)
    {
        Calendar curtime = GregorianCalendar.getInstance(Locale.getDefault());
        curtime.add(5, dayoffset);
        
        return curtime.getTimeInMillis() >= time;
    }
    
    public static String getTimeMillis()
    {
        return Calendar.getInstance(Locale.CHINA).getTimeInMillis()+"";
    }
    
    public static Timestamp getCurrentTime()
    {
        return new Timestamp(Calendar.getInstance(Locale.CHINA).getTimeInMillis());
    }
    
    public static Date getCurrentDate()
    {
        return Calendar.getInstance(Locale.CHINA).getTime();
    }
    
    public static boolean isDateIn(String currentDate, String startDate, String endDate)
    {
        if ((currentDate.compareTo(startDate) >= 0) && (currentDate.compareTo(endDate) <= 0))
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        System.out.println(getNextDay(new Date()));
    }
    
    //获取本月第一天
    public static String getMonthFirstDay(){
        Calendar cale = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday;
        // 获取前月的第一天
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        firstday = format.format(cale.getTime());
        return firstday;
    }
    
    //获取本周第一天
    public static String getWeekDay(){
        Calendar cale = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday;
        // 获取前月的第一天
        cale = Calendar.getInstance();
        cale.add(Calendar.WEEK_OF_MONTH, 0);
        cale.set(Calendar.DAY_OF_WEEK, 1);
        firstday = format.format(cale.getTime());
        return firstday;
    }
    
    public static String getNextDay(Date date) {  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, -1);  
        date = calendar.getTime();  
        return format.format(date);  
    }      
    
}
