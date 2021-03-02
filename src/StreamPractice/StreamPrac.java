package StreamPractice;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamPrac {
    public static void main(String[] args) {

//        for(Person p : getPeople()) {
//            System.out.println(p.getName());
//        }

        // filter
        List<Person> people = getPeople();
//        people.stream().filter(person -> person.getName() == "Kim").forEach(System.out::println);
//        people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed()).forEach(System.out::println);
//          people.stream().allMatch(person -> person.getAge() == 30 && person.getName().equals("Park"));
//        System.out.println(people.stream().anyMatch(person -> person.getAge() > 50));
        Person oldest = people.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
        System.out.println(oldest);


    }

    public static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Kim", 20),
                new Person("Lee", 25),
                new Person("Park", 30),
                new Person("Yoon", 30)
        );
    }
}
