package example;

public class PatternMatchingExample {

    public static void main(String[] args) {
        Animal animal1 = new Bird();
        Animal animal2 = new Dog();

        if (animal1 instanceof Bird) {
            ((Bird) animal1).fly();
        }

        if (animal2 instanceof Dog) {
            ((Dog) animal2).bark();
        }

        if (animal1 instanceof Bird bird) {
            bird.fly();
        }

        if (animal2 instanceof Dog dog) {
            dog.bark();
        }

        if (animal1 instanceof Dog dog) {
            dog.bark();
        }

    }

    interface Animal {

    }

    private static class Bird implements Animal {
        public void fly() {
            System.out.println("Flying");
        }
    }

    private static class Dog implements Animal {
        public void bark() {
            System.out.println("Barking");
        }
    }
}
