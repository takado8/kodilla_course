package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL='Not set'";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        // Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL='Not set'";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlCleaningQuery = "UPDATE books SET bestseller=FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlCleaningQuery);

        // when
        String callUpdateBestsellers = "CALL UpdateBestsellers()";
        statement.execute(callUpdateBestsellers);

        // then
        String testQuery = "SELECT COUNT(*) AS HOW_MANY FROM books WHERE bestseller=TRUE";
        var result = statement.executeQuery(testQuery);
        int howMany = -1;
        if (result.next()) {
            howMany = result.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);

        result.close();
        statement.close();
    }
}