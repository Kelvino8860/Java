public class JobApplicant
{ private String name;
  private String phoneNum;
  private boolean wordProcessing;
  private boolean spreadSheets;
  private boolean dataBases;
  private boolean graphics;
 public JobApplicant(String name, String phoneNum, boolean word, boolean spread, boolean data, boolean graphics)
        {   this.name = name;
            this.phoneNum = phoneNum;
            wordProcessing = word;
            spreadSheets = spread;
            dataBases = data;
            this.graphics = graphics;
        }
public String getName()
    {  return name;
         }
public String getPhoneNum()
   {  return phoneNum;
     }
public boolean getWordProcessing()
   {  return wordProcessing;
     }
public boolean getSpreadSheets()
  {  return spreadSheets;
     }
public boolean getDataBases()
   {  return dataBases;
     }
public boolean getGraphics()
   {  return graphics;
     }
}