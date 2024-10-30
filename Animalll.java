public class Animalll {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animalll {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}