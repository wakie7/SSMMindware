package utp.edu.pe.ssmmindware.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.ssmmindware.Entity.DesarrolladorEntity;
import utp.edu.pe.ssmmindware.Repository.DesarrolladorRepository;

@Service
public class DesarrolladorService {

    @Autowired
    private DesarrolladorRepository DesarrolladorRepository;

    public void save(DesarrolladorEntity desarrollador) {
        DesarrolladorRepository.save(desarrollador);
    }

    public void delete(DesarrolladorEntity desarrollador) {
        DesarrolladorRepository.delete(desarrollador);
    }

    public DesarrolladorEntity findById(Integer id) {
        return DesarrolladorRepository.findById(id).orElse(null);
    }

    public DesarrolladorEntity findByNombreDesarrollador(String nombreDesarrollador) {
        return DesarrolladorRepository.findByNombreDesarrollador(nombreDesarrollador);
    }

    public DesarrolladorEntity findByApellidoDesarrollador(String apellidoDesarrollador) {
        return DesarrolladorRepository.findByApellidoDesarrollador(apellidoDesarrollador);
    }

    public DesarrolladorEntity findByCorreoDesarrollador(String correoDesarrollador) {
        return DesarrolladorRepository.findByCorreoDesarrollador(correoDesarrollador);
    }
}
