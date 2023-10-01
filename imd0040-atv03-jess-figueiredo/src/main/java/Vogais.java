
public class Vogais {

    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
        // Converter o texto para minúsculas para simplificar a verificaçã
        text = text.toLowerCase();

        // Inicializar o contador de vogais
        int contadorVogais = 0;

        // Percorrer o texto e verificar cada caractere
        for (int i = 0; i < text.length(); i++) {
            char caractere = text.charAt(i);
            // Verificar se o caractere é uma vogal
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'á' || caractere == 'é' || caractere == 'í' || caractere == 'ó' || caractere == 'ú' ||
                caractere == 'à' || caractere == 'è' || caractere == 'ì' || caractere == 'ò' || caractere == 'ù' ||
                caractere == 'â' || caractere == 'ê' || caractere == 'î' || caractere == 'ô' || caractere == 'û' ||
                caractere == 'ã' || caractere == 'õ') {
                contadorVogais++;
            }
        }

        // Retornar o total de vogais encontradas
        return contadorVogais;
    }

}
