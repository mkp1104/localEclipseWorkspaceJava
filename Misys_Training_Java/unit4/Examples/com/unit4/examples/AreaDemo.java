package com.unit4.examples;
abstract class Shape
{
      private int dim1, dim2;
      
	  public void setDim1(int dim1)
      {
              this.dim1 = dim1;
       }
	   public int getDim1()
      {
              return dim1;
       }
       
	  public void setDim2(int dim2)
      {
              this.dim2 = dim2;
       }
	   public int getDim2()
      {
              return dim2;
       }

      public abstract double area();
}

class Square extends Shape
{
      public double area()
      {
			return (getDim1()*getDim1());
      }
}

class Triangle extends Shape
{
      public double area()
      {
			return (0.5*getDim1()*getDim2());
      }
}

class ShapeArea
{
	public void showArea(Shape s )
	{
		System.out.println(s.area());
	}
}

class AreaDemo
{
    public static void main(String[] s)
    {
	    Triangle t = new Triangle();  
	    Square s = new Square();          
        ShapeArea sa = new      
		ShapeArea();
	    sa.showArea(c);
	    sa.showArea(s);
	}
}
