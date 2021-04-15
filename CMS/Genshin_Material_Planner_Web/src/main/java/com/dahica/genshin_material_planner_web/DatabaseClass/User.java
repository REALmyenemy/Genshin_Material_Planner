package com.dahica.genshin_material_planner_web.DatabaseClass;

import java.io.Serializable;

public class User implements Serializable
{
    private int id;
    private String username;
    private String email;
    private String hashpass;

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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the hashpass
     */
    public String getHashpass() {
        return hashpass;
    }

    /**
     * @param hashpass the hashpass to set
     */
    public void setHashpass(String hashpass) {
        this.hashpass = hashpass;
    }
    
}
