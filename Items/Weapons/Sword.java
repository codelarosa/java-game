
/**
 * Created by Delarosa on January 12, 2022;
 */
package Items.Weapons;

public class Sword extends Weapon {

    /**
     * SWORD CONTRUCTOR...
     * @param rarity Worth of the sword...
     * @param durability Health of the sword...
     * @param level Level of the sword...
     * @param damageMin Minimum damage of the sword...
     * @param damageMax Maximum damage of the sword...
     */
    public Sword(ItemRarity rarity, int durability, int level, int damageMin, int damageMax) {
        super(rarity, durability, level, damageMin, damageMax);
        this.type = WeaponType.SWORD;
    }


}
