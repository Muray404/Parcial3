public class prueba2 {
    public static void main(String[] args) {
        int cine[][], nfila, ncol;

        do {
            nfila = input.leerEntero("numero de filas:  ");
            ncol = input.leerEntero("numero de columnas:  ");

            if (nfila <= 0 || ncol <= 0) {
                System.out.println("Error: los valores tienen que ser superior a (0). ");
            }
        } while (nfila <= 0 || ncol <= 0);


        cine = new int[nfila][ncol];
        System.out.println("llena las filas ");

        for (int i = 0; i < nfila; i++) {
            for (int j = 0; j < ncol; j++) {

                cine[i][j] = input.leerEntero("fila (" + (i + 1) + ") columna (" + (j + 1) + "): ");
                while (cine[i][j] > 1) {
                    cine[i][j] = input.leerEntero("fila [" + (i + 1) + "] columna [" + (j + 1) + "]: ");
                }
            }
        }
        libresPorFila(cine);
    }
    //---------------------------------------------------------------------------------

    public static void libresPorFila(int[][] cine){
        int totalOcupados = 0;
        for (int fil = 0 ;fil < cine.length;fil++){
            int libres = 0;
            int ocupados = 0;
            for (int col = 0;col < cine[fil].length;col++){
                if (cine[fil][col] == 0) {
                    libres++;

                } else if (cine[fil][col] == 1){
                    ocupados++;
                    totalOcupados++;
                }

            }
            System.out.println("Fila " +(fil +1) + " tiene " + libres + " asientos libres " );

        }
        System.out.println("total de  asientos ocupados: "+totalOcupados);
    }



}
