import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -5478362402251582890L;

    private Integer id;
    private String userName;

    public User(Integer id, String userName) {
        super();
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
