package utilities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeRelatedClasses {
    public static void main(String... args){
        localDate();
        localTime();
        localDateTime();
        periodAndDuration();
        periodOfDay();
    }

    private static void localDate(){
        System.out.println("\nlocalDate(): current date");
        System.out.println(LocalDate.now());
        System.out.println("\nlocalDate(): all zoneIds");
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for(String zoneId: zoneIds){
            System.out.println(zoneId);
        }

        System.out.println("\nlocalDate(): current date in Tokyo");
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(LocalDate.now(zoneId));

        System.out.println("\nlocalDate(): date 2023-02-23");
        LocalDate lc1 = LocalDate.parse("2023-02-23");
        System.out.println(lc1);

        LocalDate lc2 =  LocalDate.parse("20230223", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(lc2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lc3 =  LocalDate.parse("23/02/2023", formatter);
        System.out.println(lc3); 

        LocalDate lc4 =  LocalDate.of(2023, 2, 23);
        System.out.println(lc4); 

        LocalDate lc5 =  LocalDate.of(2023, Month.FEBRUARY, 23);
        System.out.println(lc5);

        LocalDate lc6 = LocalDate.ofYearDay(2023, 54);
        System.out.println(lc6);


        System.out.println(lc6.getYear());        
        System.out.println(lc6.getMonth());       
        System.out.println(lc6.getMonthValue());  
        System.out.println(lc6.getDayOfMonth());  
        System.out.println(lc6.getDayOfWeek());   
        System.out.println(lc6.isLeapYear());     
        System.out.println(lc6.lengthOfMonth());  
        System.out.println(lc6.lengthOfYear());  
    }
}
