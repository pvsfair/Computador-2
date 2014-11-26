/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Device;
import computador.Generalizacoes.Programa;

/**
 *
 * @author Paulo
 */
public abstract class Computador implements Device {

    static int numComputadoresLigados;
    private int HD;
    private int RAM;
    private float processadorGHz;
    private String processadorModelo;
    private boolean OnOff;
    private String[] programasPadroesInstalados = new String[3];

    public Computador() {
        numComputadoresLigados = 0;
    }

    public Computador(int HD, int RAM, float processadorGHz, String processadorModelo) {
        this.HD = HD;
        this.RAM = RAM;
        this.processadorGHz = processadorGHz;
        this.processadorModelo = processadorModelo;
    }

    public void reiniciar() {

    }

    protected abstract void iniciaSO();

    public abstract boolean executaPrograma(int i);

    public abstract boolean executaPrograma(Programa programa);

    protected abstract void instalaProgramasPadroes();
}
