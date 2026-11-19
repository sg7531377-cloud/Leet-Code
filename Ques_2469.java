
class Ques_2469 {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32;
        return new double[]{kelvin, fahrenheit};
    }
    public static void main(String[] args) {
        Ques_2469 obj = new Ques_2469();
        double celsius = 36.50;
        double[] result = obj.convertTemperature(celsius);
        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
    }
}
