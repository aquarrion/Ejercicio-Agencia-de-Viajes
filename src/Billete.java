import java.util.Date;
import java.util.List;

public class Billete {
    //atributos
    int idBillete;
    Date fechaEmision;
    double precioTotal;
    Cliente clientes;
    Categoria categoria;
    List<Vuelo> vuelos;

    //constructor
    public Billete(){

    }
}
