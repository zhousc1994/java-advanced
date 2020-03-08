package wildcard.test3;

import wildcard.test2.Cat;

import java.util.List;

public class Test2 {
    // <? super E> 有下限的通配符，能接受指定类及其父类的数据
    public static void print(List<? super Cat> list){
        // 允许添加cat和Cat的子类元素，还有null
        list.add(new Cat("馒头","5"));
        list.add(new WhileCat("小黑","3"));
        list.add(null);

        // 应为不确定传入类型是Cat或Cat父类，因此只能用Object来接收
        Object object = list.get(0);
        for (Object o : list){
            System.out.println(o);
        }
    }
}
