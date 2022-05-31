function printData(){
    // document.write("Data printed on the document");
    document.getElementById("content").innerHTML = "Data printed on the document";
     console.log("Data written on console");
     //use fetch api to consume end pints java
     fetch("http://localhost:9494/expense")
     .then(response => response.json())
     .then(responseJson => console.log(responseJson))
     .catch(error => console.log(error));
 }