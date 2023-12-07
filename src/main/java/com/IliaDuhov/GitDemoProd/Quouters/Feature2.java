package com.IliaDuhov.GitDemoProd.Quouters;

import java.util.Objects;

public class Feature2 {
    private String name;
    private long id;

    public Feature2(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feature2 feature2)) return false;
        return getId() == feature2.getId() && Objects.equals(getName(), feature2.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}
