import java.util.Scanner;
public class emailvalidation {

            public static void main(String[] args) {

                String[] emailIds = {
                        "anikit@gmail.com",
                        "pragnya@gmail.com",
                        "badri@gmail.com",
                        "Satyajit@gmail.com",
                        "sudeepta@gmail.com",
                        "anikit@outlook.com",
                        "pragnya@outlook.com",
                        "badri@oulook.com",
                        "Satyajit@outlook.com",
                        "sudeepta@outlook.com",
                };

                Scanner scanner = new Scanner(System.in);
                while(true){
                System.out.print("Enter the email ID to search:\nType 'EXIT' to exit.");
                String searchEmail = scanner.nextLine();
                    if(searchEmail.equalsIgnoreCase("EXIT")){
                        System.out.println("See you again...");
                        break;
                    }
                    // Search for the email ID in the array
                    boolean found = false;
                    for (String email : emailIds) {
                        if (email.equalsIgnoreCase(searchEmail)) {
                            found = true;
                            break;
                        }
                    }
                    // Display the result
                    if (found) {
                        System.out.println("Email ID found in the array.");
                    } else {
                        System.out.println("Email ID not found in the array.");
                    }
                    System.out.println("---------------------------------------\n");
                }
            }
        }

