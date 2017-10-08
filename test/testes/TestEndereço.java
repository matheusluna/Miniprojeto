/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

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
public class TestEndereço {
    
    public TestEndereço() {
    }
    
    @Test
    public void test1(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("Petrolina", endereco.getCidade());
    }
    
    @Test(expected = Exception.class)
    public void test2(){
        Endereco endereco = null;
        try {
            endereco = new Endereco(null, "Areia Branca", 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test3(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("", "Areia Branca", 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test4(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", null, 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test5(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "", 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test6(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 0, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test7(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test8(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, null, "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test9(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test10(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test11(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", null, "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test12(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test13(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", null);
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test14(){
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "56330-025", "Petrolina", "PEB");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test15(){
        String teste = "";
        for(int i = 0; i <=100; i++){
            teste += "a";
        }
        Endereco endereco = null;
        try {
            endereco = new Endereco(teste, "Areia Branca", 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test16(){
        String teste = "";
        for(int i = 0; i <=100; i++){
            teste += "a";
        }
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", teste, 316, "56330-025", "Petrolina", "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    @Test(expected = Exception.class)
    public void test17(){
        String teste = "";
        for(int i = 0; i <=100; i++){
            teste += "a";
        }
        Endereco endereco = null;
        try {
            endereco = new Endereco("Jitirana", "Areia Branca", 316, "", teste, "PE");
        } catch (Exception ex) {
            Logger.getLogger(TestEndereço.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(316, endereco.getNumero());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
