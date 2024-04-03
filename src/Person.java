public class Person {
    String fullName;
    Dog dog;
    int age;

    void talk(String text){
        System.out.println(fullName + "... talk ..." + text + " ... ");
    }
    void move(){
        System.out.println(fullName + "  walk ...");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
//        if (age >= 10) {
//            this.dog = new Dog();
//        }
    }

}
