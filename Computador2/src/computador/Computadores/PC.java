/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Programa;
import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;
import computador.Programas.Notepad;
import computador.Programas.ProgramaPadrão;

/**
 *
 * @author Paulo
 */
public class PC extends Computador {

    private final SO sistemaOperacional;

    public enum SO {

        UBUNTU, FEDORA, MINT, ZENWALK, WINDOWS_XP, WINDOWS_VISTA, WINDOWS_7, WINDOWS_8, WINDOWS_8_1
    }

    private Monitor monitor;
    private Teclado teclado;

    public PC() {
        this.sistemaOperacional = SO.UBUNTU;
        this.monitor = new Monitor();
        this.teclado = new Teclado();
    }

    public PC(SO sistemaOperacional, Monitor monitor, Teclado teclado) {
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public PC(SO sistemaOperacional, Monitor monitor, Teclado teclado, int HD, int RAM, float processadorGHz, String processadorModelo) {
        super(HD, RAM, processadorGHz, processadorModelo);
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
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
        this.programasPadroesInstalados[0] = new Notepad();
        this.programasPadroesInstalados[1] = new ProgramaPadrão("Mozilla Firefox");
        this.programasPadroesInstalados[2] = new ProgramaPadrão("Media player");
    }

    @Override
    public String toString() {
        return sistemaOperacional.toString();
    }

    @Override
    public boolean ligar() {
        boolean ligou = super.ligar();
        if (ligou) {
            System.out.println("Sistema " + this + " carregado com sucesso.");
        } else {
            System.out.println("Houve um problema na inicialização do seu Sistema Operacional.");
        }
        return ligou;
    }

    @Override
    public boolean desligar() {
        boolean desligou = super.desligar();
        if (desligou) {
            System.out.println("Seu Sistema Operacional " + this + " foi finalizado com maestria.");
            System.out.println("Seu computador foi desligado com sucesso.");
        } else {
            System.out.println("Ocorreu algum erro durante o desligamento de seu computador.");
        }
        return desligou;
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

    public SO getSistemaOperacional() {
        return sistemaOperacional;
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

}
