[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/KC4njJ5e)
## Atividade

Nesta atividade você deverá criar um programa que dado um texto (String), deverá retornar a quantidade de vogais existentes. 

Considerar para vogais as seguintes letras e sua variação maiúscula:

* a, á, à, â, ã, e, é, ê, è, i, í, ì, î, o, ó, ò, ô, õ, u, ú, ù, û

```java
public class Vogais {

    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
        //TODO adicionar solução aqui
        return 0;
    }

}
```

## Exemplos

O resultado deverá ser retornado como inteiro no método contarVogais

| Entrada | Saida esperada |
|---------|----------------|
| abc     | 1              |
| aeiou     | 5              |
| Olá tudo bom?     | 5              |

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```console
$ ./gradlew test
```