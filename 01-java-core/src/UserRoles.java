public class UserRoles {
    public static void main(String[] args) {
        String role = "EDITOR";
        
        switch (role.toUpperCase()) {
            case "ADMIN":
                System.out.println("Full access granted.");
                break;
            case "EDITOR":
                System.out.println("Can edit and publish content.");
                break;
            case "GUEST":
                System.out.println("Read-only access.");
                break;
            default:
                System.out.println("Role not recognized.");
        }
    }
}
