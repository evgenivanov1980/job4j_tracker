package ru.job4j.models;

import javax.persistence.*;
import java.util.Objects;


public class Item {

    private String id;
    private String name;
    private String description;
    private long created;

    public Item() {
    }


    public Item(String name, String description, long created) {
        this.name = name;
        this.description = description;
        this.created = created;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id='"
                + id
                + '\''
                + ", name='" + name
                + '\''
                + ", description='"
                + description + '\''
                + ", create="
                + created + '}';
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public long getCreated() {
        return this.created;
    }

    public void setCreated(long create) {
        this.created = create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return created == item.created
                && Objects.equals(id, item.id)
                && Objects.equals(name, item.name)
                && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, created);
    }
}



