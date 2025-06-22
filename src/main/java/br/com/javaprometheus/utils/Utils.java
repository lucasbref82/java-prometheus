package br.com.javaprometheus.utils;

import org.slf4j.helpers.MessageFormatter;

public class Utils {
    public static String format(String mensagem, Object... argumentos) {
        return MessageFormatter.basicArrayFormat(mensagem, argumentos);
    }
}
