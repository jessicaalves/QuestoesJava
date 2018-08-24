package questoesframework;

/*author jessica*/
public class Principal {

    public static void main(String[] args) {
       
      Coruja c = new Coruja();
      Pinguim p = new Pinguim();
      Urso u = new Urso();
      Morcego m = new Morcego();
      Aviao a = new Aviao();
      
      FazerVoar fv = new FazerVoar();
      
      fv.fazerVoar(c);
      fv.fazerVoar(m);
      fv.fazerVoar(a);
      
    
    }
    
}
