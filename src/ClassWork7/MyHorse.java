package ClassWork7;

public class MyHorse {

    String name;
    int age;

    public MyHorse(){

    }

    MyHorse(String name) {
        this.name = name;
    }

    MyHorse (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyHorse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
