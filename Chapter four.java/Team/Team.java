public class Team
{ private String schoolName;
  private String sportName;
  private String teamName;
  public final static String MOTTO = "Sportsmanship!";
  public Team(String schoolName, String sportName, String teamName)
      {  this.schoolName = schoolName;
         this.sportName = sportName;
         this.teamName = teamName;
           }
 public String getSchoolName()
    {  return this.schoolName;
            }
 public String getSportName()
    {  return this.sportName;
          }
 public String getTeamName()
   { return this.teamName;
           }
 public void display()
   { System.out.println("\nSport motto >> " + MOTTO +
          "\nSchool name >> " + schoolName +
           "\nSports name >> " + sportName + "\nTeam's name >> " + teamName);
         }
}