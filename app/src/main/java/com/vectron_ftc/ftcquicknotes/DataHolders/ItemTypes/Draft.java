package com.vectron_ftc.ftcquicknotes.DataHolders.ItemTypes;

import com.vectron_ftc.ftcquicknotes.DataHolders.Item;

/**
 * Created by cezar on 3/3/18.
 */

public class Draft extends Item {

    private int id;
    private String name;

    public Draft(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
