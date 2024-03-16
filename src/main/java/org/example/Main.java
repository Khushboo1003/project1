package org.example;

import org.example.java8Examples.Animal;
import org.example.java8Examples.Cat;
import org.example.java8Examples.Dog;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //How to take user input?
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Who is this?");
        String name = in.nextLine();
        System.out.println("Welcome " + name);
        // Calling methods using class objects
        Cat cat = new Cat();
        cat.run();

        //Calling methods using interface reference which is storing cat object at runtime
        Animal animal = new Cat();
        animal.run();
        //Lambda exp
        Animal animal1 = () -> System.out.println("Dog is running");
        animal1.run();

        int arr[] = {1,3,4,1,7,8};
        System.out.println(Arrays.stream(arr).sum());
        //sort in ascending order
        System.out.println("Sorted in Ascending order : ");
        Arrays.stream(Arrays.stream(arr).sorted().toArray()).forEach(i -> System.out.print(i));
        //sort in descending order
        System.out.println("Sorted in descending order : ");
        List<Integer> intList = Arrays.asList(1,3,4,1,7,8);
        intList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i));
        //to remove duplicate elements
        System.out.println("Duplicates removed : ");
        intList.stream().distinct().forEach(integer -> System.out.print(integer));
        //fetch the second largest from the list
        Optional<Integer> secondLargest = intList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).findFirst();
        System.out.println("Second largest no is " + secondLargest.get());

    }
}