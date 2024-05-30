
// class test {
//     void display() {
//         System.out.println("hello 1");
//     }
// }

// public class Demo1 extends test {

//     void display() {

//         System.out.println("Hello 2 ");
//         super.display();
//     }

//     public static void main(String[] args) {
//         Demo1 d1 = new Demo1();
//         d1.display();

//     }
// }
//=================================================
// The following code does not compiles due to same name and same returntype
// public class Demo
// {
//    public void calculate(int x)   // II
//    {
//      System.out.println(x+x);
//    }
//    public int calculate(int x)   // III
//    {
//      System.out.println(x*x);
//      return x;
//    }
//    public static void main(String args[])
//    {
//       Demo d1 = new Demo();
//       d1.calculate(10);		// II
//       int k = d1.calculate(10);		// II
//       System.out.println(k);
//    }
// }
//========================================================================
// constructor overloadin gin javaaa
// public class Demo1
// {
//   public Demo1()  // default constructor  I
//   {
//       System.out.println("Hello 1");
//   }
//  public Demo1(int x)     // II
//   {
//       this();
//       System.out.println(x);
//   }
//   public Demo1(int x, int y)   // III
//   {
//       this(100);
//       System.out.println(x*y);
//   }
//    public static void main(String args[])
//    {
//       Demo1 d3 = new Demo1(10, 20);   // III

//    }
// }
//=========================================================
// the beloow code does not works .........
// public class Demo1
// {
//     public void Demo1()
//     {
//         System.out.println("hello jarvis.");
//     }
//   public Demo1(int x)  
//   {
//      System.out.println(x);
//   }
//    public static void main(String args[])
//    {
//       Demo1 d1 = new Demo1();   
//       Demo1 d2 = new Demo1(10);   
//    }
// }
//=====================================================
//constructor behaviour in inheritance.................
// class A
// {
//    A()
//    {
//       System.out.println("From A");
//    }
// }
// class B extends A
// {
//    B()
//    {
//       System.out.println("From B");
//    }
// }
// public class C extends B
// {
//    C()
//    {
//       System.out.println("From C");
//    }
//    public static void main(String args[])
//    {
//        C c = new C();
//   }
// }
//=============================================================
class Test {
   public Test() // I
   {
      System.out.println("From Test");
   }

   public Test(int x) // II
   {
      this();
      System.out.println(x);
   }
}

public class Demo1 extends Test {
   public Demo1() // III
   {
      super(100);
      System.out.println("From Demo");
   }

   public Demo1(int x) // IV
   {
      this();
      System.out.println(x);
   }

   public static void main(String args[]) {
     // Demo1 d1 = new Demo1(10); // IV

   }
}
