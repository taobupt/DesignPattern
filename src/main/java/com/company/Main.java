package com.company;

//import com.sun.media.sound.SoftShortMessage;
//import design.*;
//import factory.pizzafm.Pizza;
//import factory.pizzafm.PizzaStore;
//import factory.pizzafm.NYPizzaStore;
//import factory.pizzafm.ChicagoPizzaStore;

//import factory.abstractFactory.*;

//import command.simpleremote.*;

//import nestedclass.*;

import java.util.*;

//import StatePattern.gumballState.GumballMachine;
//import adapter.simple.*;
//import adapter.simple.facade.*;
//import design.Quack;
//import templateMethod.abstractVersion.Coffee;
//import templateMethod.abstractVersion.Tea;


import adapter.simple.AdapterOperation;
import adapter.simple.ScoreOperation;
import compound.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;


public class Main {


    static void simulate() {
//        Quackable mallardDuck=new MallarDuck();
//        Quackable redheadDuck=new RedheadDuck();
//        Quackable duckcall=new DuckCall();
//        Quackable rubberDuck=new RubberDuck();
//
//        Quackable goose=new GooseAdapter(new Goose());

        Quackable mallardDuck = new QuackCounter(new MallarDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckcall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Goose Adapter");
        simualte(mallardDuck);
        simualte(redheadDuck);
        simualte(duckcall);
        simualte(rubberDuck);
        simualte(goose);

        System.out.println("The dcuks quacked " + QuackCounter.getQuacks() + " times");
    }

    static void simualte(Quackable duck) {
        duck.quack();
    }
    public static void main(String[] args) {


        ScoreOperation so=new AdapterOperation();
        int []nums={4,3,2,1};
        so.sort(nums);
        for(int x:nums)
            System.out.println(x);
        System.out.println(so.search(nums,2));

        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("config.xml"));
            NodeList nl=doc.getElementsByTagName("classname");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }




        //simulate();

















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

        //review for the java fundamental
//        List<Student>ll=new ArrayList<>();
//        ll.add(new Student(100,"tap"));
//        ll.add(new Student(200,"tao"));
//
//        ll.add(new Student(10,"BUPT"));
//        //lambda expression
//        ll.sort((Student s1,Student s2)->s1.getScore()-s2.getScore());
//
//        Iterator<Student>it=ll.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        for(Student s:ll){
//            System.out.println(s);
//        }
//        ll.forEach((tmp)->{
//            System.out.println(tmp);
//        });
//
//
//
//        System.out.println("hello I have setted the git");


        //OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        //System.out.println(innerClass.getA());
        //System.out.println(innerClass.getB());
        //System.out.println(innerClass.getC());
        //System.out.println(innerClass.getD());



        //adapter
//        MallardDuck duck=new MallardDuck();
//
//        WildTurkey turkey=new WildTurkey();
//
//        Duck turkeyAdapter=new TurkeyAdapter(turkey);
//        System.out.println("The turkey says...");
//        turkey.goggle();
//        turkey.fly();
//
//        System.out.println("\n the duck says");
//        testDuck(duck);
//        System.out.println("\n the turkeyadapter say....");
//        testDuck(turkeyAdapter);


        //facade pattern
//        AbstractEncryptFacade encryptFacade=new NewEncryptFacade();
//        encryptFacade.FileEncrypt("A:\\log.txt","A:\\encry.txt");

        //method pattern
//        Tea myTea=new Tea();
//        Coffee coffee=new Coffee();

//        System.out.println("\nMaking tea ...");
//        myTea.prepareRecipe();

//        System.out.println("\nMaking coffee");
//        coffee.prepareRecipe();
//        Menu pancakeHouseMenu = new PancakeHouseMenu();
//        Menu dinnerMenu = new DinnerMenu();
//        Menu cafeMenu = new CafeMenu();
//        ArrayList<Menu> it = new ArrayList<>();
//        it.add(pancakeHouseMenu);
//        it.add(dinnerMenu);
//        it.add(cafeMenu);
//        Waitress waitress = new Waitress(it);
//        waitress.printMenu();


        //state pattern
//        GumballMachine gumballMachine = new GumballMachine(10);
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
    }

//    static void testDuck(Duck duck){
//        duck.quack();
//        duck.fly();
//    }
}
