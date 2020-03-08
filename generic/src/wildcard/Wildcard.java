package wildcard;

import java.util.List;

/**
 * 通配符？
 */
public class Wildcard {

    /**
     * <?>无限定的通配符，是让泛型能够接受未知类型的数据
     * ?只是代表一个占位符，因此不算一个类型，也不需要定义类型
     * @param list
     */
    public void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
