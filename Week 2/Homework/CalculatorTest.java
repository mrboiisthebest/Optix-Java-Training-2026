import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        userInteraction(calc);
    }


    public static void userInteraction(Calculator calc){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entern First Int:");
        String num1Input = scanner.nextLine();

        System.out.println("Entern Second Int:");
        String num2Input = scanner.nextLine();

        System.out.println("Entern Opperator( 1 = *, 2 = +, 3 = -, 4 = /, 5 = %, 6 = ^):");
        String oppInput = scanner.nextLine();
        

        float num1 = Integer.parseInt(num1Input);
        float num2 = Integer.parseInt(num2Input);
        int opp = Integer.parseInt(oppInput);

        if (calc == null){
            System.out.println("No Calculater Was Attached!");
            scanner.close();
            return;
        }

        System.out.println(calc.ValidOpperations.size());

        if (opp > calc.ValidOpperations.size() || opp < 0){
            System.out.println("Detected Invalid Opperation! Defaulted to 1");
            opp = 1;
        }

        float Result = calc.Opperate(num1, num2, opp);
        System.out.println("Result:" + Result);

        System.out.println("Would You Like To Compute Again? (T/F)");
        String goAgain = scanner.nextLine();

        if (goAgain.equals("T")){
            userInteraction(calc);
            scanner.close();
            return;
            
        }else if(goAgain.equals("F")){
            System.out.println("Ended!");
            scanner.close(); 
            return;
        }
        // Incase User did not Write T or F still close
        scanner.close(); 
    }
}


class Calculator{
    public final Map<Integer, BiFunction<Float, Float, Float>> ValidOpperations = new HashMap<>();

    public Calculator(){
        ValidOpperations.put(1, this::Multiply);
        ValidOpperations.put(2, this::Add);
        ValidOpperations.put(3, this::Sub);
        ValidOpperations.put(4, this::Divide);
        ValidOpperations.put(5, this::Mod);
        ValidOpperations.put(6, this::Power);
    }

    private float Multiply(float num1, float num2){
        return (num1 * num2);
    }

    private float Add(float num1, float num2){
        return (num1 + num2);
    }

    private float Sub(float num1, float num2){
        return (num1 - num2);
    }

    private float Divide(float num1, float num2){
        return (num1 / num2);
    }

    private float Mod(float num1, float num2){
        return (num1 % num2);
    }

    private float Power(float num1, float num2){
        return (float) Math.pow(num1, num2);
    }


    public float Opperate(float num1, float num2, int operater){
        float result = ValidOpperations.get(operater).apply(num1, num2);
        return result;
    }
}
