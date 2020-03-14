package com.annotion;

import java.lang.annotation.*;

@Inherited//表示可被子类继承
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value();

    int sex() default 1;// 0男1女

}
