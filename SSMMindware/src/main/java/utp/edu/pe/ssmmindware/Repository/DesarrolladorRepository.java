package utp.edu.pe.ssmmindware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utp.edu.pe.ssmmindware.Entity.DesarrolladorEntity;

public interface DesarrolladorRepository extends JpaRepository<DesarrolladorEntity, Integer> {
    DesarrolladorEntity findByNombreDesarrollador(String nombreDesarrollador);
    DesarrolladorEntity findByApellidoDesarrollador(String apellidoDesarrollador);
    DesarrolladorEntity findByCorreoDesarrollador(String correoDesarrollador);
}
