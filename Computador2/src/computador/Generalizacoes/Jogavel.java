/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Generalizacoes;

/**
 *
 * @author Paulo Victor
 */
public interface Jogavel extends IPrograma {

    public void carregarElementos();

    public void descarregarElementos();
    
    public void jogar();
}
