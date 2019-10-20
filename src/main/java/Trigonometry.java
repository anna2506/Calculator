import java.util.Scanner;

public class Trigonometry{
static Scanner scanner;
private Number num;
String trigFunc = "";
public Trigonometry(){
        scanner = new Scanner(System.in);
}
/**
 * Set the variable num1
 * @param num
 */
public void setNum(Number num) {
        this.num = num;
}

public Number getNum(){
        return num;
}
public String enterTrigonometryFunction(){
        System.out.println("Enter a trigonometry function(sin/cos/tan/ctg):");
        if(scanner.hasNext()){
                trigFunc = scanner.next();
        }
        else {
                System.out.println("Your input is incorrect. Please, try again.");
                scanner.next();
                trigFunc = enterTrigonometryFunction();
        }
        return trigFunc;
}
public Number enterNum(){
        System.out.println("Enter the number you want to calculate with trigonometry function: ");
        if(scanner.hasNextInt()){
                num = scanner.nextInt();
        }
        else if(scanner.hasNextDouble()){
                num = scanner.nextDouble();
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
public Number calc(Number num, String trigFunc){
        Number result = null;
        switch (trigFunc){
                case "sin":
                        if(num instanceof Integer){
                                result = Math.sin(num.intValue());
                        }
                        else if(num instanceof Double){
                                result = Math.sin(num.doubleValue());
                        }
                        else if(num instanceof Long){
                                result = Math.log(num.longValue());
                        }
                        else{
                                System.out.println("The input error. Please, try again.");
                        }
                        System.out.print("The sin of num1 is ");
                        break;
                case "cos":
                        if(num instanceof Integer){
                                result = Math.cos(num.intValue());
                        }
                        else if(num instanceof Double){
                                result = Math.cos(num.doubleValue());
                        }
                        else if(num instanceof Long){
                                result = Math.cos(num.longValue());
                        }
                        else{
                                System.out.println("The input error. Please, try again.");
                        }
                        System.out.print("The cos of num1 is ");
                        break;
                case "tan":
                        if(num instanceof Integer){
                                result = Math.tan(num.intValue());
                        }
                        else if(num instanceof Double){
                                result = Math.tan(num.doubleValue());
                        }
                        else if(num instanceof Long){
                                result = Math.tan(num.longValue());
                        }
                        else{
                                System.out.println("The input error. Please, try again.");
                        }
                        System.out.print("The tan of num1 is ");
                        break;
                case "ctg":
                        if(num instanceof Integer){
                                result = 1/Math.tan(num.intValue());
                        }
                        else if(num instanceof Double){
                                result = 1.0/Math.tan(num.doubleValue());
                        }
                        else if(num instanceof Long){
                                result = 1/Math.tan(num.longValue());
                        }
                        else{
                                System.out.println("The input error. Please, try again.");
                        }
                        System.out.print("The ctg of num1 is ");
                        break;
                default:
                        break;
        }
        return result;
}
}