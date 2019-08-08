async function fetchdata(ur) {
    try {
        dat = await fetch((ur));
        response = await dat.json();
        console.log(response);
        return response;
    } catch (e) {
        console.log(e);
    }
}



fun = fetchdata('https://api.github.com/users');
var jo;
fun.then(json_obj => {
    jo=json_obj;
    json_obj.forEach(element => {
        
        var routing = element.login;
        document.getElementById('body').innerHTML+=
        `<button
            id="${element.login}"
            onclick="userDetails('${element.login}')">
            ${element.login}
        </button>`;
        
    });
});
function userDetails(login){
    console.log(login);
    jo.forEach(element =>{
        if(element.login==login){
            document.getElementById('body').innerHTML=`
            <p>${element.id} ${element.login}</p>
            <p><img src=${element.avatar_url}></img></p>
            <p>Type :- ${element.type}</p>
            <p>Site Admin:- ${element.site_admin}</p>
            `;
        }
    });

}
