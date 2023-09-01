package me.firestar311.starsql.api.annotations.table;

import me.firestar311.starsql.api.objects.ObjectHandler;

import java.lang.annotation.*;

/**
 * This annotation tells the library to use an {@link ObjectHandler} for the table
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface TableHandler {
    Class<? extends ObjectHandler> value();
}
