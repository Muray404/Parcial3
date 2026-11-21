public class ejercicios {

    static void main (String[] args) {

        int filas = input.leerEntero("Escribe la cantidad de filas: ");
        int[] estrellasPorFila = new int [filas];

        for (int i=0; i<filas; i++){
            estrellasPorFila[i] = input.leerEntero("Escribe la cantidad de estrellas de la fila " + (i+1) + ": ");
        }

        System.out.println("-----------RESULTADO-----------\n");
        System.out.println("Figura dibujada: \n");
        dibujarFigura(estrellasPorFila, filas);
        int acumulador = acumularEstrellas(estrellasPorFila);
        System.out.println("La cantidad de estrellas dibujadas en total fue de: " + acumulador);
        //int filaMayor = identificarMayor(estrellasPorFila, filas);
        //System.out.println("La fila con mayor cantidad de estrellas es: " + filaMayor);
    }

    static void dibujarFigura (int [] estrellasFila, int filas){

        for (int i=0; i<filas; i++){
            for (int j=1;j<=estrellasFila[i];j++){
                System.out.print("★");
            }
            System.out.println();
        }
    }

    static int acumularEstrellas(int[] estrellas){
        int acumulador =0;
        for (int i=0; i<estrellas.length;i++){
            acumulador+=estrellas[i];
        }

        return acumulador;
    }
/*
    static int identificarFilaMayor(int [] estrellasFila, int filas){

        for (int i=0; i<estrellasFila.length;i++){

        }
    }

 */



    static int buscarPosicion(int [] estrellasFila, int filas){
        int filaMayor = estrellasFila[0];
        for (int i=1; i<estrellasFila.length; i++){
            if (filaMayor<estrellasFila[i]){
                filaMayor=estrellasFila[i];
            }
        }
        return filaMayor;
    }
}
