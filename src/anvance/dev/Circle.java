package anvance.dev;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}
	@Override
	public double chuVi() {
		return 2 * Math.PI * r;
	}
	@Override
	public double dienTich() {
		return Math.PI * r * r;
	}
	@Override
	public void draw() {
		
	}
	public String toString() {
		return String.format("Circle: dt:%.22f - cv:%.2f", dienTich(),chuVi());
	}
	


}
