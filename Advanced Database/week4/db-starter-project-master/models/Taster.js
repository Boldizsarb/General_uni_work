const mongoose = require("mongoose");
//const { Schema } = mongoose;


const {schema}= mongoose; //destructure
// ({courly brackets are objects})
const tasterSchema = new mongoose.Schema({
  twitter:String, // value paring, defining the value
  tastings:Number,
  name:String,
},{timestamps:true}); // it will create a time stamp


module.exports = mongoose.model("Taster",tasterSchema);
//model must be named the upper case singular version of its corresponding collection.
// In this case, our collection is called "tasters" so the model name is, "Taster"