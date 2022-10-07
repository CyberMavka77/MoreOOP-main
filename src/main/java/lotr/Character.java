package lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Setter
    private int hp;
    @Getter @Setter
    private int power;
    public int getHp(){
        return Math.max(0, this.hp);
    }

    public abstract void kick(Character whoKick);
    public boolean isAlive(){
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + this.hp +
                ", power=" + this.power +
                '}';
    }
}
