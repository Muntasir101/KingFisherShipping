package org.example;

public class WithoutConstructor {
    private  String name = "Alice";
    private  int age = 20;

    public static void main(String[] args) {
        WithoutConstructor user1 = new WithoutConstructor();
        System.out.println(user1.name + " Age: "+ user1.age);

        WithoutConstructor user2 = new WithoutConstructor();
        System.out.println(user2.name + " Age: "+ user2.age);
    }
}
