/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Jogavel;
import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class GamerPC extends PC{
    private int VRAM;
    private String placaDeVideoModelo;
    private List<Jogavel> jogosInstalados;

    public GamerPC(int VRAM, String placaDeVideoModelo, List<Jogavel> jogosInstalados, SO sistemaOperacional, Monitor monitor, Teclado teclado, int HD, int RAM, float processadorGHz, String processadorModelo) {
        super(sistemaOperacional, monitor, teclado, HD, RAM, processadorGHz, processadorModelo);
        this.VRAM = VRAM;
        this.placaDeVideoModelo = placaDeVideoModelo;
        this.jogosInstalados = jogosInstalados;
    }
    
    public boolean jogarJogo(Jogavel jogo){
        for (Jogavel jogoInstalado : jogosInstalados) {
            if(jogo.getClass().equals(jogoInstalado)){
                JOptionPane.showMessageDialog(null, "Executando Jogo");
                return true;
            }
        }
        return false;
    }
    
}
