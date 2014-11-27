/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Aplicativo;
import computador.Generalizacoes.IPrograma;
import computador.Programas.Aplicativos.AplicativoPadrao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class SmartPhone extends Computador {

    public static final String SISTEMA_OPERACIONAL = "Android";
    private android versaoAndroid;
    private float tamanhoDaTela;
    protected ArrayList<Aplicativo> apkInstalados = new ArrayList<>();

    public enum android {

        Eclair, Froyo, Gingerbread, Honeycomb, IceCreamSandwich, JellyBean, KitKat, Lollopop
    }

    public SmartPhone() {
        this.versaoAndroid = android.IceCreamSandwich;
        this.tamanhoDaTela = 5;
    }

    public SmartPhone(android versaoAndroid, float tamanhoDaTela, int HD, int RAM, float processadorGHz, String processadorModelo) {
        super(HD, RAM, processadorGHz, processadorModelo);
        this.versaoAndroid = versaoAndroid;
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public SmartPhone(SmartPhone sp) {
        this.HD = sp.HD;
        this.OnOff = sp.OnOff;
        this.RAM = sp.RAM;
        for (Aplicativo apkInstalado : sp.apkInstalados) {
            this.apkInstalados.add(apkInstalado);
        }
        this.processadorGHz = sp.processadorGHz;
        this.processadorModelo = sp.processadorModelo;
        this.tamanhoDaTela = sp.tamanhoDaTela;
        this.versaoAndroid = sp.versaoAndroid;
    }

    @Override
    public boolean ligar() {
        boolean ligou = super.ligar();
        if (ligou) {
            JOptionPane.showMessageDialog(null, this + " carregado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Houve um problema na inicialização do seu Celular.");
        }
        return ligou;
    }

    @Override
    public boolean desligar() {
        boolean desligou = super.desligar();
        if (desligou) {
            JOptionPane.showMessageDialog(null, "Seu " + this + " foi finalizado com perfeição.");
            JOptionPane.showMessageDialog(null, "Seu celular foi desligado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante o desligamento de seu celular.");
        }
        return desligou;
    }

    @Override
    protected void iniciaSO() {
        JOptionPane.showMessageDialog(null, "Iniciando o " + this);
        JOptionPane.showMessageDialog(null, "Aguarde enquando o " + this + " é carregado no seu celular.");
    }

    @Override
    public boolean executaPrograma(int i) {
        if (i < 0 || i >= apkInstalados.size()) {
            JOptionPane.showMessageDialog(null, "Index out of range.");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Executando " + apkInstalados.get(i));
        }
        return true;
    }

    @Override
    public boolean executaPrograma(IPrograma programa) {
        if (programa.getClass().isInstance(Aplicativo.class)) {
            for (Aplicativo apkInstalado : apkInstalados) {
                if (programa.equals(apkInstalado)) {
                    JOptionPane.showMessageDialog(null, "Executando aplicativo.");
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null, "Aplicativo nao encontrado.");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Este programa nao é um aplicativo para celular.");
        return false;
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    @Override
    protected void instalarProgramasPadroes() {
        programasPadroesInstalados = null;
        apkInstalados.add(new AplicativoPadrao("Relógio"));
        apkInstalados.add(new AplicativoPadrao("Notas"));
    }

    @Override
    public String toString() {
        return SmartPhone.SISTEMA_OPERACIONAL + " " + versaoAndroid.toString();
    }
}
