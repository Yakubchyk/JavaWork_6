public class TMS {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Red ", 20, 500);

        System.out.println(calculator.color + calculator.cost + calculator.weight);

        calculator.sum(5,5);
    }
}
