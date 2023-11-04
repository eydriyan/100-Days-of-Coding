public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    void setHeight(int height){
        this.height = height;
    }

    double getHeight(){
        return height;
    }

    void setWidth(int width){
        this.width = width;
    }

    double getWidth(){
        return width;
    }

    double calculateArea() {
        return height * width;
    }

    double calculatePerimeter(){
        return 2 * (height + width);
    }
    
}
