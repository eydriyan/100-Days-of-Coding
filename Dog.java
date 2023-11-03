public class Dog {

    String name, color, breed, sex;
    int age;

    public Dog(String name, String color, String breed, String sex, int age){

        this.name = name;
        this.color = color;
        this.breed = breed;
        this.sex = sex;
        this.age = age;

        System.out.println("Dog successfully created!");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Breed: " + breed);
        System.out.println("Breed: " + sex);
        System.out.println("Age: " + age);

    }
}
