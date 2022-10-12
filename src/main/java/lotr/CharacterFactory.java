package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    @SneakyThrows
    static Character createCharacter(){
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(Noble.class);
        int choice = new Random().nextInt(subTypes.size());
        return (Character) subTypes.toArray(new Class[0])[choice].getDeclaredConstructor().newInstance();

    }

    public static void main(String[] args) {
        lotr.Character ch = CharacterFactory.createCharacter();
        System.out.println(ch);
    }
}
