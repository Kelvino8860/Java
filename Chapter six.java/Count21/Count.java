public class Count
{  private int myVal;
   private int compVal;
   private int count;
   private int doctor;
public Count()
  {  compNum();
     }
public void setMyVal(int val)
   {  myVal = val;
         }
public void compNum()
  { compVal = ((int)(Math.random() * 100) % 3 + 1);
    }
public int getMyVal()
  {  return myVal;
    }
public int getCompVal()
  { return compVal;
     }
public int getCount()
   { return myVal + compVal;
      }
public int getDoctor()
  {  return (myVal + compVal)*0;
    }
}