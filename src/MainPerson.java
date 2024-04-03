public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person secondPerson = new Person("Bill", 10);
        Person person1 = new Person("Dima", 10);
        System.out.println(person1.dog.name);
        person.move();
        person.talk("Who am I ?");


    }
}
