import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi"));
        animais.add(new Vaca("Mimosa"));

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}