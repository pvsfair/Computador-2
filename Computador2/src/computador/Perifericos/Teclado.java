/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Perifericos;

import computador.Generalizacoes.Device;
import computador.Generalizacoes.Periferico;

/**
 *
 * @author Paulo
 */
public class Teclado implements Device, Periferico{

    private String marca;
    private String modelo;
    private String tipoTeclado;
    private boolean conectado;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, String tipoTeclado, boolean conectado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoTeclado = tipoTeclado;
        this.conectado = conectado;
    }
    
    public void digitar(){
        
    }
    
    @Override
    public void ligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }
    
}
