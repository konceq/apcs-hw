import java.util.*;

public class RPN{
  private Stack stack;
  private static final String opperators = "*/+-^%";
  
    public RPN(){
	stack = new Stack();
    }


  public void calculate(){
      System.out.print("Enter input");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      if(input.equals("off")){
        on=false;
      }
      else if(input.equals("clear")){
        stack = new Stack();
      }
      else if(opperators.indexOf(input) ==-1){
          stack.push(input);
      }
      else{
        System.out.println(opperate(input));
      }

    }
  }
  
  public double opperate(String op){
    double b = Double.parseDouble(stack.pop());
    double a = Double.parseDouble(stack.pop());
    double rtn = 0;
    if(op.equals("+")){
      rtn = a+b;
    }
    else if(op.equals("-")){
      rtn = a-b;
    }
    else if(op.equals("*")){
      rtn = a*b;
    }   
    else if(op.equals("/")){
      rtn = a/b;
    }
    else if(op.equals("^")){
	rtn =Math.pow(a,b);
    }
    else if(op.equals("%")){
	rtn = a%b;
    }
    stack.push(rtn + "");
    return rtn;
  }


  public static void main(String[]args){
    RPN x = new RPN();
    x.calculate();
    System.out.println(x.stack);
  }
}

  
