require("dotenv").config();
const express = require("express");
const path = require("path");
const app = express();
app.set("view engine", "ejs");

const mongoose = require("mongoose");
const { WEB_PORT, MONGODB_URI } = process.env; // neds to be declared before mongo

/**
 * notice above we are using dotenv. We can now pull the values from our environment
 */

// mongoose stuff 

 mongoose.connect(MONGODB_URI, { useNewUrlParser: true });


 mongoose.connection.on("error", (err) => {
  console.error(err);
  console.log("MongoDB connection error. Please make sure MongoDB is running.");
  process.exit();
});
//

// connecting the controller to routes
const tasterController = require("./controllers/taster");
app.get("/tasters", tasterController.list);
app.get("/tasters/delete/:id", tasterController.delete);
//


console.log(process.env.PORT);

app.use(express.static(path.join(__dirname, "public")));

app.get("/", (req, res) => {
  res.render("index");
});

app.get("/tasters", (req, res) => {
  res.render("tasters");
});

app.listen(WEB_PORT, () => {
  console.log(`Example app listening at http://localhost:${WEB_PORT}`);
});

