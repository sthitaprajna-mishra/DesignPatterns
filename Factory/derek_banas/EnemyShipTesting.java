package Factory.derek_banas;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        System.out.println("What type of ship? (U/R/B)");

        if(sc.hasNext()) {
            String typeOfShip = sc.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        doEnemyStuff(theEnemy);
    }

    public static void doEnemyStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
