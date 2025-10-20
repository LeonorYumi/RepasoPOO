public class Cancion {
    private String titulo;
    private double duracion;
    private int reproducciones;
    // Constructor con parametros
    Cancion(String titulo, double duracion, int reproducciones) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }
    // Constructor sin parametros
    public Cancion() {
        titulo = "";
        duracion = 0;
        reproducciones = 0;
    }

    // getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null) {
            System.out.println("El titulo no puede ser nulo");
        }else  {
            this.titulo = titulo;
        }
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        if (duracion < 0) {
            System.out.println("La duracion no puede ser negativo");
        }else   {
            this.duracion = duracion;
        }
    }
    public int getReproducciones() {
        return reproducciones;
    }
    public void setReproducciones(int reproducciones) {
        if (reproducciones < 0) {
            System.out.println("Reproduccion no puede ser negativo");
        }else   {
            this.reproducciones = reproducciones;
        }
    }

    public void Reproducir(){
        if (reproducciones != 0){
            this.reproducciones += 1;
        }else {
            System.out.println("Reproduccion no puede ser negativo");
        }
    }

}