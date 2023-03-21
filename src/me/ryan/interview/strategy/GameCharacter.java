package me.ryan.interview.strategy;

import me.ryan.interview.strategy.weapon.Weapon;

/**
 * packageName      : me.ryan.interview.strategy
 * fileName          : GameCharacter
 * author           : ryan
 * date             : 2023/03/21
 * description      :
 * =====================================================
 * DATE               AUTHOR                NOTE
 * -----------------------------------------------------
 * 2023/03/21          ryan       최초 생성
 */
public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {

    }
}
