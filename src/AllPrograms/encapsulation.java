package src.AllPrograms;

public class encapsulation {
    public static void main(String[] args) {
        login login = new login("admin", "admin");

        boolean check = login.islogged("admin", "admign");
        System.out.println(check);
        System.out.println(login.getUsername());




    }

}
class login {
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;
        private String password;
        login(String u, String p) {
            this.username = u;
            this.password = p;
        }

        boolean islogged(String username, String password) {
            if (this.username.toLowerCase().equals(username)
                    && this.password.toLowerCase().equals(password)) {
                System.out.println("LoggedIn");
                return true;
            } else {
                System.out.println("Oops details are wrong");
                return false;
            }
        }
    }

