public class Main {
    public static void main (String[] args) {
        Revista pandas = new Revista("R0001", "Pandas y Vida Silvestre", true, 2001, 0001);

        Libro historia = new Libro("L0001", "Historia de México", true, 2010);

        System.out.println(pandas.toString());

        System.out.println(historia.toString());

        System.out.println(pandas.anhoCodigo());
        System.out.println(historia.anhoCodigo());
    }
}