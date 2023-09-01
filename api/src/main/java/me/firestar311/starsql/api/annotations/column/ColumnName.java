package me.firestar311.starsql.api.annotations.column;

import java.lang.annotation.*;

/**
 * This annotation allows customization of the name of the column in the database. This annotation has the highest priority for naming columns
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColumnName {
    String value();
}
