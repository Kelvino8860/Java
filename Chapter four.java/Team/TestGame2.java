public class TestGame2
{  public static void main(String[]  args)
     {  Team teamData1 = new Team("Koelel", "Rugby", "Wolves");
        Team teamData2 = new Team("Utumishi", "VolleyBall", "Hawks");
        Game game1 = new Game(teamData1, teamData2, "7PM");
       
       System.out.println("The game between " + teamData1.getSchoolName() + " " +
                  teamData1.getSportName() + " " + teamData1.getTeamName());
       System.out.println(" and " + teamData2.getSchoolName() + " " + teamData2.getSportName() +
                     " " + teamData2.getTeamName());
       System.out.println(game1.getTime());
               }
}