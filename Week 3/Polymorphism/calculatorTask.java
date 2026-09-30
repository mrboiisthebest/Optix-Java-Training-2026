
public class calculatorTask {
    public static void main(String[] args){
        Calc myCalc = new Calc();
        System.out.println(myCalc.Divide(10, 5));
        System.out.println(myCalc.Mult(10, 5));


        Calc myOldCalc = new SlowCalc();
        System.out.println(myOldCalc.Divide(10, 5));
        System.out.println(myOldCalc.Mult(10, 5));

    }
}


class Calc{

    public double Divide(int num1, int num2){
        return num1 / num2;
    }

    public double Mult(int num1, int num2){
        return num1 * num2;
    }
}



class SlowCalc extends Calc{

    @Override
    public double Divide(int num1, int num2){
        for (int i = 1; i < 1000000000; i++){
            float WsteMyTime = (999999999 / i) * i / 2;
        }

        return num1 / num2;
    }

    @Override
    public double Mult(int num1, int num2){
        for (int i = 1; i < 1000000000; i++){
            float WsteMyTime = (999999999 / i) * i / 2;
        }

        return num1 * num2;
    }
}
