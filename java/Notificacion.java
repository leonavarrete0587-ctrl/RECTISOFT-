
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Notificacion del sistema RECTISOFT.
 * Representa los avisos enviados a los usuarios
 * sobre las operaciones de la rectificadora.
 */
public class Notificacion {

    // Atributos
    private int idNotificacion;
    private String destinatario;
    private String mensaje;
    private String tipo;
    private LocalDateTime fecha;
    private boolean leida;

    // Constructor
    public Notificacion(int idNotificacion,
                        String destinatario,
                        String mensaje,
                        String tipo) {

        this.idNotificacion = idNotificacion;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.fecha = LocalDateTime.now();
        this.leida = false;
    }

    // Métodos Getters y Setters
    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isLeida() {
        return leida;
    }

    // Marca la notificación como leída
    public void marcarComoLeida() {
        this.leida = true;
    }

    // Devuelve un resumen de la notificación
    public String mostrarResumen() {
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return "Notificación: " + idNotificacion
                + "\nDestinatario: " + destinatario
                + "\nMensaje: " + mensaje
                + "\nTipo: " + tipo
                + "\nFecha: " + fecha.format(formato)
                + "\nEstado: " + (leida ? "Leída" : "Pendiente");
    }
}
