import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertirMoneda{

    public void convertir (String monedaBase, String monedaTarget, ConsultarMoneda consulta , Scanner lectura){
        double cantidad;
        double cantidadAConvertir;
        DecimalFormat df = new DecimalFormat("#.###"); //para solo tener los primeros cuatro digitos
        Monedita monedita = consulta.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("El tipo de cambio actual es: " +monedaBase+" = "+Double.parseDouble(df.format( monedita.conversion_rate()))+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de dinero en "+ monedaBase+" a convertir: ");
        cantidad = Double.parseDouble((lectura.nextLine()));
        cantidadAConvertir =Double.parseDouble(df.format(cantidad * monedita.conversion_rate())); //formateo para que solo muestre los tres primeros decimales
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadAConvertir+"  "+monedita.target_code());


    }

//    public void otraMonedaAConvertir(ConsultarMoneda consulta, Scanner lectura){
//        System.out.println("Ingrese el identificador de la moneda: ");
//        String monedaBase = lectura.nextLine().toUpperCase();
//        System.out.println("Ingrese el identificador de la otra moneda: ");
//        String monedaConvertir = lectura.nextLine().toUpperCase();
//        convertir(monedaBase,monedaConvertir,consulta,lectura);
//
//    }


}
