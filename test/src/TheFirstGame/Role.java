package TheFirstGame;

import java.util.Scanner;

public  abstract class Role {
    String name;
    int hp=100;
    int mp=100;
    int attact_v;
    int defend_v;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttact_v() {
        return attact_v;
    }

    public void setAttact_v(int attact_v) {
        this.attact_v = attact_v;
    }

    public int getDefend_v() {
        return defend_v;
    }

    public void setDefend_v(int defend_v) {
        this.defend_v = defend_v;
    }



}
