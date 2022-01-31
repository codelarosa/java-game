
/**
 * Created by Delarosa on January 13, 2022; 
 */
package Entities.NPCs;

import Items.Weapons.Weapon;

public class Attacker extends NPC {
 
    /**
     * ATTACKER CONTRUCTOR...
     * @param weapon Weapon of the attacker...
     * @param health Health of the attacker...
     * @param armor Armor of the attacker...
     * @param level Level of the attacker...
     */
    protected Attacker(Weapon weapon, int health, int armor, int level) {
        super(weapon, health, armor, level);
        this.type = EntityType.ATTACKER;
    }

}
