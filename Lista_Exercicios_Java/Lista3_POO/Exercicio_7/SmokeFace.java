package exercicio_7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SmokeFace {

    private class Publicacao extends JFrame {

        private JButton botao;
        private int var;

        public Publicacao() {
            setLayout(new FlowLayout());

            Curtir manipulador = new Curtir();

            botao = new JButton("Classe Interna Anonima");
            add(botao);

            botao.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    var++;
                    System.out.println(var);

                }
            });
        }

    }

    private class Curtir extends Publicacao implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showInputDialog(e);

        }
    }
    private class Comentar extends Publicacao implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showInputDialog(e);

        }
    }
    private class Compartilhar extends Publicacao implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showInputDialog(e);

        }
    }

    public SmokeFace() {
        Publicacao smokeFace = new Publicacao();

        List<Publicacao> lista = new ArrayList<>();

        lista.add(new Curtir());
        lista.add(new Compartilhar());
        lista.add(new Comentar());

        Iterator i = lista.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        smokeFace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smokeFace.setSize(240, 460);
        smokeFace.setVisible(true);
    }

    public static void main(String[] args) {
        new SmokeFace();
    }

}
