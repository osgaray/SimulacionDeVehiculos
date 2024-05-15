import java.util.Scanner;

public class App {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // marca, placa(string), capacidad de tanque de combustible(galones), 
        // nivel del combustible(galones) y rendimiento del combustible (km/galones)
        System.out.println("Hello, World!");
        // double combustibleNcesario = distancia/rendimiento;

        // caracteristicas del vehiculo 1
        String[] vehiculo = {"Toyota","1001","40","30","20"};

        // caracteristicas del vehiculo 2
        String[] vehiculo2 = {"Hyundai","1020","35","23","15"};
    

        // selecionar vehiculo
        System.out.println("Selecciona el vehiculo que quieres utilizar: ");
        System.out.println("1. Marca: "+vehiculo[0]+" \tPlaca: "+vehiculo[1]+" \t Capacidad de tanque: "+vehiculo[2]+" galones");
        System.out.println("Nivel de combustible: "+vehiculo[3]+" galones"+"\tRedimiento del combustible: "+vehiculo[4]+" km por galones\n");
        System.out.println("2. Marca: "+vehiculo2[0]+" \tPlaca: "+vehiculo2[1]+" \t Capacidad de tanque: "+vehiculo2[2]+" galones");
        System.out.println("Nivel de combustible: "+vehiculo2[3]+" galones"+"\tRedimiento del combustible: "+vehiculo2[4]+" km por galones");
        
        // verificar que el vehiculo seleccionado es correcto
        try {
            int vehiculoselect = input.nextInt();
            input.nextLine();
            switch (vehiculoselect) {
                // vehiculo 1
                case 1:
                    System.out.println("Que acción deseas realizar: ");
                    System.out.println("1. Conducir el vehiculo");
                    System.out.println("2. Reabastecer el combustible");
                    System.out.println("3. Ver si el vehiculo puede conducir");
                    int opcion = input.nextInt();
                    input.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("Has selecionado la opcion para Conducir");
                            System.out.println("Cuanta distancia deseas conducir: ");
                            int distancia = input.nextInt();
                            input.nextLine();
                            Conducir(vehiculo, distancia);
                            break;
                        case 2:
                            System.out.println("Has selecionado la opcion Reabastecer");
                            System.out.println("Cuantos combustible deseas reabastecer: ");
                            int cantidad = input.nextInt();
                            input.nextLine();
                            reabastecerCombustible(vehiculo, cantidad);
                            break;
                        case 3:
                            System.out.println("Has selecionado la opcion Puede Conducir");
                            System.out.println("Cuanta distancia deseas conducir: ");
                            int distancia2 = input.nextInt();
                            input.nextLine();
                            puedeConducir(vehiculo, distancia2);
                            break;
                        default:
                            System.out.println("Accion no valida");
                            break;
                    }
                    break;
                // vehiculo 2
                case 2:
                System.out.println("Que acción deseas realizar: ");
                System.out.println("1. Conducir el vehiculo");
                System.out.println("2. Reabastecer el combustible");
                System.out.println("3. Ver si el vehiculo puede conducir");
                int opcion2 = input.nextInt();
                input.nextLine();
                switch (opcion2) {
                    case 1:
                        System.out.println("Has selecionado la opcion para Conducir");
                        System.out.println("Cuanta distancia deseas conducir: ");
                        int distancia = input.nextInt();
                        input.nextLine();
                        Conducir(vehiculo2, distancia);
                        break;
                    case 2:
                        System.out.println("Has selecionado la opcion Reabastecer");
                        System.out.println("Cuantos combustible deseas reabastecer: ");
                        int cantidad = input.nextInt();
                        input.nextLine();
                        reabastecerCombustible(vehiculo2, cantidad);
                        break;
                    case 3:
                        System.out.println("Has selecionado la opcion Puede Conducir");
                        System.out.println("Cuanta distancia deseas conducir: ");
                        int distancia2 = input.nextInt();
                        input.nextLine();
                        puedeConducir(vehiculo2, distancia2);
                        break;
                    default:
                        System.out.println("Accion no valida");
                        break;
                }
                default:
                    break;
            }
    
        } catch (Exception e) {
            System.out.println("Opcion incorrecta");
        }

        
        
    }
    // conducir
    public static void Conducir(String[] vehiculo, int distancia){
        int nivelcombustible = Integer.parseInt(vehiculo[3]);
        int redimientocombustible = Integer.parseInt(vehiculo[4]);
        double combustibleNcesario = distancia/redimientocombustible;
        if (combustibleNcesario <= nivelcombustible) {
            System.out.println("Has conducido...");
            System.out.println("Tu nivel de combustible es: "+(nivelcombustible-combustibleNcesario));
        } else{
            System.out.println("No tienes combustible suficiente");
        }
    }
    // reabastecer
    public static void reabastecerCombustible(String[] vehiculo,int cantidad){
        int nivelcombustible = Integer.parseInt(vehiculo[3]);
        int capacidadtanque = Integer.parseInt(vehiculo[2]);
        if (cantidad > (capacidadtanque-nivelcombustible) && cantidad>=0) {
            System.out.println("No se puede reabastecer más");
        }else{
            nivelcombustible+= cantidad;
            System.out.println("Tu nivel de combustible es "+nivelcombustible);
        }
    }

    // puedeconducir
    public static void puedeConducir(String[] vehiculo, int distancia){
        int redimientocombustible = Integer.parseInt(vehiculo[4]);
        double combustibleNcesario = distancia/redimientocombustible;
        int nivelcombustible = Integer.parseInt(vehiculo[3]);
        if (combustibleNcesario<=nivelcombustible) {
            System.out.println("Si puedes conducir");
        } else {
            System.out.println("No puedes conducir");
        }
    }
}