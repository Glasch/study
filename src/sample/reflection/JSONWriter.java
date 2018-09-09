package sample.reflection;

import java.lang.reflect.Field;

/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class JSONWriter {
    String write(Object object) {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(JSONField.class)) {
                try {
                    String annotationName = field.getAnnotation(JSONField.class).name();

                    System.out.println(field.getName() + " : " + field.get(object) + " : " + annotationName);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                }
            }

        }


        return "";

    }
}
