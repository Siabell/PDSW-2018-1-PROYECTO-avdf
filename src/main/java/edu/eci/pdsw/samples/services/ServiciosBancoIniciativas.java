package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Iniciativa;
import edu.eci.pdsw.samples.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;

public interface ServiciosBancoIniciativas {

	public abstract void InsertarUsuario(Usuario usuario) throws ExcepcionBancoIniciativas;

        public abstract void InsertarIniciativa(Iniciativa iniciativa) throws Exception;
        
        public abstract Usuario consultarUsuario (long documento) throws ExcepcionBancoIniciativas;
        
        public abstract void updateUsuario(long documento,String rol) throws Exception;
        
        public abstract List<Usuario> consultarUsuarios() throws Exception;
        
        public ArrayList<Iniciativa> consultarIniciativas() throws PersistenceException;
}
