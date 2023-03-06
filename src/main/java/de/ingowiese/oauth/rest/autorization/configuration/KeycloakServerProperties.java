package de.ingowiese.oauth.rest.autorization.configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "baeldung-realm.json";
    AdminUser adminUser = new AdminUser();

    public static class AdminUser {
        String username = "admin";
        String password = "admin";
        
        public String getUsername() {
			return username;
		}
        public String getPassword() {
			return password;
		}
    }

	public AdminUser getAdminUser() {
		return adminUser;
	}

	public String getRealmImportFile() {
		return realmImportFile;
	}
	
	public String getContextPath() {
		return contextPath;
	}
}