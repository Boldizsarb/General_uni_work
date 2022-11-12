
document.getElementById("btnexample").addEventListener("click", e=>{

fetch("data/places.json")
.then(response=>response.json() ) // it can be => response.text() if the file is a text not json, to the arrow function the curly bracket are not needed because that is one line 
.then(places=>{
    let output = "";
    places.forEach(place=>{ /*Looping through each place */
    output += `<p><strong>${place.name}</strong> - ${place.Stars}*</p>`; /*appending the empty string, each will be in a <p>*/
    });
    document.getElementById("results").innerHTML = output; // pringting it out to the page 
});

});