# To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database
A To-Do List App that uses H2 database to perform CRUD (Create, Read, Update, Delete) and search by keyword functionality.

App runs on the local host machine (if it was uploaded to server, it would be accessible through proper HTTP address). Upon execution it creates H2 database if one does not exist yet 
(alternatively, any relational database can be used if the application.properties file is modified accordingly).


1. After the App is launched it can be accessed through localhost address http://localhost:8080/todolist on the web browser (Read):
![main](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/796998a6-f5db-4ae2-a8fa-51c6620df136)


2. After clicking 'Add task' button a new page http://localhost:8080/todolist/new is loaded where a new task can be added (Create):
![create](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/621a264e-ff4b-4813-8be0-b409ffde2890)


3. A new task is also displayed onn the main page and now it looks as follows (Read):
![read](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/186b2a36-5818-4119-8667-78c20e3be17d)


4. Any created task can be edited by clicking on the 'Edit task' icon, then a new page http://localhost:8080/todolist/{id} is loaded (Update):
![update](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/bd1a4d0b-e972-4fac-8cfc-bbc24e1451c2)


5. An updated list is displayed (Read):
![read2](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/fbdbd78b-3017-4243-85c0-805ad8386448)


6. List can be searched for any matches to a keyword and only the records that include it are displayed (Search functionality):
![search](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/f6dc8d5f-f5e0-405c-b2d9-86f3279d4e73)


7. Any task can be deleted by clicking 'Delete task' icon and a confirmation notification (JavaScript) pops up and the item is deleted from the database (Delete):
![delete](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/6491cfdb-ce38-42af-a4c3-41f44ec9d258)

8. Now the list looks as follows (Read):
![read3](https://github.com/StormC1oud/To_Do_List_Spring_Boot_App_With_Thymeleaf_and_H2_Database/assets/142148846/8ab40ebe-5a50-49a8-a81c-78191d8a2559)


