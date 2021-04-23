import java.util.List;

public class Cliente {
    //atributos
    int idCliente;
    String nombre;
    String primerApellido;
    String segundoApellido;
    List<Cliente> clientes;

    //constructor por defecto
    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public Cliente(String primerApellido,String segundoApellido){
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
}
