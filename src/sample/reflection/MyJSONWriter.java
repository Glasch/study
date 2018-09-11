package sample.reflection;







import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;



/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class MyJSONWriter {
    JSONObject write(Object object) {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        JSONObject jsonObject = new JSONObject();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(JSONField.class)) {
                try {
                    field.setAccessible(true);
                    String annotationName = field.getAnnotation(JSONField.class).name();
                    jsonObject.put(annotationName,field.get(object));

                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                }
            }

        }
        System.out.println(jsonObject);
        return jsonObject;
    }

    public static void main(String[] args) {
        MyJSONWriter myJsonWriter = new MyJSONWriter();
        Hand hand = new Hand(1,"PS",25);
        myJsonWriter.write(hand);
    }
}
