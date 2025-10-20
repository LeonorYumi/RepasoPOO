public class Artista {
    private String nombre;
    private String genero;
    private int seguidores;

    // Constructor con parametros
    public Artista(String nombre, String genero, int seguidores) {
        this.nombre = nombre;
        this.genero = genero;
        this.seguidores = seguidores;
    }
    // Constructor sin parametros
    public Artista() {
        nombre = "Bad Bunny";
        genero = "Reggaeton";
        seguidores = 49000000;
    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else {
            System.out.println("El nombre no puede estar vacio");
        }
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        if(genero == null || genero.isEmpty()) {
            System.out.println("El genero no puede estar vacio");
        }else  {
            this.genero = genero;
        }
    }
    public int getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(int seguidores) {
        if(seguidores >= 0) {
            this.seguidores = seguidores;
        }else  {
            System.out.println("Los seguidores no puede estar vacios");
        }
    }
    public void ganarSeguidores(int seguidores) {
        if(seguidores >= 0) {
            this.seguidores += seguidores;
        }else  {
            System.out.println("Los seguidores no pueden ser negativos");
        }
    }
    public void mostrarPerfil() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Genero: " + this.genero);
        System.out.println("Seguidores: " + this.seguidores);
    }
}