import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        


        double answer = 0;
        double area = 0;
        

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                area = (a + b + c) / 2;
                answer = Math.sqrt(area * (area - a) * (area - b) * (area - c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                answer = a * b;
                break;
            case "circle":
                double r = scanner.nextDouble();
                answer = (r * r) * 3.14;
                break;
            
        }
        System.out.println(answer);
    }
}
