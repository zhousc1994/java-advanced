package method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {

    public static void main(String[] args) {
        try {
            // 反射获取类信息
            Class<?> aClass = Class.forName("method.Student");
            // 创建一个类型实例
            Object student = aClass.newInstance();

            // 得到所有的方法
            Method[] methods = aClass.getDeclaredMethods();
            for (Method method :methods) {
                System.out.println(method.getName() +"  " + method.getParameterCount());
            }

            Method setNameMethod = aClass.getDeclaredMethod("setName",String.class);
            // 调用方法
            Object stu1 = setNameMethod.invoke(student, "王总");
            Method getName = aClass.getDeclaredMethod("getName");
            Object name = getName.invoke(student);
            System.out.println(name);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
