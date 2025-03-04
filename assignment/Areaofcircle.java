package assignment;

class Areaofcircle {
	float radius;
	void initilize(float r) {
		radius = r;
	}
	void Area() {
		float area = 3.14f * radius * radius;
		System.out.println("Area of circle is " + area);
	}
	public static void main(String [] args) {
		Areaofcircle c = new Areaofcircle();
		c.initilize(2);
		c.Area();
	}
}