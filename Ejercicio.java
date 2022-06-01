public class Ejercicio {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.Edad = 50;
        cliente.Nombre = "Luciano";
        cliente.Telefono = 123456789;
        cliente.Credito = 95000;

        System.out.println("Mi nombre es " + cliente.Nombre);
        System.out.println("Tengo " + cliente.Edad + " años");
        System.out.println("Mi numero de telefono es " + cliente.Telefono);
        System.out.println("La cantidad de mi credito es " + cliente.Credito + " dolares");

        Trabajador trabajdor = new Trabajador();
        trabajdor.Salario = 9000;

        System.out.println("Mi salario es de " + trabajdor.Salario + " dolares mensual");

    }
}

class Persona {
    int Edad;
    String Nombre;
    int Telefono;

}

class Cliente extends Persona {
    int Credito;
    
}

class Trabajador extends Persona {
    int Salario;
}