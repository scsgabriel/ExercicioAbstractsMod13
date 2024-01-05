public class PessoaJuridica extends Pessoa{
    public Long pj;

    public Long getPj() {
        return pj;
    }

    public void setPj(Long pj) {
        this.pj = pj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "Nome = " + nome +
                ", Tipo do documento = " + documento + '\'' +
                ", Número do documento = " + pj + '\'' +
                ", País de residência = " + pais + '\'' +
                '}';
    }
}
