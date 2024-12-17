# springBootApi
*sa-backend*

```
@RestController
@RequestMapping(path = "test")
public class TestController {
    @GetMapping
    public List<String> getList() {
        return List.of("chaine de caractère","transmise par sa");
    }
    @GetMapping(path = "string")
    public String getString() {
        return "chaine de caractère transmise par sa";
    }
}
```
>[!NOTE]
>Apres avoir demarre le projet, ont peut lancer les requetes GET  
![image](https://github.com/user-attachments/assets/fba92c13-d2c4-4c6a-ac3a-1c8cfb1e92d5)

Utiisation de l'image Docker MariaBD et creation de container avec la cmd docker-compose up -d  
![image](https://github.com/user-attachments/assets/329edef1-1da7-4462-9809-f7432f05e8ff)  

Exmple d'un requête POST pour créer un Client qui doit retourner 201 + vous pouvez vérifier la table Client
![image](https://github.com/user-attachments/assets/3471bec4-4a1c-4e1b-8f92-41f21af9a190)



