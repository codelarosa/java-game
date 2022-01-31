/**
 * Created by Delarosa on January 13, 2022; 
 */
package Entities.NPCs;

import Entities.Entity;
import Items.Weapons.Weapon;

public class NPC extends Entity {

    /**
     * NPC CONTRUCTOR...
     * @param weapon Weapon of the NPC...
     * @param health Health of the NPC...
     * @param armor Armor of the NPC...
     * @param level Level of the NPC...
     */
    protected NPC(Weapon weapon, int health, int armor, int level) {
        super(weapon, health, armor, level);
    }

}
