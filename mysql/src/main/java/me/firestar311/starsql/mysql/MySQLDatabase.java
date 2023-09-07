package me.firestar311.starsql.mysql;

import me.firestar311.starsql.api.objects.SQLDatabase;

import java.util.logging.Logger;

public class MySQLDatabase extends SQLDatabase {
    public MySQLDatabase(Logger logger, MySQLProperties properties) {
        super(logger, properties);
        this.url = "jdbc:mysql:" + properties.getHost() + ":" + properties.getPort() + "/" + properties.getDatabaseName();
    }
}