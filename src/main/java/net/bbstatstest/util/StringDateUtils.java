package net.bbstatstest.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class StringDateUtils
{
    private static final String ISO_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final DateFormat ISO_DATE_FORMAT = new SimpleDateFormat( ISO_PATTERN );
    
    public static String localDateTimeNowAsIsoString()
    {
        return localDateTimeToIsoString( LocalDateTime.now() );
    }

    public static String localDateTimeToIsoString( LocalDateTime dateTime )
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( ISO_PATTERN );
        
        return localDateTimeToFormattedString( dateTime, formatter );
    }
    
    public static String localDateTimeToFormattedString( LocalDateTime dateTime, DateTimeFormatter formatter )
    {
        return dateTime.format( formatter );
    }
    
    public static String nowAsIsoString()
    {
        return dateTimeToIsoString( new Date() );
    }
    
    public static String dateTimeToIsoString( Date dateTime )
    {
        return dateTimeToFormattedString( dateTime, ISO_DATE_FORMAT );
    }
    
    public static String dateTimeToFormattedString( Date dateTime, DateFormat formatter )
    {
        return formatter.format( dateTime );
    }
}
