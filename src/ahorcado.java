import java.util.Scanner;
public class ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Scanner class let you write into the game
        Scanner scanner = new Scanner(System.in);


        // Asignation and Declaration
        String palabraSecreta = "thunderstruck";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arrays
        char[] letrasAdivinadas = new char[palabraSecreta.length()]; 
        /* Hacemos un arreglo con el tamaño de la palabra secreta */
        
        // Iterative Structure (Loop for)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) { /* string.valueOf se utilizando cuando tenemos una palabra hecha de chars */
            System.out.println("Palabra a adivinar : " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras.)");
            System.out.println("Introduce una letra, porfavor.");
           
            //We use class scanner to ask for a letter 
            
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Iterative Structure (Loop for)
            for (int j = 0; j < palabraSecreta.length(); j++) {
              // Conditional Structure  
             if (palabraSecreta.charAt(j) == letra) {
                letrasAdivinadas[j] = letra;
                letraCorrecta = true;
            }
        }

        if(!letraCorrecta) {
            intentos++;
            System.out.println("¡Incorrecto! te quedan " + (intentosMaximos - intentos) + " intentos.");
        }

        /* Equals sirve para comparar 2 variables */
        if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("¡Felicidades! has adivinado la palabra secreta : " + palabraSecreta);

        }

    }
    
    if (!palabraAdivinada) { 
        System.out.println("¡Game Over!");
    }
    scanner.close();

}
}
