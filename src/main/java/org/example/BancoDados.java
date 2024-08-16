package org.example;

import java.util.logging.Logger;

public class BancoDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou Conexao");
    }

    public static void fecharConexao(){
        LOGGER.info("Fechado Conexao");
    }

    public static void inserirDados(Pessoa pessoa) {
        LOGGER.info("Inserindo dados no Banco");
    }

    public static void removerDados(Pessoa pessoa) {
        LOGGER.info("Removeu dados no Banco");
    }
}
