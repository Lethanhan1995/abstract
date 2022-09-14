package anvance.dev;

public class Triangle extends Shape{
	private double  a;
	private double b;
	private double c;
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double chuVi() {
		return a + b + c;
	}
	@Override
	public double dienTich() {
		double p = chuVi()/ 2;
		return p * Math.sqrt((p - a) * (p - b) * (p - c));
	}
	@Override
	public void draw() {
		
	}
	@Override
	public String toString() {
		return String.format("Trangle: dt:%.2f - cv:%.2f", dienTich(), chuVi());
	}
	

}
