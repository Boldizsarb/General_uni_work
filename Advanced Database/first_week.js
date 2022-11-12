const http = require("http");
const server = http.createServer(); // creating the server
const { MongoClient } = require("mongodb");

const uri = "mongodb+srv://admin:admin@work.8oijiin.mongodb.net/?retryWrites=true&w=majority";
const dbName = "test"; // name of the database
const client = new MongoClient(uri, { useNewUrlParser: true });
const students = [ // the data 
    {
        name: { first: "joe", last: "appleton" },
        dob: new Date("August 12, 1982"),
    },
    {
        name: { first: "bill", last: "smith" },
        dob: new Date("August 12, 1982"),
    },
];

server.on("request", async (req, res) => {
    // when the server request happen the function gets runned 
    try {
        await client.connect(); // network request
        const db = client.db(dbName); // 
        const collection = db.collection("students"); // like a table 
        await collection.insertMany(students); // the variable
        res.end("Request ended"); // renders this onto the screen 

    } catch (e) { // should an error happen, this will be the feadback 
        console.log(`Could not update ${e}`);
    }
});

server.listen(5000);
 // it did upload the data to the cloud but only once and there is no feadback. Only once since after that 
 // it gives a dubplicate error


