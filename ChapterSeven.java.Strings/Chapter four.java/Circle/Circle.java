public class Circle
{ private double radius;
  private double diameter;
  private double area;
 public Circle()
   {  radius = 1;
      diameter = 2 * radius;
      area = Math.PI * radius * radius;
    //System.out.println("The default radius of a circle is " + radius +
          //   "cm and has a diameter of " + diameter + "cm. It has an area of " + area + "cm^2");
     }
 public void setRadius(double radius)
   { this.radius = radius;
     this.diameter = 2 * radius;
     this.area = Math.PI * radius * radius;
        }
 public double getRadius()
   {  return radius;
      }
 public double getDiameter()
   { return diameter;
           }
 public double getArea()
   { return area;
        }
}