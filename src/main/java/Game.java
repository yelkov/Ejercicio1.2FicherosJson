import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String version = "";
    private String descripcion = "";
    private List<String> lenguajes = new ArrayList<String>();
    private List<String> imagenes = new ArrayList<String>();
    private Map<String,String> comentarios = new HashMap<String,String>();

    public Game(){}
    public Game(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<String> getLenguajes() {
        return lenguajes;
    }
    public void addLenguaje(String lenguaje) {
        lenguajes.add(lenguaje);
    }
    public List<String> getImagenes() {
        return imagenes;
    }
    public void addImagen(String imagen) {
        imagenes.add(imagen);
    }
    public Map<String, String> getComentarios() {
        return comentarios;
    }
    public void addComentario(String usuario, String contenido) {
        comentarios.put(usuario, contenido);
    }
}
