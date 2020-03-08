package wildcard.test2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    /**
     * add:除了null之外，不允许加入任何元素
     */
    public static void printAnimal(List<? extends Animal> list){
        for (Animal animal : list){
            // 除了null之外，不允许加入任何元素
//            Cat animal1 = new Cat("dsds", "12");
//            list.add(animal1);
            list.add(null);
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("旺财", "18");

        Cat cat2 = new Cat("小王", "18");

        ArrayList<Animal> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);

        printAnimal(list);
    }
}
