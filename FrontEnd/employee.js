
const url = 'http://localhost:8080/P1-KhaNguyenN/'

document.getElementById('getReimbursements').addEventListener('click', assembleFunc);
//so when this button gets clicked, the function called assembleFunc will run
//we could have used: document.getElementById('getAvengerButton').onClick(assembleFunc);
document.getElementById('log-out').addEventListener('click', logout);
async function logout(){
    window.location.replace("http://127.0.0.1:5500/Login.html");
}
document.getElementById('viewPending').addEventListener('click', pending);
//this function will get all avengers from our Java server
document.getElementById('submitReimbursements').addEventListener('click', submit);
async function assembleFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data
    let response = await fetch(url + 'getReimbursements', {credentials: "include"});

    console.log(response);
    
    if(response.status === 200) { //if the request is successful...
        
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each avenger into my table
        for(let reimbursements of data) { //for every avenger in the data variable/object

            console.log(reimbursements); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = reimbursements.reim_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursements.reim_amount;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursements.reimb_submitted;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursements.reimb_resolved;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursements.reimb_description;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursements.reimb_author;
            row.appendChild(cell6);

            let cell7 = document.createElement("td");
            cell7.innerHTML = reimbursements.reimb_resolver;
            row.appendChild(cell7);

            let cell8 = document.createElement("td");
            cell8.innerHTML = reimbursements.reimb_status_id;
            row.appendChild(cell8);
            

            let cell9 = document.createElement("td");
            cell9.innerHTML = reimbursements.reimb_type_id;
            row.appendChild(cell9);

            // //if the avenger has a home, just fill the cell with the home name
            // if(avenger.home_fk != null){
            //     console.log("home came through")
            //     let cell7 = document.createElement("td");
            //     cell7.innerHTML = avenger.home_fk.homeName;
            //     row.appendChild(cell7);
            // } else { //otherwise, still append the cell but leave it empty
            //     let cell7 = document.createElement("td");
            //     row.appendChild(cell7);
            // }



           document.getElementById("reimbursementsBody").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML

        }

    }

}

async function pending() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data
    let response = await fetch(url + 'viewPending', {credentials: "include"});

    console.log(response);
    
    if(response.status === 200) { //if the request is successful...
        
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each avenger into my table
        for(let reimbursements of data) { //for every avenger in the data variable/object

            console.log(reimbursements); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = reimbursements.reim_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursements.reim_amount;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursements.reimb_submitted;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursements.reimb_resolved;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            switch(reimbursements.reimb_type_id){
                case 1:
                    cell5.innerHTML = "Lodging";
                    break;
                
                case 2:
                    cell5.innerHTML = "Travel";
                    break;

                case 3: 
                    cell5.innerHTML = "Food";
                    break;
                
                case 4: 
                    cell5.innerHTML = "Other";
                    break;
            }
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursements.reimb_author;
            row.appendChild(cell6);

            let cell7 = document.createElement("td");
            cell7.innerHTML = reimbursements.reimb_resolver;
            row.appendChild(cell7);

            let cell8 = document.createElement("td");
            switch(reimbursements.reimb_status_id){
                case 1:
                    cell8.innerHTML = "PENDING";
                    break;
                case 2:
                    cell8.innerHTML = "APPROVED";
                    break;
                case 3:
                    cell8.innerHTML = "DENIED";
                    break;
            }
            row.appendChild(cell8);
            

            let cell9 = document.createElement("td");
            cell9.innerHTML = reimbursements.reimb_type_id;
            row.appendChild(cell9);

            // //if the avenger has a home, just fill the cell with the home name
            // if(avenger.home_fk != null){
            //     console.log("home came through")
            //     let cell7 = document.createElement("td");
            //     cell7.innerHTML = avenger.home_fk.homeName;
            //     row.appendChild(cell7);
            // } else { //otherwise, still append the cell but leave it empty
            //     let cell7 = document.createElement("td");
            //     row.appendChild(cell7);
            // }



           document.getElementById("reimbursementsBody").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML

        }

    }

}

async function submit() {
    let id = document.getElementById("idnumber").value;
    let reimbursementsAmount = document.getElementById("reimbursementsAmount").value;
    let Description = document.getElementById("Description").value;

    console.log(id)
    console.log(reimbursementsAmount)
    console.log(Description)

    let userInput = {
        reimb_type_id: id,
        reimb_amount: reimbursementsAmount,
        reimb_description: Description
      
    };


    let response = await fetch(url + "submitReimbursements", {
        method: "POST",
        body: JSON.stringify(userInput),
        credentials: "include"
    });

    
}