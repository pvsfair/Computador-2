/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Programas;

import computador.Generalizacoes.ArmazenamentoEmNuvem;
import computador.Generalizacoes.Programa;

/**
 *
 * @author Paulo Victor
 */
public class Dropbox extends ArmazenamentoEmNuvem implements Programa {

    private String nomeDoPrograma;

    public Dropbox() {
        super(4, "admin", "admin");
        this.nomeDoPrograma = "Dropbox";
    }

    public Dropbox(int espacoArmazenamento, String usuario, String senha) {
        super(espacoArmazenamento, usuario, senha);
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

    public static boolean login(Dropbox drop, String usuario, String senha) {
        if (drop.usuario.equals(usuario) && drop.senha.equals(senha)) {
            System.out.println("Login Realizado com sucesso.");
            return true;
        } else {
            System.out.println("Usuario ou senha errados.");
            return false;
        }
    }

}
