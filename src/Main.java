public class Main {
    public static void main(String[] args) {

        Dog smallDog = new Dog("Bobik", 4, "Braun"); // создание обьекта и это ссылочный тип.
        Dog smallDog2 = new Dog("Barsik", 4, "Schwartz"); // создание обьекта и это ссылочный тип.

        smallDog.giveMeString(25);
        smallDog.letsEat(13, "rabbit", "cat");

        smallDog.barking();
        String result = smallDog2.barking2();
        System.out.println(result);
        System.out.println("Бобику " + smallDog.age);


    }
}
