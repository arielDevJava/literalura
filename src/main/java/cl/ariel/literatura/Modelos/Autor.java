package cl.ariel.literatura.Modelos;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer cumpleanios;
    private Integer fechaFallecimiento;


    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)



    private List<Libro> libros;
    public Autor() {
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public Integer getCumpleanios() {
        return cumpleanios;
    }
    public Integer getFechaFallecimiento() {
        return fechaFallecimiento;
    }
    public List<Libro> getLibros() {
        return libros;
    }

    public void getLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Autor(cl.ariel.literatura.Records.Autor autor) {
        this.nombre = autor.nombre();
        this.cumpleanios = autor.cumpleanios();
        this.fechaFallecimiento = autor.fechaFallecimiento();
        this.libros = getLibros();

    }

    @Override
    public String toString() {
       return
                "\n***********************  AUTOR  ***********************" +

                        "\nNOMBRE = '" + nombre + '\'' +
                        "\nFECHA DE NACIMIENTO = " + cumpleanios +
                        "\nFECHA DE FALLECIDO =" + fechaFallecimiento +
                        "\nLIBROS =" + libros;


    }
}
