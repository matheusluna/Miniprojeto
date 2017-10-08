/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import entidades.Empregado;
import entidades.Endereco;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TestEmpregado {
    
    public TestEmpregado() {
    }
    
    @Test
    public void test1(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("123456", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test2(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test3(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado(null, "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test4(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test5(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "", "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test6(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", null, "Matheus Moreira Luna", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test7(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", "", 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test8(){
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", null, 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test9(){
        String teste = "";
        
        for(int i = 0; i <= 70; i++){
            teste = "a";
        }
        
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", teste, 21, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test10(){
       
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", "Matheus Moreira Luna", 17, 1000.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test11(){
       
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", "Matheus Moreira Luna", 21, 800.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    
    @Test(expected = Exception.class)
    public void test12(){
       
        Empregado empregado = null;
        Endereco endereco = null;
        try {
            //endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
            empregado = new Empregado("1234567", "111.111.111-11", "Matheus Moreira Luna", 21, 800.00, endereco);
        } catch (Exception ex) {
            Logger.getLogger(TestEmpregado.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("123456", empregado.getMatricula());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
