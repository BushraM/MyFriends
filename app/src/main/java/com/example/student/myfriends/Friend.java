package com.example.student.myfriends;

/**
 * Created by student on 2/25/15.
 */
public class Friend {

    private int id;
    private String name;
    private String phone;
    private String address;
    private String email;

    public Friend(){}

    public Friend(int id,String name, String email, String address, String phone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public void set_id(int id){
        this.id = id;
    }

    public int get_id(){
        return id;
    }

    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String get_address() {
        return address;
    }

    public void set_address(String address) {
        this.address = address;
    }

    public String get_phone() {
        return phone;
    }

    public void set_phone(String phone) {
        this.phone = phone;
    }
}
