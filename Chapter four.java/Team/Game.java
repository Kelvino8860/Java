public class Game
{  private Team teamData1;
   private Team teamData2;
   private String gameTime;
   public Game(Team team1, Team team2, String gtime)
     { super();

       this.teamData1 = team1;
       this.teamData2 = team2;
      if(teamData1.getSportName().equalsIgnoreCase(teamData2.getSportName()))
            this.gameTime = gtime;
      else
        this.gameTime = "Game cancelled!!";
         }
     public String getTime()
     {   return gameTime;
            }
}