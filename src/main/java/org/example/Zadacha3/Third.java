package org.example.Zadacha3;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.ArrayList;

//Создать список из N элементов, содержащий объекты User(String name, int age).
//Значение N программа должна запросить с клавиатуры, данные пользователей User программа также должна запрашивать с клавиатуры. Вывести результат на экран.
public class Third {
    public static void main(String[] args) {
        User rBeda = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        rBeda.setName(name);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        rBeda.setAge(age);
        if (age < 0 || age > 110) {
            return;
        }
        User sevAlieva = new User();
        System.out.println("Введите имя пользователя:");
        String name1 = scanner.nextLine();
        rBeda.setName(name1);
        System.out.println("Введите возраст:");
        int age1 = scanner.nextInt();
        rBeda.setAge(age1);
        if (age1 < 0 || age1 > 110) {
            return;
        }
        //System.out.printf("Пользователь: %s, Возраст: %d", rBeda.getName(), rBeda.getAge());
        ArrayList<User> users = new ArrayList<>();
        users.add(rBeda);
        users.add(sevAlieva);

    }
}

class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        if (age1 > 0 && age1 < 110)
            this.age = age1;
        else {
            System.out.println("Введите возраст от 0 до 110!");
        }
    }
}