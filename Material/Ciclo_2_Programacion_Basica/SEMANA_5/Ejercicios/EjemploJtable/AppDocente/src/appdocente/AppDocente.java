
package appdocente;

import java.util.ArrayList;


public class AppDocente {

   
    public static void main(String[] args) {
        ArrayList<Docente> listaDoc=new ArrayList<Docente>();
        listaDoc=loadData();
        StartWindow window=new StartWindow();
        window.setVisible(true);
        window.setDocentes(listaDoc);
        window.mostrar();
        
        
        
    }
    
    public static ArrayList<Docente> loadData(){
        ArrayList<Docente> listDocentes=new ArrayList<Docente>();
        Docente d1=new Docente("Camilo Rodriguez","12658994",2,23);
        Docente d2=new Docente("Eduardo Delgado","1265000",3,23);
        Docente d3=new Docente("Celina Torres","58845264",1,15);
        Docente d4=new Docente("Sergio Molina","68658994",3,12);
        Docente d5=new Docente("Diego Mantilla","58885965",1,33);
        d1.calcularSalario();
        d2.calcularSalario();
        d3.calcularSalario();
        d4.calcularSalario();
        d5.calcularSalario();
        listDocentes.add(d1);
        listDocentes.add(d2);
        listDocentes.add(d3);
        listDocentes.add(d4);
        listDocentes.add(d5);
        return listDocentes;
    
    }
    
}
