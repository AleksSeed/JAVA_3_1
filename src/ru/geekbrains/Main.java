package ru.geekbrains;

import ru.geekbrains.Fruit.Apple;
import ru.geekbrains.Fruit.Orange;
import java.util.Arrays;
import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        /** Задание 1 */
        String arr[] = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        zamena(arr,1,4);

        /** Задание 2 */
        String[] arrayOfStrings = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        asList(arrayOfStrings);
        System.out.println("Задание 2:\n");

        /** Задание 3 */
        System.out.println("Задание 3:");

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox.add(new Apple(7)); //добавление яблок в коробку
        appleBox.add(new Apple(4));
        orangeBox.add(new Orange(5)); //добавление апельсинов в коробку

        System.out.println("Яблоки весят = " + appleBox.getWeight());
        System.out.println("Апельсины весят = " + orangeBox.getWeight());

        System.out.println("Коробки одинаково заполнены = " + appleBox.compare(appleBox2));

        appleBox.pour(appleBox2);   //Наполнение 2 коробки из 1

        System.out.println("Вес 1-ой коробки = " + appleBox.getWeight());
        System.out.println("Вес 2-ой коробки = " + appleBox2.getWeight());
}

    static void zamena(Object[] arr, int i1, int i2){
        System.out.println("Задание 1: \nИсходный массив:  " + Arrays.toString(arr));
        Object sw = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=sw;
        System.out.println("Массив с заменой: " + Arrays.toString(arr) + "\n");
    }

}