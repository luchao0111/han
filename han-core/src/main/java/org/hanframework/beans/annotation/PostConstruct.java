package org.hanframework.beans.annotation;

import java.lang.annotation.*;

/**
 * @author liuxin
 * @version Id: PostConstruct.java, v 0.1 2018/10/30 10:03 AM
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PostConstruct {
}
