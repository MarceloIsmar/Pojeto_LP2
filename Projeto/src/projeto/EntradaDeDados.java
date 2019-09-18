package projeto;

import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.Professor;


public class EntradaDeDados {
    DAO dao = new DAO();
    
    
    public void entradaPessoa(String opt){
        
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF: "));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
     
         if(opt.equals("1")){
             Aluno aluno = new Aluno(nome, sexo, cpf, idade);
               aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("RA: ")));
         }
        dao.salvar(pessoa);
 
        
        else{
            Professor professor = new Professor();
        professor.setNome(JOptionPane.showInputDialog("Nome: "));
        professor.setSexo(JOptionPane.showInputDialog("Sexo: "));
        professor.setCpf(Long.parseLong(JOptionPane.showInputDialog("CPF: ")));
        professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        professor.setSiap(Long.parseLong(JOptionPane.showInputDialog("Siap: ")));
        
        }
            
        if(aluno instanceof Aluno){
            
        }
        new DAO().salvar(aluno);
    }
    

}
