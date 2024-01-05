package solid.interface_segregation;

public class InterfaceSegregationApp {
    public static void main(String[] args) {
        // Instead of having a bulky interface
        // Here, we have 3 interfaces

        // 1. StandardDevelopment
        // StandardDevelopment role is implemented by JuniorDeveloper
        // StandardDevelopment has ability to code and sprintPlanning
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.code();
        juniorDeveloper.sprintPlanning();

        // 2. ExperiencedDevelopment
        // ExperiencedDevelopment role is implemented by SeniorDeveloper
        // ExperiencedDevelopment extends StandardDevelopment
        // ExperiencedDevelopment has ability to code, sprintPlanning, applyDesignPattern, and conductCodeReview
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.code();
        seniorDeveloper.sprintPlanning();
        seniorDeveloper.applyDesignPattern();
        seniorDeveloper.conductCodeReview();


        // 3. ExpertDevelopment
        // ExpertDevelopment role is implemented by PrincipalDeveloper
        // ExpertDevelopment has ability to architectSystem, and mentorTeam
        PrincipalDeveloper principalDeveloper = new PrincipalDeveloper();
        principalDeveloper.architectSystem();
        principalDeveloper.mentorTeam();

        // Avoiding a single interface with all abilities in one class is crucial.
        // If roles are forced to implement all methods, some might remain unused.
    }
}
