# User Management System
- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### Controller
     - ##### _getAllUsers( )_   
     - ##### _getUser( )_       
     - ##### _addUser( )_     
     - ##### _updateUser( )_    
     - ##### _deleteUser( )_       
    
  - ### Service
     - ##### _getAllUsers( )_   
     - ##### _getUser( )_       
     - ##### _addUser( )_     
     - ##### _updateUser( )_    
     - ##### _deleteUser( )_  
     
   - ### Repository
     - ##### _findAll( )_   
     - ##### _findById( )_       
     - ##### _save( )_     
     - ##### _deleteById( )_       
     
- ## Data Structure used 
  - #### ArrayList of type String
  - #### HashMap<String,String> for designing ResponseEntity while exception handling
- ## Database Used
  - #### H2 console
- ## Project Summary
  In this project we can perform all the CRUD operations on the list of Users. Here we have also provided some validatoins on the field values and if we put invalid details in 
  the response body then we will handle exception and will revert with HttpStatus code 400 as a BAD_REQUEST. We have provided some endpoints and also in this section below we have given our API. 
  Using this API we can perform the operations accordingly
  
  > http://localhost:8080/api/
  
  End points:
    - ##### /getAllUser
    - ##### /getUser/{userId}
    - ##### /addUser
    - ##### /updateUserInfo/userId/{userId}
    - ##### /deleteUser
