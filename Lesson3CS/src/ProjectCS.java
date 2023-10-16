public class ProjectCS {

        public static void main(String[] args) {
            String teamName1, teamName2;
            int[] fragsTeam1 = new int[5];
            int[] fragsTeam2 = new int[5];

            teamName1 = "Команда 1";
            teamName2 = "Команда 2";

            fragsTeam1[0] = 10;
            fragsTeam1[1] = 8;
            fragsTeam1[2] = 12;
            fragsTeam1[3] = 7;
            fragsTeam1[4] = 11;

            fragsTeam2[0] = 9;
            fragsTeam2[1] = 11;
            fragsTeam2[2] = 10;
            fragsTeam2[3] = 13;
            fragsTeam2[4] = 6;

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




