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
public class Teclado implements Periferico{

    private String marca;
    private String modelo;
    private String tipoTeclado;
    private boolean conectado;

    public Teclado() {
        this.marca = "GoldShip";
        this.modelo = "MicroTecladoUSB";
        this.tipoTeclado = "qwerty";
        this.conectado = true;
    }

    public Teclado(String marca, String modelo, String tipoTeclado, boolean conectado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoTeclado = tipoTeclado;
        this.conectado = conectado;
    }
    
    public String digitar(){
        return "";
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }
    
}
