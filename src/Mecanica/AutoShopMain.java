package Mecanica;

public class AutoShopMain {
    public static void main(String[] args) {
        Vehicle carro = new Vehicle("ABC-1234", "Honda Civic", 2018, 55000);
        Customers cliente = new Customers("Lana", 999991111, carro);


        Quote orcamento = new Quote(cliente);

        orcamento.addItem(new Part("Filtro de Óleo", "Fram", 30.0, 0.30));
        orcamento.addItem(new Part("Óleo Motor 5W30", "Castrol", 150.0, 0.30));
        orcamento.addItem(new Service("Troca de óleo e filtro", 2, 100.0));

        System.out.println("-------- Oficina Mecânica --------");
        System.out.println("Cliente: " + orcamento.getCustomer().getName());
        System.out.println("Carro: " + orcamento.getCustomer().getVehicle().getModel());
        System.out.println("Status: " + orcamento.getStatus());
        System.out.println("Total a pagar: R$ " + orcamento.calculateTotal());
        System.out.println("----------------------------------");

        orcamento.approveService();
        System.out.println("Novo Status: " + orcamento.getStatus());
    }
}