import java.text.DecimalFormat;

public class Circle {
	private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getCircumference(double PI){
		double cf;
		cf = 2*radius*PI;
		return cf;
	}
	
	public String getFormattedCircumference(double PI){
		double cf = getCircumference(PI);
		String circumference = formatNum(cf);
		return circumference;
	}
	public double getArea(double PI){
		double area =0d;
		area = PI *(radius*radius);
		return area;
	}
	
	public String getFormattedArea(double PI){
		double ar = getArea( PI);
		String formattedArea = formatNum(ar);
		return formattedArea;
	}
	public String formatNum(double number){
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);
		String formattedNum = df.format(number);
		return formattedNum;
	}

}
