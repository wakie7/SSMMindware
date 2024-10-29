package utp.edu.pe.ssmmindware.Service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.ssmmindware.Entity.ServicioEntity;
import utp.edu.pe.ssmmindware.Repository.ServicioRepository;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository ServicioRepository;

    public void save(@Valid ServicioEntity servicio) {
        ServicioRepository.save(servicio);
    }

    public void delete(@Valid ServicioEntity servicio) {
        ServicioRepository.delete(servicio);
    }

    public ServicioEntity findById(Integer id) {
        return ServicioRepository.findById(id).orElse(null);
    }
}
