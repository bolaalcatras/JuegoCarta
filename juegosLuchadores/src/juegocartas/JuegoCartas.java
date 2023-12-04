/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ SENA
 */
public class JuegoCartas {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int opc = 0;
      Scanner sc = new Scanner(System.in);
      
       System.out.println("Bienvenido al juego de luchadores.");
        System.out.print("Jugador 1, ingresa tu nombre: ");
        String nombreJugador1 = sc.next();
        System.out.print("Jugador 2, ingresa tu nombre: ");
        String nombreJugador2 = sc.next();
        
        
        
 
           System.out.println("menu");
           
           System.out.println("1: raza 1");
           
          System.out.println("2: raza 2");
         opc=sc.nextInt();
         
        switch(opc ){
            case 1:
                int s= 0;
                
               int dl=0,desc=0;   
                  Raza1 l1 = new Raza1("1",100,20,10,10);
                  Raza1 l2 = new Raza1("2",100,20,10,10);
                  
                   
       
     

        
        
        while(l1.getHp()>0 | l2.getHp()>0)
    {
      
         int op=0;
         
          dl = (int) (Math.random() * (2 - 1+1)) + 1;    
          
          if(dl==1){
         System.out.println("TURNO DEL PRIMER JUGADOR  "+l1.nombre);
          
          System.out.println(" " ); 
         System.out.println(" "+l1.nombre +"seleccione su atake :");
           System.out.println("1.atacar ");
           System.out.println("2. curar");
           op = sc.nextInt();
           
           switch(op){
               
               case 1:
                 {
                      l1.atacar(l2);
                        System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+"HP= "+l1.hp);
             System.out.println(""+l2.nombre+"HP= "+l2.hp);
                   
                   }
                    
             
               break;
               case 2:
                   
               break;
               case 3:
                   
               break;
               case 4:
                   
               break;
               case 5:
                   
               break;
           }
          
          
                              //inicio jugador 2
               
          } if(dl==2){
                   System.out.println("TURNO DEL SEGUNDO JUGADOR  "+l2.nombre);
          System.out.println(" "+l2.nombre+" seleccione su atake");
         System.out.println("");
           System.out.println("1.atacar ");
           System.out.println("2. curar ");
           op = sc.nextInt();
                   
                    switch(op){
               
               case 1:
                  
                       
                    l2.atacar(l1);
                    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+"HP= "+l1.hp);
             System.out.println(""+l2.nombre+"HP= "+l2.hp);
                    
                   
                   
                    
                   
                    
                    
               break;
               case 2:
                   
               break;
               case 3:
                   
               break;
               case 4:
                   
               break;
               case 5:
                   
               break;
                    }
             
           
                    }
    
                    if (l1.hp<=0) {
         System.out.println("EL GANADOR ES: "+l2.nombre);
     }
     else {
         System.out.println("EL GANADOR ES: "+l1.nombre);
    
     
            
               }
                   
         
           }
         
                   
                   
      }
    
    }
}
        






















































































//          if(op==1){
//             
//               l1.atacar(l2);
//               System.out.println("TABLA DE VIDA ");
//            System.out.println(""+l1.nombre+"HP= "+l1.hp);
//              System.out.println(""+l2.nombre+"HP= "+l2.hp);
//         }
//    else if(op==2){  
//                   
//                
//                      
//              }
//    
//      
//      
//    
//    
//    
//      if(dl==2){
//         System.out.println("Gano el jugador "+l2.nombre);
//          System.out.println(" "+l2.nombre+" seleccione su atake");
//         System.out.println("");
//           System.out.println("1.atacar ");
//           System.out.println("2. curar ");
//           op = sc.nextInt();
//      }
//          if(op==1){
//              
//         l2.atacar(l1);
//          System.out.println(""+l1.nombre+"HP= "+l1.hp);
//              System.out.println(""+l2.nombre+"HP= "+l2.hp);
//              }
//                   
//          else if(op==2){
//   
//    }
//      
//          else if(op==3){
//              
//          }
//          else if(op==4){
//              
//          }
//    }
//                 
//    
//        
//    
//  
//    System.out.println(" ");
//    System.out.println("Alejandro: "+l1.getHp());
//    System.out.println("Pepe: "+l2.getHp());
//    
//     if (l1.hp<=0) {
//         System.out.println("EL GANADOR ES: "+l2.nombre);
//     }
//     else {
//         System.out.println("EL GANADOR ES: "+l1.nombre);
//         
//         
//     }
//    
//                break;
//                case 2:
//    
//    
//                
//                
//                break;
//                
//                
//                case 3:
//                    
//                    
//                break;
//           
//     }
//    }
//        }
//    
//   
//
//


