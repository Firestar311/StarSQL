package me.firestar311.starsql.api;

import java.util.List;

public interface Table {
    String getName();
    List<Column> getColumns();
    Class<?> getModelClass();
    List<Constraint> getConstraints();
}
