Basic REST Server
-----------------

Made this project to be reused later when implementing a rest controller.

Started from the spring boot examples, converting it to a war, but things are
not so simple because:

1: deploying to tomcat 7 is hardly possible, 
   see https://stackoverflow.com/questions/49385257/tomcat-7-java-lang-noclassdeffounderror-javax-el-elmanager?noredirect=1&lq=1
2: you not only need to change the pom.xml, package the application as a war, and give 'tomcat provided', but also should
   change the Application class: 
   https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-create-a-deployable-war-file
3: the urls change compared to the app-deployed-as-jar, requiring the war name in the middle
   for instance, with the current code, we have to put with this url: 
   http://localhost:8080/basicrestserver-0.0.1-SNAPSHOT/clientmanager/reset   
