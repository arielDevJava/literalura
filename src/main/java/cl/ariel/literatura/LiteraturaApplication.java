package cl.ariel.literatura;
import cl.ariel.literatura.principal.Principal;
import cl.ariel.literatura.Interface.iAutorRepository;
import cl.ariel.literatura.Interface.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

    @Autowired
    private iLibroRepository libroRepository;
    @Autowired
    private iAutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraturaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Principal libreria = new Principal(libroRepository, autorRepository);
        libreria.consumo();

    }
}
