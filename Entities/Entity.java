/**
 * Created by Delarosa on January 11, 2022;
 */
package Entities;

import java.util.concurrent.ThreadLocalRandom;

import Items.Weapons.Weapon;

public class Entity {

    protected enum EntityType {
        PLAYER, 
        HEALER, ATTACKER,
        ZOMBIE, SKELETON
    }

    /**
     * VARIABLES...
     */
    protected boolean isAlive;

    protected Weapon weapon;
    protected int health;
    protected int armor;
    protected int level; 

    protected EntityType type;

    protected Entity(Weapon weapon, int health, int armor, int level) {
        this.weapon = weapon;
        this.health = health;
        this.armor = armor;
        this.level = level;
    }
    
    /**
     * ACCESSORS...
     */
    public boolean isAlive() { return this.isAlive; }

    public EntityType getType() { return this.type; }

    public int getHealth() { return this.health; }
    
    public int getArmor() { return this.armor; }

    public boolean hasArmor() {
        if (this.armor > 0) { return true; }
        else { return false; }
    }
    
    public int getLevel() { return this.level; }

    public Weapon getWeapon() { return this.weapon; }

    public void changeWeapon(Weapon weapon) { this.weapon = weapon; }

    /**
     * FUNCTIONS...
     */
    protected void updateIsAlive(Entity entity) {
        if (entity.health > 0) { entity.isAlive = true; }
        if (entity.health <= 0) { entity.isAlive = false; }
    }

    protected int calcHit() {
        int damage = ThreadLocalRandom.current().nextInt(this.weapon.getDamageMin(), this.weapon.getDamageMax() + 1);
        int critMin = (this.weapon.getDamageMax() / 2) + 36;
        
        if (damage >= critMin) {
            this.weapon.setIsCritical(true);
        }

        return damage;
    }

    /**
     * ATTACKS AN ENTITY...
     * @param entity Entity to attack...
     * @return Either a hit or miss.. [TRUE] or [FALSE]
     */
    public void attack(Entity entity) {

        int damage = calcHit();

        if (this.weapon.getIsCritical()) {
            System.out.println("CRITICAL HIT!");
            System.out.println("CRITICAL HIT!");
            System.out.println("CRITICAL HIT!");
            System.out.println("CRITICAL HIT!");
            System.out.println("CRITICAL HIT!");
        }

        // IF DAMAGE IS MORE THAN HEALTH
        if (entity.health <= damage) {
            entity.health = 0;
            updateIsAlive(entity);
            // check for level up
        }
        
        // IF DAMAGE IS LESS THAN HEALTH
        if (entity.health > damage) {

            if (!entity.hasArmor()) {
                entity.health -= damage;

                System.out.println("HIT FOR : " + damage + " DAMAGE");
            }

            if (entity.hasArmor()) {

                entity.armor -= damage * 3;
                if (entity.armor < 0) { entity.armor = 0; }

                entity.health -= damage / 2;

                this.weapon.setDurability(this.weapon.getDurability() - 5);

                System.out.println("HIT FOR : " + damage + " DAMAGE");
            }            
        }
        
        this.weapon.setIsCritical(false);
    }
}
