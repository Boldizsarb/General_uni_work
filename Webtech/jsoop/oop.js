// we can hook it up the a button for example:
document.getElementById("btnexample").addEventListener("click", e=>{
    let eye = new Eye();
})

class Eye{

    constructor(){

        this.eye = document.createElement("div");
        this.eye.classList.add("eye");
        document.body.appendChild(this.eye);

        this.innereye = document.createElement("div");
        this.innereye.classList.add("innereye");
        this.eye.appendChild(this.innereye); // Appending the eye 

        this.eye.addEventListener("mouseover", e=>{ // Hower effect
            this.lookRight();
        })
        this.eye.addEventListener("mouseout", e=>{
            this.lookLeft();
        })
    }
    lookRight(){
        this.innereye.style.right = "5px";
    };
    lookLeft(){
       this.innereye.style.left = "5px";
    };
}
////////////////////////////////////////////////////

