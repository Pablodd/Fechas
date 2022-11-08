import java.util.Scanner;

public class Fechas {

    static public float hora_1, minute_1, hora_2, minute_2, calculate_minutes, incognita, parte_decimal, parte_entera, parte_decimal_minutos;

    static public String hour_1_am,hour_2_am;

    static String franjas(String franja_1, String franja_2){

        if(franja_1.contains("am")){
            hour_1_am = franja_1.replace("am", "");
            String[] hour_minute_1 = hour_1_am.split(":");

            hora_1 = Float.parseFloat(hour_minute_1[0]);
            minute_1 = Float.parseFloat(hour_minute_1[1]);

        }else if(franja_1.contains("pm")){
            hour_1_am = franja_1.replace("pm", "");
            String[] hour_minute_1 = hour_1_am.split(":");

            hora_1 = Float.parseFloat(hour_minute_1[0]);
            minute_1 = Float.parseFloat(hour_minute_1[1]);

        }else{
            System.out.println("Algo falló");
        }

        if(franja_2.contains("am")){
            hour_2_am = franja_2.replace("am", "");
            String[] hour_minute_2 = hour_2_am.split(":");

            hora_2 = Float.parseFloat(hour_minute_2[0]);
            minute_2 = Float.parseFloat(hour_minute_2[1]);

        }else if(franja_2.contains("pm")){
            hour_2_am = franja_2.replace("pm", "");
            String[] hour_minute_2 = hour_2_am.split(":");

            hora_2 = Float.parseFloat(hour_minute_2[0]);
            minute_2 = Float.parseFloat(hour_minute_2[1]);

        }else{
            System.out.println("Algo falló");
        }

        if( hora_1 > 12){

            return "No podemos seguir";

        }else if( hora_2 > 12){

            return "No podemos seguir";
     
        }else{
            
            return  Suma_horas(hora_1, minute_1, hora_2, minute_2);
            
        }

    }

    static String Suma_horas(float h_1, float m_1, float h_2, float m_2){
        
        if(h_2<h_1){

            incognita = h_2 + 12;

        }else{

            incognita = h_2;

        }
        calculate_minutes = (((incognita*60)+(m_2))-((h_1*60)+(m_1)))/60;
    
        parte_decimal = calculate_minutes % 1;
        parte_entera = calculate_minutes - parte_decimal;

        parte_decimal_minutos = parte_decimal*60;

        int minutos = (int) parte_decimal_minutos;
        int horas = (int) parte_entera;
  
        String diferencia_horas = horas + ":" + minutos;

        return diferencia_horas;

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce fecha solo de 00 a 12, separa los horarios con -.");

        String secuence = myObj.nextLine();
        System.out.println("La franja horaria es: " + secuence);

        String[] parts = secuence.split("-");

        String franja_1 = parts[0].replace(" ","");
        String franja_2 = parts[1].replace(" ","");
     
        System.out.println(franjas(franja_1, franja_2));

    }
    
}
