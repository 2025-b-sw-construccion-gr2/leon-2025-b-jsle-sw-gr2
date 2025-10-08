public class Calculadora {
    public static void main(String[] args) {
        int resultadoSuma = Suma.sumar(8, 2);
        int resultadoResta = Resta.restar(8, 2);

        System.out.println("Resultado de 8 + 2 = " + resultadoSuma);
        System.out.println("Resultado de 8 - 2 = " + resultadoResta);
    }
}