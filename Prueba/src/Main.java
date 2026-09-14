
import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

public class Main {

    private static String soy_gay;

    public static void main(String[] args) {
        Libro l1 = new Libro(1, 234, "tornado", "mili", true);
        Libro l2 = new Libro(2, 235, "elmas", "capito", false);
        Libro l3 = new Libro(3, 432, "micho", "talarga", true);
        Libro l4 = new Libro(4, 123, "elvio", "lador", false);

        Scanner sc = new Scanner(System.in);
        int opcion, Id;
        System.out.println("opciones: ");
        opcion = sc.nextInt();
        sc.nextLine();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    System.out.println(l1.mostrarDatos());
                    System.out.println(l2.mostrarDatos());
                    System.out.println(l3.mostrarDatos());
                    System.out.println(l4.mostrarDatos());

                    break;
                case 2:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == l1.Id) {
                        System.out.println(l1.toString());
                    } else if (Id == l2.Id) {
                        System.out.println(l2.toString());
                    } else if (Id == l3.Id) {
                        System.out.println(l3.toString());
                    } else {
                        System.out.println(l4.toString());
                    }

                    break;
                case 3:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == l1.Id) {
                        if (l1.prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else if (Id == l2.Id) {
                        if (l2.prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else if (Id == l3.Id) {
                        if (l3.prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else {
                        if (l4.prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    }

                    break;
                case 4:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == l1.Id) {
                        if (l1.prestado) {
                            l1.prestado = false;
                        } else {
                            l1.prestado = true;
                        }
                    } else if (Id == l2.Id) {
                        if (l2.prestado) {
                            l2.prestado = false;
                        } else {
                            l2.prestado = true;
                        }
                    } else if (Id == l3.Id) {
                        if (l3.prestado) {
                            l3.prestado = false;
                        } else {
                            l3.prestado = true;
                        }
                    } else {
                        if (l4.prestado) {
                            l4.prestado = false;
                        } else {
                            l4.prestado = true;
                        }
                    }

                    break;
                case 5:
                    int Id2;
                    System.out.println("ingrese dos libros");
                    Id = sc.nextInt();
                    sc.nextLine();
                    Id2 = sc.nextInt();
                    sc.nextLine();
                    if (Id == l1.Id && Id2 == l2.Id) {
                        if (l1.pag > l2.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == l1.Id && Id2 == l3.Id) {
                        if (l1.pag > l3.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == l1.Id && Id2 == l4.Id) {
                        if (l1.pag > l4.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == l2.Id && Id2 == l3.Id) {
                        if (l2.pag > l3.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == l2.Id && Id2 == l4.Id) {
                        if (l2.pag > l4.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == l3.Id && Id2 == l4.Id) {
                        if (l3.pag > l4.pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    }
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
            System.out.println("opciones");
            opcion = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("chau");
        
        System.out.println("escribi soy gay");
        soy_gay = sc.nextLine();
        if (soy_gay == "soy gay"){
            System.out.println("mentiroso");
        } else {
            System.out.println("AJSajsjjajsjajjasjj gay de mrd");
        }
    }
}
