package br.com.digitalinnovationone;

import java.util.logging.Logger;

public class BancoDeDados {

    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciada conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizada conexão");
    }
}
