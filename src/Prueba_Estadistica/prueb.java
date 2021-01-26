/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_Estadistica;

/**
 *
 * @author User
 */
public class prueb {
    public static void main(String args[]){
        Prueba_Mann_Whitney pb = new Prueba_Mann_Whitney();
        pb.observacion1(73);
        pb.observacion1(87);
        pb.observacion1(79);
        pb.observacion1(75);
        pb.observacion1(82);
        pb.observacion1(65);
        pb.observacion1(95);
        pb.observacion1(75);
        pb.observacion1(70);
        
        pb.observacion2(86);
        pb.observacion2(81);
        pb.observacion2(84);
        pb.observacion2(88);
        pb.observacion2(90);
        pb.observacion2(85);
        pb.observacion2(84);
        pb.observacion2(92);
        pb.observacion2(83);
        pb.observacion2(91);
        pb.observacion2(53);
        pb.observacion2(84);
       
        pb.mescla();
              
        pb.Umedia();
        pb.mediaPobla();
        pb.desviacionEstandar();
        System.out.println(pb.Zestandar());
    }
}
