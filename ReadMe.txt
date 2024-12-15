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
-