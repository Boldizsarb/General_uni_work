const express = require('express'); 

const app = express();
app.set('view engine', 'ejs'); // EJS, HTML only 
app.use(express.static('public')); // CSS and Java 

app.get("/", (req, res) =>{
res.render("index",{title: "Welcome to the Home page"}); // file name only. it will rendered onto the page 
});
app.get("/contact", (req, res) =>{
    res.render("contact"); 
    });
    app.get("/aboutus", (req, res) =>{
        res.render("aboutus"); 
        });

app.listen(3000,()=>{console.log("Server started!")} );