public class ProjectWar {

        public static void main(String[] args) {

            int liWarriorAttack = 13;
            int liArcherAttack = 24;
            int liHorsemanAttack = 46;

            int minWarriorAttack = 9;
            int minArcherAttack = 35;
            int minHorsemanAttack = 12;

            int liWarriorCount = 860;

            
            int minWarriorCount = (int) (liWarriorCount * 1.5);
            int minArcherCount = (int) (liWarriorCount * 1.5);
            int minHorsemanCount = (int) (liWarriorCount * 1.5);

            int liTotalAttack = (liWarriorAttack * liWarriorCount) + (liArcherAttack * liWarriorCount) + (liHorsemanAttack * liWarriorCount);

            int minTotalAttack = (minWarriorAttack * minWarriorCount) + (minArcherAttack * minArcherCount) + (minHorsemanAttack * minHorsemanCount);

            System.out.println("Загальний показник атаки династії Лі: " + liTotalAttack);
            System.out.println("Загальний показник атаки династії Мінь: " + minTotalAttack);
        }

}
