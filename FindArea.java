class Figure {
    double dimension1;
    double dimension2;

    Figure(double x, double y) {
        dimension1 = x;
        dimension2 = y;
    }

    double area() {
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double x, double y) {
        super(x, y);
    }

    double area() // method overriding
    {
        System.out.print("Area of rectangle is :");
        return dimension1 * dimension2;
    }
}

class Triangle extends Figure {
    Triangle(double x, double y) {
        super(x, y);
    }

    double area() // method overriding
    {
        System.out.print("Area for triangle is :");
        return dimension1 * dimension2 / 2;
    }
}

class FindArea {
    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fig; // reference variable

        fig = r;
        System.out.println("Area of rectangle is :" + fig.area());
        fig = t;
        System.out.println("Area of triangle is :" + fig.area());
        fig = f;
        System.out.println(fig.area());
    }
}
/*Through the dual mechanism of inheritance and runtime polymorphism, it is possible to define a single consistent interface that is used by different, yet related types of subclass objects in a class hierarchy.  

If an object is derived from Figure, then its area can be computed by calling area( ).  
The interface to this operation is the same no matter what type of object is used.
 */