/**
 * Created by Delarosa on January 11, 2022;
 */
package Entities;

import Items.Weapons.Weapon;

public class Player extends Entity {
    
    /**
     * VARIABLES...
     */
    private String name;
    private float exp;
    private int coins;

    /**
     * PLAYER CONSTRUCTOR...
     * @param weapon Weapon of the player...
     * @param name Name of the player... 
     * @param health Health of the player... 
     * @param level Level of the player... 
     * @param exp Experience of the player... 
     * ------------------------------------
     * @param coins Default value is    : 0
     */
    public Player(Weapon weapon, String name, int health, int armor, int level, float exp) {
        super(weapon, health, armor, level);
        this.isAlive = true;
        this.name = name;
        this.exp = exp;
        this.coins = 0;
        this.type = EntityType.PLAYER;
    }

    /**
     * ACCESSORS...
     */
    public float getExperience() { return this.exp; };

    public int getCoins() { return this.coins; };

    public String getName() { return this.name; }

    /**
     * FUNCTIONS...
     */


}
