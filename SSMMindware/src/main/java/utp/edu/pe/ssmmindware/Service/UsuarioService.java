package utp.edu.pe.ssmmindware.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.pe.ssmmindware.Entity.UsuarioEntity;
import utp.edu.pe.ssmmindware.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean authenticate(String nombreUsuario, String password) {
        UsuarioEntity usuario = usuarioRepository.findByUsuario(nombreUsuario);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
