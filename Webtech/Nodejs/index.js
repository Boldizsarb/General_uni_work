const express = require('express'); 

const app = express();
app.set('view engine', 'ejs'); // EJS, HTML only 
app.use(express.static('public')); // CSS and Java 

app.get("/", (req, res) =>{
res.render("index"); // file name only. it will rendered onto the page 
});
app.get("/contact", (req, res) =>{
    res.render("contact"); 
    });

app.listen(3000,()=>{console.log("Server started!")} );