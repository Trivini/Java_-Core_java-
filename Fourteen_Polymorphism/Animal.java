package Fourteen_Polymorphism;

public class Animal {

    //concept of Method Overriding
    public void sound(){
        System.out.println("Animal making Sound");
    }

}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog sounds Bow");
    }
    
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sounds Meow");
    }
    
}


class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();

    }
}
