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
public abstract class Programa implements IPrograma{

    protected String nomeDoPrograma;

    public Programa(String nomeDoPrograma) {
        this.nomeDoPrograma = nomeDoPrograma;
    }

    @Override
    public String toString() {
        return nomeDoPrograma;
    }

    public String getNomeDoPrograma() {
        return nomeDoPrograma;
    }
}
