import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "a";
        Calculator calculator = new Calculator();
        while(!Objects.equals(input, "q")) {
            input = scanner.nextLine();
            List<String> inputs = List.of(input.split(" "));
            String command = inputs.get(0);
            String parm1 = inputs.get(1);
            String parm2 = null;
            try {
                parm2 = inputs.get(2);
            } catch (Exception ignored) {
            }
            switch (command){
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(parm1), Integer.parseInt(parm2)));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(parm1), Integer.parseInt(parm2)));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(parm1), Integer.parseInt(parm2)));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(parm1), Integer.parseInt(parm2)));
                    break;
                case "fibonacii":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parm1)));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parm1)));
                    break;

            }
        }

    }
}
