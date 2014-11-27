/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.IPrograma;
import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;
import computador.Programas.Notepad;
import computador.Programas.ProgramaPadrão;
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Iniciando o " + this);
        JOptionPane.showMessageDialog(null, "Aguarde enquanto o SO e inicializado.");
    }

    @Override
    public boolean executaPrograma(int i) {
        if (i < 0 || i >= programasPadroesInstalados.length) {
            JOptionPane.showMessageDialog(null, "Index out of range.");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Executando " + programasPadroesInstalados[i]);
        }
        return true;
    }

    @Override
    public boolean executaPrograma(IPrograma programa) {
        for (IPrograma programaPI : programasPadroesInstalados) {
            if (programa.getClass().equals(programaPI)) {
                JOptionPane.showMessageDialog(null, "Executando Programa");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "O programa não esta instalado.");
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
            JOptionPane.showMessageDialog(null, "Sistema " + this + " carregado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Houve um problema na inicialização do seu Sistema Operacional.");
        }
        return ligou;
    }

    @Override
    public boolean desligar() {
        boolean desligou = super.desligar();
        if (desligou) {
            JOptionPane.showMessageDialog(null, "Seu Sistema Operacional " + this + " foi finalizado com maestria.");
            JOptionPane.showMessageDialog(null, "Seu computador foi desligado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante o desligamento de seu computador.");
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
