/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package pruebajava2;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas
 
 /*****************************************************************************
 *Paola Bravo Cardenas
 * @author LAB03
 *Fecha:06 de Noviembre 2017
 *Programa:Prueba2Paola
 * Responsabilidad:Creacion clase
 * */
 
public class Pruebajava2 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)

{
float mes= Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
//El metodo round es para redondear un decimal
 switch(Math.round(mes))//Se recibe un valor
 { 
     case 12://Csaso 12 mes de diciembre si el valor es 12
             JOptionPane.showMessageDialog(null, "diciembre");
             
            break;
     case 11://Caso 11 mes de noviembre si el valor es 11
                 JOptionPane.showMessageDialog(null, "noviembre");
            break;
     case 10://Caso 10 mes de octubre si el valor es 10
                 JOptionPane.showMessageDialog(null, "octubre");
     case 9 ://Caso 9 mes de septiembre si el valor es 9    
                 JOptionPane.showMessageDialog(null, "Septiembre");
            break;
     case 8://Caso 11 mes de noviembre si el valor es 8
                 JOptionPane.showMessageDialog(null, "agosto");
            break;
     case 7://Caso 7 mes de octubre si el valor es 7
                 JOptionPane.showMessageDialog(null, "julio");
            break;
     case 6://Caso 6 mes de septiembre si el valor es 6
                 JOptionPane.showMessageDialog(null, "junio");
            break;
     case 5://Caso 5 mes de septiembre si el valor es 5
                 JOptionPane.showMessageDialog(null, "mayo");
            break;
     case 4://Caso 4 mes de septiembre si el valor es 4
                 JOptionPane.showMessageDialog(null, "abril");
            break;
     case 3://Caso 3 mes de septiembre si el valor es 3
                 JOptionPane.showMessageDialog(null, "marzo");
            break;
     case 2://Caso 2 mes de septiembre si el valor es 2
                 JOptionPane.showMessageDialog(null, "febrero");
            break;
     case 1://Caso 1 mes de septiembre si el valor es 2
                 JOptionPane.showMessageDialog(null, "enero");
            break;
     default:
            JOptionPane.showMessageDialog(null, "son todo los meses");
            break;
            
               
    
            
            
            
            
         
          
 }
     
     




        
            


}
   



}
