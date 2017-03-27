package com.company;

import java.util.Objects;

/**
 * Created by Tao on 12/30/2016.
 */
public class Student{
    private int score;
    private String name;
    public Student(int score,String name){
        this.score=score;
        this.name=name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int compareTo(Student b){
//        if(b.getScore()==this.score)
//            return 0;
//        else if(b.getScore()>this.score)
//            return -1;
//        else
//            return 1;
//    }

    public String toString(){
        return "name is "+name+" score: "+score;
    }
}
