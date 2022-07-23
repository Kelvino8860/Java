import java.time.*;
public class TestWedding
{ public static void main(String[]   args)
    {   
          LocalDate birthBride1 = LocalDate.of(2001, 3, 10);
      LocalDate birthGroom1 = LocalDate.of(2001, 6, 10);
      LocalDate birthBride2 = LocalDate.of(2002, 10, 20);
      LocalDate birthGroom2 = LocalDate.of(1999, 2, 20);
      LocalDate weddingDate1 = LocalDate.of(2030, 6, 10);
           LocalDate weddingDate2 = LocalDate.of(2028, 4, 22);
             Person bride1 = new Person("Jennifer", "Wanjiru", birthBride1);
                       Person groom1 = new Person("Kelvin", "Njoroge", birthGroom1);
                               Person bride2 = new Person("Flavee", "Ann", birthBride2);
                                         Person groom2 = new Person("Anderson", "Michael", birthGroom2);
               Couple couple1 = new Couple(bride1, groom1);
                                 Couple couple2 = new Couple(bride2, groom2);
               Wedding wedding1 = new Wedding(weddingDate1, couple1, "Italy");
                         Wedding wedding2 = new Wedding(weddingDate2, couple2, "Dubai");
                displayWedding(wedding1);
                   displayWedding(wedding2);
           }          
public static void displayWedding(Wedding details)
   {  Couple couple = details.getCouple();
      LocalDate weddingDate = details.getWeddingDate();
      String location = details.getLocation();
      Person bride = couple.getBride();
      Person groom = couple.getGroom();
      String firstBride = bride.getFirstName();
      String lastBride = bride.getLastName();
      LocalDate brideBirthDate = bride.getBirthDate();
      String firstGroom = groom.getFirstName();
      String lastGroom = groom.getLastName();
      LocalDate groomBirthDate = groom.getBirthDate();
      System.out.println("\n" + lastGroom + "/" + lastBride + " Wedding");
      System.out.println("Date: " + weddingDate + " Location: " + location);
      System.out.println("Bride: " + firstBride + " " + lastBride + " " + brideBirthDate);
      System.out.println("Groom: " + firstGroom + " " + lastGroom + " " + groomBirthDate);
    }
}