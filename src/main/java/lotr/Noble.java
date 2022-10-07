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
    public Noble(int[] hp, int[] power){
        super(new Random().nextInt(hp[1]) + hp[0], new Random().nextInt(power[1]) + power[0]);
    }

    @Override
    public void kick(Character whoKick) {
        int damage = new Random().nextInt(this.getPower());
        whoKick.setHp(Math.max(0, whoKick.getHp()- damage));
    }
}
