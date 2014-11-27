/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Programa;
import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;
import computador.Programas.ProgramaPadrão;

/**
 *
 * @author Paulo
 */
public class Mac extends Computador {

    public static final String SISTEMA_OPERACIONAL = "MaxOsX";
    private MacOsX versaoSO;

    public enum MacOsX {

        CHEETAH, PUMA, JAGUAR, PANTHER, TIGER, LEOPARD, SNOW_LEOPARD, LION, MOUNTAIN_LION, MAVERICKS, YOSEMITE
    }
    private Monitor monitor;
    private Teclado teclado;

    public Mac() {
        this.versaoSO = MacOsX.SNOW_LEOPARD;
        this.monitor = new Monitor();
        this.teclado = new Teclado();
    }

    public Mac(MacOsX versaoSO, Monitor monitor, Teclado teclado) {
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public Mac(MacOsX versaoSO, Monitor monitor, Teclado teclado, int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        super(HD, RAM, processadorGHz, processadorModelo);
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    public boolean ligar() {
        boolean ligou = super.ligar();
        if (ligou) {
            System.out.println("Sistema " + this + " carregado com sucesso.");
        } else {
            System.out.println("Houve um problema na inicialização do seu Mac.");
        }
        return ligou;
    }

    @Override
    public boolean desligar() {
        boolean desligou = super.desligar();
        if (desligou) {
            System.out.println("Seu Sistema Operacional " + this + " foi finalizado com maestria.");
            System.out.println("Seu Mac foi desligado com sucesso.");
        } else {
            System.out.println("Ocorreu algum erro durante o desligamento de seu Mac.");
        }
        return desligou;
    }

    @Override
    protected void iniciaSO() {
        System.out.println("Iniciando o " + this);
        System.out.println("Aguarde enquanto o SO e inicializado.");
    }

    @Override
    public boolean executaPrograma(int i) {
        if (i < 0 || i >= programasPadroesInstalados.length) {
            System.out.println("Index out of range.");
            return false;
        } else {
            System.out.println("Executando " + programasPadroesInstalados[i]);
        }
        return true;
    }

    @Override
    public boolean executaPrograma(Programa programa) {
        for (Programa programaPI : programasPadroesInstalados) {
            if (programa.getClass().equals(programaPI)) {
                System.out.println("Executando Programa");
                return true;
            }
        }
        System.out.println("O programa não esta instalado.");
        return false;
    }

    @Override
    protected void instalarProgramasPadroes() {
        this.programasPadroesInstalados[0] = new ProgramaPadrão("Editor de Texto");
        this.programasPadroesInstalados[1] = new ProgramaPadrão("Opera");
        this.programasPadroesInstalados[2] = new ProgramaPadrão("Media player");
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    @Override
    public String toString() {
        return Mac.SISTEMA_OPERACIONAL + " " + this.versaoSO;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public static String getSISTEMA_OPERACIONAL() {
        return SISTEMA_OPERACIONAL;
    }

    public MacOsX getVersaoSO() {
        return versaoSO;
    }

}
