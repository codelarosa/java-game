/**
 * Created by Delarosa on January 12, 2022;
 */
package Items.Weapons;

import Items.Item;

public class Weapon extends Item {

    protected enum WeaponType {DEFAULT, SWORD, AXE, BOW};

    /**
     * VARIABLES...
     */
    protected Weapon defaultWeapon = new Fists(ItemRarity.COMMON, Integer.MAX_VALUE, 1, 1, 2);
    
    protected boolean isCritical;
    protected WeaponType type;
    protected int damageMin;
    protected int damageMax;
    
    /**
     * [WARNING] DO NOT USE! INSTEAD...
     * [WARNING] USE TYPE CONTRUCTORS... 
     * [WARNING] I.E. "SWORD" OR "AXE"... 
     * 
     * ITEM CONSTRUCTOR...
     * @param rarity Worth of the weapon...
     * @param durability Health of the weapon...
     * @param level Level of the weapon...
     * 
     * WEAPON CONTRUCTOR...
     * @param damageMin Minimum damage of the weapon...
     * @param damageMax Maximum damage of the weapon...
     */
    protected Weapon(ItemRarity rarity, int durability, int level, int damageMin, int damageMax) {
        super(rarity, durability, level);
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    /**
     * GETTERS...
     */
    public WeaponType getType() { return this.type; }

    public int getDamageMin() { return this.damageMin; }
    
    public int getDamageMax() { return this.damageMax; }

    public boolean getIsCritical() { return this.isCritical; }

    public Weapon getDefaultWeapon() { return this.defaultWeapon; }

    /**
     * SETTERS...
     */
    public void setDurability(int durability) { this.durability = durability; }

    public void setIsCritical(boolean isCritical) { this.isCritical = isCritical; }


}