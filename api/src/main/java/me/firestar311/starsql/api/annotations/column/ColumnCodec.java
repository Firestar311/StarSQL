package me.firestar311.starsql.api.annotations.column;

import me.firestar311.starsql.api.objects.SqlCodec;

import java.lang.annotation.*;

/**
 * This annotation allows you to tell the library a {@link SqlCodec} for a field/column <br>
 * The MySQL type when using this feature is VARCHAR with a default length of 1000<br>
 * If you want to override this behavior, use the {@link ColumnType} annotation. You can only specify a Varchar argument here. This is only to allow customization of the length
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColumnCodec {
    Class<? extends SqlCodec<?>> value();
}
