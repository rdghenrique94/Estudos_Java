package model;

public class Frame {
	
	Rectangle rectangle;
	private double width;
	
	public Frame(Rectangle rectangle, double width) {
		this.rectangle = rectangle;
		this.width = width;
	}
	public double calcArea() {
		double areaTotal = rectangle.getBase() * rectangle.getHeight();
		double areaIn = (rectangle.getBase() - 2 * width) * (rectangle.getHeight() - 2 * width);
		return areaTotal - areaIn;
	}

}
