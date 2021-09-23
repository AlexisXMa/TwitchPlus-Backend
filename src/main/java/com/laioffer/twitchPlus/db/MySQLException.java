package com.laioffer.twitchPlus.db;

public class MySQLException extends RuntimeException {
    public MySQLException(String errorMessage) {
        super(errorMessage);
    }
}
