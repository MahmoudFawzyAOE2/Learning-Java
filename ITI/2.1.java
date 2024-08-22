import java.util.*;

class Calculator {
    public String maths;

    public Calculator() {
        maths = "";
    }

    public Calculator(String equation) {
        maths = equation;
    }

    public String[] getParts() {
        return maths.split(" ");
    }

    public String doOperation() {
        String[] parts = this.getParts();
        float out = Float.parseFloat(parts[0]);
        if (parts.length < 3) {
            return "Error in Input";
        } else {
            for (int i = 0; i < parts.length / 2; i++) {
                float operand = Float.parseFloat(parts[i * 2 + 2]);
                switch (parts[i * 2 + 1]) {
                    case "+":
                        out = out + operand;
                        break;
                    case "-":
                        out = out - operand;
                        break;
                    case "x":
                        out = out * operand;
                        break;
                    default:
                        return "Unknown Operation";
                }
            }
        }
        return String.valueOf(out);
    }
}
public class Main {
    public static void main(String[] args){

        String commandLine="70 + 30 - 40 x 2";
        Calculator cal = new Calculator (commandLine);
        System.out.println("The output of "+commandLine+ " is "+cal.doOperation ());
    }//end of main
}//end of class