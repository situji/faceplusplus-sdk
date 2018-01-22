package com.majp.facepluseplus.annotation;

import java.lang.annotation.*;

/**
 * @author lanhuidong
 * @since 2017-03-21
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bytes {

    String name() default "";

}
