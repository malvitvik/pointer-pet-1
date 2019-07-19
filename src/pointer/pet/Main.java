package pointer.pet;

public class Main {

    public static void main(String[] args) {
        doSound(new Cat());
        doSound(new Dog());
        doSound(new Cow());
    }

    static void doSound(Pet pet) {
        pet.voice();
    }
}
