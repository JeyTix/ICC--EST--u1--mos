public class MetodosOrdenamiento {
    public int[] sortBySeleccionAsc(int[] arreglo, boolean asc){
        int tamanio=  arreglo.length;

        //Reorrer el arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice= i;
            for (int j = i+1; j < tamanio; j++) {
                // if convencional
                if (asc){
                    if (arreglo[j]< arreglo[indice]) {
                        indice = j;
                    }
                } else {
                    if (arreglo[j]> arreglo[indice]) {
                        indice = j;
                    }
                }

                // if ternario
                if (asc? arreglo[j]< arreglo[indice]: arreglo[j]> arreglo[indice]) {
                    indice= j;
                }
            }
            // Intercambio de indice encontrado por el primero
            int aux= arreglo[indice];
            arreglo[indice]= arreglo[i];
            arreglo[i]= aux;
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo) {
            System.out.print(elemento+ " ");
        }
    }
    
}
