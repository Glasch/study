package sample.reflection;







import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;
import sun.applet.Main;


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
        Integer number = 0 ;
        String site = " ";
        Integer stake = 0;


        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if ("-number".equals(arg)){
                 number = Integer.parseInt(args[i+1]) ;
            }
            if ("-site".equals(arg)){
                 site = args[i+1];
            }
            if ("-limit".equals(arg)){
                 stake = Integer.parseInt(args[i+1]);
            }

        }

        MyJSONWriter myJsonWriter = new MyJSONWriter();
        Hand hand = new Hand(number,site,stake);
        myJsonWriter.write(hand);

    }
}
