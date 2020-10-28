package com.utilities.api;

import com.pages.developWebex.LoginPages;

public interface AuthenticationUtility {
    String bearerToken = null;
    String user = null;
    String password = null;
    public String getBearerToken();
    public String getUser();
    public String getPassword();
    public boolean commonLogin(String user, String password, LoginPages loginPages);

    //public String getAuthorization();
}
