package com.icss.day07;

public class Practise1 {
    private String mood;
    private String type;
    private int age;
    private String name;

    public Practise1(String mood,String type,String name,int age){
        super();
        this.age =age;
        this.name = name;
        this.type = type;
        if (mood.equals("心情好")||mood.equals("心情不好")){
            this.mood = mood;
        }else{
            System.out.println("输入信息错误，这只狗狗今天心情好");
            this.mood = "心情好";
        }
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {

        this.mood = mood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(){
        if (mood.equals("心情好")){
            System.out.println("名字叫"+this.name+"的"+this.type+"心情好,开心的汪汪叫");
        }else {
            System.out.println("名字叫"+this.name+"的"+this.type+"心情不好,伤心的呜呜叫");
        }

    }

    public void run(){
        if (mood.equals("心情好")){
            System.out.println("名字叫"+this.name+"的"+this.type+"心情好,开心的围着主人转");
        }else {
            System.out.println("名字叫"+this.name+"的"+this.type+"心情不好,伤心的一动不动");
        }
    }
}
