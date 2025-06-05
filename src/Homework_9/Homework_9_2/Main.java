package Homework_9.Homework_9_2;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Main {
    public static void main(String[] args) {
        Animal collection = new Animal();

        // Добавляем животных
        collection.addAnimal("Кошка");
        collection.addAnimal("Собака");
        collection.addAnimal("Лиса");
        collection.printAnimals(); // Выводит текущий список

        // Удаляем животное из конца
        String removedAnimal = collection.removeAnimal();
        System.out.println("Удалено животное: " + removedAnimal);
        collection.printAnimals();

        // Еще раз добавим и удалим
        collection.addAnimal("Мышь");
        collection.printAnimals();

        String removed = collection.removeAnimal();
        System.out.println("Удалено животное: " + removed);
        collection.printAnimals();
    }
}