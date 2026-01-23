//Andrés Palomino Cassain
//45614964F
//14/10/2025

package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Declaramos las variables que van a ser utilizadas
        int ronda=0; //Rondas jugadas
        int numerorondas; //Numero de rondas indicadas
        int respuesta; //Respuestas jugador
        int vidas=2; //Vidas jugador
        //Respuestas posicion
        int op1=0;
        int op2=0;
        int op3=0;

        //Respuestas correctas
        String InsultosBuenos[] = new String[3]; 
        InsultosBuenos[0] = "¿Es que TANTO me parezco a tu hermana?";
        InsultosBuenos[1] = "Pues tu aliento debería considerarse igual.";
        InsultosBuenos[2] = "Qué apropiado, tú peleas como una vaca.";

        //Respuestas incorrectas
        String InsultosMalos[] = new String[6];
        InsultosMalos[0] = "La única forma en la que te conservarás será disecado.";
        InsultosMalos[1] = "Entonces se un buen perro ¡Siéntate! ¡Quieto!";
        InsultosMalos[2] = "Grrrr... No me imaginaba que supieras contar hasta tan alto.";
        InsultosMalos[3] = "Ah, ¿Ya has obtenido ese trabajo de barrendero?";
        InsultosMalos[4] = "¿Por qué? ¿Acaso querías pedir uno prestado?";
        InsultosMalos[5] = "Estaría acabado si la usases alguna vez.";

        //Insultos piratas
        String piratas[] = new String[3]; 
        piratas[0] = "Eres tan repulsivo como una mona marrana.";
        piratas[1] = "Dicen que mis puños son un arma letal.";
        piratas[2] = "¡Luchas como un granjero! ";

        //Bienvenida al juego
        System.out.println("Bienvenido a la batalla de insultos de Monkey Island!");
        System.out.println("Un pirata te insultará y debes elegir una respuesta para dicho insulto, dependiendo de la calidad de tu respuesta se te sumarán o restarán puntos");
        System.out.println("La partida acabará cuando llegues a cero puntos, superes las rondas indicadas o salgas pulsando la tecla 0");

        //Usuario indica el numero de rondas
        System.out.println("Elige el numero de rondas que quieres jugar");
        numerorondas = sc.nextInt();

        //Inicio del juego, si te quedas sin vidas, llegas a la ronda indicadas o si elijes la opcion 0, sales del juego
        while (ronda < numerorondas) { 

            //Pirata aleatorio de los 3 indicados
            System.out.println(piratas[random.nextInt(piratas.length)]);

            //Caso de cada uno de los piratas y sus respuestas, el orden cambia entre cada uno con una buena prefijada y 2 malas de las elegidas                                 
            //Variable de aleatorizacion de opciones
            int opciones = random.nextInt(3);
            
            if (opciones==0){
                op1 = 2;
                op2 = 1;
                op3 = 3;
                System.out.println("1. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("2. " + InsultosBuenos[random.nextInt(InsultosBuenos.length)]);
                System.out.println("3. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("0. Salir del juego");
            }
            else if (opciones==1){
                op1 = 1;
                op2 = 2;
                op3 = 3;
                System.out.println("1. " + InsultosBuenos[random.nextInt(InsultosBuenos.length)]);
                System.out.println("2. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("3. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("0. Salir del juego");
            }
            else if (opciones==2){
                op1 = 3;
                op2 = 2;
                op3 = 1;
                System.out.println("1. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("2. " + InsultosMalos[random.nextInt(InsultosMalos.length)]);
                System.out.println("3. " + InsultosBuenos[random.nextInt(InsultosBuenos.length)]);
                System.out.println("0. Salir del juego");
            }

            //Solicitamos al usuario una respuesta
            System.out.println("Elige una de las 3 respuestas o sal del juego");
            respuesta = sc.nextInt();

            //Casos tras respuesta
            while (respuesta < 0 || respuesta > 3) {
                System.out.println("Error, elije un numero entre el 0 y el 3");
                respuesta = sc.nextInt();
            }
            if (respuesta==op1){
                System.out.println("Golpe asestado!");
                    vidas++; 
                    System.out.println("Ganas 1 vida! Enhorabuena");
                    System.out.println("Te quedan " +vidas+ " vidas");
                    ronda++;
            }
            else if (respuesta == op2 || respuesta == op3){
                System.out.println("Fallo!");
                System.out.println("Pierdes una vida");
                vidas--;
                System.out.println("Te quedan " +vidas+ " vidas");
                ronda++;
            }
            
            //Si pulsas la tecla 0 corta el juego
            else if (respuesta == 0){
                ronda = numerorondas;
            }

            //Si llegas a 0 vidas corta el juego
            if (vidas == 0){
                ronda = numerorondas;
            }

        }

        //Recuento de puntos
            System.out.println("Fin del juego! Has terminado con "+vidas+ " vidas.");
            if (vidas <= 0) {
                System.out.println("Has terminado el juego sin vidas, los loros se ríen de ti");
            } else if (vidas >= 1 && vidas <=5){
                System.out.println("Te has defendido como un buen marinero");
            }
            else {
                System.out.println("Eres el rey de los piratas");
            }
                
            //Nos despedimos del usuario y cerramos scanner
            System.out.println("Gracias por jugar, nos vemos pronto tripulante!");
            sc.close();                  
        }
    }