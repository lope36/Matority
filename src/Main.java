import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        System.out.print("urodzony 17.02.2002 - ");
        if (majority(17,2,2002))
            System.out.println("pełnoletni");
        else
            System.out.println("niepełnoletni");

    }

        public static boolean majority (int day, int month, int year){
            LocalDate dateOfBirth, now;
            dateOfBirth = LocalDate.of(year,month,day);
            now = LocalDate.now();
            Period p = Period.between(dateOfBirth, now);
            if (p.getYears()>= 18) return true;
            return false;


        }



    }

