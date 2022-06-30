package exercicio_6;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio_6 extends Publicacao{

    public class Publicacao {

        List<Integer> listaCurtida;
        List<String> listaComentario;
        List<Integer> listaCompartilhamento;

        public void iniciar() {
            iniciarCurtida();
            iniciarComentario();
            iniciarCompartilhamento();
        }//fim iniciar

        private void iniciarCurtida() {
            this.listaCurtida = new ArrayList<>();
            
            int curtidas = 15;
            
            listaCurtida.add(curtidas);
            JOptionPane.showMessageDialog(null, 
				"Curtida " + listaCurtida, 
				"SmokeFace", JOptionPane.PLAIN_MESSAGE);
        }

        private void iniciarComentario() {
            this.listaComentario = new ArrayList<>();
            
            String comentar = JOptionPane.showInputDialog("Digite um comentario ");
            
            listaComentario.add(comentar);
            
            JOptionPane.showMessageDialog(null, 
				"Comentario " + listaComentario, 
				"SmokeFace", JOptionPane.PLAIN_MESSAGE);
            
        }

        private void iniciarCompartilhamento() {
            this.listaCompartilhamento = new ArrayList<>();
            
            int compartilhamento = 13;
            
            listaCompartilhamento.add(compartilhamento);
            JOptionPane.showMessageDialog(null, 
				"Compartilhamento " + listaCompartilhamento, 
				"SmokeFace", JOptionPane.PLAIN_MESSAGE);
        }

    }//fim classe

    public Exercicio_6() {

        Publicacao publicacao = new Publicacao();
        publicacao.iniciar();
    }

    public static void main(String[] args) {
        new Exercicio_6();
    }
}
