package com.example;

public class Demo {
    private String name ;
    private String weapon;
    private int power;

    public Demo(String name , String weapon , int power){
        this.name=name;
        this.weapon=weapon;
        this.power=power;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public static void main (String[] args){

    Demo dm1 = new Demo("yamen","sowrd",13);

    System.out.println(dm1.getName());


    }
}
