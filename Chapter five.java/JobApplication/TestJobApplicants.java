public class TestJobApplicants
{  public static void main(String[]   args)
     {  JobApplicant object1 = new JobApplicant("Kelvin Njoroge", "0772526382", true, true, true, true);
        JobApplicant object2 = new JobApplicant("James Nyundo", "0720754893", true, false, true, false);
        JobApplicant object3 = new JobApplicant("Paul Nderitu", "0746061885", true, true, false, true);
        isQualified(object1);
        isQualified(object2);
        isQualified(object3);
        display(object1);
        display(object2);
        display(object3);
        boolean qualified;
    }
public static boolean isQualified(JobApplicant app)
   {   int count = 0;
       boolean wordProcessing = app.getWordProcessing();
       boolean spreadSheets = app.getSpreadSheets();
       boolean dataBases = app.getDataBases();
       boolean graphics = app.getGraphics();
       if(wordProcessing == true)
           count++;
       if(spreadSheets == true)
           count++;
       if(dataBases == true)
           count++;
       if(graphics == true)
           count++;
       if(count >= 3)
          return true;
       else 
          return false;
      }
public static void display(JobApplicant app)
     {  System.out.println("APPLICANT'S NAME : " + app.getName() + "\nPHONE NUMBER : " + app.getPhoneNum() +
                 "\nSKILLS........" + "\nWord Processing : " + app.getWordProcessing() + "\nSpread Sheets : " +
          app.getSpreadSheets() + "\nData Bases : " + app.getDataBases() + "\nGraphics : " + app.getGraphics());
       if(isQualified(app))
          System.out.println(app.getName() + " has qualified for the job." + "\n ");
       else
          System.out.println(app.getName() + " has not qualied for the job." + "\nThe jod requires an applicant to have at least three qualifications." + "\n ");
       }
}