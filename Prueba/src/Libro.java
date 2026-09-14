public class Libro {
    int id;
    int pag;
    String titulo;
    String autor;
    boolean prestado;
    int Id;

    public Libro(int id, int pag, String titulo, String autor, boolean prestado) {
        this.id = id;
        this.pag = pag;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }
     String mostrarDatos(){
         return "id"+id+"nombre"+titulo+"autor"+autor+"prestado"+prestado+"pagina"+pag;
     }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", pag=" + pag + ", titulo=" + titulo + ", autor=" + autor + ", prestado=" + prestado + ", Id=" + Id + '}';
    }
   
}
