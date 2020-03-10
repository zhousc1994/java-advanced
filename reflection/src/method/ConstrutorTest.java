package method;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstrutorTest {

    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("method.Student");
            //  获取该类的所有构造器
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor constructor:declaredConstructors) {
                // constructor.getParameterCount() 获取构造器参数的个数
                System.out.println(constructor.getName()+ " "+ constructor.getParameterCount());
                // 获取构造器的所有参数类型
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class cls : parameterTypes){
                    System.out.println(cls);
                }
            }

            // 通过无参构造器创建对象
            Constructor<?> constructor = aClass.getConstructor();
            Object stu1 = constructor.newInstance();
            System.out.println(stu1);

            // 通过有参构造器创建对象
            Constructor<?> constructor1 = aClass.getConstructor(String.class);
            Object stu2 = constructor1.newInstance("小王");
            System.out.println(stu2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
