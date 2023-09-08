package me.firestar311.starsql.api.interfaces;

import me.firestar311.starsql.api.DatabaseRegistry;

import java.util.List;
import java.util.logging.Logger;

public interface Database {
    //Credentials
    String getName();
    String getUser();
    String getPassword();
    String getUrl();
    
    //Other needed things
    void registerClass(Class<?> clazz);
    Logger getLogger();
    
    //Database registry
    DatabaseRegistry getRegistry();
    void setRegistry(DatabaseRegistry registry);
    
    //Getters
    <T> List<T> get(Class<T> clazz, String[] columns, Object[] values) throws Exception;
    <T> List<T> get(Class<T> clazz, String columnName, Object value) throws Exception;
    <T> List<T> get(Class<T> clazz) throws Exception;
    
    //Saving
    void saveSilent(Object object);
    void save(Object object) throws Exception;
    
    //Deleting
    void deleteSilent(Class<?> clazz, Object id);
    void deleteSilent(Object object);
    void delete(Object object) throws Exception;
    void delete(Class<?> clazz, Object id) throws Exception;
    
    //Queue Related
    void queue(Object object);
    void flush();
}
