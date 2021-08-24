package com.icss.day11;

public class Cook extends Person {
    private int cid;

    public Cook(){

    }

    public Cook(int cid) {
        this.cid = cid;
    }

    public Cook(String name, int cid) {
        super(name);
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String cook(){
        return "厨师炒菜";
    }

    @Override
    public String toString() {
        return "Cook{" +
                "cid=" + cid +
                '}';
    }
}
