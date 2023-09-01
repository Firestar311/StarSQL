package me.firestar311.starsql.api.objects.typehandlers;

import me.firestar311.starsql.api.objects.TypeHandler;

public class BooleanHandler extends TypeHandler {
    public BooleanHandler() {
        super(Boolean.class, "bit(1)", (column, object) -> {
            if (object instanceof Number number) {
                return number;
            } else if (object instanceof Boolean bool) {
                return bool ? 1 : 0;
            }
            return 0;
        }, (column, object) -> {
            if (object instanceof Boolean bool) {
                return bool;
            } else if (object instanceof Number number) {
                return number.intValue() == 1;
            } else if (object instanceof String str) {
                return Boolean.parseBoolean(str);
            }
            return false;
        });
        addAdditionalClass(boolean.class);
    }
}
