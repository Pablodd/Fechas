import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce fecha solo de 00 a 12, separa los horarios con -.");

        String secuence = myObj.nextLine();
        System.out.println("La franja horaria es: " + secuence);

        String[] parts = secuence.split("-");

        String franja_1 = parts[0].replace(" ","");
        String franja_2 = parts[1].replace(" ","");

        if(franja_1.contains("am")){

           if(franja_2.contains("am")){
            String hour_1_am = franja_1.replace("am", "");
            String hour_2_am = franja_2.replace("am", "");

            String[] hour_minute_1 = hour_1_am.split(":");
            String[] hour_minute_2 = hour_2_am.split(":");


            float hora_1 = Float.parseFloat(hour_minute_1[0]);
            float minute_1 = Float.parseFloat(hour_minute_1[1]);

            float hora_2 = Float.parseFloat(hour_minute_2[0]);
            float minute_2 = Float.parseFloat(hour_minute_2[1]);

            if(hora_1>12){

                System.out.println("No podemos seguir");


            }else if(hora_2>12){

                System.out.println("No podemos seguir");

                
            }else{

                float calculate_minutes = (((hora_2*60)+(minute_2))-((hora_1*60)+(minute_1)))/60;

                float parte_decimal = calculate_minutes % 1;
                float parte_entera = calculate_minutes - parte_decimal;

                int minutos = (int) parte_decimal;
                int horas = (int) parte_entera;

                System.out.print("Hay una franja de: " + horas + ":"+ minutos);
                
            }

           }else if(franja_2.contains("pm")){
            String hour_1_am = franja_1.replace("am", "");
            String hour_2_am = franja_2.replace("pm", "");

            String[] hour_minute_1 = hour_1_am.split(":");
            String[] hour_minute_2 = hour_2_am.split(":");


            float hora_1 = Float.parseFloat(hour_minute_1[0]);
            float minute_1 = Float.parseFloat(hour_minute_1[1]);

            float hora_2 = Float.parseFloat(hour_minute_2[0]);
            float minute_2 = Float.parseFloat(hour_minute_2[1]);

            if(hora_1>12){

                System.out.println("No podemos seguir");


            }else if(hora_2>12){

                System.out.println("No podemos seguir");

                
            }else{

                float calculate_minutes = ((((hora_2+12)*60)+(minute_2))-((hora_1*60)+(minute_1)))/60;

                float parte_decimal = calculate_minutes % 1;
                float parte_entera = calculate_minutes - parte_decimal;

                float parte_decimal_minutos = parte_decimal*60;


                int minutos = (int) parte_decimal_minutos;
                int horas = (int) parte_entera;

                System.out.print("Hay una franja de: " + horas + ":"+ minutos);
                
            }
            

           }else{
            System.out.println("No podemos calcular la hora");

           }
            


        }else if(franja_1.contains("pm")){

            if(franja_2.contains("am")){
                String hour_1_am = franja_1.replace("pm", "");
                String hour_2_am = franja_2.replace("am", "");
    
                String[] hour_minute_1 = hour_1_am.split(":");
                String[] hour_minute_2 = hour_2_am.split(":");
    
    
                float hora_1 = Float.parseFloat(hour_minute_1[0]);
                float minute_1 = Float.parseFloat(hour_minute_1[1]);
    
                float hora_2 = Float.parseFloat(hour_minute_2[0]);
                float minute_2 = Float.parseFloat(hour_minute_2[1]);
    
                if(hora_1>12){
    
                    System.out.println("No podemos seguir");
    
    
                }else if(hora_2>12){
    
                    System.out.println("No podemos seguir");
    
                    
                }else{
    
                    float calculate_minutes = (((hora_2*60)+(minute_2))-((hora_1*60)+(minute_1)))/60;
    
                    float parte_decimal = calculate_minutes % 1;
                    float parte_entera = calculate_minutes - parte_decimal;
    
                    int minutos = (int) parte_decimal;
                    int horas = (int) parte_entera;
    
                    System.out.print("Hay una franja de: " + horas + ":"+ minutos);
                    
                }
    
               }else if(franja_2.contains("pm")){
                String hour_1_am = franja_1.replace("pm", "");
                String hour_2_am = franja_2.replace("pm", "");
    
                String[] hour_minute_1 = hour_1_am.split(":");
                String[] hour_minute_2 = hour_2_am.split(":");
    
    
                float hora_1 = Float.parseFloat(hour_minute_1[0]);
                float minute_1 = Float.parseFloat(hour_minute_1[1]);
    
                float hora_2 = Float.parseFloat(hour_minute_2[0]);
                float minute_2 = Float.parseFloat(hour_minute_2[1]);
    
                if(hora_1>12){
    
                    System.out.println("No podemos seguir");
    
    
                }else if(hora_2>12){
    
                    System.out.println("No podemos seguir");
    
                    
                }else{
    
                    float calculate_minutes = ((((hora_2)*60)+(minute_2))-((hora_1*60)+(minute_1)))/60;
    
                    float parte_decimal = calculate_minutes % 1;
                    float parte_entera = calculate_minutes - parte_decimal;
    
                    float parte_decimal_minutos = parte_decimal*60;
    
    
                    int minutos = (int) parte_decimal_minutos;
                    int horas = (int) parte_entera;
    
                    System.out.print("Hay una franja de: " + horas + ":"+ minutos);
                    
                }
                
    
               }else{
                System.out.println("No podemos calcular la hora");
    
               }

        }else{
            System.out.println("Algo salio mal");
        }

    }
    
}
