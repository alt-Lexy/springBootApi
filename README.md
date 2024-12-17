# springBootApi
sa-backend

.....  

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
    public String getString() {
        return "chaine de caractère transmise par sa";
    }

    @GetMapping
    public List<String> getList() {
        return List.of("chaine de caractère","transmise par sa");
    }
}  

Apres avoir demarre le projet, ont peut lancer les requetes GET  
![image](https://github.com/user-attachments/assets/fba92c13-d2c4-4c6a-ac3a-1c8cfb1e92d5)
