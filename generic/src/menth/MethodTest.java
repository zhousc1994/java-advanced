package menth;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MethodTest {

    /**
     * <T>表示声明一个泛型类型T，具体类型在使用时确定
     * 其实可以用字母如F来代替T，但通常要大写
     * <T>通常需放在方法返回值之前
     * <T>定义好一个泛型类型T，则泛型T作为数据类型使用
     */
    public static <T> void changeArray(T[] arr, int start, int end){
        T t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }

    public static <K,V> V getValue(Map map , K key){
        return (V) map.get(key);
    }

    public static <T> void prinet(List<T> list){
        T t = list.get(1);
        list.add(t);
    }


    public static void main(String[] args) {
        String[] strs = {"2019","你好","世界"};
        changeArray(strs,1,2);
        System.out.println(Arrays.toString(strs));

        Integer[] ints = new Integer[]{1,5,7,9,3};
        changeArray(ints,1,2);
        System.out.println(Arrays.toString(ints));
    }
}
