public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion!");
        int []arreglo= {10, 5, 8, 6, 3};

        MetodosOrdenamiento xd= new MetodosOrdenamiento();
        xd.sortBySeleccion(arreglo);
        xd.printArreglo(arreglo);
    }
}
