public class TestCircle
{ public static void main(String[]   args)
    {  Circle object1 = new Circle();
       Circle object2 = new Circle();
       Circle object3 = new Circle();
       object1 = getDataOne(object1);
       object2 = getDataTwo(object2);
       display(object1, object2, object3);
        }
 public static Circle getDataOne(Circle details)
     {  double radius, diameter, area;
        radius = 10;
        details.setRadius(radius);
        return details;
      }
 public static Circle getDataTwo(Circle detail)
   {  double radius;
      radius = 100;
      detail.setRadius(radius);
      return detail;
       }
 public static void display(Circle object1, Circle object2, Circle object3)
   { System.out.println("A circle with radius " + object1.getRadius() + "cm has a diameter of " +
                        object1.getDiameter() + "cm and an area of " + object1.getArea());
    System.out.println("A circle with radius " + object2.getRadius() + "cm has a diameter of " +
                        object2.getDiameter() + "cm and an area of " + object2.getArea());
    System.out.println("A circle with radius " + object3.getRadius() + "cm has a diameter of " +
                        object3.getDiameter() + "cm and an area of " + object3.getArea());
     }
}