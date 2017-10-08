/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Empregado;
import java.util.List;

/**
 *
 * @author mathe
 */
public interface IEmpregadoDao {
    public boolean create(Empregado empregado);
    public Empregado read(String matricula);
    public boolean update(Empregado empregado);
    public boolean delete(Empregado empregado);
    public List<Empregado> listar();
}
