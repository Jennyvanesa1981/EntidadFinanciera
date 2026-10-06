import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<ObjCredito> solicitudes = new LinkedList<>();

        Metodos metodos = new Metodos();

        int opcion;

        do {

            System.out.println("\n=== ENTIDAD FINANCIERA ===");
            System.out.println("1. Registrar solicitud");
            System.out.println("2. Consultar solicitudes");
            System.out.println("3. Modificar solicitud");
            System.out.println("4. Iniciar asesoria");
            System.out.println("5. Finalizar asesoria");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1:

                    metodos.RegistrarSolicitud(solicitudes, sc);

                    break;

                case 2:

                    metodos.MostrarSolicitudes(solicitudes);

                    break;

                case 3:

                    System.out.print("Ingrese el ID de la solicitud: ");
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    metodos.ModificarSolicitud(solicitudes, idModificar, sc);

                    break;

                case 4:

                    System.out.print("Ingrese el ID de la solicitud: ");
                    int idIniciar = sc.nextInt();
                    sc.nextLine();

                    metodos.IniciarAsesoria(solicitudes, idIniciar);

                    break;

                case 5:

                    System.out.print("Ingrese el ID de la solicitud: ");
                    int idFinalizar = sc.nextInt();
                    sc.nextLine();

                    metodos.FinalizarAsesoria(solicitudes, idFinalizar);

                    break;

                case 6:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while(opcion != 6);

        sc.close();
    }
}