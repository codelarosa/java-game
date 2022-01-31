/**
 * Created by Delarosa on January 5, 2022;
 */
import Entities.Player;
import Items.Item.ItemRarity;
import Items.Weapons.*;

public class Engine {

    public static boolean debug;

    public void start() {

        System.out.println("RUNNING IN TERMINAL");

        Sword sword = new Sword(ItemRarity.COMMON, 100, 1, 0, 100);
        Player player = new Player(sword, "Delarosa", 100, 100, 0, 0);

        System.out.println("PLAYER CREATED!");
        System.out.println("PLAYER'S HEALTH BEFORE: " + player.getHealth());
        System.out.println("PLAYER'S ARMOR BEFORE: " + player.getArmor());

        player.attack(player);

        System.out.println("PLAYER'S HEALTH AFTER: " + player.getHealth());
        System.out.println("PLAYER'S ARMOR AFTER: " + player.getArmor());

        if (!player.isAlive()) {
            System.out.println("GAME OVER!");
        }

    }

}
