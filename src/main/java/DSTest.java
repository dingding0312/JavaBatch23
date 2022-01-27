import java.util.ArrayList;
import java.util.*;
import java.util.Objects;

public class DSTest {
    public static void main(String[] args) {
        // test for ArrayList
//        List<Person> list = new ArrayList<>();
//        list.add(new Person(18));
//        list.add(new Person(16));
//        for(Person p:list){
//            System.out.println(p);
//        }

        //test for LinkedList
//        List<Person> list1 = new LinkedList<>();
//        list1.add(new Person(29));
//        list1.add(new Person(33));
//        for(Person p:list1){
//            System.out.println(p);
//        }

        //test for HashSet
//        Set<Person> set1 = new HashSet<>();
//        set1.add(new Person(1));
//        set1.add(new Person(2));
//        for(Person p:set1){
//            System.out.println(p);
//        }

        //test for TreeSet
//        Set<Person> set = new TreeSet<>();
//        set.add(new Person(45));
//        set.add(new Person(99));
//        set.add(new Person(101));
//        for(Person p:set){
//            System.out.println(p);
//        }
        //test for PriorityQueue
        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.age == o2.age) return 0;

                return o1.age < o2.age ? -1 : 1;
            }
        });
        queue.offer(new Person(33));
        queue.offer(new Person(55));
        queue.offer(new Person(66));
        for(Person p:queue){
            System.out.println(p);
        }
    }
}
class Person implements Comparable<Person>{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }


    @Override
    public int compareTo(Person o) {
        if(this.age == o.age) return 0;

        return this.age < o.age ? 1 : -1;
    }
}