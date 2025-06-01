package Homework_9.Homework_9_2;

import java.util.LinkedList;

public class Animal {
    private final LinkedList<String> animals;

    public Animal() {
        animals = new LinkedList<>();
    }

    // Метод для добавления животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    // Метод для удаления животного из конца коллекции
    public String removeAnimal() {
        if (animals.isEmpty()) {
            return null; // Или выбросить исключение
        }
        return animals.removeLast();
    }

    // Метод для вывода текущего состояния коллекции
    public void printAnimals() {
        System.out.println("Текущие животные: " + animals);
    }
}