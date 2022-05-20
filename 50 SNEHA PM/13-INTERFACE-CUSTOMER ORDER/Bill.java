import java.util.*;

interface BillGen{
	int calculate();}
class ProductB implements BillGen{
	String name;
	int prod_id,quantity,unit_price,total;
	ProductB(){}
	ProductB(String n, int p, int q, int u){
		name= n; prod_id = p;
		quantity = q; unit_price = u; }
		public int calculate() {
			total=quantity * unit_price;
			return total;}}

public class Bill {

	private static Object sum;

	public static void main(String[] args) {
		
		ProductB[][] order;
		System.out.println("Enter number of orders");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		order = new ProductB[n][];
		
		for (int  i= 0 ; i < n ; i++) {
			System.out.println("Enter number of products:");
			int m = sc.nextInt();
			order[i] = new ProductB[m];
			       for(int j = 0; j < m ;j++) {
					System.out.println("enter product" + j + "Name: ");
					String a= sc.next();
					System.out.println("enter product ID");
					int b= sc.nextInt();
					System.out.println("enter product Quantity");
					int c= sc.nextInt();
					System.out.println("enter product unit_price");
					int d= sc.nextInt();
					ProductB pb=new ProductB (a,b,c,d);
					order[i][j] = pb;
					order[i][j].total = order[i][j].calculate();}}
			for(int i =0; i < n ;i++){
				int sum = 0;
				System.out.println("Order No: " +(i+1));
				Date date=java.util.Calendar.getInstance().getTime();
				System.out.println(date);
				System.out.println("-------------------------------------------");
				System.out.printf("%5s %20s %25s %10s %10s","prod_id","Name","Quantity","unit_price","Total");
				System.out.println();
				System.out.println("--------------------------------------------------");
				for(int j=0 ; j<order[i].length; j++)
					System.out.printf("%5s %20s %25s %10s %10s",order[i][j].prod_id,order[i][j].name,order[i][j].quantity, order[i][j].unit_price, order[i][j].total);
				System.out.println();}
			   System.out.println("------------------------------------------");
					int i;
					for( int k=0 ; k<order[i].length; k++)
						sum = sum + order[i]][k].total;
					System.out.println("Net amount :" +sum);
				System.out.println("------------------------------------------------------");
			}}}
				
					

