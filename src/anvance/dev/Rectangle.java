package anvance.dev;

public  class Rectangle extends Shape {
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
		@Override
		public double chuVi() {
			return (a + b)* 2;
		}
	    public double dienTich() {
	    	return a * b;
	    	
	    }
		@Override
		public void draw() {
			System.out.println("Draw Rectangle");
		}
		@Override
		public String toString() {
			return String.format("Rectangle : dt:%.2f - cv:%.2f", dienTich(), chuVi());
	}

}
