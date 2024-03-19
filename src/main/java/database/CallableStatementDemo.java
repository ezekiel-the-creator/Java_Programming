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
        String sql = "{ ? = call replace(?, ?, ?)}";
        Connection conn = getConnection();

        try (conn; CallableStatement st = conn.prepareCall(sql)) {
            st.registerOutParameter(1, Types.VARCHAR);
            st.setString(2, origText);
            st.setString(3, substr1);
            st.setString(4, substr2);
            st.execute();
            result = st.getString(1);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
