import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LeerJsonGame {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            List<Game> juegos = mapper.readValue(new File("src/main/resources/juegos.json"),mapper.getTypeFactory().constructCollectionType(List.class, Game.class));
            for (Game game : juegos){
                System.out.println(game.getNombre() + "\n" + game.getDescripcion());
            }

        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

    }
}
