public class App {
    public static void main(String[] args) throws Exception {

        público  estático  int  tamv = 0 ;
        Escáner estático  público leer = nuevo Escáner ( Sistema . en );  
   
       public  static  void  main ( String [] args ) lanza  una excepción {
   
           booleano  condiciosalida = verdadero ;
   
           hacer {
   
               intentar {
   
                   Sistema . afuera . imprimir (
                           "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo " );
                   tamv = leer . siguienteInt (); //10
                   condiciosalida = ( tamv >= 2 && tamv <= 16 ) ? falso verdadero ;​
   
               } captura ( Excepción  e ) {
                   Sistema . afuera . println ( e );
                   Sistema . afuera . println ( "Ocurrio algo revisar, parece que estas ingresando datos enteros" );
                   leer . Proxima linea ();
               }
   
           } mientras ( condiciosalida );
   
           //recibimos el array del metodo
           int  array [] = llenado ();
   
           Sistema . afuera . println ( "Mostrar" );
   
           Mostrar ( matriz );
   
           int [] arrayInvertido = Invertir ( matriz );
           Sistema . afuera . println ( "Arreglo invertido:" );
           Mostrar ( arrayInvertido );
           Sistema . afuera . println ( "Amén" );
       }
   
   
       public  static  int [] llenado () {
   
           int [] arreglo = new  int [ tamv ];
   
           for ( int  i = 0 ; i < arreglo . longitud ; i ++) {
               Sistema . afuera . println ( "ingrese el valo [" + i + "]" );
               arreglo [ i ] = leer . siguienteInt ();
           }
           //Hay que hacer que mire bonito
   
            arreglo de regreso ;
       }
   
   
       //Aqui va el metodo de inverso
       //los voy a aplazar a todos ☻
   
   
       //para que se vea bonito
       public  static  void  Mostrar ( int [] a ) {
           Sistema . afuera . imprimir ( "[" );
           para ( int  i = 0 ; i < a . longitud ; i ++) {
               Sistema . afuera . imprimir ( a [ yo ]);
               si ( yo < a . longitud - 1 ) {
                   Sistema . afuera . imprimir ( ", " );
               }
           }
           Sistema . afuera . println ( "]" );
       }
   
   
       //método de invertido
       public  static  int [] Invertir ( int [] a ) {
           int [] invertido = nuevo  int [ a . longitud ];
           for ( int  i = 0 , j = a . longitud - 1 ; i < a . longitud ; i ++, j -) {
               invertido [ i ] = a [ j ];
           }
           volver  invertido ;
       }
   
   }
   
   



    
   




    




        
