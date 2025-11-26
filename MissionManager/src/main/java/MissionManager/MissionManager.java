package MissionManager;

public class MissionManager {

    private static MissionManager instance;

    private String currentMission;
    private String currentObjective;

    private MissionManager() {
        // Construtor privado impede criação externa
    }

    public static MissionManager getInstance() {
        if (instance == null) {
            instance = new MissionManager();
        }
        return instance;
    }

    public void startMission(String mission, String objective) {
        this.currentMission = mission;
        this.currentObjective = objective;
        System.out.println("Missão iniciada: " + mission);
        System.out.println("Objetivo atual: " + objective);
    }

    public void advanceObjective(String newObjective) {
        this.currentObjective = newObjective;
        System.out.println("Novo objetivo: " + newObjective);
    }

    public void completeMission() {
        System.out.println("Missão concluída: " + currentMission);
        currentMission = null;
        currentObjective = null;
    }

    public String getCurrentMission() {
        return currentMission;
    }

    public String getCurrentObjective() {
        return currentObjective;
    }
}
