/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswhilefor3;

import javax.swing.JOptionPane;

public class EjerciciosWhileFor3 {

    public static void main(String[] args) {
        Double pre,prf=0.0,p1,p2,l,tf;
        int n,x;
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudiantes"));
        for (x=1;x<=n;x++){
              p1=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del parcial 1 del estudiante "+x));
      
              p2=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del parcial 2 del estudiante "+x));

              l=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del laboratorio del estudiante "+x));

              tf=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del trabajo final del estudiante "+x));
              
              pre=(p1*0.30)+(p2*0.35)+(l*0.25)+(tf*0.10);
              
              prf=prf+pre;
                           
        }
            prf=prf/n;
            JOptionPane.showMessageDialog(null,"la nota promedio del curso es "+prf);

    }
}
