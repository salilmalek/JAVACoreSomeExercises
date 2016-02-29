

abstract class Shapes { // create an abstract concept (shapes class)
	abstract void draw(int a, int b); // write a method draw
}

// extends the shapes class to line, circle, square, rectangle
class Line extends Shapes {
	@Override
	void draw(int x, int y) {
		System.out.println("Draw Line at point x=" + x + " & y=" + y);
	}
}

class Circle extends Shapes {
	@Override
	void draw(int x, int y) {
		System.out.println("Draw Circle at point x=" + x + " & y=" + y);
	}
}

class Square extends Shapes {
	@Override
	void draw(int x, int y) {
		System.out.println("Draw Square at point x=" + x + " & y=" + y);
	}
}

class Rectangle extends Shapes {
	@Override
	void draw(int x, int y) {
		System.out.println("Draw Rectangle at point x=" + x + " & y=" + y);
	}
}

public class Test {
	public static void main(String[] args) {
		Line line = new Line();
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		line.draw(10, 20);
		circle.draw(20, 30);
		square.draw(20, 30);
		rectangle.draw(30, 40);
	}
}
