/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Programa;
import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;

/**
 *
 * @author Paulo
 */
public class PC extends Computador {

    private int sistemaOperacional;
    private Monitor monitor;
    private Teclado teclado;

    public enum SO {

        so1, so2
    }

    public PC() {
    }

    public PC(int sistemaOperacional, Monitor monitor, Teclado teclado) {
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public PC(int sistemaOperacional, Monitor monitor, Teclado teclado, int HD, int RAM, float processadorGHz, String processadorModelo) {
        super(HD, RAM, processadorGHz, processadorModelo);
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    protected void iniciaSO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executaPrograma(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executaPrograma(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void instalaProgramasPadroes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
