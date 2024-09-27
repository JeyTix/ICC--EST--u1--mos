public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** Metodo de ordenamiento Seleccion *****");
        int []arreglo= {10, 5, 8, 2, 0};

        MetodosOrdenamiento xd= new MetodosOrdenamiento();
        System.out.println("> Arreglo Ascendente");
        xd.sortBySeleccionAsc(arreglo,true);
        xd.printArreglo(arreglo);
        System.out.println("\n> Arreglo Descendente");
        xd.sortBySeleccionAsc(arreglo,false);
        xd.printArreglo(arreglo);
    }
}
