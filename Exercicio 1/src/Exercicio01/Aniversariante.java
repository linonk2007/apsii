package Exercicio01;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    // Construtor recebendo nome, dia e mês
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    // Construtor recebendo nome e objeto DataAniversario
    public Aniversariante(String nome,
                          DataAniversario dataAniversario) {

        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(
            DataAniversario dataAniversario) {

        this.dataAniversario = dataAniversario;
    }

    // Dois aniversariantes são iguais se possuem
    // o mesmo nome e a mesma data
    public boolean equals(Object outroAniversariante) {

        if (outroAniversariante instanceof Aniversariante) {

            Aniversariante outro =
                    (Aniversariante) outroAniversariante;

            return this.nome.equals(outro.nome)
                    && this.dataAniversario.equals(
                            outro.dataAniversario);
        }

        return false;
    }
}