package Inheritance;

import java.util.Scanner;
class Player1 {

    public String name;
    public int health;
    public String weapon;

    public Player1(String name,int health,String weapon){
        this.name=name;
        this.health=health;
        this.weapon=weapon;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void hitGun1(){
        if(this.health>0){
            this.health-=40;
        }
    }

    public void hitGun2(){
        if(this.health>0){
            this.health-=30;

        }

    }
}


class Player2 extends Player1 {
    public boolean armor;
    public boolean isArmor() {
        return armor;
    }

    public Player2(String name, int health, String weapon, boolean armor){
        super(name,health,weapon);
        this.name=name;
        this.health=health;
        this.weapon=weapon;
        this.armor=armor;
    }

    public void hitGun1(){
        if(isArmor()){
            if(this.health>0){
                this.health-=30;
            }
        }else{
            if(this.health>0){
                this.health-=40;
            }
        }
    }

    public void hitGun2(){
        if(isArmor()){
            if(this.health>=0){
                this.health-=20;
            }
        }else{
            if(this.health>=0){
                this.health-=30;
            }
        }
    }
}
public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player1 player1 = new Player1("Sumit", 100, "air gun");
        Player2 player2 = new Player2("Amit", 100, "blowgun", true);
        Player2 player3 =new Player2("Niraj",100,"ak47",false);

        System.out.println(player1.getName() + " has " + player1.getWeapon() + " & " + player2.getName() + " has " + player2.getWeapon());
        System.out.println("======================================");


        while (true) {
            System.out.println("Select a player: ");
            System.out.println("1: " + player1.getName());
            System.out.println("2: " + player2.getName());
            System.out.println("3: " + player3.getName());
            System.out.println("Q: Quit");

            char input = sc.next().charAt(0);
            System.out.println("======================================");
            if (input == '1') {
                playGame(sc, player1);
            } else if (input == '2') {
                playGame(sc, player2);
            } else if (input == 'q' || input == 'Q') {
                System.out.println("Quitting the game.");
                System.out.println("======================================");
                break;
            }else if(input =='3') {
            	playGame(sc, player3);
            }
            
            else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        sc.close();
    }

    public static void playGame(Scanner sc, Player1 player) {
    	
        while (player.getHealth() > 0) {
            System.out.println("Select a weapon: ");
            System.out.println("1: Gun-1");
            System.out.println("2: Gun-2");
            System.out.println("Q: Quit");

            char input = sc.next().charAt(0);
            System.out.println("--------------------------------------------------");
            if (input == '1') {
                System.out.println("Press 'Y' to hit with " + player.getWeapon() + " or 'N' to quit.");
                while (true) {
                    char hit = sc.next().charAt(0);
                    if (hit == 'y' || hit == 'Y') {
                        if (player.getHealth() <= 0) {
                            System.out.println("Game over, " + player.getName() + " is dead!");
                            return;
                        }
                        player.hitGun1();
                        System.out.println(player.getName() + " health is now " + (Math.max(player.health, 0)));
                        break;
                    } else if (hit == 'n' || hit == 'N') {
                        System.out.println("Exiting the game...");
                        System.out.println("======================================");
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            } else if (input == '2') {
                System.out.println("Press 'Y' to hit with " + player.getWeapon() + " or 'N' to quit.");
                while (true) {
                    char hit = sc.next().charAt(0);
                    if (hit == 'y' || hit == 'Y') {
                        if (player.getHealth() <= 0) {
                            System.out.println("Game over, " + player.getName() + " is dead!");
                            return;
                        }
                        player.hitGun2();
                        System.out.println(player.getName() + " health is now " + Math.max(player.getHealth(),0));
                        System.out.println("--------------------------------------------------");
                        break;
                    } else if (hit == 'n' || hit == 'N') {
                        System.out.println("Exiting the game...");
                        System.out.println("======================================");
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            } else if (input == 'q' || input == 'Q') {
                System.out.println("Exiting the game...");
                System.out.println("======================================");
                return;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        System.out.println("Game over, " + player.getName() + " is dead!");
        System.out.println("======================================");
    }

}