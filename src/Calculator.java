public class Calculator {
    int weight, cost;
    String color;

    int sum(int first, int second) {
        return first + second;
    }

    int sub(int first, int second) {
        return first - second;
    }

    int dev(int first, int second) {
        return first / second;
    }

    int mult(int first, int second) {
        return first * second;
    }

    Calculator(String color, int weight, int cost) {
        this.color = color;
        this.weight = weight;
        this.cost = cost;

    }
    {
        System.out.println(this.color + this.cost + this.weight);
    }
}

