/**
 * Created by Delarosa on January 13, 2022; 
 */
package Items.Armors;

import Items.Item;

public class Armor extends Item {

    protected enum ArmorAbility { CAMOFLAUGE, DEFLECTION } 
    protected enum ArmorType { CHAINMAIL, IOTV, BULLETPROOF } 

    ArmorAbility ability;
    ArmorType type;

    protected Armor(ItemRarity rarity, int durability, int level) {
        super(rarity, durability, level);
    }

    public ArmorAbility getAbility() { return ability; }

    public ArmorType getType() { return type; }

}
