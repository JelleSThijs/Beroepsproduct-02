package com.jsthijs.beroepsproduct02.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Item {
    private Integer id;
    private String name;
    private String summary;
    private String image;
    private String maker;
    private Integer release_year;
    private String type;

    public Item(String name, String summary, String image, String maker, Integer release_year, String type) {
        this.name = name;
        this.summary = summary;
        this.image = image;
        this.maker = maker;
        this.release_year = release_year;
        this.type = type;
    }

    public Item(ResultSet rs) throws SQLException {
        this.name = rs.getString("name");
        this.summary = rs.getString("summary");
        this.image = rs.getString("image");
        this.maker = rs.getString("maker");
        this.release_year = rs.getInt("release_year");
        this.type = rs.getString("type");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getImage() {
        return image;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public String getMaker() {
        return maker;
    }

    public String getType() {
        return type;
    }
}
