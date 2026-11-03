
import java.time.LocalDateTime;

public class PruebaNotificacionMotor {

    public static void main(String[] args) {

        // Datos del trabajo de motor
        int numeroOrden = 1;
        String cliente = "Carlos Perez";
        String vehiculo = "Chevrolet Aveo 1.6";
        String servicio = "Rectificacion de ciguenal";
        String estado = "En proceso";

        // Construir el mensaje
        String mensaje = "RECTISOFT informa: El trabajo de "
                + servicio + " para el vehiculo " + vehiculo
                + " del cliente " + cliente
                + " fue recibido correctamente. Orden: "
                + numeroOrden + ". Estado: " + estado;

        // Obtener fecha actual
        LocalDateTime fechaActual = LocalDateTime.now();

        // Crear objeto de la clase Notificacion
        Notificacion notificacion = new Notificacion(
                numeroOrden,
                cliente,
                mensaje,
                "Trabajo de motor",
                fechaActual
        );

        // Mostrar informacion
        System.out.println("==================================");
        System.out.println("       SISTEMA RECTISOFT");
        System.out.println(" RECTIFICADORA DE MOTORES NAVARRETE");
        System.out.println("==================================");

        System.out.println("Orden: " + numeroOrden);
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehiculo: " + vehiculo);
        System.out.println("Servicio: " + servicio);
        System.out.println("Estado: " + estado);

        System.out.println("----------------------------------");
        System.out.println("NOTIFICACION GENERADA");
        System.out.println("----------------------------------");

        System.out.println(notificacion.mostrarResumen());

        System.out.println("Leida: " + notificacion.isLeida());

        // Marcar notificacion como leida
        notificacion.marcarComoLeida();

        System.out.println("Despues de marcar como leida:");
        System.out.println("Leida: " + notificacion.isLeida());

        System.out.println("==================================");
        System.out.println("       PROCESO FINALIZADO");
        System.out.println("==================================");
    }
}
