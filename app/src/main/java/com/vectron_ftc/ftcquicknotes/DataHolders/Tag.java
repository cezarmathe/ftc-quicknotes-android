package com.vectron_ftc.ftcquicknotes.DataHolders;

/**
 * Created by cezar on 3/1/18.
 */

public class Tag {
    private String name;
    private int id;
    // TODO: 3/1/18 add id assignement method for all data holders

    public Tag(String name) {
        this.name = name;
        // TODO: 3/1/18 automatically assign id from available id's
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
