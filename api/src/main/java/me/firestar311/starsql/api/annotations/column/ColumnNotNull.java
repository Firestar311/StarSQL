package me.firestar311.starsql.api.annotations.column;

import java.lang.annotation.*;

/**
 * This annotation tells the library that the column cannot be null. Please note, this will cause SQLExceptions if there is a null value for a field on insert (or update)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColumnNotNull {
    
}
