public class TestTeam
{  public static void main(String[]  args)
     { Team oneObject = new Team("Koelel", "Rugby", "Wolves");
       Team twoObject = new Team("Utumishi", "Hockey", "Crows");
       Team threeObject = new Team("Shiners", "Voleyball", "Timbers");
       display(oneObject);
       display(twoObject);
       display(threeObject);
        }
  public static void display(Team t)
    {  System.out.println("Sports motto >> " + t.MOTTO +
                         "\nSchool name >> " + t.getSchoolName() +
                         "\nSports name >> " + t.getSportName() +
                         "\nTeam's name >> " + t.getTeamName());
          }
}