/**
 * Created by Delarosa on January 12, 2022;
 */
package Items;

public class Item {
    
    public enum ItemRarity {COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, MYTHIC};

    /**
     * VARIABLES...
     */
    protected boolean isBroken;
    protected int durability;

    protected ItemRarity rarity;
    protected int level;

    /**
     * [WARNING] DO NOT USE! INSTEAD...
     * [WARNING] USE TYPE CONTRUCTORS... 
     * [WARNING] I.E. "SWORD" OR "AXE"... 
     * 
     * ITEM CONSTRUCTOR...
     * @param rarity Worth of the item...
     * @param durability Health of the item...
     * @param level Level of the item...
     */
    protected Item(ItemRarity rarity, int durability, int level) {
        this.rarity = rarity;
        this.durability = durability;
        this.level = level;
    }
    
    /**
     * ACCESSORS...
     */
    public boolean isBroken() {
        if (this.durability <= 0) { return true; }
        else { return false; }
    }

    public int getDurability() {
        return this.durability;
    }

    public ItemRarity getRarity() {
        return this.rarity;
    }

    public int getLevel() {
        return this.level;
    }

    /**
     * FUNCTIONS...
     */
    

}
