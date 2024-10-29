package utp.edu.pe.ssmmindware.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name = "nombre_usuario")
    @NotBlank(message = "El nombre de usuario es obligatorio")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "El nombre de usuario solo debe contener letras y números")
    private String usuario;

    @Column(name = "contrasenia")
    @Min(value=8 , message = "La contraseña debe tener minimo 8 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "La contraseña debe tener almenos una letra mayúscula, una letra minúscula y un número")
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

}
