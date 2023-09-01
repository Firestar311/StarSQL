package me.firestar311.starsql.h2;

import me.firestar311.starsql.api.objects.SQLDatabase;

import java.util.logging.Logger;

public class H2Database extends SQLDatabase {
    public H2Database(Logger logger, H2Properties properties) {
        super(logger, properties);
        
        String url = "jdbc:h2:";
        if (exists(properties.getType())) {
            url += properties.getType() + ":";
        }
        
        url += properties.getDatabaseName();
        
        if (exists(properties.getCipher())) {
            url += ";CIPHER=" + properties.getCipher().toUpperCase();
        }
        
        if (exists(properties.getFileLock())) {
            url += ";FILE_LOCK=" + properties.getFileLock().toUpperCase();
        }
        
        if (properties.isIfExists()) {
            url += ";IF_EXISTS=TRUE";
        }
        
        if (!properties.isCloseOnExit()) {
            url += ";DB_CLOSE_ON_EXIT=TRUE";
        }
        
        if (exists(properties.getInitRunScript())) {
            url += ";INT=RUNSCRIPT FROM " + properties.getInitRunScript();
        }
        
        if (properties.getTraceLevelFile() > -1 && properties.getTraceLevelFile() < 4) {
            url += ";TRACE_LEVEL_FILE=" + properties.getTraceLevelFile();
        }
        
        if (properties.isIgnoreUnknownSettings()) {
            url += ";IGNORE_UNKNOWN_SETTINGS=TRUE";
        }
        
        if (exists(properties.getAccessMode())) {
            url += ";ACCESS_MODE_DATA=" + properties.getAccessMode().toUpperCase();
        }
        
        if (exists(properties.getCompatibilityMode())) {
            url += ";MODE=" + properties.getCompatibilityMode().toUpperCase();
        }
        
        if (properties.isAutoReconnect()) {
            url += ";AUTO_RECONNECT=TRUE";
        }
        
        this.url = url;
    }
    
    private boolean exists(String value) {
        return value != null && !value.isEmpty();
    }
}
