package utp.edu.pe.ssmmindware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utp.edu.pe.ssmmindware.Entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    UsuarioEntity findByUsuario(String nombreUsuario);
}
