package com.icss.day07;

public class Music {
    private static String name = "好汉歌";
    private static String type = "流行音乐";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Music.name = name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Music.type = type;
    }

    public static String details(){
        return "Music[name="+name+",type="+type+"]";
    }
}
