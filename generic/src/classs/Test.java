package classs;

import java.util.List;

/**
 * 如果一个类多处都要用到同一个泛型，可以把泛型定义在类上
 * @param <T>
 */
public class Test<T> {

   public void print(List<T> arrayList){
       for (T t : arrayList){
           System.out.println(t);
       }
   }

    // 静态方法不能使用类定义的泛型，只能单独定义
   public static <T> T getValue(T t){
       return t;
   }
}
