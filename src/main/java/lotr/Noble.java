package lotr;

import java.util.Random;

public class Noble extends Character{
    public Noble(int hp, int power, Character whoKick) {
        super(hp, power);
        if (this.getHp() > 15 || this.getHp() < 5) {
            this.setHp(5);
        }
        if (this.getPower() > 15 || this.getPower() < 5) {
            this.setPower(5);
        }
    }
    public Noble(int hp_min, int hp_max, int power_min, int power_max){
        super((new Random().nextInt(hp_max - hp_min + 1) + hp_min), (new Random().nextInt(power_max - power_min + 1) + power_min));
    }

    @Override
    public void kick(Character whoKick) {
        int damage = new Random().nextInt(this.getPower());
        whoKick.setHp(Math.max(0, whoKick.getHp()- damage));
    }
}
