
public class basicOperations {

	public static void main (String[] args)
	{
	  int a = 6;
    int b = 3;
    String operator  = "+";
    //Scanner sc = new Scanner(System.in);
    //operator = sc.nextLine();
    switch(operator)
    {
      case "+":
        System.out.println(a+b);
      break;
      case "-":
      System.out.println(a - b);  
      break;
      case "*":
      System.out.println(a*b);
      break;
      case "/":
      System.out.println(a / b);
      break;
      case "%":
      System.out.println(a % b); 
      break;
      case "++":
      {
        a++;
        System.out.println(a);
      }
      break;
      case "--":
      {
        b--;
        System.out.println(b);
      }
      break;
      
      
    }
    //sc.close();
	}
}


