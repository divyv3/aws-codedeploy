public class HelloJava {
    public static void main(String[] args) {
        String buildNumber = System.getenv("CODEBUILD_BUILD_NUMBER");
        if (buildNumber == null || buildNumber.isEmpty()) {
            buildNumber = "local";
        }

        System.out.printf("Hello java - Build number: %s%n", buildNumber);
    }
}
