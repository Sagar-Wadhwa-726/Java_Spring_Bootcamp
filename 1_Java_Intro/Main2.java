class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(3, 6);
        System.out.println(result);
    }
}
