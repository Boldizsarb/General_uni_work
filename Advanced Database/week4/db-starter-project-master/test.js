const { response } = require("express")

function makeRequest(location){
return new Promise((resolve,reject)=>{
console.log(`Making a request to ${location}`)
    if(location === "Google"){
        resolve("Google says hi")
    }else{
        reject("We can only talk to google")
    }
})
}

function processRequest(response){
    return new Promise((resolve,reject)=>{
        console.log("Processing response")
        resolve(`Extra information+ ${response}`)
    })
}
/*
makeRequest("Google").then(response =>{
    console.log("Response Received")
    return processRequest(response)
}).then(processResponse =>{
    console.log(processResponse)
}).catch(err =>{
    console.log(err)
})
*/

// Same function with A sync
async function doWork(){
    try{ // this is how we cath error! anything that could throw an error goes into the try
        const response = await makeRequest("Google") // the code should wait until this wait request is finished, afterwards it will execute the next thing
        console.log("response received")
        const processedResponse = processRequest(response)
        console.log(processedResponse)
    }catch(err){
        // here you type what you want to do with the error
        console.log(err)
    }
}

doWork()


