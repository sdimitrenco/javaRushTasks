package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasia", 23, "test");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Man man2 = new Man("Vasia", 23, "test");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Vasia", 23, "test");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

        Woman woman2 = new Woman("Vasia", 23, "test");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        String name;
        int age;
        String address;


    }

    public static class Woman {
        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        String name;
        int age;
        String address;


    }
}
