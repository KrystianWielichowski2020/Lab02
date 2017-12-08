package com.ebookfrenzy.lab02.entity;

/**
 * Created by stud on 11/26/2017.
 */

public class Recipe {
    private String name, description;
    private boolean isWithMeat;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isWithMeat() {
        return isWithMeat;
    }

    public Recipe(String name, String description, boolean isWithMeat) {
        this.name = name;
        this.description = description;
        this.isWithMeat = isWithMeat;
    }

    @Override
    public String toString() {
        return name + ", opis: " + description;
    }
}
