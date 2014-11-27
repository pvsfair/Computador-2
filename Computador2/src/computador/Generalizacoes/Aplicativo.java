/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Generalizacoes;

import java.util.Objects;

/**
 *
 * @author Paulo Victor
 */
public abstract class Aplicativo {

    private String nomeAplicativo;

    public Aplicativo(String nomeAplicativo) {
        this.nomeAplicativo = nomeAplicativo;
    }

    public String getNomeAplicativo() {
        return nomeAplicativo;
    }

    @Override
    public String toString() {
        return nomeAplicativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aplicativo other = (Aplicativo) obj;
        if (!Objects.equals(this.nomeAplicativo, other.nomeAplicativo)) {
            return false;
        }
        return true;
    }

}
