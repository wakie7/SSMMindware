package utp.edu.pe.ssmmindware.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "servicio")
@Getter
@Setter
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicio;

    @Column
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "El nombre solo debe contener letras y espacios")
    private String nombreServicio;

    @Column
    @NotBlank(message = "La descripción es obligatoria")
    @Size(min = 2, max = 50, message = "La descripción debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "La descripción solo debe contener letras y espacios")
    private String descripcionServicio;

    @Column
    @NotBlank(message = "El precio es obligatorio")
    @Size(min = 2, max = 50, message = "El precio debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "El precio solo debe contener letras y espacios")
    private String precioServicio;
}
