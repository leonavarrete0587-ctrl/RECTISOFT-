              CLASE: NOTIFICACION
------------------------------------------------
- idNotificacion: int
- destinatario: String
- mensaje: String
- tipo: String
- fecha: LocalDateTime
- leida: boolean
------------------------------------------------
+ Notificacion()
+ Notificacion(idNotificacion: int,
  destinatario: String, mensaje: String,
  tipo: String, fecha: LocalDateTime)
+ marcarComoLeida(): void
+ mostrarResumen(): String
+ getIdNotificacion(): int
+ setIdNotificacion(idNotificacion: int): void
+ getDestinatario(): String
+ setDestinatario(destinatario: String): void
+ getMensaje(): String
+ setMensaje(mensaje: String): void
+ getTipo(): String
+ setTipo(tipo: String): void
+ getFecha(): LocalDateTime
+ setFecha(fecha: LocalDateTime): void
+ isLeida(): boolean
+ setLeida(leida: boolean): void
------------------------------------------------