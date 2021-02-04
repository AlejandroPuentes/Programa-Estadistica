/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_Estadistica;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Prueba_Mann_Whitney {
    Observaciones obs11;
    Observaciones obs22;
    ArrayList<Observaciones>obs1;
    ArrayList<Observaciones>obs2;
    double rangos [][];
    int contadorr;
    

    public Prueba_Mann_Whitney() {
        
       
        obs1 = new ArrayList<>();
        obs2 = new ArrayList<>();
        
    }
    
    
    
    public void observacion1(int dato){
        obs11 = new Observaciones();
        obs11.prueba = dato;
        registro1(obs11);
    }
    public void observacion2(int dato){
        obs22 = new Observaciones();
        obs22.prueba = dato;
        registro2(obs22);
    }
    
    private void registro1(Observaciones dato){
        obs1.add(dato);
    }
    private void registro2(Observaciones dato){
        obs2.add(dato);
    }
    private int contador (ArrayList obs1,ArrayList obs2){
        int cont=0;
        for (int i = 0; i < obs1.size(); i++) {
            cont++;
        }
        for (int i = 0; i < obs2.size(); i++) {
           cont++;              
        }
        return cont;
    }
    
    
    
    public void mescla () {
        int cont=contador(obs1,obs2);
        contadorr = cont;
        rangos= new double[2][contador(obs1,obs2)];
        int arraux[]=new int[cont];
        //System.out.println();
        int h =0;
        for (Observaciones elemento: obs1){
            //System.out.println(elemento.prueba);
            rangos[0][h]=elemento.prueba;
            h++;
        }
        
        for (Observaciones elemento: obs2){
            //System.out.println(elemento.prueba);
            rangos[0][h]=elemento.prueba;
            h++;

        }
       
        for (int i = 0 ; i<cont;i++){
            arraux[i]=(int)rangos[0][i];
        }
        for (int i = 0 ; i<cont;i++){
            System.out.print(arraux[i]);
        }
       
        System.out.println("--");      
        for (int i = 0 ; i<cont;i++){
            for(int j= 0; j < cont-1; j++){
                if (arraux[j]> arraux[j+1]){
                    int  aux2 =arraux[j];
                    arraux [j]=arraux [j+1];
                    arraux [j+1]=aux2;                                     
                }
            } 
        }
        for (int i = 0 ; i<cont;i++){
            rangos[0][i]=arraux[i];
        }
        System.out.println("--");  
        for (int i = 0 ; i<2;i++){
            for(int j = 0; j <cont; j++){
                System.out.print(rangos[i][j]+"   "); 
            } 
            System.out.println("   ");
        }
        int i=0;
        while( i<cont-1){
            int ind=i+1;
            int contn=1;
            for(int j = i+1; j <cont; j++){
                if (arraux[i]==arraux[j]){
                    contn++;
                    ind+=j+1;
                }
            }
            double aux=(double)ind /(double)contn;
            System.out.println(ind+" / "+contn+" = "+aux);
            int asx=i;
            while (rangos[0][i]==arraux[asx]){
                rangos[1][i]=aux;
                i++;
            }
            
            
        }
        if (rangos[0][cont-1]!=rangos[0][cont-2]){
            rangos [1][cont-1]= cont;
        }else{
            rangos [1][cont-1]= rangos[1][cont-2];
        }
        
        System.out.println("--");  
        for ( i = 0 ; i<2;i++){
            for(int j = 0; j <cont; j++){
                System.out.print(rangos[i][j]+"   "); 
            } 
            System.out.println("   ");
        }
        
        for (Observaciones elemento: obs1){
            for( i=0;i<cont;i++){
                if (elemento.prueba ==rangos[0][i]){
                    elemento.rango=rangos[1][i];
                }
            }            
        } 
        for (Observaciones elemento: obs2){
            for( i=0;i<cont;i++){
                if (elemento.prueba ==rangos[0][i]){
                    elemento.rango=rangos[1][i];
                }
            }            
        }
    }
            
    public ArrayList obs1(){
        return obs1;
    }
    public ArrayList obs2(){
        return obs2;
    }
    
    public double [][] Vectrango(){
        return rangos;
    }
    
            
    public double rango1(){
        double suma=0;
        for (int i = 0; i < obs1.size(); i++) {
            suma += obs1.get(i).rango;
            
        }
        return suma;
        
    }
    public double rango2 (){
        double suma=0;
        for (int i = 0; i < obs2.size(); i++) {
            suma += obs2.get(i).rango;
            
        }
        System.out.println(suma);
        return suma;
    }
    public int  tamanoN1(){
        int N1;
        N1 = obs1.size();
        return N1;
    }
    public int tamanoN2(){
        int N2;
        N2 = obs2.size();
        return N2;
    }
    
    public double Umedia(){
       int N1,N2;
       double R1,U;
       N1 = tamanoN1();
       N2 = tamanoN2();
       R1 = rango1();
       
       U = N1*N2+(N1*(N1+1)/2)-R1;
        System.out.println(U);
        return U;
    }
    
    public double mediaPobla(){
       int N1,N2;
       double Mp;
       N1 = tamanoN1();
       N2 = tamanoN2();
       Mp = (N1*N2)/2;
       System.out.println(Mp);
       return Mp;
    }
    
    
    public double desviacionEstandar(){
       int N1,N2;
       double Des;
       N1 = tamanoN1();
       N2 = tamanoN2();  
       Des =(N1*N2*(N1+N2+1)/12);
       System.out.println(Des);  
       return Des;
    }
    
    public double Zestandar(){
        double Z = (Umedia()-mediaPobla())/Math.pow(desviacionEstandar(), 0.5);
        return  Z ;
    }
    
    public double calculaz(double v){ //funcion de densidad de probabilidad normal
        double N=Math.exp(-Math.pow(v, 2)/2)/Math.sqrt(2*Math.PI);
        return N;
    }
    public double calculazacum(double v){  //Funcion de distribucion de probabilidad normal
        double acumulador = 0.00000028666;
        for(double i=-5;i<v;i=i+0.00001){
                acumulador = acumulador + (0.00001 * calculaz(i-0.000005));
        }
        return acumulador;
    }
   
}
