package co.chegoususadmin.Login;

/**
 * Created by fraps on 7/13/16.
 */
public interface LoginCallback
{

    void userLoggedIn();

    void errorHappened(String errorMessage);

}
