# Atividade 1

>"What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
>
>The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
>
>“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
>
>Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices."
------

O texto comenta sobre a concepção geral do significado de Engenharia de software, e o papel da Google em trazer novas percepções literárias no ramo. O autor explica sobre como um engenheiro de software acaba sendo percebido como um curso, e consequentemente, um cargo mais sério. Isso se deve ao termo "Engenharia" no nome, que remete a a aplicação de um conhecimento teórico para construir algo real, mas a Engenharia de software não funciona exatamente assim, sendo ela algo que trabalha com o intangível. O autor também aborda o fato dessa engenharia não ser tão rigorosa, dando espaços para erros, e pontuando que programação em um geral segue a mesma linha.



# Atividade 2

>Programming Over Time
>We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
>
>One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
>
>The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
>
>Time and Change
>How code will need to adapt over the length of its life
>
>Scale and Growth
>How an organization will need to adapt as it evolves
> 
>Trade-offs and Costs
>How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth
----------

O autor nesse trecho traz a debate como a engenharia de software não é feita só do ato de escrever códigos, mas também de todos os processos e organizações
que mantém o código ao decorrer do tempo. Esse trcho toca na vida útil de um código, em qual seria a resposta para manter este código utilizável e "valioso" por um longo período, e a esperança de que as novidades que a Google traz, respondam essas perguntas. O livro aponta o conceito de programação integrada com o passar do tempo, e levanta perguntas de como aumentar a sustentabilidade de um código para aumentar sua vida útil, o livro também enfatiza três fundamentos que organizações deveriam manter em mente quando fazendo o design, a arquitetura e a escritura de seus códigos: Tempo e Mudança; Escala e crescimento; Compensações e custos.


# Atividade 3

1. Velocidade vs. Consumo de Memória
2. Facilidade de Manutenção vs. Performance
3. Segurança vs. Usabilidade




# Atividade 4

![Imagem do Bertoti](https://github.com/Leti-10/Bertoti/blob/main/Engeharia1/Imagens/imagem%20slides%20bertoti.png)

A imagem faz uma demonstração visual do conceito de MVP, que vem do inglês Minimal Viable Product. A ideia do MVP é de que o programador deve sempre entrgar algo utilizável durante os processos de entrega do projeto, e durante o processo de montagem de seu programa ou sistema, sempre construir versões simplificadas com fins de aprendizado e validação do cliente, sempre em mente resolver o problema proposto pelo cliente. De nada adianta a carcaça de um sistema complexo que é inutilizável e não entrega nenhum tipo de valor para o cliente.





# Atividade 5

## Classe loja

    package org.sputnik;

    import java.util.LinkedList;
    import java.util.List;

    public class Loja {

    private List<ItemCrochet> itens = new LinkedList<ItemCrochet>();
    
    public void addItem(ItemCrochet item) {
        itens.add(item);
    }

    public ItemCrochet buscarItemPorNome(String nome) {
        for (ItemCrochet item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    public void mostrarQuantidadePorNome(String nome) {
        ItemCrochet item = buscarItemPorNome(nome);
        if (item != null) {
            System.out.println("Item: " + item.getNome() +
                    " | Quantidade em estoque: " + item.getQuantidade());
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public void venderItem(String nome, int quantidade) {
        for (ItemCrochet item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                if (item.getQuantidade() >= quantidade) {
                    item.diminuirEstoque(quantidade); // atualiza o estoque
                    double total = quantidade * item.getPreco();
                    System.out.println("Venda realizada!");
                    System.out.println("Item: " + item.getNome());
                    System.out.println("Quantidade vendida: " + quantidade);
                    System.out.println("Total: R$ " + total);
                    System.out.println("Restante no Estoque: " + item.getQuantidade());
                    return;
                } else {
                    System.out.println("Estoque insuficiente para " + nome + ".");
                    return;
                }
            }
        }
        System.out.println("Item não encontrado.");
    }

    }


## Classe ItemCrochet

    package org.sputnik;

    public class ItemCrochet {

    private String nome;
    private double preco;
    private int quantidade;

    public ItemCrochet(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade <= getQuantidade()) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }


    }


## Teste

    import org.junit.Test;
    import org.sputnik.ItemCrochet;
    import org.sputnik.Loja;
    import static org.junit.Assert.assertEquals;

    public class Teste {

    @Test
    public void test(){

        Loja loja = new Loja();
        loja.addItem(new ItemCrochet("Agulha 3.0mm", 15.00, 23));
        loja.addItem(new ItemCrochet("Novelo amigurumi", 18.00, 50));
        loja.addItem(new ItemCrochet("Agulha de tapeçaria", 2.50, 120));

        loja.venderItem("Agulha de tapeçaria", 5);
        ItemCrochet item = loja.buscarItemPorNome("Agulha de tapeçaria");

        assertEquals(115, item.getQuantidade());
    }

    }

   
