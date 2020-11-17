import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(2, 2);
        shapes[2] = new Square(4);

        for (Shape element : shapes) {
            if (element != null) {
                if (element instanceof Circle) {
                    System.out.println(((Circle) element).getRadius());
                    ((Circle) element).resized(25);
                    System.out.println(((Circle) element).getRadius());
                }
            }
        }
    }
}
