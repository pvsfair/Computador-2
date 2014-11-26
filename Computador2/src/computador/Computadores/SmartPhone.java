/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Programa;

/**
 *
 * @author Paulo
 */
public class SmartPhone extends Computador {

    public static final String SISTEMA_OPERACIONAL = "Android";
    private int versaoAndroid;
    private float tamanhoDaTela;

    public SmartPhone() {

    }

    public SmartPhone(int versaoAndroid, float tamanhoDaTela, int HD, int RAM, float processadorGHz, String processadorModelo) {
        super(HD, RAM, processadorGHz, processadorModelo);
        this.versaoAndroid = versaoAndroid;
        this.tamanhoDaTela = tamanhoDaTela;
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
