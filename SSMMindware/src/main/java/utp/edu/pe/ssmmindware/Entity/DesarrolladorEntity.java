package utp.edu.pe.ssmmindware.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "desarrollador")
@Getter
@Setter
public class DesarrolladorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDesarrollador;

    @Column
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$", message = "El nombre solo debe contener letras y espacios")
    private String nombreDesarrollador;

    @Column
    @NotBlank(message = "El apellido es obligatorio")
    @Size(min = 2, max = 50, message = "El apellido debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$", message = "El apellido solo debe contener letras y espacios")
    private String apellidoDesarrollador;

    @Column
    @NotBlank(message = "La edad es obligatoria")
    private int edadDesarrollador;

    @Column
    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Debe ingresar un correo válido")
    private String correoDesarrollador;

    @Column
    @NotBlank(message = "La especialidad es obligatoria")
    @Size(min = 2, max = 50, message = "La especialidad debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "La especialidad solo debe contener letras y espacios")
    private String especialidad;
}
