package me.firestar311.starsql.api;

import java.util.function.Function;

public class ObjectCodex {
    protected String sqlType;
    protected Class<?> primaryClass;
    protected Class<?>[] secondaryClasses;
    protected Function<Object, Object> javaToSqlConverter, sqlToJavaConverter;

    public ObjectCodex(String sqlType, Class<?> primaryClass, Class<?>... secondaryClasses) {
        this.primaryClass = primaryClass;
        this.secondaryClasses = secondaryClasses;
    }

    public Function<Object, Object> getJavaToSqlConverter() {
        return javaToSqlConverter;
    }

    public void setJavaToSqlConverter(Function<Object, Object> javaToSqlConverter) {
        this.javaToSqlConverter = javaToSqlConverter;
    }

    public Function<Object, Object> getSqlToJavaConverter() {
        return sqlToJavaConverter;
    }

    public void setSqlToJavaConverter(Function<Object, Object> sqlToJavaConverter) {
        this.sqlToJavaConverter = sqlToJavaConverter;
    }

    public boolean isValidClass(Class<?> clazz) {
        if (primaryClass == clazz) {
            return true;
        }
        
        if (secondaryClasses != null) {
            for (Class<?> secondaryClass : secondaryClasses) {
                if (secondaryClass == clazz) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public Class<?> getPrimaryClass() {
        return primaryClass;
    }

    public Class<?>[] getSecondaryClasses() {
        return secondaryClasses;
    }
}
