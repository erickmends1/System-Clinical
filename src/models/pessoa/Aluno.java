package models.pessoa;


public final class Aluno extends Pessoa {
    private long idAluno;
    private int nivelDesempenho;

    public Aluno(String nome, String dataNacimento, String cpf, String email, long idAluno) {
        super(nome, dataNacimento, cpf, email);
        this.idAluno = idAluno;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public int getNivelDesempenho() {
        return nivelDesempenho;
    }

    public void setNivelDesempenho(int nivelDesempenho) {
        System.out.println("Vai representar a media dada pelo nivel de satisfação do paciente...");
    }

    @Override
    public String toString() {
        return "Aluno:\n"
                +"Id Paciente: "
                + this.getIdAluno()
                +", Nome: "
                + this.getNome()
                +", Data Nacimento: "
                + this.getDataNacimento()
                +", CPF: "
                + this.getCpf()
                +", Email: "
                + this.getEmail()
                +", Desempenho: "
                + this.getNivelDesempenho();
    }
}
