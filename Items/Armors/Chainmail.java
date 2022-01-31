/**
 * Created by Delarosa on January 13, 2022; 
 */
package Items.Armors;

public class Chainmail extends Armor {
    
    /**
     * CHAINMAIL ARMOR CONTRUCTOR...
     * @param ability Ability of the chainmail armor... (if any)
     * @param rarity Worth for the chainmail armor...
     * @param durability Health of the chainmail armor... 
     * @param level Level of the chainmail armor... 
     */
    protected Chainmail(ArmorAbility ability, ItemRarity rarity, int durability, int level) {
        super(rarity, durability, level);
        this.ability = ability;
        this.type = ArmorType.CHAINMAIL;

    }
}
