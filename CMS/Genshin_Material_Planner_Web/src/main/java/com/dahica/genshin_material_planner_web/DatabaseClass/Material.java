package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;
import java.util.ArrayList;

public class Material implements Serializable
{
   private int id;
   private String name;
   private int type;
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
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
