package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public interface ICurtir{
        public abstract String toString();
    }

    public class Curtiu implements ICurtir{
        public String toString(){return this.getClass().getSimpleName();}
    }

    public class Amou implements ICurtir{
        public String toString(){return this.getClass().getSimpleName();}
    }

    public class Legal implements ICurtir{
        public String toString(){return this.getClass().getSimpleName();}
    }

    public class Reacao{
        private ICurtir interfaceCurtir;
        public Reacao(ICurtir interfaceCurtir){
            setCurtir(interfaceCurtir);
        }
        public void setCurtir(ICurtir interfaceCurtir){
            this.interfaceCurtir=interfaceCurtir;
        }
        public String toString(){return this.interfaceCurtir.toString();}
    }

    public Principal(){

        Reacao reacao = new Reacao(new Curtiu());
        System.out.println(reacao);

        Reacao reacao2 = new Reacao(new Amou());
        System.out.println(reacao2);

        reacao.setCurtir(new Legal());
        System.out.println(reacao);

    }


    public static void main(String[] args){
        new Principal();
    }

}