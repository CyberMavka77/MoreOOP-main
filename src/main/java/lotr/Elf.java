package lotr;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character whoKick) {
        if (whoKick.getPower() < this.getPower()){
            whoKick.setHp(0);
        }
        else {
            whoKick.setHp(Math.max(0, whoKick.getHp() - 1));
        }
    }
}
