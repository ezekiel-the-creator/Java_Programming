package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class CallableStatementDemo {
    String result = "";
    String sql = "{ ? = call replace(?, ?, ? )}";
    Connection conn = getConnection();
    try (conn; CallableStatement st = conn.prepareCall(sql))
}
