import enums.AccountStatus;

abstract public class Account {
    private String id;
    private String password;
    private AccountStatus status;
    public void resetPassword(String password){
        this.password=password;
        System.out.println("The password is successfully reset");
    };
   public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setStatus(AccountStatus status){
        this.status=status;
    }
    public AccountStatus getStatus(){
        return status;
    }

}
