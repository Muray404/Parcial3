public class prueba {
    static void main(String[] args) {
        int lecturas = input.leerEntero("Escribe la cantidad de lecturas: ");

        while (lecturas <= 0) {
            lecturas = input.leerEntero("Escribe la cantidad de lecturas: ");
        }

        double[] temperaturas = new double[lecturas];

        for (int i = 0; i < lecturas; i++) {

            temperaturas[i] = input.leerDouble("ingrese la temperatura " + (i + 1));

            while (temperaturas[i] < -10 || temperaturas[i] > 60) {
                temperaturas[i] = input.leerDouble("ingrese la temperatura " + (i + 1));
            }
        }

        double promedio = promedioTemperaturas(temperaturas);
        int contadorMayorPromedio = temperaturasMayoresAlPromedio(temperaturas, promedio);
        int temperaturaMayor = temperaturaMayor(temperaturas);
        boolean esCapicua = esCapicua(temperaturas);

        System.out.println("El promedio de temperaturas es: " + promedio);
        System.out.println("La cantidad de temperaturas mayores al promedio fue de: " + contadorMayorPromedio);
        System.out.println("La posicion de la temperatura mas alta es: " + temperaturaMayor);
        if (esCapicua){
            System.out.println("Perfil simétrico");
        }
        else {
            System.out.println("Perfil irregular");
        }

    }


    //    --------------------------------LIMITE MAIN ---------------------------------------------------
    static double promedioTemperaturas (double[] temperaturas){
        double suma = 0;
        double promedio;

        for (int i=0; i<temperaturas.length; i++){
            suma +=temperaturas[i];
        }

        promedio = suma / temperaturas.length;
        return promedio;
    }

    static int temperaturasMayoresAlPromedio (double [] temperaturas, double promedio){
        int contador=0;

        for (int i=0; i<temperaturas.length;i++){
            if (temperaturas[i]>promedio){
                contador++;
            }
        }
        return contador;
    }

    static int temperaturaMayor(double [] temperaturas){
        double lecturaAlta=temperaturas[0];
        int posicion =0;

        for (int i=1; i<temperaturas.length; i++){
            if (temperaturas[i]>lecturaAlta){
                posicion=i;
            }
        }
        return (posicion+1);
    }

    public static boolean esCapicua(double[] temperaturas){
        boolean capicua = false;

        for (int i=0; i<temperaturas.length / 2; i++){
            if (temperaturas[i] == temperaturas[temperaturas.length-1-i]){
                capicua=true;
            }
        }
        return capicua;
    }
}