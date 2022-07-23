public class TestGame
{  public static void main(String[]  args)
     {  Team teamData1 = new Team("Koelel", "Rugby", "Wolves");
        Team teamData2 = new Team("Utumishi", "Rugby", "Hawks");
        Game game1 = new Game(teamData1, teamData2, "7PM");
       
       System.out.println("The game between " + teamData1.getSchoolName() + " " +
                  teamData1.getSportName() + " " + teamData1.getTeamName());
       System.out.println(" and " + teamData2.getSchoolName() + " " + teamData2.getSportName() +
                     " " + teamData2.getTeamName());
       System.out.println(" takes place at " + game1.getTime());
               }
}