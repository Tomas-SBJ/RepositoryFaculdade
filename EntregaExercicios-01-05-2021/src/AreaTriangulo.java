import java.util.Scanner;

//Faça um algoritmo que o valor de base e o valor da altura de um triangulo. Calcule e mostre a área deste triângulo.

public class AreaTriangulo
{
    public static void main(String[] args)
    {
        int base;
        int altura;
        int area;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        base = teclado.nextInt();
        System.out.println("Digite o valor da altura:");
        altura = teclado.nextInt();

        area = (base * altura) / 2;

        System.out.println("Área do triangulo: " + area);

        teclado.close();
    }
}
