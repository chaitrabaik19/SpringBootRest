# SpringBootRest
added a rest api with spring boot CRUD opertaions

Document aims at suppporting the RESTFUL API's
>Application has built with Spring boot, maven frameworks.
>RESTFUL api supports GET,PUT,POST,DELETE mappings 

Rest controllers and URLS :

For GET :

1> With GET mapping , we have the "http://localhost:8081/app/people"  which enables to fetch all the records from datastore

sample values :

url:http://localhost:8081/app/people
method: GET
response: json format
[
    {
        "user_id": 9,
        "user_name": "test",
        "user_age": 30,
        "user_balance": 15,
        "user_email": "chaitra19@gmail.com",
        "user_adress": "testadress"
    },
    {
        "user_id": 2,
        "user_name": "MAHANTESH",
        "user_age": 28,
        "user_balance": 100,
        "user_email": "XYZ@GMAIL.COM",
        "user_adress": "XYZ"
    },
    {
        "user_id": 3,
        "user_name": "anupama",
        "user_age": 22,
        "user_balance": 50,
        "user_email": "anu@gmail.com",
        "user_adress": "shimoga"
    }
]





2> using GET : Fetch a particular record 
end point : http://localhost:8081/app/people/{id}    (replace id with any existing user id)
method: GET 
input : http://localhost:8081/app/people/3
RESPONSE: json

{
    "user_id": 3,
    "user_name": "anupama",
    "user_age": 22,
    "user_balance": 50,
    "user_email": "anu@gmail.com",
    "user_adress": "shimoga"
}


3)using POST : TO add a new record 
end point: http://localhost:8081/app/people
input : query params 
ex: http://localhost:8081/app/people?user_id=10&user_name=test10&user_age=27&user_balance=1510&user_adress=testaddress10

response: JSON 

{
    "user_id": 10,
    "user_name": "test10",
    "user_age": 27,
    "user_balance": 1510,
    "user_email": null,
    "user_adress": "testaddress10"
}
updated in db 

4)using DELETE : to remove the record from datastore
end point: http://localhost:8081/app/people/{id}  (replace id with existing record id you want to remove)
method: DELETE
input : id = 10
ex: http://localhost:8081/app/people/10

{
    "user_id": 10,
    "user_name": "test10",
    "user_age": 27,
    "user_balance": 1510,
    "user_email": null,
    "user_adress": "testaddress10"
}
removed from db


5) using PUT : TO update an existing record
end point:http://localhost:8081/app/people
METHOD : PUT 
INPUT TYPE : QUERY PARAMS
EX: http://localhost:8081/app/people?user_id=9&user_name=test&user_age=30&user_balance=15&user_email=chaitra19@gmail.com&user_adress=testadress

RESPONSE: 
{
    "user_id": 9,
    "user_name": "test",
    "user_age": 30,
    "user_balance": 15,
    "user_email": "chaitra19@gmail.com",
    "user_adress": "testadress"
}

RECORD UPDATED

ALL ABOVE RESPONSES HAVE BEEN TESTED USING POSTMAN 


GUI :

To consume all above api end points we have created a simple javascript ,html page with basic grid 

1)we have 2 buttons in GUI 
2)ON CLICK OF GET PEOPLE RECORDS
3)the api call to particular end point is made
4)on click of show in table button , the same json data will be shown in grid view
5)on refresh of this page will recall the api call, and again once the button is clicked , the call to api will be done.

this GUI can be enhanced with css and also can be embeded into spring project to make a clear sepearation of concerns using MVC architecture.

















