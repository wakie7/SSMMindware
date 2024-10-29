package utp.edu.pe.ssmmindware.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Contacto {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$", message = "El nombre solo debe contener letras y espacios")
    private String name;

    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "Debe ingresar un correo electrónico válido")
    private String email;

    @NotBlank(message = "Debe seleccionar un país")
    private String country;

    @NotBlank(message = "El mensaje es obligatorio")
    @Size(min = 10, message = "El mensaje debe tener al menos 10 caracteres")
    @Pattern(regexp = "^[A-Za-z0-9\\s.,!?\"'-]+$", message = "El mensaje contiene caracteres no permitidos")
    private String mensaje;

    public @NotBlank(message = "El nombre es obligatorio") @Size(min = 2, max = 50,
            message = "El nombre debe tener entre 2 y 50 caracteres") @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$",
            message = "El nombre solo debe contener letras y espacios") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "El nombre es obligatorio") @Size(min = 2, max = 50,
            message = "El nombre debe tener entre 2 y 50 caracteres") @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$",
            message = "El nombre solo debe contener letras y espacios") String name) {
        this.name = name;
    }

    public @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "Debe ingresar un correo electrónico válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "El correo electrónico es obligatorio")
                         @Email(message = "Debe ingresar un correo electrónico válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Debe seleccionar un país") String getCountry() {
        return country;
    }

    public void setCountry(@NotBlank(message = "Debe seleccionar un país") String country) {
        this.country = country;
    }

    public @NotBlank(message = "El mensaje es obligatorio") @Size(min = 10, message = "El mensaje debe tener al menos 10 caracteres") @Pattern(regexp = "^[A-Za-z0-9\\s.,!?\"'-]+$", message = "El mensaje contiene caracteres no permitidos") String getMensaje() {
        return mensaje;
    }

    public void setMensaje(@NotBlank(message = "El mensaje es obligatorio") @Size(min = 10, message = "El mensaje debe tener al menos 10 caracteres") @Pattern(regexp = "^[A-Za-z0-9\\s.,!?\"'-]+$", message = "El mensaje contiene caracteres no permitidos") String mensaje) {
        this.mensaje = mensaje;
    }
}
