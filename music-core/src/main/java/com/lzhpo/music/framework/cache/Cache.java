package com.lzhpo.music.framework.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    /**
     * 业务的名称
     */
    String value() default "";

    /**
     * 缓存的Key（默认类名-方法名-自定义key）
     */
    String key() default "";

    /**
     * 是否刷新缓存，默认false
     */
    boolean flush() default false;

    /**
     * 缓存失效时间，默认30秒
     */
    long expire() default 30L;

    /**
     * 缓存时间单位，默认秒
     */
    TimeUnit unit() default TimeUnit.SECONDS;
}
