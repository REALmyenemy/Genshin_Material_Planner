package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;
import java.util.ArrayList;

public class Mob_drop extends Source implements Serializable
{
    private ArrayList<String>mobs = new ArrayList<>();

    /**
     * @return the mobs
     */
    public ArrayList<String> getMobs() {
        return mobs;
    }

    /**
     * @param mobs the mobs to set
     */
    public void setMobs(ArrayList<String> mobs) {
        this.mobs = mobs;
    }
}
