package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;

public class ListAlchemy implements Serializable
{
    private Material mat;
    private int amount;

    /**
     * @return the mat
     */
    public Material getMat() {
        return mat;
    }

    /**
     * @param mat the mat to set
     */
    public void setMat(Material mat) {
        this.mat = mat;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
