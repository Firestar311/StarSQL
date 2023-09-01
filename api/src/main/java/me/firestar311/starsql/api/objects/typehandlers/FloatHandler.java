package me.firestar311.starsql.api.objects.typehandlers;

import me.firestar311.starsql.api.objects.Column;
import me.firestar311.starsql.api.objects.TypeHandler;

public class FloatHandler extends TypeHandler {
    public FloatHandler() {
        super(Float.class, "float", FloatHandler::parse, FloatHandler::parse);
        addAdditionalClass(float.class);
    }
    
    private static Object parse(Column column, Object object) {
        if (object instanceof Number number) {
            return number.floatValue();
        } else if (object instanceof String str) {
            return Float.parseFloat(str);
        }
        return 0.0F;
    }
}
