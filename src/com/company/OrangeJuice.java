package com.company;

public class OrangeJuice {

    private int optTemp = 12;
    private int currTemp;

    public OrangeJuice(int curTemp) {
        this.currTemp = curTemp;
    }

    public int getOptTemp() {
        return optTemp;
    }

    public void setOptTemp(int optTemp) {
        this.optTemp = optTemp;
    }

    public int getCurrTemp() {
        return currTemp;
    }

    public void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }
}
