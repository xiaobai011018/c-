package com.bsc.jdbc.Druid;

import java.util.Date;

public class Actor {
    private Integer id;
    private String name;
    private String sex;
    private Date borndate;

    public Actor() {
    }

    public Actor(Integer id, String name, String sex, Date borndate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    @Override
    public String toString() {
        return "\nActor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate=" + borndate +
                '}';
    }
}
