package Atividades_Práticas;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        double grausCelsius = 30;
        double grausFahrenheit = (grausCelsius * 1.8) + 32;

        System.out.printf("Graus Celsius: %.2f ºC\n", grausCelsius);
        System.out.printf("Graus Fahrenheit: %.2f ºF", grausFahrenheit);
    }
}
