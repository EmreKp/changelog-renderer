# Changelog Viewer
A changelog rendering helper package written in Spring boot

### Summary

It adds a controller for viewing change logs in browser by `/changelog` route.

(e.g. if your project URL is `http://localhost:8080`, then you can access changelog page on `http://localhost:8080/changelog`)

For default usage, CHANGELOG.md must exist at root of the project. If filename is different, 
then you should specify `fileName` in URL query. (e.g. `/changelog?fileName=Different.md`)

### Usage

It can be used by just adding one dependency to project's pom.xml.
 Needed controllers and other components already exist in package.
 
pom.xml code (replace "latest version" with project version (e.g. 0.1.0)):
 
 ```
 <dependencies>
     ..............
     <!-- changelog viewer !-->
     <dependency>
 	<groupId>com.github.metglobal-compass</groupId>
 	<artifactId>spring-changelog-viewer</artifactId>
 	<version>"latest version"</version>
     </dependency>
     ..............
 </dependencies>
 ```

After adding that, run `` mvn install`` to import dependency. And scan the package by 
adding or editing annotation in main application class.

If your application's running class is `MainApplication`, then annotiations will be like this:

```
@SpringBootApplication(scanBasePackages={"com.compass.changelog", ...})
............
public class MainApplication {
```

or

```
@SpringBootApplication
@ComponentScan(basePackages={"com.compass.changelog", ...})
............
public class MainApplication {
```