/**
 * Created by Delarosa on January 11, 2022;
 */
package Entities.Enemies;

import Items.Weapons.Weapon;

public class Skeleton extends Enemy {
    
    /**
     * SKELETON CONTRUCTOR...
     * @param weapon Weapon of the skeleton...
     * @param health Health of the skeleton...
     * @param armor Armor of the skeleton...
     * @param level Level of the skeleton...
     */
    public Skeleton(Weapon weapon, int health, int armor, int level) {
        super(weapon, health, armor, level);
        this.type = EntityType.SKELETON;
    }
}
