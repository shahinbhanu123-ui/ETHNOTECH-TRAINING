class Student {

    String name;
    int age;
    int energy;
    String mood;
    float attendance;

    Student(String name, int age, String mood, int energy) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }

    void skipclass() {
        if (this.energy < 2) {
            System.out.println("Weak");
        } else {
            System.out.println("Strong");
        }
    }

    void takerest() {
        if (this.attendance > 85) {
            System.out.println("Take rest");
        } else {
            System.out.println("Not to take rest");
        }
    }

    void sleep() {
        if (this.mood.equals("bored")) {
            System.out.println("I want to sleep");
        }
    }

    void study() {
        if (this.mood.equals("ambition")) {
            System.out.println("I want to achieve");
        }
    }

    void eat() {
        this.energy += 5;
        System.out.println("Energy: " + this.energy);
    }

    public static void main(String[] args) {

        Student s = new Student("Shahin", 20, "bored", 5);

        s.attendance = 90;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Mood: " + s.mood);
        System.out.println("Energy: " + s.energy);

        s.skipclass();
        s.takerest();
        s.sleep();
        s.study();
        s.eat();
    }
}