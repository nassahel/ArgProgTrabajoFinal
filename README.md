{ "info": { "\_postman_id": "3e16cb9d-5636-4778-a584-5349bd559aba",
"name": "Argentina Programa RESTful API basics: CRUD, test & variable",
"description": "\# 🚀 Get started here`\n`{=tex}`\nThis `{=tex}template
guides you through CRUD operations (GET, POST, PUT, DELETE), variables,
and tests.`\n`{=tex}`\n`{=tex}\## 🔖 **How to use this
template**`\n`{=tex}`\n`{=tex}\#### **Step 1: Send
requests**`\n`{=tex}`\nRESTful `{=tex}APIs allow you to perform CRUD
operations using the POST, GET, PUT, and DELETE HTTP
methods.`\n`{=tex}`\nThis `{=tex}collection contains each of these
request types. Open each request and click \"Send\" to see what
happens.`\n`{=tex}`\n`{=tex}\#### **Step 2: View
responses**`\n`{=tex}`\nObserve `{=tex}the response tab for status code
(200 OK), response time, and size.`\n`{=tex}`\n`{=tex}\#### **Step 3:
Send new Body data**`\n`{=tex}`\nUpdate `{=tex}or add new data in
\"Body\" in the POST request. Typically, Body data is also used in PUT
request.`\n`{=tex}`\n`{=tex}`\n{\n    \"name\": \"Add your name in the body\"\n}\n\n``\n`{=tex}`\n`{=tex}\####
**Step 4: Update the variable**`\n`{=tex}`\nVariables `{=tex}enable you
to store and reuse values in Postman. We have created a variable called
`base_url` with the sample request
<https://postman-api-learner.glitch.me>. Replace it with your API
endpoint to customize this collection.`\n`{=tex}`\n`{=tex}\#### **Step
5: Add tests in the \"Tests\" tab**`\n`{=tex}`\nTests `{=tex}help you
confirm that your API is working as expected. You can write test scripts
in JavaScript and view the output in the \"Test Results\"
tab.`\n`{=tex}`\n`{=tex}`<img src=\"https://content.pstmn.io/b5f280a7-4b09-48ec-857f-0a7ed99d7ef8/U2NyZWVuc2hvdCAyMDIzLTAzLTI3IGF0IDkuNDcuMjggUE0ucG5n\">`{=html}`\n`{=tex}`\n`{=tex}\##
💪 Pro tips`\n`{=tex}`\n`{=tex}- Use folders to group related requests
and organize the collection.`\n`{=tex}- Add more scripts in \"Tests\" to
verify if the API works as expected and execute
flows.`\n    `{=tex}`\n`{=tex}`\n`{=tex}\## ℹ️
Resources`\n`{=tex}`\n[Building requests]`{=tex}(https://learning.postman.com/docs/sending-requests/requests/)
`\n[Authorizing requests]`{=tex}(https://learning.postman.com/docs/sending-requests/authorization/)
`\n[Using variables]`{=tex}(https://learning.postman.com/docs/sending-requests/variables/)
`\n[Managing environments]`{=tex}(https://learning.postman.com/docs/sending-requests/managing-environments/)
`\n[Writing scripts]`{=tex}(https://learning.postman.com/docs/writing-scripts/intro-to-scripts/)",
"schema":
"https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
"\_exporter_id": "28637952" }, "item": \[ { "name":
"http://localhost:8080/libros", "request": { "method": "GET", "header":
\[\], "url": { "raw": "http://localhost:8080/libros", "protocol":
"http", "host": \[ "localhost" \], "port": "8080", "path": \[ "libros"
\] }, "description": "Se debe ingresar a \"/libros\"para mostrar todos
los libros existentes. No es necesario ingresar el id ya que se genera
automaticamente de manera incremental." }, "response": \[\] }, { "name":
"http://localhost:8080/libros/create", "request": { "method": "POST",
"header": \[\], "body": { "mode": "raw", "raw":
"{`\r\n    `{=tex}\"isbn\": 12245,`\r\n    `{=tex}\"titulo\": \"El Señor
de los Novillos\",`\r\n    `{=tex}\"anio\":
2004,`\r\n    `{=tex}\"ejemplares\":
10,`\r\n    `{=tex}\"ejemplaresPrestados\":
5,`\r\n    `{=tex}\"ejemplaresRestantes\": 5,`\r\n    `{=tex}\"alta\":
true`\r\n`{=tex}}", "options": { "raw": { "language": "json" } } },
"url": { "raw": "http://localhost:8080/libros/create", "protocol":
"http", "host": \[ "localhost" \], "port": "8080", "path": \[ "libros",
"create" \] }, "description": "Se debe ingresar a \"/libros/create\"para
crear un nuevo libro" }, "response": \[\] }, { "name":
"http://localhost:8080/libros/update", "request": { "method": "PUT",
"header": \[\], "body": { "mode": "raw", "raw":
"{`\r\n    `{=tex}\"id\": 6,`\r\n    `{=tex}\"isbn\":
12245,`\r\n    `{=tex}\"titulo\": \"El Señor de los
Novillos\",`\r\n    `{=tex}\"anio\":
2050,`\r\n    `{=tex}\"ejemplares\":
10,`\r\n    `{=tex}\"ejemplaresPrestados\":
5,`\r\n    `{=tex}\"ejemplaresRestantes\": 5,`\r\n    `{=tex}\"alta\":
true`\r\n`{=tex}}", "options": { "raw": { "language": "json" } } },
"url": { "raw": "http://localhost:8080/libros/update", "protocol":
"http", "host": \[ "localhost" \], "port": "8080", "path": \[ "libros",
"update" \] }, "description": "Se debe ingresar a \"/libros/update\"para
actualizar la informacion de alguún libro" }, "response": \[\] }, {
"name": "http://localhost:8080/libros/delete/6", "request": { "method":
"DELETE", "header": \[\], "url": { "raw":
"http://localhost:8080/libros/delete/6", "protocol": "http", "host": \[
"localhost" \], "port": "8080", "path": \[ "libros", "delete", "6" \] },
"description": "Se debe ingresar a \"/libros/delete/{id}\" para eliminar
un libro por su id" }, "response": \[\] } \], "event": \[ { "listen":
"prerequest", "script": { "type": "text/javascript", "exec": \[ "" \] }
}, { "listen": "test", "script": { "type": "text/javascript", "exec": \[
"" \] } } \], "variable": \[ { "key": "id", "value": "1" }, { "key":
"base_url", "value": "https://postman-rest-api-learner.glitch.me/" } \]
}

