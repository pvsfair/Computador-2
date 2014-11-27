/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Device;
import computador.Generalizacoes.IPrograma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public abstract class Computador implements Device {

    protected static int numComputadoresLigados = 0;
    protected int HD;
    protected int RAM;
    protected float processadorGHz;
    protected String processadorModelo;
    protected boolean OnOff;
    protected IPrograma[] programasPadroesInstalados = new IPrograma[3];

    public Computador() {
        this.HD = 500;
        this.RAM = 4;
        this.processadorGHz = 1.9f;
        this.processadorModelo = "Intel core I5-4460T";
        this.instalarProgramasPadroes();
    }

    public Computador(int HD, int RAM, float processadorGHz, String processadorModelo) {
        this.setHD(HD);
        this.setRAM(RAM);
        this.setProcessadorGHz(processadorGHz);
        this.setProcessadorModelo(processadorModelo);
        this.instalarProgramasPadroes();
    }

    @Override
    public boolean ligar() {
        if (!isOn()) {
            JOptionPane.showMessageDialog(null, "Ligando o " + this + ".");
            this.OnOff = true;
            Computador.numComputadoresLigados++;
            JOptionPane.showMessageDialog(null, "Iniciando SO.");
            this.iniciaSO();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O seu " + this + " ja esta ligado.");
            return false;
        }
    }

    @Override
    public boolean desligar() {
        if (isOn()) {
            JOptionPane.showMessageDialog(null, "Finalizando SO.");
            JOptionPane.showMessageDialog(null, "Desligando o computador.");
            this.OnOff = false;
            Computador.numComputadoresLigados--;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao precisa desligar um computador que ja esta desligado.");
            return false;
        }
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    public void reiniciar() {
        if (isOn()) {
            this.desligar();
            this.ligar();
        } else {
            JOptionPane.showMessageDialog(null, "Nao faz sentido reiniciar um computador que esta desligado.");
        }
    }

    public static String mostrarComputadores(ArrayList<Computador> computadores) {
        String string = "";
        int i = 1;
        for (Computador computador : computadores) {
            string += (i + " - " + computador + ((computador.isOn()) ? " Ligado" : " Desligado"));
            string += '\n';
            i++;
        }
        return string;
    }

    protected abstract void iniciaSO();

    public abstract boolean executaPrograma(int i);

    public abstract boolean executaPrograma(IPrograma programa);

    protected abstract void instalarProgramasPadroes();

    public static int getNumComputadoresLigados() {
        return numComputadoresLigados;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        if (HD < 1) {
            JOptionPane.showMessageDialog(null, "Seu computador nao pode ter menos de 1GB de espaço de armazenamento no HD");
            JOptionPane.showMessageDialog(null, "Seu HD tem agora 10GB de armazenamento.");
            this.HD = 10;
        } else {
            this.HD = HD;
        }
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM < 1) {
            JOptionPane.showMessageDialog(null, "Seu computador nao pode ter menos de 1GB de memória RAM");
            JOptionPane.showMessageDialog(null, "Sua RAM tem agora 1GB.");
            this.RAM = 1;
        } else {
            this.RAM = RAM;
        }
    }

    public float getProcessadorGHz() {
        return processadorGHz;
    }

    public void setProcessadorGHz(float processadorGHz) {
        if (processadorGHz < 0.5f) {
            JOptionPane.showMessageDialog(null, "Seu computador nao pode ter um processador com clock menor que 0.5 GHz, até meu celular tem mais poder de processamento...");
            JOptionPane.showMessageDialog(null, "O clock do processamento do seu processador agora é 0.5 GHz.");
            this.processadorGHz = 0.5f;
        } else {
            this.processadorGHz = processadorGHz;
        }
    }

    public String getProcessadorModelo() {
        return processadorModelo;
    }

    public void setProcessadorModelo(String processadorModelo) {
        if (processadorModelo.equals("")) {
            JOptionPane.showMessageDialog(null, "Você nao instalou nenhum processador.");
            JOptionPane.showMessageDialog(null, "Você agora tem um Intel Core i3");
            this.processadorModelo = "Intel Core i3";
        } else {
            this.processadorModelo = processadorModelo;
        }
    }

    public IPrograma[] getProgramasPadroesInstalados() {
        return programasPadroesInstalados;
    }

}
