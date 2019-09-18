package projeto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class DAO {
    
    public void salvar(Pessoa pessoa){
      
        List<Pessoa> listaDePessoas = new ArrayList<>();
        
        listaDePessoas.add(pessoa);
    }
    
    public void exibirTodos(String opcao){
        if(opcao.equals("2")){
            for(int i = 0; i < listaDePessoas.size(); i++){
              if(listaDePessoas.get(i) instanceof Aluno){
                  JOptionPane.showMessageDialog(null, listaDePessoas.get(i)getNome());
              }
            }
        }
        else{
            
        }
    }
}
