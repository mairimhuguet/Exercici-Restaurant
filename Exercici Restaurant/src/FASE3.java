import javax.swing.*;

import javafx.scene.control.Menu;

import java.util.*;


public class FASE3 {

static	HashMap<String, Integer> cartaclient=new HashMap<String, Integer>(); 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//FASE1
		//Variable per a cada bitllet
		
	int billete5 = 5;
	int billete10 = 10;
	int billete20 = 20;
	int billete50 = 50;
	int billete100 = 100;
	int billete200 = 200;
	int billete500 = 500;
	
	Scanner entrada = new Scanner (System.in);
	
	
	
	//Array del menu
		String[] menu = new String [5];
		menu[0] = "ensalada";
		menu[1] = "sopa";
		menu[2] = "pasta";
		menu[3] = "carne";
		menu[4] = "flan";
		
	//Array dels preus de cada plat
		Integer[] preuplat = new Integer [5];
		preuplat[0] = 10;
		preuplat[1] = 20;
		preuplat[2] = 20;
		preuplat[3] = 25;
		preuplat[4] = 5;
		
//FASE2
		
		for (int i = 0; i < preuplat.length; i++) {
		cartaclient.put(menu[i], preuplat[i]);
	}
	
		System.out.println("Bienvenido, la carta es la siguiente:");
		System.out.println(cartaclient);
			
	
		String respuesta1 [] = new String [2];
		respuesta1[0] = JOptionPane.showInputDialog("Quins dos plats vols per menjar? (minusculas. En la consola tienes las opciones)");
		respuesta1[1] = JOptionPane.showInputDialog("Quins dos plats vols per menjar? (minusculas. En la consola tienes las opciones)");
	
        
    	    //int total = 0;
    	        	       
        System.out.println("El cliente quiere " +  respuesta1[0] + " para comer");
        System.out.println("El cliente quiere " +  respuesta1[1] + " para comer");
     
        //Preguntar al client si vol menjar més 
        JOptionPane.showConfirmDialog(null, "Quieres mas comida?", null, JOptionPane.YES_NO_OPTION);  
        

//FASE 3
        //Donar el preu segons el que ha demanat el client
            
		int total1=0;
		int total2=0;
        
        for (int i = 0; i < preuplat.length; i++) {
        if (respuesta1[0].contains(menu[i])) {
        total1 = preuplat[i];
        //System.out.println(total1);
        }
      
        if (respuesta1[1].contains(menu[i])) {
        total2 = preuplat[i];
        //System.out.println(total2);
        }
           
        } 
        
               
        //Suma dels plats demanats
        
        int total = total1+total2;
    	System.out.println("Su factura asciende a un total de " + total +"€.");
    

}
}