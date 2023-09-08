package me.firestar311.starsql.sqlite;

import me.firestar311.starsql.api.objects.SQLDatabase;

import java.util.logging.Logger;

public class SQLiteDatabase extends SQLDatabase {
    public SQLiteDatabase(Logger logger, SQLiteProperties properties) {
        super(logger, properties);
        this.url = "jdbc:sqlite:";
        if (properties.isMemory()) {
            this.url += ":memory:";
        } else {
            this.url += properties.getDatabaseName();
        }
    }
}
