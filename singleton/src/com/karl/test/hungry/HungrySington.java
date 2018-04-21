package com.karl.test.hungry;

public class HungrySington {

    private HungrySington(){}

    private final static HungrySington hungrySington = new HungrySington();

    public final static HungrySington newInstance(){
        return hungrySington;
    }

}
