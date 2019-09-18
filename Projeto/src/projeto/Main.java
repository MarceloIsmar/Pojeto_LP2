package projeto;
import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {
        String opt; 
        EntradaDeDados entrada = new EntradaDeDados();
        String menu = "0- Sair \n 1- Salvar Aluno \n 2- Exibir \n" +
                        "3- Remover Aluno \n 4- Salvar Professor";
     do{
           opt = JOptionPane.showInputDialog(menu);
         switch(opt){
             case "0": 
                 break;
             case "1": entrada.entradaPessoa(opt);
                 break;
             case "2":
                 break;
             case "3":
                 break;
             case "4": entrada.entradaPessoa(opt);
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opcao Invalida");
         }
     }
     while(! opt.equals("0"));
        
    }
     
   }  
    
    
