# spring-elastic-demo

GET / - Lista todos 
```sh
$ curl localhost:8080/rest/search/all
[
   {
      "name": "Ajay",
      "id": 123,
      "teamName": "Accounting",
      "salary": 12000
   },
   {
      "name": "Jaga",
      "id": 1234,
      "teamName": "Accounting",
      "salary": 22000
   },
   {
      "name": "Thiru",
      "id": 12345,
      "teamName": "Accounting",
      "salary": 12000
   }
]
```

GET / - Lista por name 
```sh
$ curl localhost:8080/rest/search/name/Ajay
[
   {
      "name": "Ajay",
      "id": 123,
      "teamName": "Accounting",
      "salary": 12000
   }
]
```


GET / - Lista por salario 
```sh
$ curl localhost:8080/rest/search/salary/12000
[
   {
      "name": "Ajay",
      "id": 123,
      "teamName": "Accounting",
      "salary": 12000
   },
   {
      "name": "Thiru",
      "id": 12345,
      "teamName": "Accounting",
      "salary": 12000
   }
]
```

