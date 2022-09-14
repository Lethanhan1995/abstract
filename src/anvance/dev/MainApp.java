package anvance.dev;

import java.util.Scanner;

public class MainApp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[5];
		input(shapes);
		print(shapes);
		maxDienTich(shapes);
		maxChuVi(shapes);
	}
		private static void print(Shape[] shapes) {
			for(Shape shape: shapes) {
			System.out.println(shape);
		  }
		}
		private static void maxDienTich(Shape[] shapes) {
			Shape max = shapes[0];
			for (Shape shape : shapes) {
				if(shape.dienTich() > max.dienTich()) {
				max = shape;
				}
			}
			System.out.println("Hinh co dien tich lon nhat la:");
			System.out.println(max);
		}
		
		private static void maxChuVi(Shape[] shapes) {
			Shape max = shapes[0];
			for(Shape shape : shapes) {
			    if(shape.chuVi() > max.chuVi()) {
			    	max = shape;
			    }
		    }
		    
			System.out.println("Hinh co chu vi lon nhat la:");
			System.out.println(max);

		}
		private static void input(Shape[] shapes) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap 2 hinh chu nhat");
			for (int i = 0; i < 2; i++) {
				System.out.println("a =");
				double a = sc.nextDouble();
				System.out.println("b =");
				double b = sc.nextDouble();
				sc.nextLine();
				
				shapes[i] = new Rectangle(a, b);
				
				
			}
			System.out.println("Nhap 2 hinh tron");
			for (int i = 0; i < 2; i++) {
				System.out.println("r =");
				double r = sc.nextDouble();
				sc.nextLine();

				shapes[i + 2] = new Circle(r);
			}
			System.out.println("Nhap 1 hinh tam giac");
			System.out.println("a =");
			double a = sc.nextDouble();
			System.out.println("b =");
			double b = sc.nextDouble();
			System.out.println("c =");
			double c = sc.nextDouble();
			shapes[4] = new Triangle(a,b,c);
			sc.close();
		}
		

}
