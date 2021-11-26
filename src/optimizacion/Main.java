package optimizacion;

public class Main {

    public static void main(String[] args){
      String[] misStrings = {"a","b","c","d","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","v","w","x","y","z"};
      long antes = System.currentTimeMillis();

      String resultado = "";
      for (int i = 0; i < misStrings.length; i++){
          resultado += misStrings[i];
      }

      long ahora = System.currentTimeMillis();
        System.out.println("String obtenido: " + resultado);
        System.out.println("tiempo transcurrido concatenacion: " + (ahora - antes));

        long antesdos = System.currentTimeMillis();

        StringBuilder resultaDos = new StringBuilder(misStrings.length);
        for (int i = 0; i < misStrings.length; i++){
            resultaDos.append(misStrings[i]);
        }

        String resultadoStringBuilder = resultaDos.toString();

        long ahorados = System.currentTimeMillis();
        System.out.println("String obtenido: " + resultadoStringBuilder);
        System.out.println("Tiempo transcurrido stringBuilder: " + (ahorados - antesdos));

    }
}
