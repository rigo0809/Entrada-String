import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu primeiro nome:");
String nome = sc.next();
System.out.println(nome);
 System.out.println("Digite seu sobrenome");
    String sobrenome = sc.next();
    System.out.println("Seu nome completo é : " + nome + " " + sobrenome);
    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();
    System.out.println(idade);
    System.out.println("Digite sua Altura em Centímetros :");
    double Altura = sc.nextDouble();
    System.out.println(Altura + "centimetros");
    System.out.println("Digite sua Massa em Kg:");
    int Massa = sc.nextInt();
    System.out.println(Massa);
double AlturaMetros = Altura/100;
    double AlturaQuadrado = AlturaMetros * AlturaMetros;
    double MassaDividida = Massa / AlturaQuadrado;
    System.out.println("Seu IMC é:" + MassaDividida);

    sc.close();
  }
}