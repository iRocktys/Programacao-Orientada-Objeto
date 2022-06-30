package exercicio_8;

import javax.swing.JFrame;

public class Exercicio_8 {

    public class Publicacao extends JFrame{

        private static Publicacao curtir;     
        
        private Publicacao() {

        }

        public static Publicacao iniciar() {

            if (curtir == null) {   
                curtir = new Publicacao();
                System.out.println("Nova Curtida instanciada");
                return curtir;
            } else {
                return null;
            }

        }
    }

    public Exercicio_8() {

        Publicacao curtir = Publicacao.iniciar();
        Publicacao comentar = Publicacao.iniciar();
        Publicacao compartilhar = Publicacao.iniciar();
    }

    public static void main(String[] args) {
        new Exercicio_8();

    }

}
