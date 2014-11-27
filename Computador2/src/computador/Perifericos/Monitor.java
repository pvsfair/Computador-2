/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Perifericos;

import computador.Generalizacoes.Device;
import computador.Generalizacoes.Periferico;
import javax.swing.JOptionPane;

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
    private boolean contectado;

    public Monitor() {
        this.marca = "AOC";
        this.modelo = "716Sw";
        this.altura = 720;
        this.largura = 1280;
        this.OnOff = false;
    }

    public Monitor(String marca, String modelo, int altura, int largura, boolean OnOff) {
        this.marca = marca;
        this.modelo = modelo;
        this.altura = altura;
        this.largura = largura;
        this.OnOff = OnOff;
    }

    @Override
    public boolean ligar() {
        if (!isOn()) {
            JOptionPane.showMessageDialog(null, "Ligando o monitor.");
            this.OnOff = true;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O seu monitor ja esta ligado.");
            return false;
        }
    }

    @Override
    public boolean desligar() {
        if (isOn()) {
            JOptionPane.showMessageDialog(null, "Desligando o monitor.");
            this.OnOff = false;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao precisa desligar um monitor que ja esta desligado.");
            return false;
        }
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    @Override
    public boolean isConectado() {
        return contectado;
    }

    public void atualizaTela() {

    }

}
