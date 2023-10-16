import java.util.Scanner;
public class ProjectCSScanner {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть назву команди 1: ");
            String teamName1 = scanner.nextLine();

            System.out.print("Введіть назву команди 2: ");
            String teamName2 = scanner.nextLine();

            int[] fragsTeam1 = new int[5];
            int[] fragsTeam2 = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Введіть фраги для " + teamName1 + " в грі " + (i + 1) + ": ");
                fragsTeam1[i] = scanner.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                System.out.print("Введіть фраги для " + teamName2 + " в грі " + (i + 1) + ": ");
                fragsTeam2[i] = scanner.nextInt();
            }

            double avgTeam1 = calculateAverage(fragsTeam1);
            double avgTeam2 = calculateAverage(fragsTeam2);

            String winner = (avgTeam1 > avgTeam2) ? teamName1 : (avgTeam1 < avgTeam2) ? teamName2 : "Нічия";

            System.out.println("Перемогла команда " + winner + " набрала " + Math.max(avgTeam1, avgTeam2) + " очків");
        }

        private static double calculateAverage(int[] frags) {
            double sum = 0;
            for (int frag : frags) {
                sum += frag;
            }
            return sum / frags.length;
        }
    }
