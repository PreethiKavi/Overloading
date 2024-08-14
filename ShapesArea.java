class Shape
{
	void area(double a)
        {
		System.out.println("Area of square is:"+(a*a));
	}
	static void area(double pi,double r)
	{
		System.out.println("Area of circle is:"+(pi*r*r));
	}
        static void area(int l,int b,int h)
	{
		System.out.println("Area of rectangle is :"+(l*b*h));
	}
}

public class ShapesArea{

	public static void main(String[] args)
	{
		Shape a=new Shape();
		a.area(6.33);
                Shape.area(3.14,4.2);
		Shape.area(40,20,15);
}

}

