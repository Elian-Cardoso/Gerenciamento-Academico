import java.util.ArrayList;

class Pessoa {
    String nome;
    String email;

    void logar() {
        System.out.println("Usuário logado");
    }
}

class Professor extends Pessoa {
    void logar() {
        System.out.println("Professor logado");
    }
}

class Aluno extends Pessoa {
    void logar() {
        System.out.println("Aluno logado");
    }
}


class Turma {
    int id;
    String nome;
    Professor professor;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    void inserirAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }


    void listarAlunos() {
        System.out.println("Alunos da turma " + nome + ":");
        for (Aluno a : listaAlunos) {
            System.out.println(a.nome);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        
        Professor p1 = new Professor();
        p1.nome = "Carlos";
        p1.email = "carlos@email.com";
        p1.logar();

        // criar alunos
        Aluno a1 = new Aluno();
        a1.nome = "Maria";
        a1.email = "maria@email.com";
        a1.logar();

        Aluno a2 = new Aluno();
        a2.nome = "João";
        a2.email = "joao@email.com";

        // criar turma
        Turma t1 = new Turma();
        t1.id = 1;
        t1.nome = "Turma de Java";
        t1.professor = p1;

        t1.inserirAluno(a1);
        t1.inserirAluno(a2);

        t1.listarAlunos();
    }
}
