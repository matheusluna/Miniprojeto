/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.IEmpregadoDao;
import java.util.List;

/**
 *
 * @author mathe
 */
public class EmpregadoManager {
    private IEmpregadoDao iEmpregadoDao;

    public EmpregadoManager(IEmpregadoDao iEmpregadoDao) {
        this.iEmpregadoDao = iEmpregadoDao;
    }
    
    public List<Empregado> listar(){
        return iEmpregadoDao.listar();
    }
    
    public boolean validaEmpregado(Empregado empregado){
        List<Empregado> lista = listar();
        
        for(Empregado e : lista){
            if(e.getMatricula().equals(empregado.getMatricula())){
                return true;
            }
        }
        return false;
    }
    
    public boolean create(Empregado empregado){
        if(!validaEmpregado(empregado)){
            return iEmpregadoDao.create(empregado);
        }else{
            return false;
        }
    }
    
    public Empregado read(String matricula){
        
        return iEmpregadoDao.read(matricula);
        
    }
    
    public boolean update(Empregado empregado){
        if(validaEmpregado(empregado)){
            return iEmpregadoDao.update(empregado);
        }else{
            return false;
        }
    }
    
    public boolean delete(Empregado empregado){
        if(validaEmpregado(empregado)){
            return iEmpregadoDao.delete(empregado);
        }else{
            return false;
        }
    }
}
