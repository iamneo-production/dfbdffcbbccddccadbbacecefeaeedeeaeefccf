@RestController

public class ApiController{
    @GetMapping("disp")
    public String Welcome(){
        return "Welcome String Boot!";
    }
}