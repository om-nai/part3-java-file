//ID:- 21CE081
import java.util.*;
import java.text.SimpleDateFormat;
abstract class GeometricObject
{
    String color="";
    boolean filled=false;
    private String C_date;

    GeometricObject()
    {
        filled=false;
        color="";
    }

    GeometricObject(String c,boolean b)
    {
        color=c;
        filled=b;
    }
     
    void setColor(String c)
    {
        color=c;
    }

    String getColor()
    {
        return color;
    }

    boolean isFilled()
    {
        return filled;
    }

    void setFilled(boolean b)
    {
        filled=b;
    }

    void get_date()
   {
     Date date=new Date();
     SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
     C_date = formatter.format(date);
     System.out.println("Current date:" + C_date);
   } 

      abstract double getarea();
      abstract double getPerimeter();
}

class Circle extends GeometricObject
{
    double radius;

    Circle()
    {
        radius=0;
    }

    Circle(double r)
    {
        radius=r;
    }

    Circle(double r,String c,boolean b)
    {
        super(c,b);
        radius=r;
    }

    void setRadius(double r)
    {
        radius=r;
    }

    double getarea()
    {
        return (3.14*radius*radius);
    }

    double getPerimeter()
    {
        return (2*3.14*radius);
    }

    double getDiameter()
    {
        return (2*radius);
    }

    double getRadius()
    {
        return radius;
    }
}

class Rectengle extends GeometricObject
{
    double hight;
    double width;

    Rectengle()
    {
        hight=0;
        width=0;
    }

    Rectengle(double w,double h)
    {
        hight=h;
        width=w;
    }

    Rectengle(double w,double h,String c,boolean b)
    {
        super(c,b);
        hight=h;
        width=w;
    }

    double getarea()
    {
        return hight*width;
    }

    double getPerimeter()
    {
        return (2*hight*width);
    }

    double getWidth()
    {
        return width;
    }

    void setWidth(double w)
    {
        width=w;
    }

    double gethight()
    {
        return hight;
    }

    void sethight(double w)
    {
        hight=w;
    }
}

public class pra_3_1 {
    public static void main(String[] args) {
        Rectengle re=new Rectengle();
        Circle c=new Circle();
        double carea,rarea;

        c.setRadius(4.0);
        re.setWidth(5.0);
        re.sethight(6.0);
        
        carea=c.getarea();
        rarea=re.getarea();
        
        System.out.println("A1:" + carea);
        System.out.println("A2:" + rarea);
        }
}
