import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;

public class CarritoDeCompras {

    private ArrayList<Insumos> insumosMedicos;
    private int total;

    public CarritoDeCompras() {
        insumosMedicos = new ArrayList<Insumos>();
        total = 0;
    }

    public void agregarInsumo(Insumos insumo){
        insumosMedicos.add(insumo);
        total = total + insumo.getPrecio()*insumo.getCantidad();
    }

    public void eliminarInsumo(Insumos insumo){
        insumosMedicos.remove(insumo);
        total = total - insumo.getPrecio()*insumo.getCantidad();
    }

    public void vaciarCarrito(Insumos insumo){
        insumosMedicos.clear();
    }

    /*public void fechaHora(){
        ZoneId zonedId = ZoneId.of( "America/Montreal" );
        LocalDate today = LocalDate.now( zonedId );
        System.out.println(today);
    }*/

    public void dateTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(calendar.getTime()));
    }

    public void finalizarCompra(){
        System.out.println("******* BOLETA *******");
        System.out.print("Fecha y Hora:\n");
        dateTime();
        System.out.println("\nProductos \t\tTotal");
        detalleCompra();
        System.out.println("\nTotal Compra:\t$" + total);
    }

    public void detalleCompra(){
        for (Insumos aux: insumosMedicos) {
            System.out.println(aux.toString());
        }
    }

}
