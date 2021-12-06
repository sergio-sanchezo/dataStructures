//INICIO INTERFAZ GRAFICA
package proyecto;

import java.util.*;
import javax.swing.JFrame;
public class main {

    public static void printMenu(){
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Digite una de las opciones entre (1-5), (-1) para salir :");
        System.out.println ("1. Método pushFront");
        System.out.println ("2. Método popFront");
        System.out.println ("3. Método pushBack");
        System.out.println ("4. Método popBack");
        System.out.println ("5. Método insertByPrice (Solo para lista enlazada)");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
    }
    public static void printMenCantidad(){
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Seleccione con cual cantidad de datos desea trabajar entre (1-5):");
        System.out.println ("1. 10,000");
        System.out.println ("2. 100,000");
        System.out.println ("3. 1'000,000");
        System.out.println ("4. 10'000,000");
        System.out.println ("5. 100'000,000 (Cantidad poco procesable)");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
    }
    public static int cantidadDatos(int x){
        int datos = 0;
        if(x == 1){
            datos = 10000;
        }
        if(x == 2){
            datos = 100000;
        }
        if(x == 3){
            datos = 1000000;
        }
        if(x == 4){
            datos = 10000000;
        }
        if(x == 5){
            datos = 100000000;
        }
        return datos;
    }
    public static void main(String[] args) {

        linkedList listTM = new linkedList();
        linkedList listCPU = new linkedList();
        linkedList listGF = new linkedList();
        
            Tarjeta_Madre tm1 = new Tarjeta_Madre("Supermicro MBD-X10DAX","2 x LGA2011-3","EATX",2000,16,"Green / Black",-1,575.20);
            Tarjeta_Madre tm2 = new Tarjeta_Madre("Asus Z10PE-D16 WS","2 x LGA2011-3","SSI EEB",1024,16,"Black / Gold",-1,0);
            Tarjeta_Madre tm3 = new Tarjeta_Madre("ASRock EP2C612D16C-4L","2 x LGA2011-3 Narrow","SSI EEB",1024,16,"Green / Blue",0,349.99);
            Tarjeta_Madre tm4 = new Tarjeta_Madre("Supermicro MBD-X10DRI-O","2 x LGA2011-3 Narrow","EATX",1024,16,"Black / Green",0,578.54);
            Tarjeta_Madre tm5 = new Tarjeta_Madre("ASRock EP2C602-4L/D16","2 x LGA2011","SSI EEB",512,16,"Blue / White",-3,431.89);
            Tarjeta_Madre tm6 = new Tarjeta_Madre("ASRock EP2C602-4L/D16","2 x LGA2011","SSI EEB",2050,16,"Blue / White",-3,400);
            
            Cpu cpu1 = new Cpu("AMD Ryzen 5 5600X",6,3.7,4.6,65,"None",true,-351,299);
            Cpu cpu2 = new Cpu("AMD Ryzen 7 5800X",8,3.8,4.7,105,"None",true,-191,369);
            Cpu cpu3 = new Cpu("AMD Ryzen 9 5900X",6,3.6,4.2,65,"None",true,-1068,241.99);
            Cpu cpu4 = new Cpu("AMD Ryzen 5 5600X",12,3.7,4.8,105,"None",true,-117,524);
            Cpu cpu5 = new Cpu("AMD Ryzen 5 5600G",6,3.7,4.4,65,"Radeon Vega 7",true,-16,239);

            Graficadora gf1 = new Graficadora("PNY VCNRTXA6000-PB","RTX A6000",48,1455,1860,"Black / Gold",266.7,0,4990.13);
            Graficadora gf2 = new Graficadora("PNY VCQRTX8000-PB","Quadro RTX 8000",48,1395 ,1770,"Black / Gold",266.7,0,5600.10);
        
            
            listTM.pushBack(tm2);
            listTM.pushBack(tm5);
            listTM.pushBack(tm3);
            listTM.pushBack(tm1);
            listTM.pushBack(tm4);
            
            listCPU.pushBack(cpu2);
            listCPU.pushBack(cpu5);
            listCPU.pushBack(cpu3);
            listCPU.pushBack(cpu1);
            listCPU.pushBack(cpu4);
            
            listGF.pushBack(gf1);
            listGF.pushBack(gf2);
        
        JFrame interfazGrafica = new JFrame("Ventana Lista de Componentes");
        InterfazUsuario listaComponentes = new InterfazUsuario(listTM,listCPU,listGF);
        listaComponentes.setBounds(400, 150, 920, 430);
        listaComponentes.setVisible(true);
        listaComponentes.setDefaultCloseOperation(3);
    }
    
    
}//FIN INTERFAZ GRAFICA


//INICIO PARA TOMAR TIEMPOS

