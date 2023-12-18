package MyProgramm.security;

public class LoginConnect { //** Класс представляющий логин и пароль*/
    private String login;
    private String password;

    public LoginConnect(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    
    public void setLogin(String login){
        this.login = login; 
    }
    public void setPassword(String password){
        this.password = password; 
    }

    public String getInfo() {
        return String.format("Login: %s, Password: %s.", this.login, this.password, this.getClass().getSimpleName());
    }
}
