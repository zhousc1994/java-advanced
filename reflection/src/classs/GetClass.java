package classs;

/**
 * 每个对象运行都有一个对应的class对象，class的获取方式有三种
 */
public class GetClass {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 1.已有对象，调用对象的getClass方法
        GetClass getClass = new GetClass();
        Class<? extends GetClass> aClass = getClass.getClass();

        // 2.通过类获取
        Class<?> getClass2 = GetClass.class;

        // 3.不知道对象，只有对象的全限名字符串
        Class<?> aClass1 = Class.forName("classs.GetClass");
       
        // 通过newInstance()创建class的实例，相当于调用无参构造器创建实例
        GetClass o = (GetClass) aClass1.newInstance();

    }
}
