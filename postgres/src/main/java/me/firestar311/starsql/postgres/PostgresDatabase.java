package me.firestar311.starsql.postgres;

import me.firestar311.starsql.api.objects.SQLDatabase;

import java.util.logging.Logger;

public class PostgresDatabase extends SQLDatabase {
    public PostgresDatabase(Logger logger, PostgresProperties properties) {
        super(logger, properties);
        this.url = "jdbc:postgresql:" + properties.getHost() + ":" + properties.getPort() + "/" + properties.getDatabaseName();
    }
}