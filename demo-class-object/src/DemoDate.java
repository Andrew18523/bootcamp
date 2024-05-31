import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // 17 type (8 primitives + 8 wrapper classes + String)
    LocalDate ld = LocalDate.of(2024,12,31);
    System.out.println(ld); //2022-12-31

    //LocalDate ld2 = LocalDate.of(2024,12,32); //runtime error
    //System.out.println(ld2);
    System.out.println(ld.plusDays(1L)); // 2025-01-01
    System.out.println(ld.plusMonths(2L)); // 2025-02-28
    System.out.println(ld.plusYears(1L)); // 2026-12-31
    System.out.println(ld.minusDays(100L)); // 2024-09-22

    Month month =ld.getMonth();
    System.out.println(month.toString()); //DECEMBER
    System.out.println(ld.getMonth()); //DECEMBER
    System.out.println(ld.getDayOfMonth()); //31
    System.out.println(ld.getDayOfWeek()); //TUESDAY
  }
}
