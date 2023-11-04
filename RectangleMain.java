public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 12);

        System.out.println("The area of the rectangle is " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());

        rectangle.setHeight(6);
        rectangle.setWidth(12);

        System.out.println("\nThe area of the rectangle is " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());

    }
}
