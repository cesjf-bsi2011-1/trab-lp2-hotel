package myutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCustomizer {
    
    public static String DateToStr(Date date) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(date);
    }
    
    public static String getMonthFromDateObject(Date date)
    {
        SimpleDateFormat formatador = new SimpleDateFormat("MM");
        return formatador.format(date);
    }
    
    public static String getDayFromDateObject(Date date)
    {
        SimpleDateFormat formatador = new SimpleDateFormat("dd");
        return formatador.format(date);
    }
    
    public static Date StrToDate(String data) throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.parse(data);
    }
}
