package com.jee.donationswebsite.model;

public class Login {

    private String usename;
    private String password;

    public Login() {
    }

    public Login(String usename, String password) {
        this.usename = usename;
        this.password = password;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
