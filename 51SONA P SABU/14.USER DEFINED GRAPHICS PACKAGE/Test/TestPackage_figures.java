package Test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("Enter the radius of Circle:");
		float r=sc.nextFloat();
		Circle ci=new Circle(r);
		System.out.println("perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		System.out.println("Enter the side1 of triangle:");
		int s1=sc.nextInt();
		System.out.println("Enter side2 of triangle:");
		int s2=sc.nextInt();
		System.out.println("Enter side3 of triangle:");
		int s3=sc.nextInt();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());
		System.out.println("enter the breadth of rectangle");
		int b=sc.nextInt();
		System.out.println("enter the length of rectangle");
		int l=sc.nextInt();
		Rectangle rt=new Rectangle(l,b);
		System.out.println("perimeter:"+rt.perimeter());
		System.out.println("Area:"+rt.area());
		
		

	}

}
