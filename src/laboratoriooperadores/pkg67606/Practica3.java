package laboratoriooperadores.pkg67606;

public class Practica3 {

    public static void main(String[] args) {
        //PRIMERA PARTE :OPERADORES UNARIOS
        // OPERADORES DE INCREMENTO
        int x = 10;
        int y = 10;
        boolean b = false;
        System.out.println("VALOR INICIAL DE X:" + x);
        System.out.println("VALOR INICIAL DE Y:" + y);
        System.out.println("VALOR DE X CON PRE-INCREMENTO:" + ++x);
        System.out.println("VALOR DE Y POS-INCREMENTO: " + y++);
        System.out.println("VALOR FINAL DE X:" + x);
        System.out.println("VALOR FINAL DE Y: " + y);
//PASO2
//OPERADORES POSITIVOS / NEGATIVOS | COMPLEMEMTARIOS 
System.out.println("EL NEGATIVO DE X ES:" + -x);
System.out.println("EL COMPLEMENTARIO DE B ES:" + !b );
//OPERDOR INVERSO A NIVEL DE BITS
x = 192;
System.out.println("EL NUMERO 192 EN BINARIO ES: " + 
                Integer.toBinaryString(x));
System.out.println("EL INVERSO DE 182 EN BINARIO ES:"  + 
                Integer.toBinaryString(~x));
System.out.println("EL INVERSO DE 192 ES:" + ~x);
//PASO 7
//OPERADOR CAST
x= (int) 5.9999999999; // (10 NUEVES)
System.out.println("CASTEANDO UN DOBLE EN ENTERO:" + x);

//SEGUNDA PARTE - OPERADORES BINARIOS
//OPERADORES ARITMETICOS
 
x=5;
y=5;
        System.out.println("SUMA: 5 + 5= " + (x+y));
        System.out.println("RESTA: 5 - 5=" + (x-y));
        System.out.println("MULTIPLICACION: 5* 5= " + (x*y));
        System.out.println("DIVISION: 5 / 5 = " + (x/y));
        System.out.println("MODULO: 5 % 5 =" + (x%y));
        //CONCATENACION 
        String frase1 = "!EL OPERADOR SUMA (+)¡";
        String frase2 = "TAMBIEN UNE CADENAS DE TEXTO!";
        System.out.println(frase1 + frase2);
        
        
        //DIVISION ENTERA
        x = 7;
        y = 4;
        double z = x / y;       //EL RESULTADO REAL ES 1.75
        System.out.println("LA DIVISION 7/4 ES: " + z);
        
        //OPERADORES LOGICO - RELACIONALES
        b =(x > y);             //¿7 MAYOR QUE 4? - TRUE
        boolean b2= (x  <  y);  //¿7 Menor QUE 4? - fallse
        boolean b3 =(x !=y);    //¿7 diferente de 4? - TRUE

        System.out.println("¿7 > 4 AND 7 < 4:? " + (b && b2));
        System.out.println("¿7 > 4 OR 7 <4 ?:" + (b || b2 ));
        System.out.println("¿7 > 4 AND 7 !=4?:" + (b && b3));
        System.out.println("¿7 > 4 OR 7 !=4 ?: " + (b || b3));
        System.out.println("¿FRASE1 ES UN STRING?" + 
                (frase1 instanceof String));
        
        //OPERADORES DE ASIGNACION 
        System.out.println("¡HEMOS ESTADO UTILIZANDO EL OPERADOR" + 
                "ASIGNACION DESDE EL PRINCIPIO! ¿LO HABIAS NOTADO?");
        x = 10;
        y = 10;
        x += 20;
        y = y + 20;
        System.out.println("VALOR DE X:" + x);
        System.out.println("VALOR DE Y:" + y);
        
        //OPERADORES BITWISE
        int byte1 = 51;
        int byte2 = 112;
        System.out.println("EL byte1 EN BINARIO: " + 
                Integer.toBinaryString(byte1));
        System.out.println("EL byte2 EN BINARIO=: " +
                Integer.toBinaryString(byte2));
        System.out.println("OPERACION BITWISE AND:" +
                Integer.toBinaryString(byte1 & byte2));
        System.out.println("OPERACION BITWISE OR: " + 
                Integer.toBinaryString(byte1 | byte2));
        System.out.println("OPERACION BITWISE XOR: " + 
                Integer.toBinaryString(byte1 ^ byte2));
        System.out.println("DEZPLAZAMIENTO 3 LUGARES A LA IZQUIERDA: " + 
                Integer.toBinaryString(byte1 << 3));
        System.out.println("DEZPLAZAMIENTO 3 LUGARES A LA DERECHA: " + 
                Integer.toBinaryString(byte1 >> 3));
        System.out.println("DEZPLAZAMIENTO SIN SIGNO 3 LUGARES A LA DERECHA:" +
                Integer.toBinaryString(byte1 >>> 3));
        
        
        
        
        
        
        
        
    }

}
