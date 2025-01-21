It's just main folder for all projects on spring.

package firstApp - project : start spring
- create project;
- create controller;
- add dev tools;
- actuator
- security
- application properties
- inversion of control, dependency injection


package secondApp - project : continue to learn spring
- create project
- scanBasePackages
- @Autowired with setMethod
- @Autowired with just Method
- @Autowired with field
- @Qualifiers
- @Primary
- @Lazy initialization
- @Scope beans
- @PostConstruct and @PreDestroy
- create Bean with config file

package thirdApp - project : continue to learn spring
- create new project thirdApp
- connect new DB
- create new entity class
- add date to DB with DAO
- read date from DB (Select by id / One pupil)
- read date from DB (Select all from table / List of Pupil)
- read date from DB with parameters
- update DB date
- delete data from DB (delete by id + delete all data)
- application.properties -  create new table (if table doesn't exist),
                            update new table (if table exist),
                            show sql query
- test use class for create query (not interface)

package fourthApp - project : continue to learn spring
- create new project fourthApp
- create new class + learning return json object
- refactoring code (new method for create)
- @PathVariable
- create new class for check RuntimeException
- create new method for error handling
- create new method for error with text enter
- create new class for all exception + @ControllerAdvice

package fifthApp - project : continue to learn spring + mysql
- create new project fifthApp
- create new table employee (use old DB)
- connect DB with fifthApp + create class Employee
- create new interface EmployeeDAO + class EmployeeDAOImpl + method findAll
- add EmployeeRestController
- add EmployeeService
- add new methods: findById, save, delete
- add new annotations: PostMapping, RequestBody
- add new annotation: PutMapping. Update table
- add new annotation: DeleteMapping. Delete from table. And my try rewrite @PutMapping method.
- delete some code: EmployeeDAO interface and  EmployeeDAOImpl class + rename some methods (findById)
- add new branch for Security REST API
- create new users with roles (MySecurityConfiguration)
- add access for new roles
- create new tables (users, authorities) in BD and use UserDetailsManager
- change noop password to bcrypt password
- change default tables to tables: members and roles
- fix UserDetailsManager for new tables

package sixthApp - project : continue to learn spring MVC. Thymeleaf
- create new project sixthApp with Thymeleaf
- add controller and helloWorld.html
- add css: mystyle.css
- add @RequestMapping and use form in html
- add method correctName (use HttpServletRequest) for fix name
- add method correctName3 (use @RequestParam) for fix name
- add new class: Pupil
- change pupil-form.html + create method processPupilForm
- add pupil-confirmation.html
- add drop down list
- add 2nd variant: how to create drop down list with application.properties
- add radio button
- add 2nd variant: how to create radio button with application.properties
- add checkbox
- add 2nd variant: how to create checkbox with application.properties

package 7thApp - project : continue to learn spring MVC. Validation
- create new project 7thApp with Validation
- add new class: Client, with @NotNull + @Size
- add template client-form
- add validation (new template client-configuration, mew method processForm)
- add new method with @InitBinder
- add new field: Age, with @Min and @Max annotation
- add new field: zipCode, with @Pattern annotation
- add new file: messages.properties for errors messages
- add new custom validation CarNumber
- add new class CarNumberValidator for custom validation
- add new filed carNumber for test our custom validation
- fix upperCase error if field is empty

package 8thApp - project : continue to learn spring (back to fifthApp - project with Employee)
- create new project from fifthApp project
- create new controller + del old controller
- add dependency Thymeleaf + template list-employees
- add Bootstrap for table
- add index.html
- add new button with use Bootstrap
- add new page for add new Employee
- add method (POST) for save Employee + "Back" button
- add sort data in the table + sort with js
- add filed + Update button for update data
- add new method for update Employee
- add new method for delete Employee (field + button)

package 9thApp - project : continue to learn spring 'Security'
- create new project 9thApp with Spring Security
- added controller and home-page.html
- added new users + passwords
- create new login page (new controller + new html page)
- added check for login errors
- added logout button
- added info about username on login page
- added managers page
- added access for managers
- added admins page
- added access denied page
- added hiding links
- added database connection
- added new method of using user data from database
- create new tables for users and authority (client, roles)
- use new tables + bcrypt passwords

package 10thApp - project : learn spring AOP
- create new project
- some initial settings (added dependency + new console method)
- added interface UserDataDAO + class UserDataImpl
- added new class Aspect + Advice Before
-