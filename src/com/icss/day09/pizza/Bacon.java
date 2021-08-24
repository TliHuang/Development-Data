package com.icss.day09.pizza;

public class Bacon extends Pizza {
    private double qualite;

    public Bacon(String name, double price, int size, double qualite) {
        super("培根披萨", price, size);
        this.qualite = qualite;
    }

    public double getQualite() {
        return qualite;
    }

    public void setQualite(double qualite) {
        this.qualite = qualite;
    }

    @Override
    public String show() {
        return "名称：" + this.getName() + "\n价格：" + this.getPrice() + "\n大小：" + this.getSize() + "\n培根克数：" + this.getQualite();
    }

}
