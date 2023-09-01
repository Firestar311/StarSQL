package me.firestar311.starsql.api.interfaces;

import me.firestar311.starsql.api.DatabaseRegistry;
import me.firestar311.starsql.api.objects.Row;
import me.firestar311.starsql.api.objects.Table;
import me.firestar311.starsql.api.objects.TypeHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public interface Database {
    String getName();
    String getUser();
    String getPassword();
    String getUrl();
    void registerClass(Class<?> clazz);
    Set<Table> getTables();
    Logger getLogger();
    <T> List<T> get(Class<T> clazz, String[] columns, Object[] values) throws SQLException;
    <T> List<T> get(Class<T> clazz, String columnName, Object value) throws SQLException;
    <T> List<T> get(Class<T> clazz) throws SQLException;
    void saveSilent(Object object);
    void save(Object object) throws SQLException;
    void deleteSilent(Class<?> clazz, Object id);
    void deleteSilent(Object object);
    void delete(Object object) throws SQLException;
    void delete(Class<?> clazz, Object id) throws SQLException;
    Table getTable(String name);
    Table getTable(Class<?> clazz);
    void execute(String sql) throws SQLException;
    void executePrepared(String sql, Object... args) throws SQLException;
    List<Row> executeQuery(String sql) throws SQLException;
    List<Row> executePreparedQuery(String sql, Object... args) throws SQLException;
    void queue(Object object);
    void flush();
    Set<TypeHandler> getTypeHandlers();
    void addTypeHandler(TypeHandler handler);
    void setRegistry(DatabaseRegistry registry);
    DatabaseRegistry getRegistry();
}
