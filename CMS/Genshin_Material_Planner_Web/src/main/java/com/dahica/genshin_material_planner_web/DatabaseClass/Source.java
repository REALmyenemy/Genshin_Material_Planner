package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;

public abstract class Source implements Serializable
{
    private int id;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
