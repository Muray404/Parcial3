

public class parcial3 {

    static void main (String[] args){
        int[][] matriz;
        int nFilas, nColumnas;

        do {
            nFilas = input.leerEntero("Escribe el numero de filas (debe ser mayor a 0): ");

        } while (nFilas<=0);

        do {
            nColumnas = input.leerEntero("Escribe el numero de columnas (debe ser mayor a 0): ");

        } while (nColumnas<=0);

//        ------------------------------SEPARACIÓN VISUAL--------------------------------------------------------------
        matriz = new int [nFilas][nColumnas];
        int [] contadorFilasLibres = new int [nFilas];
        int contadorOcupadosSala=0;


        System.out.println("----------------LLENAR ASIENTOS----------------");

        for (int i=0; i<nFilas;i++){
            for (int j=0;j<nColumnas;j++){

                do {
                    matriz[i][j] = input.leerEntero("Escribe el estado de el asiento " + "["+i+"]" + "["+j+"]: ");
                    if (matriz[i][j]==0){
                        contadorFilasLibres[i]++;
                    }
                    else if (matriz[i][j]==1){
                        contadorOcupadosSala++;
                    }
                } while (matriz[i][j]!=0 && matriz[i][j]!=1);
            }
        }

        for (int i=0; i<nFilas; i++){
            if (contadorFilasLibres[i]==1){
                System.out.println("La fila "+(i+1)+" tiene un asiento libre");

            }
            else {
                System.out.println("La fila "+(i+1)+" tiene " + contadorFilasLibres[i]+ " asientos libres");

            }
        }
        System.out.println("La cantidad de asientos ocupados en la sala son " + contadorOcupadosSala);

        int filaMasLibres = buscarFilaMayor(contadorFilasLibres,nFilas);

        System.out.println("La fila con mas cantidad de asientos libres es la fila " + (filaMasLibres+1));

        String bandera = bandera(matriz,nFilas,nColumnas);

        System.out.println(bandera);

        /*
        for (int i=0;i<nFilas;i++){
            for (int j=0; j<nColumnas;j++){
                if (matriz[i][j]==0){
                    System.out.print("L");
                }
                else{                                     Modificación de código durante sustentación del programa
                    System.out.print("X");
                }
            }
            System.out.println();
        }

         */
    }

    //        ------------FIN MAIN------------------SEPARACIÓN VISUAL--------------------------------------------------


    static int buscarFilaMayor(int [] contadorFilasLibres, int nFilas){

        int filaMayor=contadorFilasLibres[0];
        int posicionMayor=0;

        for (int i=0; i<nFilas;i++){
            if (filaMayor<contadorFilasLibres[i]){
                filaMayor=contadorFilasLibres[i];
                posicionMayor=i;
                break;
            }
        }
        return posicionMayor;
    }

    static String bandera(int[][] matriz, int nFilas, int nColumnas) {
        boolean hayFilaLlena = false;

        for (int i = 0; i < nFilas; i++) {
            boolean filaActualLlena = true;

            for (int j = 0; j < nColumnas; j++) {
                if (matriz[i][j] == 0) {
                    filaActualLlena = false;
                    break;
                }
            }

            if (filaActualLlena) {
                hayFilaLlena = true;
                break;
            }
        }

        if (hayFilaLlena) {
            return "Hay al menos una fila llena";
        } else {
            return "No hay filas llenas";
        }
    }


}