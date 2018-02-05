package m17bjavadoc;

/**
 * Exemplo de utilização do Javadoc
 * @author joao barbosa
 */
public class Main {
   /**
    * 
    * @param s o resultado do método toString da classe Livro
    * @return o número de carateres do resultado anterior
    */
   public static int carateres(String s){
      return s.length();
   }
   /**
    * Não são usados parâmetros.
    */
   public static void main(String[] args) {
      Livro l = new Livro("Clorofila", "Rui Reininho", 213);      
      String s;      
      int c;
      System.out.println(l);
      s = l.resumo();
      c = carateres(s);
      System.out.println(c);
   }
}
