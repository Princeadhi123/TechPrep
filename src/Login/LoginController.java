package Login;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

@Path("/login")
public class LoginController {

	// THIS CLASS SHOULD ACTUALLY USE THE LOGIN PACKAGE AND VALIDATE THE USER
	@Path("/login1")
	@GET
    public String pojo() {
        return "pojoasfsdf ok @ " + new Date().toString();
    }
	
	@Path("/login2222")
	@GET
    public String pojo1() {
        return "Hrishikesh Deshmukh" + new Date().toString();
    }
}
