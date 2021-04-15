package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;
import java.util.ArrayList;

public class Inventory implements Serializable //One user can have multiple genshin accounts
{
    private int user;
    private int id;
    private String name;
    private ArrayList<Material>materials=new ArrayList<>();

    /**
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }

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
     * @return the materials
     */
    public ArrayList<Material> getMaterials() {
        return materials;
    }

    /**
     * @param materials the materials to set
     */
    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }
}
