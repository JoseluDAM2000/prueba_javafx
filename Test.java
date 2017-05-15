
/**
 * 
 */
public class Test
{
    public static void main(String[] args)
    {
        String tiempoTotal = "";
        long inicio = System.currentTimeMillis();
        for(int i = 0; i<=1000000; i++){
            System.out.println(i);
        }
        long fin = System.currentTimeMillis();
        long segundos = (fin - inicio)/1000;
        long minutos = segundos / 60;
        tiempoTotal += minutos + ":";
        segundos = segundos%60;
        if(segundos<10){
            tiempoTotal +=0;
        }
        tiempoTotal += segundos;
        System.out.println(tiempoTotal);
    }
}
