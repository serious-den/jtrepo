package org.dmar.model.liveTest;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflection {

    @Test
    public void runReflection() {
        Class aClass = TargetDen.class;
        Annotation[] annotations = aClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof ToStringDen) {
                Field[] fields = aClass.getDeclaredFields();
                for (Field field : fields) {
                        System.out.println(field.getType().getSimpleName() + " " + field.getName() + ";");
                    }
            }
        }
    }
}