//Andrés Palomino Cassain
//25/09/25
//45614964F

package es.cide.prog;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1

        System.out.println("Ejercicio 1");

        int registro1; //correcto
        //int 1registro; //incorrecto, ya que comienza con número
        System.out.println("Incorrecto");
        int archivo_3; //correcto
        //int while; //no es correcto ya que usa el mismo nombre que uno de los comandos comunes
        System.out.println("Incorrecto");
        int $impuesto; //correcto
        System.out.println("Correcto");
        int año; //correcto
        System.out.println("Correcto");
        //int primer apellido //incorrecto ya que tiene una separación
        System.out.println("Incorrecto");
        int primer_apellido; //correcto
        System.out.println("Correcto");
        //int primer-apellido; //incorrecto al usar guión
        System.out.println("Incorrecto");
        int primerApellido; //correcto
        System.out.println("Correcto");
        //int Tom's; //incorrecto al usar las comillas, detecta un texto plano
        System.out.println("Incorrecto");
        int C3PO; //correcto
        System.out.println("Correcto");
        //int 123#; //incorrecto al usar una almohadilla, detecta la inserción de un valor
        System.out.println("Incorrecto");
        int PesoMáximo; //correcto, aunque deberíamos evitar las tildes
        System.out.println("Correcto");
        //int %descuento; //incorrecto al empezar con un carácter especial
        System.out.println("Incorrecto");
        int Weight; //correcto
        System.out.println("Correcto");
        int $$preciomínimo; //correcto, aunque deberíamos evitar tildes
        System.out.println("Correcto");
        int _$Único; //correcto, aunque deberíamos evitar tildes
        System.out.println("Correcto");
        int tamaño_máximo; //correcto, aunque deberíamos evitar tildes
        System.out.println("Correcto");
        //int peso.maximo; //incorrecto al usar un punto como separación
        System.out.println("Incorrecto");
        int Precio__; //correcto
        System.out.println("Correcto");
        //int matricula?; //incorrecto al usar un signo de interrogación
        System.out.println("Incorrecto");
        int cuántoVale; //correcto, aunque deberíamos evitar tildes
        System.out.println("Correcto");
        int high; //correcto
        System.out.println("Correcto");
        int barça; //correcto
        System.out.println("Correcto");
        int piragüista; //correcto
        System.out.println("Correcto");
        int B_011; //correcto
        System.out.println("Correcto");
        int X012AB; //correcto
        System.out.println("Correcto");
        //int 70libro; //incorrecto al empezar con un número 
        System.out.println("Incorrecto");
        //int nombre&apellido; //incorrecto al usar el &, detecta una nueva inserción
        System.out.println("Incorrecto");
        //int 0X1A; //incorrecto al empezar con un valor numérico
        System.out.println("Incorrecto");
        //int else; //incorrecto, ya que es una palabra de uso común en código
        System.out.println("Incorrecto");

        //EJERCICIO 2

        System.out.println("Ejercicio 2");

        double medio=0.5; //podría ser float
        System.out.println(medio);

        double medio2=.5;
        System.out.println(medio2);

        double enorme=9.3e12;
        System.out.println(enorme);

        double enorme2=9.3e-12;
        System.out.println(enorme2);

        int grande=12345678; //también podría usarse como long
        System.out.println(grande);

        //12345678_L; // es directamente inutilizable al usar la L tras un _

        // 0.8E+0.8; //inutilizable al usar la E
        
        short si=05_15; //también puede ser float
        System.out.println(si);

        // 018CDF; // inutilizable al usar letras de char, double y float al mismo tiempo

        int oye=0XBC5DA;
        System.out.println(oye);

        int klk=0x87d3a; //float también es utilizable
        System.out.println(klk);

        long mama=234567L;
        System.out.println(mama);

        //0_B11; //inutilizable al usar la B tras _ como separación

        short papa=010101;
        System.out.println(papa);

        short pepe=0_557;
        System.out.println(pepe);

        //.00.8E2; //inutilizable al usar la E

        double saas=.3e3f;
        System.out.println(saas);

        char laal=0b111;
        System.out.println(laal);

        long leel=12_234L;
        System.out.println(leel);

        char tut=0Xabcd;
        System.out.println(tut);

        long tet=0XabcEL;
        System.out.println(tet);

        // _234; //inutilizable al empezar por _

        //1010B; // inutilizable al usar la B

        int lmao=0x1010B;
        System.out.println(lmao);

        double diselo=1_234.2E-2;
        System.out.println(diselo);

        //1234.2EF; //inutilizable debido al EF

        float mamacita=1234.2E3F;
        System.out.println(mamacita);

        //1_1.2e_2; //intulizable debido al 2e_2

        //0bABCDL //inutilizable debido al ABCDL

        byte sloppytoppy=0X1A;
        System.out.println(sloppytoppy);

        long wayback=0X12AL;
        System.out.println(wayback);

        //abcd; //inutilizable debido a la combinacion de letras

        byte blackkk=0125;
        System.out.println(blackkk);

        double iminit=.01011;
        System.out.println(iminit);

        double whitedress=3e12;
        System.out.println(whitedress);

        //3_e12; //inutilizable al usar la e tras el _

        double eazy=-3E-1_2;
        System.out.println(eazy);

        //.8E; //inutilizabe debido al 8E

        //0B1212; //inutilizable

        byte graduation=1_2_3;
        System.out.println(graduation);

        long donda=0xedad;
        System.out.println(donda);

        short mbdtf=0XBE2;
        System.out.println(mbdtf);

        double tclgdrpt=101e2;
        System.out.println(tclgdrpt);

        //B1101; //inutilizable

        //1.34.5; //inutilizable al usar doble decimal

        float latergstr=12.3E4F;
        System.out.println(latergstr);

        //0X12AG; //inutilizable debido al AG

        //EJERCICIO 3

        System.out.println("Ejercicio 3");

        char dbr = 'a';
        System.out.println(dbr);

        char rodeo = '$';
        System.out.println(rodeo);

        char birds = '\n';
        System.out.println(birds);

        //'/n' //inutilizable

        char astroworld='\\';
        System.out.println(astroworld);

        //'\ñ'; //inutilizable debido al uso de la ñ
    
        //"t"; //no funciona debido a las comillas

        char utopia='ñ';
        System.out.println(utopia);

        //'xyz'; //inutilizable

        char overly = '\u0066';
        System.out.println(overly);

        //"XYZ" //no va debido a las comillas

        char section80='4';
        System.out.println(section80);

        char gkmc='\t';
        System.out.println(gkmc);

        char tpab='\b';
        System.out.println(tpab);

        //k //no funciona al ser una letra suelta

        //+ //no funciona al ser un signo suelto

        char untitled='+';
        System.out.println(untitled);

        char damn='?';
        System.out.println(damn);

        char mrmorale='â';
        System.out.println(mrmorale);

        char gnx=':';
        System.out.println(gnx);

        //EJERCICIO 4

        System.out.println("Ejercicio 4");

        //'8:15 PM' no funciona debido a las comillas

        String colores="Rojo, Blanco y Azul";
        System.out.println(colores);

        //"Nombre: invalido ya que tendría que acabar haciendo uso de las comillas "

        //"Capítulo \’3\’" hace uso de la comilla ’ la cual no es correcta

        String calculo="1.3e-1-2";
        System.out.println(calculo);

        String comillas="";
        System.out.println(comillas);

        String comillaespaciada=" ";
        System.out.println(comillaespaciada);

        String AAA="A";
        System.out.println(AAA);

        // "FP' usa dos tipos de comillas distintas así que genera un error

        String asignatura=" programación ";
        System.out.println(asignatura);

        // "programación "Java"" usa unas comillas dentro de otras generando así un error 

        // programación no usa comillas

        // 'W' al no usar comillas dobles genera un error

        String letrilla="\n";
        System.out.println(letrilla);

        String calculadora="4 + 5 * 2";
        System.out.println(calculadora);

        //EJERCICIO 5

        System.out.println("Ejercicio 5");

        int p=4, q=6;
        System.out.println(+p+ " y " +q);

        float x=1, y=2, z=3;
        System.out.println(+x+ " " +y+ " "+z);

        char a='a', b='b', c='c';
        System.out.println(+a+ ", " +b+ " y " +c);

        double raiz1=3, raiz2=9;
        System.out.println(+raiz1+ " " +raiz2);

        long contador=1234567890L;
        System.out.println(contador);

        short indicador=4;
        System.out.println(indicador);

        int indice=6437;
        System.out.println(indice);

        double precio=45, preciofinal=50;
        System.out.println(+precio+ " "+preciofinal);

        char car1=25, car2=48;
        System.out.println(+car1+ " " +car2);

        byte valor=3;
        System.out.println(valor);

        boolean primero=true, ultimo=false;
        System.out.println(primero+ " "+ultimo);

        String nombre="Blas";
        System.out.println(nombre);

        //EJERCICIO 6

        System.out.println("Ejercicio 6");

        byte edad=25;
        System.out.println(edad);

        int codigoPostal=07011;
        System.out.println(codigoPostal);

        double altura=1.75;
        System.out.println(altura);

        char hombre='H', mujer='M';
        System.out.println(hombre+ " y " +mujer);

        String nombrecillo="Andrés";
        System.out.println(nombrecillo);

        byte numerohijos=2;
        System.out.println(numerohijos);

        double iva=21;
        System.out.println(iva);

        byte tallacamisa=23;
        System.out.println(tallacamisa);

        byte peso=76;
        System.out.println(peso);

        byte preciooo=45;
        System.out.println(preciooo);

        boolean alumnorepetidor=true;
        System.out.println(alumnorepetidor);

        String mensaje="hola amigos de youtube";
        System.out.println(mensaje);

        char letraa='I';
        System.out.println(letraa);

        byte mayorEdad=18;
        System.out.println(mayorEdad);

        byte minutos=60;
        System.out.println(minutos);

        byte dias=31;
        System.out.println(dias);

        String matriculaCoche="0097 DFJ";
        System.out.println(matriculaCoche);

        int contador2=123456789;
        System.out.println(contador2);  

        boolean mayorDeEdad=true;
        System.out.println(mayorDeEdad);

        String tallaCamiseta="XXL";
        System.out.println(tallaCamiseta);

        //EJERCICIO 7

        System.out.println("Ejercicio 7");

        // duplicamos las variables ya que están siendo utilizadas en ejercicios anteriores
        double aa=1;
        double bb=2;
        double cc=3;
        double d=4;
        double xx=5;
        double yy=6;
        double zz=7;
        
        double calcA= (bb/2)-4*aa*cc;
        System.out.println(calcA);

        double calcB= 3*xx*yy-5*xx+12*xx-17;
        System.out.println(calcB);

        double calcC= (bb+d)/(cc+4);
        System.out.println(calcC);

        double calcD= (xx*yy)/yy+2;
        System.out.println(calcD);

        double calcE= (1/yy)+(3*xx/zz+1);
        System.out.println(calcE);

        double calcF= (1/(yy+3))+(xx/zz);
        System.out.println(calcF);

        double calcG= (1/yy)+((3+xx)/(yy+1));
        System.out.println(calcG);

        // EJERCICIO 8

        System.out.println("Ejercicio 8");

        
        double aaa = 10.0;
        double bbb = 11.0;
        double ccc = 12.0;
        double ddd = 13.0;
        double eee = 14.0;
        double fff = 15.0;
        double ggg = 16.0;
        double hhh = 17.0;
        double jjj = 18.0;
        double mmm = 19.0;
        double nnn = 20.0;
        double ppp = 21.0;
        double qqq = 22.0;
        double rrr = 23.0;
        double sss = 24.0;
        double xxx = 25.0;
        double yyy = 26.0;

        double acti1 = (3/2)+(4/3);
        System.out.println(acti1);

        double acti2 = (1/(xxx+5))-((3*xxx*yyy)/4);
        System. out.println(acti2);

        double acti3 = (1/2)+7;
        System.out.println(acti3);

        double acti4 = (1/2);
        System.out.println(acti4);

        double acti5 = (((aaa*aaa)/bbb-ccc)+((ddd-eee)/(fff-((ggg*hhh)/jjj))));
        System.out.println(acti5);

        double acti6 = ((mmm/nnn)+ppp);
        System.out.println(acti6);

        double acti7 = (mmm+(nnn/(ppp-qqq)));
        System.out.println(acti7);

        double acti8 = (((aaa*aaa)/(bbb*bbb))+((ccc*ccc)/(ddd*ddd)));
        System.out.println(acti8);

        double acti9 = ((mmm+(nnn/ppp))/(qqq-(rrr/sss)));
        System.out.println(acti9);

        double acti10 = (((3*aaa)+bbb)/ddd+(5*eee))/(ccc-(((ddd+(5*eee))/(fff+(ggg/(2*hhh))))));
        System.out.println(acti10);

        double acti11 = ((aaa*aaa)+2*aaa*bbb+(bbb*bbb)/(1/xxx*xxx)+2);
        System.out.println(acti11);


        // EJERCICIO 9 

        System.out.println("Ejercicio 9");

        int aaaa=8, bbbb=3, cccc=-5; 

        System.out.println(aaaa+bbbb+cccc);
        System.out.println(+2*bbbb+3*(aaaa-cccc));
        System.out.println(aaaa/bbbb);
        System.out.println(aaaa%bbbb);
        System.out.println(aaaa/cccc);
        System.out.println(aaaa%cccc);
        System.out.println(aaaa*bbbb/cccc);
        System.out.println(aaaa*(bbbb/cccc));
        System.out.println((aaaa*cccc)%bbbb);
        System.out.println(aaaa*(cccc%bbbb));
        System.out.println((3*aaaa-2*bbbb)%(2*aaaa-cccc));
        System.out.println(2*(aaaa/5+(4-bbbb*3))%(aaaa+cccc-2));
        System.out.println((aaaa-3*bbbb)%(cccc+2*aaaa)/(aaaa-cccc));
        System.out.println(aaaa-bbbb-cccc*2);

        // EJERCICIO 10 

        System.out.println("Ejercicio 10");

        double xxxx=88, yyyy=3.5, zzzz=-5.2;

        System.out.println(xxxx+yyyy+zzzz);
        System.out.println(2*yyyy+3*(xxxx-zzzz));
        System.out.println(xxxx/yyyy);
        System.out.println(xxxx%yyyy);
        System.out.println(xxxx/(yyyy+zzzz));
        System.out.println((xxxx/yyyy)+zzzz);
        System.out.println(2*xxxx/3*yyyy);
        System.out.println(2*xxxx/(3*yyyy));
        System.out.println(xxxx*yyyy%zzzz);
        System.out.println(xxxx*(yyyy%zzzz));
        System.out.println(3*xxxx-zzzz-2*xxxx);
        System.out.println(2*xxxx/5%yyyy);
        System.out.println(xxxx-100%yyyy%zzzz);
        System.out.println(xxxx-yyyy-zzzz*2);

        // EJERCICIO 11

        System.out.println("Ejercicio 11");

        byte bbbbb=5;
        short ssss=3;
        long ln=9L;
        int i=2, j=8;
        float f=7;
        double dddd=6;
        char ccccc='z';

        int formA= i+ccccc;
        System.out.println(formA);
        
        float formB= f-ccccc;
        System.out.println(formB);

        double formC = dddd+f;
        System.out.println(formC);

        double formD = dddd+i;
        System.out.println(formD);

        float formE = i/f;
        System.out.println(formE);

        int formF = ssss+j;
        System.out.println(formF);

        double formG = dddd+j;
        System.out.println(formG);

        int formH = ssss*ccccc;
        System.out.println(formH);

        double formI = dddd+ccccc;
        System.out.println(formI);

        int formJ = bbbbb+ccccc;
        System.out.println(formJ);

        int formK = bbbbb/ccccc+ssss;
        System.out.println(formK);

        int formL = ccccc+ccccc;
        System.out.println(formL);

        double formM = i+ln+dddd;
        System.out.println(formM);

        long formN = ln+cccc;
        System.out.println(formN);

        int formO = 5/j;
        System.out.println(formO);

        double formP = 5.2/j;
        System.out.println(formP);

        double formQ = i*f*2.5;
        System.out.println(formQ);

        float formR = ln*f*2.5F;
        System.out.println(formR);

        long formS = j-4L;
        System.out.println(formS);

        float formT = j-4L*2.5F;
        System.out.println(formT);

        double formU = bbbbb+2.5*i+35F;
        System.out.println(formU);

        int formV = 'a'+bbbbb;
        System.out.println(formV);

        int formW = 'a'+cccc;
        System.out.println(formW);

        int formX = cccc+2;
        System.out.println(formX);

        long formY = cccc-ln/2;
        System.out.println(formY);

        double formZ = 2/i+2.0/j;
        System.out.println(formZ);

        // EJERCICIO 12

        System.out.println("Ejercicio 12");

        boolean xxxxx=true;
        boolean yyyyy=false;
        boolean zzzzz=true;

        boolean act1 = (xxxxx && yyyyy) || (xxxxx && zzzzz);
        System.out.println(act1);

        boolean act2 = (xxxxx || !yyyyy)&& (!xxxxx || zzzzz);
        System.out.println(act2);

        boolean act3 = xxxxx || yyyyy && zzzzz;
        System.out.println(act3);

        boolean act4 = !(xxxxx || yyyyy) && zzzzz;
        System.out.println(act4);

        boolean act5 = xxxxx || yyyyy || xxxxx && !zzzzz && !yyyyy;
        System.out.println(act5);

        boolean act6 = !xxxxx || !yyyyy || zzzzz && xxxxx && !yyyyy;
        System.out.println(act6);


        //EJERCICIO 13

        System.out.println("Ejercicio 13");

        boolean w = false;
        boolean xxxxxx = true;
        boolean yyyyyy = true;
        boolean zzzzzz = false;

        boolean ej1 = w || yyyyyy && xxxxxx && w || zzzzzz;
        System.out.println(ej1);

        boolean ej2 = xxxxxx && !yyyyyy && !xxxxxx || !w && yyyyyy;
        System.out.println(ej2);

        boolean ej3 = !(w || !yyyyyy) && xxxxxx || zzzzzz; 
        System.out.println(ej3);

        boolean ej4 = xxxxxx && yyyyyy && w || zzzzzz || xxxxxx;
        System.out.println(ej4);

        boolean ej5 = yyyyyy || !(yyyyyy || zzzzzz && w);
        System.out.println(ej5);

        boolean ej6 = !xxxxxx && yyyyyy && (!zzzzzz || !xxxxxx);
        System.out.println(ej6);

        //EJERCICIO 14

        System.out.println("Ejercicio 14");

        int ii = 8, jj =5;
        float xxxxxxx = 0.005F, yyyyyyy = -0.01F;
        char cccccc = 'c', ddddd = 'd';

        
        System.out.println(ii <= jj );
        System.out.println(cccccc > ddddd);
        System.out.println(xxxxxxx >= 0);
        System.out.println(xxxxxxx < yyyyyyy--);
        System.out.println(jj != 6);
        System.out.println(cccccc == 99);
        System.out.println(!(ii <= jj));
        System.out.println(!(cccccc == 99));
        System.out.println(!(xxxxxxx > 0));
        System.out.println(-jj == ii - 13);
        System.out.println(++xxxxxxx > 0);
        System.out.println(yyyyyyy-- < 1);
        System.out.println(cccccc > ddddd || cccccc > 0);
        System.out.println(5 * (ii + jj) > 'c');
        System.out.println(2 * xxxxxxx + yyyyyyy == 0);
        //System.out.println(2 * xxxxxxx + (yyyyyyy == 0)); salta error y hay que cambiar la formula
        System.out.println(2 * xxxxxxx + (yyyyyyy == 0 ? 1:0)); //hacemos uso de operador ternario para convertir el boolean en un valor númerico
        System.out.println(xxxxxxx + yyyyyyy  >= 0);
        System.out.println(xxxxxxx < ++yyyyyyy);
        System.out.println(-(ii + jj) != -ii + jj);
        System.out.println(ii <= jj && ii >= cccccc);
        System.out.println(ii > 0 && jj < 5);
        System.out.println(ii > 0 || jj < 5);
        System.out.println(xxxxxxx > yyyyyyy && ii > 0 || jj < 5);
        System.out.println((3 * ii - 2 * jj) % (2 * ddddd - cccccc) > 3 * d);
        System.out.println(2 * ((ii / 5) + (4 * (jj - 3)) % (ii + jj - 2)) >= 10);
        System.out.println((ii - 3 * jj) % (cccccc + 2 * ddddd) / (xxxxxxx - yyyyyyy) >= 0);

    }

 
}