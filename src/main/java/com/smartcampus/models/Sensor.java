package com.smartcampus.models;

public class Sensor {

    private String id;
    private String type;
    private double value;
    private String roomId;

    public Sensor() {}

    public Sensor(String id, String type, double value, String roomId) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.roomId = roomId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}