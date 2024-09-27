import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonConverter {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<Game>();

        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("src/main/resources/juegos.bin"))){
            while(true){
                Object o = reader.readObject();
                if(o instanceof Game){
                    games.add((Game)o);
                }
            }
        }catch (EOFException e){
            System.out.println("Hemos llegado al final del archivo.");
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }catch (ClassNotFoundException e){
            System.out.println("No se encuentra el archivo.");
        }

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";

        try {
             mapper.writeValue(new File("src/main/resources/juegos.json"),games);
        }
        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            System.out.println("Error en la escritura del archivo.");
        }
    }

}
