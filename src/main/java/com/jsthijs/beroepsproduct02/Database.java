package com.jsthijs.beroepsproduct02;

import java.sql.*;

public class Database {

    private String host;
    private String port;
    private String user;
    private String passwd;
    private String dbname;

    private Connection conn;
    private Statement stmt;

    Database(String host, String port, String user, String passwd, String dbname) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.passwd = passwd;
        this.dbname = dbname;

        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname , user, passwd);
            this.stmt = this.conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    Database(String host, String user, String passwd, String dbname) {
        this(host, "3306", user, passwd, dbname);
    }

    Database(String host, String user, String dbname) {
        this(host, "3306", user, "", dbname);
    }

    public void AddRow(String name, String genre, String release_year) {
        String query = "INSERT INTO games(name, genre, release_year) VALUES ('"+  name + "', '" + genre + "', '" + release_year + "')";
        try {
            this.stmt.execute(query);
            System.out.println("Added " + name  + " | " + genre + " | " + release_year);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet GeefAllData(){
        String query = "SELECT * FROM games";
        try {
            ResultSet results = this.stmt.executeQuery(query);
            return results;
//            while(results.next()){
//                System.out.println(
//                    results.getString("name") + " | " +
//                    results.getString("genre") + " | " +
//                    results.getString("release_year")
//                );
//            };
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DelGame(int id){
        String query = "DELETE FROM games WHERE id = '" + id + "'";
        try {
            this.stmt.execute(query);
            System.out.println("Deleted game with id: " + id);

        } catch (SQLException e) {}
    }

    public void EditGame(int id, String name, String genre, String release_year) {
        String query = "UPDATE games SET name = '" + name + "', genre = '" + genre + "', release_year = '" + release_year + "' WHERE id = '" + id + "'";
        try {
            this.stmt.execute(query);

            System.out.println("Edited Game: | id: " + id  + " | name: " + name + " | genre: " + genre + " | release_year: " + release_year);
        } catch (SQLException e) {}
    }

    public void EditField(int id, String columName, String value){
        String query = "UPDATE games SET " + columName + "='" + value + "' WHERE id = '" + id + "'";
        try {
            this.stmt.execute(query);
            System.out.println("Edited " + columName  + " : " + value + " | with id: " + id);
        } catch (SQLException e) {}
    }

}


