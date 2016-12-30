package com.company;

import com.sun.media.sound.SoftShortMessage;
import design.*;
import factory.pizzafm.Pizza;
import factory.pizzafm.PizzaStore;
import factory.pizzafm.NYPizzaStore;
import factory.pizzafm.ChicagoPizzaStore;

import factory.abstractFactory.*;

import command.simpleremote.*;

import nestedclass.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	// write your code here
//        Duck d=new MallardDuck();
//        d.performFly();
//        d.performQuack();
//        d.setFlyBehavior(new FlyNoway());
//        d.performFly();




        //second chapter
//        WeatherData weatherData=new WeatherData();
//        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
//        weatherData.setMeasurements(80,65,30.4f);
//        weatherData.setMeasurements(82,70,29.2f);
//        weatherData.setMeasurements(78,90,29.2f);


        //decroator

//        Beverage beverage=new Espresso();
//        System.out.println(beverage.getDescription()+" $ "+beverage.cost());
//
//        Beverage beverage1=new DarkRoast();
//        beverage1=new Mocha(beverage1);
//        beverage1=new Mocha(beverage1);
//        beverage1=new Whip(beverage1);
//        System.out.println(beverage1.getDescription()+" $ "+beverage1.cost());
//
//        Beverage beverage2=new HouseBlend();
//        beverage2.setSize(Beverage.Size.MEDIUM);
//        beverage2=new Soy(beverage2);
//        beverage2=new Mocha(beverage2);
//        beverage2=new Whip(beverage2);
//        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());

        //factory

//        SimplePizzaFactory factory=new SimplePizzaFactory();
//        PizzaStore store=new PizzaStore(factory);
//
//        Pizza pizza=store.orderPizza("cheese");
//        System.out.println("We ordered a "+pizza.getName()+"\n");
//
//        pizza=store.orderPizza("veggie");
//        System.out.println("We ordered a "+pizza.getName()+"\n");
        //pizzafm


            //factory method
//        PizzaStore nyStore=new NYPizzaStore();
//        PizzaStore chicagoStore=new ChicagoPizzaStore();
//
//        Pizza pizza=nyStore.orderPizza("cheese");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza=chicagoStore.orderPizza("cheese");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza=nyStore.orderPizza("clam");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza=chicagoStore.orderPizza("clam");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza("pepperoni");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("pepperoni");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza("veggie");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("veggie");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");


        //abstract factory

//        AbstractFactory factoryBMW=new FactoryBMW320();
//        factoryBMW.createAircondition();
//        factoryBMW.createEngine();
//
//        factoryBMW=new FactoryBMW523();
//        factoryBMW.createAircondition();
//        factoryBMW.createEngine();


        // command pattern
//        SimpleRemoteControl remote=new SimpleRemoteControl();
//        Light light=new Light();
//        GarageDoor garageDoor=new GarageDoor();
//        remote.setSlot(new LightOnCommand(light));
//        remote.buttonWasPressed();
//        remote.setSlot(new GarageDoorOpenCommand(garageDoor));
//        remote.buttonWasPressed();
        List<Student>ll=new ArrayList<>();
        ll.add(new Student(100,"tap"));
        ll.add(new Student(200,"tao"));
        ll.add(new Student(10,"BUPT"));

        ll.sort((Student s1,Student s2)->s1.getScore()-s2.getScore());
        for(Student s:ll){
            System.out.println(s);
        }

        System.out.println("hello I have setted the git");
        //OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        //System.out.println(innerClass.getA());
        //System.out.println(innerClass.getB());
        //System.out.println(innerClass.getC());
        //System.out.println(innerClass.getD());
    }
}
