package org.example;

public class ConstructorDemo {
    private  String name;
    private  int age;

    public ConstructorDemo(String name, int age){
        this.name = name;
        this.age= age;
    }

    public static void main(String[] args) {
        ConstructorDemo user1 = new ConstructorDemo("alice", 30);
        ConstructorDemo user2 = new ConstructorDemo("john", 40);

        System.out.println(user1.name + " Age: "+ user1.age);
        System.out.println(user2.name + " Age: "+ user2.age);
    }
}
