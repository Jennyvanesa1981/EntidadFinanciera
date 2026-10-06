import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    public ObjCredito RegistrarSolicitud(Queue<ObjCredito> solicitudes, Scanner sc) {

        System.out.println("Ingrese el ID de solicitud:");
        int idSolicitud = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = sc.nextLine();

        System.out.println("Ingrese el documento:");
        String documento = sc.nextLine();

        System.out.println("Ingrese el tipo de crédito:");
        String tipoCredito = sc.nextLine();

        System.out.println("Ingrese el valor solicitado:");
        String valorSolicitado = sc.nextLine();

        ObjCredito credito = new ObjCredito(
                idSolicitud, nombreCliente, documento,
                tipoCredito, valorSolicitado, "Pendiente"
        );

        solicitudes.offer(credito);

        System.out.println("Solicitud registrada exitosamente.");

        return credito;
    }


    public void MostrarSolicitudes(Queue<ObjCredito> solicitudes) {

        for(ObjCredito credito : solicitudes) {

            System.out.println("ID Solicitud: " + credito.getIdsolicitud());
            System.out.println("Nombre: " + credito.getNombreCliente());
            System.out.println("Documento: " + credito.getDocumento());
            System.out.println("Tipo de credito: " + credito.getTipoCredito());
            System.out.println("Valor solicitado: " + credito.getValorSolicitado());
            System.out.println("Estado: " + credito.getEstadoCredito());
            System.out.println("-------------------------");
        }
    }


    public ObjCredito ModificarSolicitud(Queue<ObjCredito> solicitudes, int idSolicitud, Scanner sc) {

        for(ObjCredito credito : solicitudes) {

            if(credito.getIdsolicitud() == idSolicitud) {

                if(credito.getEstadoCredito().equals("Pendiente")) {

                    System.out.println("Ingrese el nuevo tipo de crédito:");
                    String nuevoTipo = sc.nextLine();

                    System.out.println("Ingrese el nuevo valor solicitado:");
                    String nuevoValor = sc.nextLine();

                    credito.setTipoCredito(nuevoTipo);
                    credito.setValorSolicitado(nuevoValor);

                    System.out.println("Solicitud modificada exitosamente.");

                    return credito;

                } else {

                    System.out.println("La solicitud ya inició la asesoría y no puede ser modificada.");

                    return null;
                }
            }
        }

        return null;
    }


    public ObjCredito IniciarAsesoria(Queue<ObjCredito> solicitudes, int idSolicitud) {

        for(ObjCredito credito : solicitudes) {

            if(credito.getIdsolicitud() == idSolicitud) {

                credito.setEstadoCredito("En asesoria");

                System.out.println("Asesoria iniciada exitosamente.");

                return credito;
            }
        }

        return null;
    }


    public ObjCredito FinalizarAsesoria(Queue<ObjCredito> solicitudes, int idSolicitud) {

        for(ObjCredito credito : solicitudes) {

            if(credito.getIdsolicitud() == idSolicitud) {

                credito.setEstadoCredito("Finalizada");

                System.out.println("Asesoria finalizada exitosamente.");

                return credito;
            }
        }

        return null;
    }
}