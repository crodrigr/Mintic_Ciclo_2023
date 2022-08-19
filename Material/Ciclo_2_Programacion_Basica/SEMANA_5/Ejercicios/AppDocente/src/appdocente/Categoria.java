package appdocente;


public class Categoria {
    
    public static double getValorPorCategoria(int categoria){
      
        switch (categoria) {
            case 1:
                return 25000;
            case 2:
                return 35000;
            default:
                return 45000;
        }        
    
    }
    
}
