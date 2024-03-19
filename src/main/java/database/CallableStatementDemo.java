package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class CallableStatementDemo {
    public static void main(String... args){
        //First create database to run the code below

        /* 
         * String result = replace("That is original text", 
         * "original text", "the result");
         * System.out.print(result);
         */
    }

    private static String replace(String origText, String substr1, String substr2) {
        String result = "";
        Sring sql = "{ ? = call replace(?, ?, ?)}";
    }
}
