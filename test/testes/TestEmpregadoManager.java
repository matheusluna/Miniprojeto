/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import entidades.Empregado;
import entidades.EmpregadoManager;
import entidades.Endereco;
import interfaces.IEmpregadoDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class TestEmpregadoManager {
    IEmpregadoDao iEmpregadoDao;
    @Before
    public void setUp() {
        iEmpregadoDao = EasyMock.createMock(IEmpregadoDao.class);
    }
    
    @Test
    public void test1(){
        Empregado empregado = null;
        Endereco endereco = null;
        
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("123456", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregadoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Empregado> lista = new ArrayList<>();
        EasyMock.expect(iEmpregadoDao.listar()).andReturn(lista);
        EasyMock.expect(iEmpregadoDao.create(empregado)).andReturn(true);
        EasyMock.replay(iEmpregadoDao);
        
        EmpregadoManager dao = new EmpregadoManager(iEmpregadoDao);
        
        assertTrue(dao.create(empregado));
    }
    @Test
    public void test2(){
        Empregado empregado = null;
        Endereco endereco = null;
        
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("123456", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregadoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Empregado> lista = new ArrayList<>();
        lista.add(empregado);
        EasyMock.expect(iEmpregadoDao.listar()).andReturn(lista);
        EasyMock.expect(iEmpregadoDao.read("123456")).andReturn(empregado);
        EasyMock.replay(iEmpregadoDao);
        
        EmpregadoManager dao = new EmpregadoManager(iEmpregadoDao);
        
        assertEquals(empregado, dao.read("123456"));
    }
    
    @Test
    public void test3(){
        Empregado empregado = null;
        Endereco endereco = null;
        
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("123456", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregadoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Empregado> lista = new ArrayList<>();
        lista.add(empregado);
        EasyMock.expect(iEmpregadoDao.listar()).andReturn(lista);
        EasyMock.expect(iEmpregadoDao.update(empregado)).andReturn(true);
        EasyMock.replay(iEmpregadoDao);
        
        EmpregadoManager dao = new EmpregadoManager(iEmpregadoDao);
        
        assertTrue(dao.update(empregado));
    }
    
    @Test
    public void test4(){
        Empregado empregado = null;
        Endereco endereco = null;
        
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("123456", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregadoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Empregado> lista = new ArrayList<>();
        lista.add(empregado);
        EasyMock.expect(iEmpregadoDao.listar()).andReturn(lista);
        EasyMock.expect(iEmpregadoDao.delete(empregado)).andReturn(true);
        EasyMock.replay(iEmpregadoDao);
        
        EmpregadoManager dao = new EmpregadoManager(iEmpregadoDao);
        
        assertTrue(dao.delete(empregado));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
