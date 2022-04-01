const express = require('express'); 

const app = express();

app.get("/", (req, res) =>{
res.send("<h1>Welcome ot the gome page</h1>");
});
// creating another root:
app.get("/contact", (req, res) =>{
    res.send("<h1>Contact page</h1>");
    });

app.listen(3000,()=>{console.log("Server started!")} )