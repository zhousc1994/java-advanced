package com.annotion;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) {
        try {
            // 获取类上注解
            Class<?> aClass = Class.forName("com.annotion.entity.People");
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            if (annotation != null){
                System.out.println(annotation.value() +"  "+ annotation.annotationType() + "  "+ annotation.sex());
            }

            Field[] peopleFiles = aClass.getDeclaredFields();
            for (Field field : peopleFiles) {
                FieldAnnotation fileAnnotation = field.getAnnotation(FieldAnnotation.class);
                if (fileAnnotation != null){
                    System.out.println("Field:"+field.getName()+":"+fileAnnotation.value());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
