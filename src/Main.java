import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        Artista artista1 = new Artista("Karol G", "Reggeateon", 71000000);
        Artista artista2 = new Artista();
        Cancion cancion1 = new Cancion();

        // MENU
        do {
            System.out.println("\n========== MENÚ ===========");
            System.out.println("1. Registrar artista ");
            System.out.println("2. Registrar canción ");
            System.out.println("3. Aumentar seguidores artista");
            System.out.println("4. Reproducir canción ");
            System.out.println("5. Mostrar información");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch(opcion) {
                case 1:
                    System.out.print("Nombre artista 2: ");
                    artista2.setNombre(sc.nextLine());
                    System.out.print("Género artista 2: ");
                    artista2.setGenero(sc.nextLine());
                    System.out.print("Seguidores artista 2: ");
                    artista2.setSeguidores(sc.nextInt());
                    sc.nextLine();
                    break;

                case 2:
                    System.out.print("Título canción 1: ");
                    cancion1.setTitulo(sc.nextLine());
                    System.out.print("Duración canción 1: ");
                    cancion1.setDuracion(sc.nextDouble());
                    sc.nextLine();
                    break;

                case 3:
                    System.out.print("Cantidad de seguidores a aumentar: ");
                    artista2.ganarSeguidores(sc.nextInt());
                    sc.nextLine();
                    break;

                case 4:
                    cancion1.Reproducir();
                    System.out.println("Canción reproducida. Total reproducciones: " + cancion1.getReproducciones());
                    break;

                case 5:
                    System.out.println("\n=== Artista 1 ====");
                    System.out.println("Nombre: " + artista1.getNombre());
                    System.out.println("Género: " + artista1.getGenero());
                    System.out.println("Seguidores: " + artista1.getSeguidores());

                    System.out.println("\n=== Artista 2 ===");
                    System.out.println("Nombre: " + artista2.getNombre());
                    System.out.println("Género: " + artista2.getGenero());
                    System.out.println("Seguidores: " + artista2.getSeguidores());

                    System.out.println("\n=== Canción 1 ===");
                    System.out.println("Título: " + cancion1.getTitulo());
                    System.out.println("Duración: " + cancion1.getDuracion());
                    System.out.println("Reproducciones: " + cancion1.getReproducciones());
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while(opcion != 6);
        sc.close();
    }
}