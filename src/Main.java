public class Main {

    public static void main(String[] args) {
        Insumos mascarilla = new Insumos("Mascarilla", 10, 500);
        Insumos alcoholGel = new Insumos("Alcohol Gel", 1, 3500);
        Insumos guantesLatex = new Insumos("Guantes\t", 10, 300);

        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.agregarInsumo(mascarilla);
        carrito.agregarInsumo(alcoholGel);
        carrito.agregarInsumo(guantesLatex);

        carrito.finalizarCompra();
    }

}
