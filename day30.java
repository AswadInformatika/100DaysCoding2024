package day30;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        //tipe data reference bigDecimal
        //biasanya di gunakan dalam operasi aritmatika yang membutuhkan bilangan desimal yang lebih tinggi melebihi range tipe data float dan double
        BigDecimal dolar = new BigDecimal("152.060");
        System.out.println("50 Dolar = " + dolar + " Rupiah");
    }
}
