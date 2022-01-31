/**
 * Created by Delarosa on January 13, 2022; 
 */
package Entities.NPCs;

import Items.Weapons.Weapon;

public class Healer extends NPC {

    /**
     * HEALER CONTRUCTOR...
     * @param weapon Weapon of the healer...
     * @param health Health of the healer...
     * @param armor Armor of the healer...
     * @param level Level of the healer...
     */
    protected Healer(Weapon weapon, int health, int armor, int level) {
        super(weapon, health, armor, level);

        if (weapon != weapon.getDefaultWeapon()) {
            this.weapon = weapon.getDefaultWeapon();
        }
        
        this.type = EntityType.HEALER;
    }
    
}
