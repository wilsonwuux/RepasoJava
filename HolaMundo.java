// El codigo siempre debe ir dentro de una clase 
class HolaMundo {
// El codigo siempre debe ir dentro de una clase 
    public static void main(String[] args){
        System.out.println("Bienvenido a JAVA");
        System.out.println("Tipos de Datos");
        // Tipos de Dato primitivos enteros, byte, short , int, long
                // long	8	–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
                // int	4	–2,147,483,648 a 2,147,483,647
                // short	2	–32,768 to 32,767
                // byte	1	–128 to 127
            byte diasMes = 31; //Aproximadamente
            short diasLustro = (12 * 31) * 5;
            int velocidadLuz = 299792458;
            long yearLuz = velocidadLuz * 365;
                System.out.println("esto es un byte ");
                System.out.println(diasMes);
                System.out.println("esto es un Short ");
                System.out.println(diasLustro);
                System.out.println("esto es un int ");
                System.out.println(velocidadLuz);
                System.out.println("esto es un long ");
                System.out.println(yearLuz);
        // Tipos de Dato primitivos flotantes float double
        // double	8	4.9e–324 to 1.8e+308
        // float	4	1.4e–045 to 3.4e+038
            float pi = 3.1415926535f;
            double e = 2.718281828459045235360;
                System.out.println("esto es un float ");
                System.out.println(pi);
                System.out.println("esto es un double ");
                System.out.println(e);
        // Tipos de Dato primitivos Textos char String
        // char letraA = 'a';
        // char letraANumerico = 61;
        // String letraA = 'a';
            char Simbolo = '#';
            String texto = "Esto es un texto string";
                System.out.println("esto es un char ");
                System.out.println(Simbolo);
                System.out.println("esto es un String ");
                System.out.println(texto);
        // Tipos de Dato primitivos Boleanos 
            boolean verdadero = true;
            boolean falso = false;
                System.out.println("boolean almacena un boleanos ");
                System.out.println(verdadero);
                System.out.println(falso);

        System.out.println("Multiples variables ");
        // Multiples variables
            int num1=10,num2=20,num3=101;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        // Operaciones aritmeticas
            System.out.println(" esto es una Suma ");
            int Suma = num1 +10;
            System.out.println(Suma);
            System.out.println(" esto es una Resta ");
            int Resta = num1 -num2;
            System.out.println(Resta);
            System.out.println(" esto es una Multiplicar ");
            int Multiplicar = num2 *num3;
            System.out.println(Multiplicar);
            System.out.println(" esto es una Dividir ");
            int Dividir = num3 /num1;
            System.out.println(Dividir);
            System.out.println(" esto es una Incrementar 1 ");
            int incremento = num1 ++;
            System.out.println(incremento);
            System.out.println(" esto es una Decremento 1 ");
            int decremento = num1 --;
            System.out.println(decremento);
        // asignacion de decrementos y aritmeticos 
            System.out.println(" esto es una asignacino incrmeneto en valor");
            num1 += 100;
            System.out.println(num1);
            System.out.println(" esto es una asignacino decremento en valor");
            num1 -= 20;
            System.out.println(num1);
            System.out.println(" esto es una asignacino en valor por multiplicacion");
            num1 *= 10;
            System.out.println(num1);
            System.out.println(" esto es una asignacino en valor por division");
            num1 /= 20;
            System.out.println(num1);
        // CONSTANTES 
            final float NumeroPi;
            System.out.println(" esto es una Constante hace uso de la palabra final");
            NumeroPi=3.1415f;
            System.out.println(NumeroPi);
        // CASTING
            System.out.println(" esto es una conversion de numeros entero flotantes");
            int variableX=10;
            float variablez=5.5f;
            int result = variableX + (int)variablez;//necesitamos pasar a entero
            System.out.println(result);
            float result2 = (float)variableX + variablez;//necesitamos pasar a float
            System.out.println(result2);
        // Operadores relacionales 
        System.out.println(" Operadores lacionales <, <=, >, >=, ==, !=");
        int dato1 = 10 , dato2= 20;
        boolean comparacion;
            comparacion = dato1 > dato2;
            System.out.println(comparacion);
            comparacion = dato1 >= dato2;
            System.out.println(comparacion);
            comparacion = dato1 < dato2;
            System.out.println(comparacion);
            comparacion = dato1 <= dato2;
            System.out.println(comparacion);
            comparacion = dato1 == dato2;
            System.out.println(comparacion);
            comparacion = dato1 != dato2;
            System.out.println(comparacion);
        // Operadores logicos 
        System.out.println(" Operadores logicos and=&&, or=||, not=!");
            comparacion = dato1 > dato2 && dato1 >= dato2;
            System.out.println(comparacion);
            comparacion = dato1 < dato2 || dato1 <= dato2;
            System.out.println(comparacion);
            comparacion = dato1 == dato2 && dato1 != dato2;
            System.out.println(!comparacion);
        // Operador ternario Si esto o esto IFTTT
        // expresion1 ? expresin2 : expresion 3
        // true ? si es verdadero haz esto : sies es falso haz esto otro
            int Persona;
            Persona = 18;
                String Autorizado = Persona > 18 ? " Pase autorizado " : " Pase Denegado ";
                    System.out.println("Autorizar solo mayores de 18");
                    System.out.print("Persona tiene ");
                    System.out.println(Persona);
                    System.out.println(Autorizado);
        // Cadenas de texto Strings 
            System.out.println("Cadenas de texto Strings");
            String textoNuevo="soy un string";
            System.out.println(textoNuevo);
            // Los String son una Clase u Objeto 
                //Metodos 
                    String Mensaje="esto es el test de Strings ";
                    // tamaño de string
                    System.out.println(Mensaje);
                    int tamanio = Mensaje.length();
                    System.out.println(tamanio);
                        //Variable contiene Texto
                        String Contiene = "Mario, Zelda, Pokemon, Metroid";
                        System.out.println(Contiene);
                        boolean resulContener=Contiene.contains("Pokemon");
                        System.out.println("El texto contiene Pokemon ?");
                        System.out.println(resulContener);
                            //Variable contiene Comienza con Letra
                            boolean StarContener=Contiene.startsWith("M");
                            System.out.println("El texto Inicia con M ?");
                            System.out.println(StarContener);
                            //Variable contiene Termina con Letra
                            boolean EndContener=Contiene.endsWith("d");
                            System.out.println("El texto Termina con d ?");
                            System.out.println(EndContener);
                    //Concatenar textos 
                    String NuevoString =Contiene.concat(" Los Mejores Juegos De Mi Infancia ");
                    System.out.println(NuevoString);
                    //Mayusculas 
                    System.out.println(NuevoString.toUpperCase());
                    //Minusculas 
                    System.out.println(NuevoString.toLowerCase());
                    //Quita los espacios 
                    System.out.println(NuevoString.trim());
                    //textos format %s String, %.4f float, %d entero
                    String MensajeCompleto="";
                    String MiNombre ="Wilson";
                    MensajeCompleto=String.format("Hola mi nombre es %s", MiNombre);
                    System.out.println(MensajeCompleto);
                    //Comparacion de Textos 
                    String Cadena1 ="texto";
                    String Cadena2 ="texto";
                    boolean resultadoCadena = Cadena1.equals(Cadena2);
                    System.out.println(resultadoCadena);
        //Condicionales 
        //IF e ELSE IF
        //Ejemplo Semaforo
        String ColorDeLuz="Verde";
            if (ColorDeLuz == "Verde"){
                System.out.println("Puede Continuar");
            }else if(ColorDeLuz == "Amarillo"){
                System.out.println("Redusca la Velocidad");
            }else if(ColorDeLuz == "Rojo"){
                System.out.println("Alto No Puede Continuar");
            }else{
                System.out.println("Color No valido");
            };
            
        //SWITCH
        //Ejemplo Semaforo
        switch (ColorDeLuz){
            case "Verde":
                System.out.println("Puede Continuar");
                break;
            case "Amarillo":
                System.out.println("Redusca la Velocidad");
                break;
            case  "Rojo":
                System.out.println("Alto No Puede Continuar");
                break;
            default:
                System.out.println("Color no valido");
                
            }
        //CICLOS 
        //WHILE
        int contador1 =1;
        while (contador1 < 5){
            System.out.println("Soy While");
            contador1++;
        }
        //DO WHILE
        int contador2 =10;
        do{
            System.out.println("Soy Do While");
            contador2++;
        }while (contador2 < 5);
        // FOR TERNARIO
        
        for(int Personas = 25 ;  Personas > 18 ;System.out.println(Personas), Personas--){};
        
        for(int multi = 1 ;  multi <= 10 ; multi++){
            int valor=9;
            int resultado=multi*valor;
            System.out.println(multi + " x " + valor + " = " + resultado);
        };

        for(int Par = 1 ;  Par <= 10 ; Par++){
            if(Par %2 ==0){
                System.out.println(Par);
            }
        };

        for(int aterisco = 0; aterisco <=6; aterisco++) { 
            for(int ater2 = 0; ater2 < aterisco; ater2++) { 
                System.out.print("*"); } 
                System.out.println("");}
    }
}