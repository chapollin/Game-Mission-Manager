package MissionManager;

public class Main {
    public static void main(String[] args) {

        MissionManager mission = MissionManager.getInstance();

        mission.startMission("Salvar a Aldeia", "Fale com o chefe da vila");

        mission.advanceObjective("Vá até a floresta");

        mission.advanceObjective("Derrote o monstro");

        mission.completeMission();
    }
}
