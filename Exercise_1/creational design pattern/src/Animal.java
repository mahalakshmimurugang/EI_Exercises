public interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("Chirp!");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        } else if (type.equals("bird")) {
            return new Bird();
        } else {
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("dog");
        animal.sound();
    }
}