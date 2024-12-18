# springBootApi
*sa-backend*  
> [!TIP]
> :shipit: Pour demarrer cette application vous aurez besoin:   
> - [ ] Docker Desktop  
> - [ ] Intellij de préférence (sinon eclipse)  
> - [ ] JDK java  
> - [ ] Une App pour tester des API: POSTMAN, BRUNO, SOAP UI (j'utilise *thunder* client, une extension de l'IDE *VS CODE*)  

>[!NOTE]
>Apres avoir demarre le projet, ont peut lancer les requetes GET  
![image](https://github.com/user-attachments/assets/fba92c13-d2c4-4c6a-ac3a-1c8cfb1e92d5)

>[!NOTE]
>Utiisation de l'image Docker MariaBD et creation de container avec la cmd docker-compose up -d  
![image](https://github.com/user-attachments/assets/329edef1-1da7-4462-9809-f7432f05e8ff)  

>[!NOTE]
>Exmple d'une requête POST pour créer un Client qui doit retourner 201 + vous pouvez vérifier la table Client  
![image](https://github.com/user-attachments/assets/8fc42775-717c-436d-bd51-0f0527eb70ee)  
![image](https://github.com/user-attachments/assets/3471bec4-4a1c-4e1b-8f92-41f21af9a190)  

>[!NOTE]
>Exemple d'une requête GET pour récuperer les clients de la table *Client*
![img.png](img.png)    

>[!NOTE]
>Exemple d'une requête GET pour lire un client dans la table *Client*   
![img_1.png](img_1.png)  

>[!NOTE]
>Exemple d'une requête POST pour poster un commentaire dans la table *Rating*  
![img_4.png](img_4.png)

>[!NOTE]
>Exemple d'une requête GET pour récupérer les commentaires de la table *Rating*  
![img_3.png](img_3.png)  

>[!NOTE]
>Exemple d'une requête DELETE pour supprimer un commentaire  
![img_2.png](img_2.png)  
Pour verifier faisons un GET, nous avons bien supprimé le commentaire avec l'ID 1
![img_5.png](img_5.png)  

>[!NOTE]
>Exemple d'un requête GET après deux requêtes POST qui définit bien le type de commentaire (NEGATIF ou POSITIF) sur le contrôle du mot __pas__  
> ![img_6.png](img_6.png)
