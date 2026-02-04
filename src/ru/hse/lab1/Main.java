package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author Барсуков Михаил Сергеевич
 * @version 1.0
 * @since 2026
 */
public class Main {
    static void main(String[] args) {
        Person user = new Person();
        user.name = "Ivan";
        user.age = 20;
        System.out.println("Имя: " + user.name);
        System.out.println("Возраст: " + user.age);
    }
}
