document.getElementById("staffbtn").addEventListener("click", e=>{    
    fetch("data/staff.json")
    .then(response=> response.json())
    .then(staf =>{

        let output = "";

        staf.forEach(staf=>{

            output += `<p><strong>Name:</strong> ${staf.name} <br><strong>Position:</strong> ${staf.position} </p>`; /*appending the empty string, each will be in a <p>*/
       
        
        });
        document.getElementById("results").innerHTML = output
    })

});
// subjects
document.getElementById("subjectsbtn").addEventListener("click", e=>{    
    fetch("data/subjects.json")
    .then(response=> response.json())
    .then(subj =>{

        let output = "";

        subj.forEach(subj=>{

            output += `<p><strong>Name:</strong> ${subj.name} <br>${subj.description}</p>`
        
        });
        document.getElementById("results").innerHTML = output
    })

});