package com.icss.day09.pizza;

public class SeaFood extends Pizza {
    private String mixzd;

    public SeaFood(String name, double price, int size, String mixzd) {
        super(name, price, size);
        this.mixzd = mixzd;
    }

    public String getMixzd() {
        return mixzd;
    }

    public void setMixzd(String mixzd) {
        this.mixzd = mixzd;
    }

    @Override
    public String show() {
        return "价格：" + this.getPrice() + "\n大小：" + this.getSize() + "\n配料：" + this.getMixzd();
    }

}
