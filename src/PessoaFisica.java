public class PessoaFisica extends Pessoa{
    public Long cpf;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public void nome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "Nome = " + nome +
                ", Tipo do documento = " + documento + '\'' +
                ", Número do documento = " + cpf + '\'' +
                ", País de residência = " + pais + '\'' +
                '}';
    }
}
