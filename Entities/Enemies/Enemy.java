/**
 * Created by Delarosa on January 11, 2022;
 */
package Entities.Enemies;

import Entities.Entity;
import Items.Weapons.Weapon;

public class Enemy extends Entity {

    protected Enemy(Weapon weapon, int health, int armor, int level) {
        super(weapon, health, armor, level);
    }


}
