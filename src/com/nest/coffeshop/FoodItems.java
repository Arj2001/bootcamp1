package com.nest.coffeshop;

public class FoodItems {

    Integer blackTea,blackCoffee,Tea,Coffee,Cake,Vada;

    public FoodItems(Integer blackTea, Integer blackCoffee, Integer tea, Integer coffee, Integer cake, Integer vada) {
        this.blackTea = blackTea;
        this.blackCoffee = blackCoffee;
        Tea = tea;
        Coffee = coffee;
        Cake = cake;
        Vada = vada;
    }

    public Integer getBlackTea() {
        return blackTea;
    }

    public void setBlackTea(Integer blackTea) {
        this.blackTea = blackTea;
    }

    public Integer getBlackCoffee() {
        return blackCoffee;
    }

    public void setBlackCoffee(Integer blackCoffee) {
        this.blackCoffee = blackCoffee;
    }

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getCake() {
        return Cake;
    }

    public void setCake(Integer cake) {
        Cake = cake;
    }

    public Integer getVada() {
        return Vada;
    }

    public void setVada(Integer vada) {
        Vada = vada;
    }
}

