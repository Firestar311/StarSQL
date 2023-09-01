package me.firestar311.starsql.api.objects.typehandlers;

import me.firestar311.starsql.api.objects.Column;
import me.firestar311.starsql.api.objects.TypeHandler;

public class IntegerHandler extends TypeHandler {
    public IntegerHandler() {
        super(Integer.class, "int", IntegerHandler::parse, IntegerHandler::parse);
        addAdditionalClass(int.class);
    }
    
    private static Object parse(Column column, Object object) {
        if (object instanceof Number number) {
            return number.intValue();
        } else if (object instanceof String str) {
            return Integer.parseInt(str);
        }
        return 0;
    }
}
