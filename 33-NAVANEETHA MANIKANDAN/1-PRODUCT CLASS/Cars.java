package product;

public class Cars {

	public static void main(String[] args) {
	  Product p1=new Product();
p1.pcode="Cars123";
p1.pname="Benz";
p1.price=3500000;
System.out.println("Displaying p1: ");
p1.display();

Product p2=new Product();
p2.pcode="Cars456";
p2.pname="Jagur";
p2.price=16500000;
System.out.println("Displaying p2: ");
p2.display();

Product p3=new Product("Maruthi","Cars789",500000);
System.out.println("Displaying p2: ");
p3.display( );
Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
	System.out.println("\n Displaying product with lowest price:" );
	p.display();
	}
	

}
