import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Lista de libros (acá van todos, los iniciales y los que se den de alta)
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro(1, 234, "tornado", "mili", true));
        lista.add(new Libro(2, 235, "elmas", "capito", false));
        lista.add(new Libro(3, 432, "micho", "talarga", true));
        lista.add(new Libro(4, 123, "elvio", "lador", false));

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu:");
        System.out.println("1. Crear un libro");
        System.out.println("2. Modificar los datos de un libro");
        System.out.println("3. Eliminar un libro");
        System.out.println("4. Mostrar la informacion de un libro");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    // Crear un libro
                    System.out.println("ingrese el id del libro");
                    int nuevoId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la cantidad de paginas");
                    int nuevoPag = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese el titulo");
                    String nuevoTitulo = sc.nextLine();
                    System.out.println("ingrese el autor");
                    String nuevoAutor = sc.nextLine();
                    System.out.println("esta prestado? (true/false)");
                    boolean nuevoPrestado = sc.nextBoolean();
                    sc.nextLine();

                    lista.add(new Libro(nuevoId, nuevoPag, nuevoTitulo, nuevoAutor, nuevoPrestado));
                    System.out.println("libro creado");
                    break;

                case 2:
                    // Modificar los datos de un libro
                    System.out.println("ingrese el id del libro a modificar");
                    int idMod = sc.nextInt();
                    sc.nextLine();

                    Libro libroMod = null;
                    for (Libro l : lista) {
                        if (l.id == idMod) {
                            libroMod = l;
                            break;
                        }
                    }

                    if (libroMod == null) {
                        System.out.println("libro no encontrado");
                    } else {
                        System.out.println("ingrese la nueva cantidad de paginas");
                        libroMod.pag = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ingrese el nuevo titulo");
                        libroMod.titulo = sc.nextLine();
                        System.out.println("ingrese el nuevo autor");
                        libroMod.autor = sc.nextLine();
                        System.out.println("esta prestado? (true/false)");
                        libroMod.prestado = sc.nextBoolean();
                        sc.nextLine();
                        System.out.println("libro modificado");
                    }
                    break;

                case 3:
                    // Eliminar un libro
                    System.out.println("ingrese el id del libro a eliminar");
                    int idElim = sc.nextInt();
                    sc.nextLine();

                    boolean eliminado = false;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).id == idElim) {
                            lista.remove(i);
                            eliminado = true;
                            break;
                        }
                    }

                    if (eliminado) {
                        System.out.println("libro eliminado");
                    } else {
                        System.out.println("libro no encontrado");
                    }
                    break;

                case 4:
                    // Mostrar la informacion de un libro
                    System.out.println("ingrese el id del libro");
                    int idMostrar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    for (Libro l : lista) {
                        if (l.id == idMostrar) {
                            System.out.println(l.mostrarDatos());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("libro no encontrado");
                    }
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
            }

            System.out.println("\nMenu:");
            System.out.println("1. Crear un libro");
            System.out.println("2. Modificar los datos de un libro");
            System.out.println("3. Eliminar un libro");
            System.out.println("4. Mostrar la informacion de un libro");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("chau");
        sc.close();
    }
}