/*package proyecto;

import java.util.*;
import javax.swing.JFrame;
public class main {

    public static void printMenu(){
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Digite una de las opciones entre (1-5), (-1) para salir :");
        System.out.println ("1. Método pushFront");
        System.out.println ("2. Método popFront");
        System.out.println ("3. Método pushBack");
        System.out.println ("4. Método popBack");
        System.out.println ("5. Método insertByPrice (Solo para lista enlazada)");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
    }
    public static void printMenCantidad(){
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Seleccione con cual cantidad de datos desea trabajar entre (1-5):");
        System.out.println ("1. 10,000");
        System.out.println ("2. 100,000");
        System.out.println ("3. 1'000,000");
        System.out.println ("4. 10'000,000");
        System.out.println ("5. 100'000,000 (Cantidad poco procesable)");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
    }
    public static int cantidadDatos(int x){
        int datos = 0;
        if(x == 1){
            datos = 10000;
        }
        if(x == 2){
            datos = 100000;
        }
        if(x == 3){
            datos = 1000000;
        }
        if(x == 4){
            datos = 10000000;
        }
        if(x == 5){
            datos = 100000000;
        }
        return datos;
    }
    public static void main(String[] args) {

        

        int opcion = 0;
        int opcionEstructura = 0;
        int numeroDatos = 0;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Seleccione una de las siguientes estructuras entre (1-5):");
        System.out.println ("1. Lista Enlazada");
        System.out.println ("2. Pila");
        System.out.println ("3. Cola");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
        opcionEstructura = entrada.nextInt();
        
        System.out.println ("**************************************************");
        System.out.println ("**************************************************");
        System.out.println ("Seleccione con cual cantidad de datos desea trabajar entre (1-5):");
        System.out.println ("1. 10,000");
        System.out.println ("2. 100,000");
        System.out.println ("3. 1'000,000");
        System.out.println ("4. 10'000,000");
        System.out.println ("5. 100'000,000 (Cantidad poco procesable)");
        System.out.println ("***************************************************");
        System.out.println ("**************************************************");
        numeroDatos = entrada.nextInt();
        if(numeroDatos >5 && numeroDatos<1 ){
            System.out.println ("Ingrese Solamente una opcion entre (1-5)");
            printMenCantidad();
            numeroDatos = entrada.nextInt();
        }
        numeroDatos = cantidadDatos(numeroDatos);
        if(opcionEstructura == 1){
            linkedList list = new linkedList();

            Tarjeta_Madre tm1 = new Tarjeta_Madre("Supermicro MBD-X10DAX","2 x LGA2011-3","EATX",2000,16,"Green / Black",-1,575.20);
            Tarjeta_Madre tm2 = new Tarjeta_Madre("Asus Z10PE-D16 WS","2 x LGA2011-3","SSI EEB",1024,16,"Black / Gold",-1,0);
            Tarjeta_Madre tm3 = new Tarjeta_Madre("ASRock EP2C612D16C-4L","2 x LGA2011-3 Narrow","SSI EEB",1024,16,"Green / Blue",0,349.99);
            Tarjeta_Madre tm4 = new Tarjeta_Madre("Supermicro MBD-X10DRI-O","2 x LGA2011-3 Narrow","EATX",1024,16,"Black / Green",0,578.54);
            Tarjeta_Madre tm5 = new Tarjeta_Madre("ASRock EP2C602-4L/D16","2 x LGA2011","SSI EEB",512,16,"Blue / White",-3,431.89);
            Tarjeta_Madre tm6 = new Tarjeta_Madre("ASRock EP2C602-4L/D16","2 x LGA2011","SSI EEB",2050,16,"Blue / White",-3,400);
            
            for (int j = 0; j < numeroDatos/5; j++) {
            list.pushBack(tm2);
            }
            for (int j = 0; j < numeroDatos/5; j++) {
            list.pushBack(tm5);
            }
            for (int j = 0; j < numeroDatos/5; j++) {
                list.pushBack(tm3);
            }
            for (int j = 0; j < numeroDatos/5; j++) {
                list.pushBack(tm1);
            }
            for (int j = 0; j < numeroDatos/5; j++) {
                list.pushBack(tm4);
            }
            
            while(opcion != -1){
                printMenu();
                opcion = entrada.nextInt();
            
                if(opcion == 1){
                    long startTime = System.nanoTime();
                    list.pushFront(tm6);
                    long endTime = System.nanoTime();
                    System.out.println("El tiempo de ejecución del método pushFront fue de:"+(endTime-startTime)+" ns");
                    System.out.println(list.sizeLinkedList()+" Datos");
                }
                if(opcion == 2){
                    long startTime = System.nanoTime();
                    list.popFront();
                    long endTime = System.nanoTime();
                    System.out.println("El tiempo de ejecución del métedo popFront fue de:"+(endTime-startTime)+" ns");
                    System.out.println(list.sizeLinkedList()+" Datos");
                }
                if(opcion == 3){
                    long startTime = System.nanoTime();
                    list.pushBack(tm6);
                    long endTime = System.nanoTime();
                    System.out.println("El tiempo de ejecución del método pushBack fue de:"+(endTime-startTime)+" ns");
                    System.out.println(list.sizeLinkedList()+" Datos");
                }
                if(opcion == 4){
                    long startTime = System.nanoTime();
                    list.popBack();
                    long endTime = System.nanoTime();
                    System.out.println("El tiempo de ejecución del método porBack fue de:"+(endTime-startTime)+" ns");
                    System.out.println(list.sizeLinkedList()+" Datos");
                }
                if(opcion == 5){
                    long startTime = System.nanoTime();
                    list.insertByPrice(tm6);
                    long endTime = System.nanoTime();
                    System.out.println("El tiempo de ejecución del método insertByPrice fue de:"+(endTime-startTime)+" ns");
                    System.out.println(list.sizeLinkedList()+" Datos");
                }
            }
        }if(opcionEstructura == 2){
            System.out.println ("PILA");
        }
        if(opcionEstructura == 3){
            System.out.println ("COLA");
        }else{
            System.out.println ("FIN DEL PROGRAMA");
        }
        
    }
    
    
}*/