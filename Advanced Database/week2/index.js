const express = require("express");
const app = express();
const port = 5000;

app.get("/", (req, res) => { 
  res.render("index");
});

app.get("/contact", (req, res) => { 
    res.send("contact");
  });


app.set('view engine', 'ejs'); // EJS, HTML only 
app.use(express.static('public')); // CSS and Java 

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`);
});

