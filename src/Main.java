public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf.setNome("Naruto Uzumaki");
        pf.setDocumento("CPF");
        pf.setCpf(123456789L);
        pf.setPais("Brasil");

        pj.setNome("EBAC LTDA");
        pj.setDocumento("CNPJ");
        pj.setPj(23565478000135L);
        pj.setPais("Brasil");

        System.out.println(pf);
        System.out.println(pj);

        //os números dos documentos são fictícios

    }
}