public class Testar {
    public static void main(String[] args) {
        Carro objeto1 = new Carro("Hyundai", "Veloster", 2013, 3);
        
        objeto1.exibirDetalhes();
        System.out.println();

        Moto objeto2 = new Moto("Parker Brothers Concepts", "NEUTRON", 2022, 250);
        
        objeto2.exibirDetalhes();
    }
}
