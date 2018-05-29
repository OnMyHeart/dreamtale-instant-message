package com.dreamtale.dreamtale.instant.message.auth;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AdminAuth {

    int value() default  0;

    String name() default "";

}
