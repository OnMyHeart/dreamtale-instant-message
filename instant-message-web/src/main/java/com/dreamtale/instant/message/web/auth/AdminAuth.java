package com.dreamtale.instant.message.web.auth;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AdminAuth {

    int value() default  0;

    String name() default "";

}
