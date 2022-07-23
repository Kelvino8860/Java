public class Apartment
{   private int apartmentNum;
    private int bedRoomNum;
    private int bathNum;
    private double rentAmount;
   public Apartment(int apartmentNum, int bedRoomNum, int bathNum, double rentAmount)
       {  this.apartmentNum = apartmentNum;
          this.bedRoomNum = bedRoomNum;
          this.bathNum = bathNum;
          this.rentAmount = rentAmount;
          }
   public int getApartmentNum()
     {  return apartmentNum;
       }
   public int getBedRoomNum()
     {   return bedRoomNum;
           }
   public int getBathNum()
    {   return bathNum;
           }
   public double getRentAmount()
    {  return rentAmount;
         }
}