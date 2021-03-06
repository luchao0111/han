package org.hanframework.tool.annotation;

import java.util.HashMap;

/**
 * @Package: org.smileframework.tool.annotation
 * @Description: 注解的属性
 * @author: liuxin
 * @date: 2018/1/4 下午3:29
 */
public class AnnotationAttributes extends HashMap {
    private String annotationName;
    private Class annotationType;
    private Object annotationValue;

    public AnnotationAttributes(String annotationName,Class annotationType){
        this.annotationName=annotationName;
        this.annotationType=annotationType;
    }

    public String getAnnotationName(){
        return this.annotationName;
    }

    public Class getAnnotationType(){
        return this.annotationType;
    }


    @Override
    public String toString() {
        return "AnnotationAttributes{" +
                "annotationName='" + annotationName + '\'' +
                ", annotationType=" + annotationType +
                ", annotationValue=" + annotationValue +
                '}';
    }
}
