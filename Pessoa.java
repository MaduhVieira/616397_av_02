public class Pessoa {
    /*Crie uma classe para representar uma pessoa, com os atributos privados de nome,
     data de nascimento e altura, os métodos públicos sets e gets e 
     um método para imprimir todos dados de uma pessoa.*/
     private String nome, nascimento;
     private Float altura;

     public Pessoa(){
     }

     public String getNome(){
        return this. nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNascimento(){
        return this.nascimento;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public Float getAltura(){
        return this.altura;
    }
    public void setAltura(Float altura){
        this.altura = altura;
    }

    public void Imprimir(){
        System.out.println("\nNome: "+ nome);
        System.out.println("\nData de Nascimento: " + nascimento);
        System.out.println("\nAltura: " + altura);
    }


}
