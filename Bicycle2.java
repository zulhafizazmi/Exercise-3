import java.util.Scanner;

public class Bicycle2 {
	
	String brand;
	String type;
	String colour;
	double weight;
    
    Scanner s = new Scanner(System.in);

    Bicycle2() {
    
        System.out.println("Enter Weight");
		this.weight = s.nextDouble();
		s.nextLine();
		System.out.println("Enter Brand");
		this.brand = s.nextLine();
		s.nextLine();
		System.out.println("Enter Type");
		this.type = s.nextLine();
		s.nextLine();
		System.out.println("Enter Colour");
		this.colour = s.nextLine();
		
			
	}
	
	
	
	Bicycle2(String b, String t, String c, double w){
			this.brand=b;
			this.type=t;
			this.colour=c;
			this.weight=w;

	}
}
