import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GuardaGames {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<Game>();

        Game juego1 = new Game("The Witcher 3: Wild Hunt");
        juego1.setDescripcion("The Witcher 3 es un juego de rol de mundo abierto ambientado en un impresionante mundo de fantasía. Controlas a Geralt de Rivia, un cazador de monstruos conocido como un brujo, mientras navegas por un vasto continente lleno de misterio y peligro.");
        juego1.setVersion("1.2");
        juego1.addImagen("https://example.com/witcher3_screenshot1.jpg");
        juego1.addLenguaje("Español");

        Game juego2 = new Game("Red Dead Redemption 2");
        juego2.setDescripcion("Red Dead Redemption 2 es un épico juego de acción y aventuras ambientado en el salvaje oeste americano. Sigues la historia de Arthur Morgan, un forajido en una banda de forajidos, mientras luchan por sobrevivir en una era de cambios y modernización.");
        juego2.setVersion("1.1.1");
        juego2.addImagen("https://example.com/rdr2_screenshot1.jpg");
        juego2.addLenguaje("Inglés");

        games.add(juego1);
        games.add(juego2);

        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("src/main/resources/juegos.bin"))){
            for (Game game : games) {
                writer.writeObject(game);
            }
        }catch (IOException e){
            System.out.println(e.getMessage() + "No se han guardado los juegos.");

        }
    }
}
