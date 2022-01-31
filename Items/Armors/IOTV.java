/**
 * Created by Delarosa on January 13, 2022; 
 */
package Items.Armors;

public class IOTV extends Armor {
    
    /**
     * IOTV ARMOR CONTRUCTOR...
     * @param ability Ability of the IOTV armor... (if any)
     * @param rarity Worth for the IOTV armor...
     * @param durability Health of the IOTV armor... 
     * @param level Level of the IOTV armor... 
     */
    protected IOTV(ArmorAbility ability, ItemRarity rarity, int durability, int level) {
        super(rarity, durability, level);
        this.ability = ability;
        this.type = ArmorType.IOTV;

    }
}
