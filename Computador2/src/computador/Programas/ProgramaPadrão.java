/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Programas;

import computador.Generalizacoes.IPrograma;
import computador.Generalizacoes.Programa;

/**
 *
 * @author Paulo Victor
 */
public class ProgramaPadrão extends Programa {

    public ProgramaPadrão(String nomeDoPrograma) {
        super(nomeDoPrograma);
    }

    @Override
    public void iniciar() {

    }

    @Override
    public void executar() {

    }

    @Override
    public void finalizar() {

    }

    public String getNomeDoPrograma() {
        return nomeDoPrograma;
    }

    public void setNomeDoPrograma(String nomeDoPrograma) {
        this.nomeDoPrograma = nomeDoPrograma;
    }
}
