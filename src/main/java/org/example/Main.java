package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet ");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verificar o nivel de agua");
            System.out.println("5 - Verificar o nivel de shampoo");
            System.out.println("6 - Verificar se tem pet na maquina");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }


        } while (option != 0);
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar Shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("Nivel de agua: " + amount);
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("Nivel de shampoo: " + amount);
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
    }

    public static void setPetInPetMachine() {
        var petName = "";
        while (petName == null || petName.isEmpty()) {
            System.out.println("Digite o nome do pet");
            petName = scanner.next();
        }
        var pet = new Pet(petName);
        petMachine.setPet(pet);

        System.out.println("O pet " + pet.getName() + "foi colocado na maquina");
    }
}


