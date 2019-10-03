/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23;

/**
 *
 * @author 18PROGB0583
 */
public class libro {
     
    
      private String autor;
      private String titulo;
      private String ISBN;
      private int paginas;
      
      public libro(){}

    public libro (String autor, String titulo, String ISBN, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Practica23{" + "autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", paginas=" + paginas + '}';
    }

    boolean toStrig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
          
      

    
