package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;
import java.util.ArrayList;


public abstract class Dependency implements Serializable
{
    private int id;
    private String name;
    private String portrait;
    private ArrayList<String> aliases = new ArrayList<>();

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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the portrait
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * @param portrait the portrait to set
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    /**
     * @return the aliases
     */
    public ArrayList<String> getAliases() {
        return aliases;
    }

    /**
     * @param aliases the aliases to set
     */
    public void setAliases(ArrayList<String> aliases) {
        this.aliases = aliases;
    }
}
