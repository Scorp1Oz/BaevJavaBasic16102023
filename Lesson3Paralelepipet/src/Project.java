public class Project {

        public static void main(String[] args) {

            double length = 10.0;
            double width = 5.0;
            double height = 3.0;

            double volume = length * width * height;

            System.out.println("Об'єм паралелепіпеда = " + volume);

            double totalLength = 2 * (length + width) + 2 * (length + height) + 2 * (width + height);
            System.out.println("Сумарна довжина всіх сторін = " + totalLength);
        }

}
