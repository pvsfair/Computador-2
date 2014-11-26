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
public class Monitor implements Device, Periferico {

    private String marca;
    private String modelo;
    private int altura;
    private int largura;
    private boolean OnOff;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, int altura, int largura) {
        this.marca = marca;
        this.modelo = modelo;
        this.altura = altura;
        this.largura = largura;
        this.OnOff = false;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public boolean isConectado() {
        return false;
    }

    public void atualizaTela() {

    }

}
