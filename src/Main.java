import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dateLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnEPlanBasico = true;
        String name ="Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario =0;
        System.out.println("Pelicula: " + name);
        System.out.println(dateLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnEPlanBasico);

        double mediEvaluacion = (4.5 +  4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix:  " +  mediEvaluacion);

        if (dateLanzamiento >= 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado  = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario +  notaMatrix ;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);

    }
}