//                 + " ("+"HP=" +l1.hp + ")"); 
                
//                 while (l1.estaVivo() && l2.estaVivo()){
//                     
//                     
//                     
//                     
//               
//                     System.out.println("Turno de " + l1.nombre + " (" +l1.hp + ")");
//                     
//            int op;
//              System.out.println("Elige una acción:");
//            System.out.println("1.curar ");
//            System.out.println("2. robar vida");
//            op = sc.nextInt();
//             if (op ==1 ){
//                 l1.Curar(l2);
//             }
//             else if (op==2){
//                     l1.Robarvida(l2);
//                 }
//                     
//                   else {
//                System.out.println("Opcion no valida, pierdes el turno sigue el otro.");
//            }
//             
//            if (l2.estaVivo()) {
//                System.out.println(l1.nombre + " gana la pelea");
//                
//            }
//             
//             System.out.println("\nTurno de " + l2.nombre + " (" + l2.hp + ")");
//            op = sc.nextInt();
//
//            System.out.println("Elige una acción:");
//            System.out.println("1. Atacar");
//            System.out.println("2. Usar habilidad especial");
//            op= sc.nextInt();
//
//            if (op == 1) {
//                l2.atacar(l1);
//            } else if (op== 2) {
//                l2.Curar(l1);
//            } else {
//                System.out.println("Opción no válida, se pierde el turno.");
//            }
//
//            if (l1.estaVivo()) {
//                System.out.println(l2.nombre + " gana la pelea!");
//                break;
//                 }
//                 }
//        
//    
                
                
               
        
        
        
       
    
        
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    


//        System.out.println("guerrero 1 ");
//        Raza1 l1=new Raza1(" goku", 1000,   100, 100,100);
//       
//        l1.Curar();
//        System.out.println("guerrero 2 ");
//        Raza2 l2=new Raza2("vegeta",1000,100,100,100);
//        l2.Ataquefuego();
//        l2.Robarvida();
//         System.out.println("guerero 3");
//        Raza3 l3=new Raza3("krilin",1000,100,100,100);
//        l3.Dobleataque();
        
//        
//        
//        int dl1=0,dl2=0;    
//   
//    Raza1 l1 = new Raza1("Alejandro",200,100,90,60);
//    Raza1 l2 = new Raza1("Pepe",200,100,90,60);
//   
//   while(l1.getHp()>0 && l2.getHp()>0)
//    {
//      dl1 = (int) (Math.random() * (6 - 1+1)) + 1;//dado luchador 1  
//      dl2 = (int) (Math.random() * (6 - 1+1)) + 1;//dadoluchador 2      
//     
//      System.out.println("Tiro de dados para turno.....");
//      System.out.println("Dado luchador 1: "+dl1);
//      System.out.println("Dado luchador 2: "+dl2);
//      System.out.println(" ");
//         
//      if(dl1>dl2){
//         System.out.println("Gano luchador 1 pega:");
//         System.out.println("Ataca:"+l1.getNombre());
//         l1.atacarLuchador(l2);
//        }
//      else if(dl2>dl1){
//         System.out.println("Gano luchador 2 pega:");
//         System.out.println("Ataca:"+l2.getNombre());
//         l2.atacarLuchador(l1);
//        }
//    }
//  
//    System.out.println(" ");
//    System.out.println("Alejandro: "+l1.getHp());
//    System.out.println("Pepe: "+l2.getHp());
//   
//   
//}
//    }
        
        
        
        
    
    

