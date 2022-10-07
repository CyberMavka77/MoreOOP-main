package lotr;

public class GameManager {
    void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()){
            System.out.println(c1.toString() + "is fighting with" + c2.toString());
            c1.kick(c2);
            System.out.println(c1.toString() + "just hit" + c2.toString());
            System.out.println("current" + c1.toString() + "hp" + c1.getHp());
            c2.kick(c1);
            System.out.println(c2.toString() + "just hit" + c1.toString());
            System.out.println("current" + c2.toString() + "hp" + c2.getHp());
            if (c1 instanceof Hobbit && c2 instanceof Hobbit){
                System.out.println("come on, they are just crying");
                break;
            }
        }
    }
}
