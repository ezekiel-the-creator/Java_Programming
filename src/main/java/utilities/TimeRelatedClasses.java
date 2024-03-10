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

        System.out.println("\nlocalDate(): date 2023-02-23 modified");
        System.out.println(lc6.withYear(2024));     
        System.out.println(lc6.withMonth(5));       
        System.out.println(lc6.withDayOfMonth(5));  
        System.out.println(lc6.withDayOfYear(53));  
        System.out.println(lc6.plusDays(10));       
        System.out.println(lc6.plusMonths(2));      
        System.out.println(lc6.plusYears(2));       
        System.out.println(lc6.minusDays(10));      
        System.out.println(lc6.minusMonths(2));     
        System.out.println(lc6.minusYears(2));
        
        System.out.println("\nlocalDate(): compare 2023-02-23 and 2023-02-22");
        LocalDate lc7 =  LocalDate.parse("2023-02-22");
        System.out.println(lc6.isAfter(lc7));       
        System.out.println(lc6.isBefore(lc7));
    }

    private static void localTime(){
        System.out.println("\nlocalTime():");

        System.out.println(localTime.now());

        ZoneId zoneId = zoneId.of("Asia/Tokyo");
        System.out.println(LocalTime.now(zoneId));

        LocalTime lt1 = LocalTime.parse("20:23:12");
        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(20, 23, 12);
        System.out.println(lt2);

        System.out.println(lt2.getHour());
        System.out.println(lt2.getMinute());
        System.out.println(lt2.getSecond());
        System.out.println(lt2.getNano());

        System.out.println(lt2.withHour(3));
        System.out.println(lt2.withMinute(10));
        System.out.println(lt2.withSecond(15));
        System.out.println(lt2.withNano(300));
        System.out.println(lt2.plusHours(10));
        System.out.println(lt2.plusMinutes(2));
        System.out.println(lt2.plusSeconds(20));

        LocalTime lt4 = LocalTime.parse("20:25:12");
        System.out.println(lt2.isAfter(lt4));
        System.out.println(lt2.isBefore(lt4));
    }
}
