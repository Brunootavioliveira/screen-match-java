//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Pegando a classe filme criada, e criando uma variavel passando a referencia dessa classe pra ela
        meuFilme.nome = "O poderoso chefão"; // Atribuindo valor a as classes criadas
        meuFilme.anoLancamento = 1970;
        meuFilme.DuracaoMinutos = 200;

        /* System.out.println(meuFilme); Será impresso o nome da classe e o endereço do objeto
        System.out.println(meuFilme.nome); Se eu quiser acesso ao atributo do objeto criado, basta usar o nome da variavel com o .
        System.out.println(meuFilme.anoLancamento);
        Criando objeto na classe e INSTANCIANDO (usando NEW, para conseguir usar métodos e atributos de uma classe)

        Classe = uma planta de uma casa, uma especificacao de algo (todo filme vai ter nome),
        la só ta escrito que o filme vai ter nome
         New = Agora com o filme em maos (na memoria) que eu posso atribuir nome...
        */

        meuFilme.exibiFichaTecnica(); //Maneira mais facil, a própria classe, ja imprimi as informacoes para a main principal
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.pegaMediaAvaliacoes());
    }
}