
# Description

This is a game application where you have to guess the word
## Tech Stack


**Server Side:** Spring Boot

**Client Side:** Tailwind, Javascript, Thymeleaf

**Builder:** Maven






## FAQ

#### Is this a finished project ?

No, I'm thinking about restricting users freedom for this application


#### Which framework or libraries did you use ? 

I used Spring Boot combined with Maven and Thymeleaf


#### What is the purpose of this application ? 

To guess the word, and to dive into Spring Boot basics

#### Is the project responsive ? 

Yes this is responsive and I used the Tailwind utlity classes to handle the design.


## Features


- Enter characters in the field
- Tries remaining appearing on the top right screen of the browser
- Decrementation by 1 if the user guess wrong
- If the character entered is correct, the letter pass automatically to the guess word
- User can reload the page
- When user reload the page, the number of tries is reset
- Get Request with the getmapping annotation when you enter the parameter
- User is now restricted to a single character
- User is now restriced to only enter lower case characters and nothing else
- A modal is displayed when the game is over





## Run Locally




Launch a Spring boot project

```bash
  https://start.spring.io/
```


Once the metadatas and the dependencies selected run a Spring boot project with Maven
```bash
  Once the metadatas selected, you can run ./mvnw spring-boot:run
```


After the server is running, in order to connect to a database
```bash
  Go to src > main > resources > application.properties and add your own properties
```





## Screenshots


![Capture d’écran 2024-07-08 à 21 41 14](https://github.com/alexisr91/Wordguessr/assets/160608635/0db1bd33-2fa4-436a-ab39-d6ed1d55efae)



## Logo 

🖥️
## License

[MIT](https://choosealicense.com/licenses/mit/)

