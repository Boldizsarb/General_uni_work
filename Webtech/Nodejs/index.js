// node js set up 
const express = require('express'); 

const mysql = require('mysql') // like importing a library

const db = mysql.createConnection({   // connecting to the database 
    host: "localhost",
    user: "root",
    password: "", // on windows it usually nothing on mac: root
    database: "something" // name of the database 
});
db.connect(err=>{
    if (err) throw err; // error checking 
    console.log("MySQL is connected!") // othervise it will notify 
});



const app = express();
app.set('view engine', 'ejs'); // EJS, HTML only 
app.use(express.static('public')); // CSS and Java 

app.use(express.json()); // the recived info will be parsed and turned into json se we can handle it easier
app.use(express.urlencoded({extended: true })); // dictionary, handles java 

app.get("/", (req, res) =>{
res.render("index",{title: "Welcome to the Home page"}); // file name only. it will rendered onto the page 
});
app.get("/location", (req, res) =>{  // responsible for sending information back
    res.send (`<h1>GET request received</h1>`); // settinp up root for the form, post request 
    });
 
app.post("/location", (req, res) =>{ // responsible for receiving information 
    res.send (`<h1>POST request received with data ${req.body.name}</h1>`);
    });

app.post("/location", (req, res) =>{ // responsible for receiving information 
    res.send (`<h1>POST request received with data ${req.body.name}</h1>`);
    });

app.get("/form", (req, res) =>{ // responsible for receiving information 
    res.render('form')
    });

app.post("/something", (req, res) =>{  // the query // the varibales name should be identical to the one in html 
    db.query("INSERT INTO location(location, name) VALUES(?,?)", [req.body.description, req.body.name], (error, results)=>{
    console.log(error);
        res.render("locadded", {err: error}) // status massage of the result, either error or succes on another ejs file. 
    });
    });

app.get("/contact", (req, res) =>{
    res.render("contact"); 
    });
    app.get("/aboutus", (req, res) =>{        
        res.render("aboutus"); 
        });

app.listen(3000,()=>{console.log("Server started!")} );


// on the browser type http://localhost:3000/form it uploads the folder to the database 
