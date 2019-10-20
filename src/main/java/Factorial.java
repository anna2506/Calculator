import java.util.Scanner;

public class Factorial {
  private Number num;
  static Scanner scanner;
  public Factorial(){
    scanner = new Scanner(System.in);
  }
  public Number getNum() {
    return num;
  }

  public void setNum(Number num) {
    this.num = num;
  }
  public Number enterNum(){
    System.out.println("Enter the number you want to calculate factorial: ");
    if(scanner.hasNextInt()){
      num = scanner.nextInt();
    }
    else if(scanner.hasNextLong()){
      num = scanner.nextLong();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num = enterNum();
    }
    return num;
  }
  public Number calc(Number num){
    Number result = null;
    if(num instanceof Integer){
      result = 1;
      for(int i = 1; i <= num.intValue(); i++ ){
        result = result.intValue() * i;
      }
    }
    else if(num instanceof Long){
      result = 1;
      for(int i = 1; i <= num.intValue(); i++ ){
        result = result.longValue() * i;
      }
    }
    else{
      System.out.println("The input error. Please, try again.");
    }
    System.out.print("The factorial of num is ");
    return result;
  }

}
