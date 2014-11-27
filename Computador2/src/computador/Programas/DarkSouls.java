/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Programas;

import computador.Generalizacoes.Jogavel;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Victor
 */
public class DarkSouls implements Jogavel {

    @Override
    public void carregarElementos() {
        JOptionPane.showMessageDialog(null, "Carregando Fases Difíceis.");
    }

    @Override
    public void descarregarElementos() {
        JOptionPane.showMessageDialog(null, "Descarregando as fases dificeis");
    }

    @Override
    public void iniciar() {
        this.carregarElementos();
        JOptionPane.showMessageDialog(null, "Começando o jogo dificil");
        JOptionPane.showMessageDialog(null, "Você morreu.");
        JOptionPane.showMessageDialog(null, "Começando de novo o Jogo.");
    }

    @Override
    public void executar() {
        JOptionPane.showMessageDialog(null, "Executando DarkSouls");
    }

    @Override
    public void finalizar() {
        JOptionPane.showMessageDialog(null, "Finalizando DarkSouls");
    }

    @Override
    public void jogar() {
        this.iniciar();
        this.executar();
        this.finalizar();
    }

}
