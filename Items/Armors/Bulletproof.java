/**
 * Created by Delarosa on January 13, 2022; 
 */
package Items.Armors;

public class Bulletproof extends Armor {

    /**
     * BULLETPROOF ARMOR CONTRUCTOR...
     * @param ability Ability of the bulletproof armor... (if any)
     * @param rarity Worth for the bulletproof armor...
     * @param durability Health of the bulletproof armor... 
     * @param level Level of the bulletproof armor... 
     */
    protected Bulletproof(ArmorAbility ability, ItemRarity rarity, int durability, int level) {
        super(rarity, durability, level);
        this.ability = ability;
        this.type = ArmorType.BULLETPROOF;

    }

}
