package org.example;

public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeShower() {
        if (this.pet == null) {
            System.out.println("Sem pet para comecar o banho ");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        ;
        pet.setClean(true);
        System.out.println(pet.getName() + " esta limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade maxima de agua atingida");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade maxima de shampoo atingida");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A maquina esta suja, limpe antes de colocar um pet");
            return;
        }
        if (hasPet()) {
            System.out.println("Ja existe um pet na maquina");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println(this.pet.getName() + " foi retirado da maquina limpo");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Maquina limpa");

    }


}