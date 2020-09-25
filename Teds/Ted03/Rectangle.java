package temp_class;

public class Rectangle {

	private double width;
	private double widthf;
	private double height;
	private double heightf;
	
	public void setWidht(double width) {
	    this.width = width;
	}

	public void setHeight(double height) {
	    this.height = height;
	}
	public void setWidhtf(double widthf) {
	    this.widthf = widthf;
	}

	public void setHeightf(double heightf) {
	    this.heightf = heightf;
	}

	public double areaEx() {
	    return width * height;
	}
	public double areaIn() {
	    return widthf * heightf;
	}
	
	public double frame() {
		return this.areaEx() - this.areaIn();
	}

	
}
