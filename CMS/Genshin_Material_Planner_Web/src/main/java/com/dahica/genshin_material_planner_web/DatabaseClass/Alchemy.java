package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;
import java.util.ArrayList;

public class Alchemy extends Source implements Serializable
{
    private ArrayList<Alchemy> list = new ArrayList<>();
    private int money;

    /**
     * @return the list
     */
    public ArrayList<Alchemy> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Alchemy> list) {
        this.list = list;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }
    
    @Override
    public String toString() {
        return "com.dahica.genshin_material_planner_web.DatabaseClass.Alchemy[ id=" + id + " ]";
    }
}
