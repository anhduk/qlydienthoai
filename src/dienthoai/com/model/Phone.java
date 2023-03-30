package dienthoai.com.model;

import java.io.Serializable;

public class Phone implements Serializable {
    private String name;
    private int id;
    private String type;

    public Phone(){

    }

    public Phone(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
