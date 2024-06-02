interface  IntDemo {
    void display();
}
class ClassOne implements IntDemo{
    public void add (int x , int y)
    {
        System.out.println("The sum of x and y is : " +(x+y));
    }
    public void display()
    {
        System.out.println("I'm the Classone .");
    }
}
class ClassTwo implements IntDemo{
    public void multiply(int a , int b)
    {
        System.out.println("The product of a and b is : " +(a*b));
    }
    public void display()
    {
        System.out.println("I' m the class two .");
    }
}
class DemoClass {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        c1.add(10 , 20);
        c1.display();
        ClassTwo c2 = new ClassTwo();
        c2.multiply( 45 , 3 );
        c2.display();
    }
}
