package com.company;

import design.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck d=new MallardDuck();
        d.performFly();
        d.performQuack();
        d.setFlyBehavior(new FlyNoway());
        d.performFly();
    }
}
